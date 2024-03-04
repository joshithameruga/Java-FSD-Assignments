import { createAction, props } from '@ngrx/store';
import { Customer } from 'src/app/model/customer.model';


export const addCustomerAction = createAction(

  '[Customers] Add Customer',
  props<{ customer: Customer }>()
  
);

export const deleteCustomerAction = createAction(

  '[Customers] Delete Customer',
  props<{ id: number }>()
  
);


