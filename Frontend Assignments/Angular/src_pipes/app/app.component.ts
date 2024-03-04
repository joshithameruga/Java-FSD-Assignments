import { Component } from '@angular/core';
import { UserService } from './user.service';
import{ User } from './user';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
 // providers:[UserService]
})
export class AppComponent {
  title = 'webapp';

  userList:User[]=[];

constructor(private userService:UserService){

}

getAll(){
  this.userList=this.userService.getAllUsers();
}
}
