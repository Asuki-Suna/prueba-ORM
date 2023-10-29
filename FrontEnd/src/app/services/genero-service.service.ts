import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

const endPoint='http://localhost:8080/genero';
const endPointTo='http://localhost:8080/genero/';

const httpOptions={
  headers: new HttpHeaders({
    'Content-Type': 'application/x-www-form-urlencoded'
  })
};

@Injectable({
  providedIn: 'root'
})
export class GeneroServiceService {

  constructor(private httpClient: HttpClient) { }

  getAll(){
    return this.httpClient.get(endPoint);
  }

  add(genero: any){
    let body = new URLSearchParams();
    body.append("nombre", genero.nombre)
    body.append("descripcion",genero.descripcion)
    let bodyencoded=body.toString();

    return this.httpClient.post(endPoint, bodyencoded, httpOptions);
  }

  remove(id: number){
    let ruta=endPointTo+id.toString();
    return this.httpClient.delete(ruta);
  }

  update(id: number, genero: any){
    let body = new URLSearchParams();
    body.append("nombre", genero.nombre)
    body.append("descripcion",genero.descripcion)
    let bodyencoded=body.toString();

    return this.httpClient.put(endPointTo+id, bodyencoded, httpOptions);
  }
}
