import { Injectable } from '@angular/core';
import { User } from './user';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor() {
    console.log("user service created");
   }
   ngOnInit():void{
    console.log('ngOnInit is called');
    this.getAllUsers();
   }

  
   users:User[]=[
    {"uid":101,"username":" joshitha","email":"jo@gmail.com"},
    {"uid":102,"username":" rachel","email":"rach@gmail.com"},
    {"uid":103,"username":" monica","email":"mon@gmail.com"},
    {"uid":104,"username":" joey","email":"joey@gmail.com"}


  ];   //inside array we should take values of user in json format


   getAllUsers(){
    console.log('getall users method called');
       return this.users;
   }
}
