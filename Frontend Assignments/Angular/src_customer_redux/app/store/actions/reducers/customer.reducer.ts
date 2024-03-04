import { createReducer, on } from "@ngrx/store";
import { addCustomerAction, deleteCustomerAction } from "../customer.action";
import { Customer } from "src/app/model/customer.model";

export interface CustomerState{
    customers:Customer[];
}

export const initialState: CustomerState = {

    customers: [
       


    ]
}


export const CustomerReducer=createReducer(

    initialState,
    on(addCustomerAction,(state,{customer})=>({

      ...state,
        customers:[...state.customers,customer]
    })),

    on(deleteCustomerAction,(state,{id})=>({

        ...state,
        customers:state.customers.filter( (customer) => { customer.customerId !== id})
       
        
      })),
)