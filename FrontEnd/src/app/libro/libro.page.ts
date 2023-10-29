import { Component, OnInit } from '@angular/core';
import { LibroServiceService } from '../services/libro-service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-libro',
  templateUrl: './libro.page.html',
  styleUrls: ['./libro.page.scss'],
})
export class LibroPage implements OnInit {
  libro: any=[]
  titleID!: string;
  anioID!: string;
  priceID!: string;
  autorID!: string;
  genreID!: string;

  constructor(private libroService: LibroServiceService, private router: Router) { }

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

  getAll(){
    this.libroService.getAll().subscribe(response => {
      this.libro=response;
    });
  }

  addLibro(){
    let libro ={
      titulo: this.titleID,
      anio: this.anioID,
      precio: this.priceID,
      autorByIdAutor: this.autorID,
      generoByIdGenero: this.genreID
    }
    this.libroService.add(libro).subscribe(response => {
      this.getAll()
    });
  }

  onClickDelete(id: number) {
    this.libroService.remove(id).subscribe(resp => {
      this.getAll()
    });
  }

  onClickUpdate(id: number) {
    let libro ={
      titulo: this.titleID,
      anio: this.anioID,
      precio: this.priceID,
      autorByIdAutor: this.autorID,
      generoByIdGenero: this.genreID
    }
    this.libroService.update(id, this.libro).subscribe(response => {
      this.getAll()
    });

  }

}
