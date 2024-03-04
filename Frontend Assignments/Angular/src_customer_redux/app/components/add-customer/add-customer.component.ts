import { Component } from '@angular/core';
import { Store } from '@ngrx/store';
import { Customer } from 'src/app/model/customer.model';
import { addCustomerAction, deleteCustomerAction } from 'src/app/store/actions/customer.action';

@Component({
  selector: 'app-add-customer',
  templateUrl: './add-customer.component.html',
  styleUrls: ['./add-customer.component.css']
})
export class AddCustomerComponent {
  
  newfirstName!:string;
  newlastName!:string;
  newemailAddress!:string;
  newusername!:string;
  newpassword!:string;
  newphoneNumber!:string;

  customerList!:Customer[];


  constructor(private store:Store<{customers:{customers:Customer[]}}>) {

    store.select('customers').subscribe( (CustomerState:{customers:Customer[]})=>{

      this.customerList = CustomerState.customers;

      console.log(this.customerList);

    })

}
addCustomer(){

  if(this.newfirstName.trim() === '' || this.newlastName.trim()==='' ||this.newemailAddress.trim()===''|| this.newpassword.trim()==='' 
   || this.newphoneNumber.trim()==='' || this.newpassword.trim()==='') {


    return;

}

  const customer:Customer ={
    customerId: Math.floor(Math.random() * 100),
    firstName: this.newfirstName,
    lastName: this.newlastName,
    username: this.newusername,
    emailAddress: this.newemailAddress,
    password: this.newpassword,
    phoneNumber: this.newphoneNumber
  }

  this.store.dispatch(addCustomerAction({customer}));
  this.newfirstName='';
  this.newlastName='';
  this.newemailAddress='';
  this.newusername='';
  this.newpassword='';
  this.newphoneNumber=''

}

deleteCustomer(id:number){

  this.store.dispatch(deleteCustomerAction({id}));

}

}