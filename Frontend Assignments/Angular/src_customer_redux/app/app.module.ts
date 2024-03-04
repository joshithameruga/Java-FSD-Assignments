import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddCustomerComponent } from './components/add-customer/add-customer.component';
import { UpdateCustomerComponent } from './components/update-customer/update-customer.component';
import { FormsModule } from '@angular/forms';
import { StoreModule } from '@ngrx/store';
import { CustomerReducer } from './store/actions/reducers/customer.reducer';
import { DeleteCustomerComponent } from './components/delete-customer/delete-customer.component';

@NgModule({
  declarations: [
    AppComponent,
    AddCustomerComponent,
    UpdateCustomerComponent,
    DeleteCustomerComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    StoreModule.forRoot({customers:CustomerReducer})
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
