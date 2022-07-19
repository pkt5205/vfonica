import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutusComponent } from './aboutus/aboutus.component';
import { AdminaccountComponent } from './adminaccount/adminaccount.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { CarouselComponent } from './carousel/carousel.component';
import { ComplainsComponent } from './complains/complains.component';
import { ComplainsinadminComponent } from './complainsinadmin/complainsinadmin.component';
import { DongleplansComponent } from './dongleplans/dongleplans.component';
import { LoginComponent } from './login/login.component';
import { PaymentComponent } from './payment/payment.component';
import { PlansComponent } from './plans/plans.component';
import { PostpaidplansComponent } from './postpaidplans/postpaidplans.component';
import { PrepaidplansComponent } from './prepaidplans/prepaidplans.component';
import { RechargedoneComponent } from './rechargedone/rechargedone.component';
import { SignupComponent } from './signup/signup.component';
import { UseraccountComponent } from './useraccount/useraccount.component';

const routes: Routes = [
  {path:'Login',component:LoginComponent},
  {path:'',component:CarouselComponent},
  {path:'SignUp',component:SignupComponent},
  {path:'adminLogin',component:AdminloginComponent},
  {path:'userAccount',component:UseraccountComponent},
  {path:'aboutUs',component:AboutusComponent},
  {path:'bckhome', component:CarouselComponent},
  {path:'plans/prepaidplans', component:PrepaidplansComponent},
  {path:'plans/postpaidplans', component: PostpaidplansComponent},
  {path:'plans/dongleplans',component:DongleplansComponent},
  {path:'plans',component:PlansComponent},
  {path:'plans/prepaidplans/chosen/:pprice/view',component:PaymentComponent},
  {path:'plans/postpaidplans/chosen',component:PaymentComponent},
  {path:'plans/dongleplans/chosen',component:PaymentComponent},
  {path:'paymentcompleted',component:RechargedoneComponent},
  {path:'recharge', component:PlansComponent},
  {path:'complains',component:ComplainsComponent},
  {path:'adminAccount',component:AdminaccountComponent},
  { path:'complainsinadmin',component:ComplainsinadminComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponents = [LoginComponent,SignupComponent,AdminloginComponent,UseraccountComponent,AboutusComponent,CarouselComponent,PrepaidplansComponent,PostpaidplansComponent,DongleplansComponent,PlansComponent,PaymentComponent,RechargedoneComponent,ComplainsComponent,AdminaccountComponent,ComplainsinadminComponent]
