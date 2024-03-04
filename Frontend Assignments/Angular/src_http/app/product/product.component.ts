import { Component } from '@angular/core';
import { ProductService } from '../product.service';
import { Product } from '../product';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent {

constructor(private productService:ProductService){


}
productList:Product[]=[];

getAllProducts(){

  this.productService.getAll().subscribe((products) => {this.productList=products}); 
                console.log("getting products") ; // get all gives observable but when we write subscribe it gives 
}

}
