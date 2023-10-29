import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

const endPoint='http://localhost:8080/autor';
const endPointTo='http://localhost:8080/autor/';

const httpOptions={
  headers: new HttpHeaders({
    'Content-Type': 'application/x-www-form-urlencoded'
  })
};

@Injectable({
  providedIn: 'root'
})
export class AutorServiceService {

  constructor(private httpClient: HttpClient) { }

  getAll(){
    return this.httpClient.get(endPoint);
  }

  add(autor: any){
    let body = new URLSearchParams();
    body.append("nombre", autor.nombre)
    body.append("apellido", autor.apellido)
    body.append("fNacimiento", autor.fNacimiento)
    let bodyencoded=body.toString();


    return this.httpClient.post(endPoint, bodyencoded, httpOptions);   
  }

  remove(id: number){
    let ruta = endPointTo+id.toString();
    return this.httpClient.delete(ruta);
  }

  update(id: number, autor: any){
    let body = new URLSearchParams();
    body.append("nombre", autor.nombre)
    body.append("apellido", autor.apellido)
    body.append("fNacimiento", autor.fNacimiento)
    let bodyencoded=body.toString();

    return this.httpClient.put(endPointTo+id, bodyencoded, httpOptions);
  }

}
