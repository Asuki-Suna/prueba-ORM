import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

const endPoint='http://localhost:8080/libro';
const endPointTo='http://localhost:8080/libro/';

const httpOptions={
  headers: new HttpHeaders({
    'Content-Type': 'application/x-www-form-urlencoded'
  })
};

@Injectable({
  providedIn: 'root'
})
export class LibroServiceService {

  constructor(private httpClient: HttpClient) { }

  getAll(){
    return this.httpClient.get(endPoint);
  }

  add(libro: any){
    let body = new URLSearchParams();
    body.append("titulo", libro.titulo)
    body.append("anio", libro.anio)
    body.append("precio", libro.precio)
    body.append("autorByIdAutor", libro.autorByIdAutor)
    body.append("generoByIdGenero", libro.generoByIdGenero)
    let bodyencoded=body.toString();


    return this.httpClient.post(endPoint, bodyencoded, httpOptions);   
  }

  remove(id: number){
    let ruta = endPointTo+id.toString();
    return this.httpClient.delete(ruta);
  }

  update(id: number, libro: any){
    let body = new URLSearchParams();
    body.append("titulo", libro.titulo)
    body.append("anio", libro.anio)
    body.append("precio", libro.precio)
    body.append("autorByIdAutor", libro.autorByIdAutor)
    body.append("generoByIdGenero", libro.generoByIdGenero)
    let bodyencoded=body.toString();


    return this.httpClient.post(endPointTo+id, bodyencoded, httpOptions); 
  }
}