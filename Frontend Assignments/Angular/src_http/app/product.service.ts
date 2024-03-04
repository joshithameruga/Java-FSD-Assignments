import { Injectable } from '@angular/core';
import {HttpClient, HttpClientModule} from'@angular/common/http';
import { Observable } from 'rxjs';
import { Product } from './product';
@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private _http:HttpClient) {}
   
  baseurl='http://localhost:3000/products';

  getAll() : Observable<Product[]>{
    return this._http.get<Product[]>(this.baseurl);
  }

  insertProduct(product:Product){

     this._http.post<Product>(this.baseurl,product)
     .subscribe((response) => {console.log.(product)});
  }
}
