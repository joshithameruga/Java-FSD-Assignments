import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { ContactusComponent } from './contactus/contactus.component';
import { PaymentComponent } from './payment/payment.component';

const routes: Routes = [
  
  {path:'' , redirectTo:'home',pathMatch:'full'}, //if we want home page without doing anythong like dashboard by deafult already mentioned home component so redirecting
  {path:'home' , component:HomeComponent},   // in path w ecan give anything anynamee
  {path:'aboutus',component:AboutusComponent},
  {path:'contactus/:username',component:ContactusComponent},
  {path:'payment/:billAmount',component:PaymentComponent}                     //path variable it can be anythong but we use for readability

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
