import { Component, OnInit } from '@angular/core';
import { AutorServiceService } from '../services/autor-service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-autor',
  templateUrl: './autor.page.html',
  styleUrls: ['./autor.page.scss'],
})
export class AutorPage implements OnInit {
  autor: any=[]
  nameID!: string;
  subnameID!: string;
  dateID!: string;

  constructor(private autorService: AutorServiceService, private router: Router) { }

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
    this.autorService.getAll().subscribe(response => {
      this.autor = response;
    });
  }

  addAutor(){
    let autor={
      nombre: this.nameID,
      apellido: this.subnameID,
      fNacimiento: this.dateID
    }
    console.log(autor)
    this.autorService.add(autor).subscribe(response => {
      this.getAll()
    });
  }

  onClickDelete(id:number){
    this.autorService.remove(id).subscribe(resp => {
      this.getAll()
    });
  }

  onClickUpdate(id:number){
    let autor={
      nombre: this.nameID,
      apellido: this.subnameID,
      fNacimiento: this.dateID
    }

    this.autorService.update(id,autor).subscribe(resp => {
      this.getAll()
    });
  }
}
