import { Component, OnInit } from '@angular/core';
import { GeneroServiceService } from '../services/genero-service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-genero',
  templateUrl: './genero.page.html',
  styleUrls: ['./genero.page.scss'],
})
export class GeneroPage implements OnInit {
  genero: any = []
  nameID!: string;
  descriptionID!: string;

  constructor(private generoService: GeneroServiceService, private router: Router) { }

  ngOnInit() {
    this.getAll();
  }

  goToAutor(){
    this.router.navigateByUrl("/autor")
  }
  
  goToGenero(){
    this.router.navigateByUrl("/genero")
  }

  goToLibro(){
    this.router.navigateByUrl("/libro")
  }

  getAll() {
    this.generoService.getAll().subscribe(response => {
      this.genero = response;
    });
  }

  addGenero() {
    let genero = {
      nombre: this.nameID,
      descripcion: this.descriptionID
    }
    this.generoService.add(genero).subscribe(response => {
      this.getAll()
    });
  }

  onClickDelete(id: number) {
    this.generoService.remove(id).subscribe(resp => {
      this.getAll()
    });
  }

  onClickUpdate(id: number) {
    let genero = {
      nombre: this.nameID,
      descripcion: this.descriptionID
    }
    this.generoService.update(id, genero).subscribe(response => {
      this.getAll()
    });

  }

}
