import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule,routingComponents } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { CarouselComponent } from './carousel/carousel.component';
import { SignupComponent } from './signup/signup.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { UseraccountComponent } from './useraccount/useraccount.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { PlansComponent } from './plans/plans.component';
import { PrepaidplansComponent } from './prepaidplans/prepaidplans.component';
import { PostpaidplansComponent } from './postpaidplans/postpaidplans.component';
import { DongleplansComponent } from './dongleplans/dongleplans.component';
import { PaymentComponent } from './payment/payment.component';
import { RechargedoneComponent } from './rechargedone/rechargedone.component';
import { ComplainsComponent } from './complains/complains.component';
import { AdminaccountComponent } from './adminaccount/adminaccount.component';
import { ComplainsinadminComponent } from './complainsinadmin/complainsinadmin.component';


@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    CarouselComponent,
    routingComponents,
    SignupComponent,
    AdminloginComponent,
    UseraccountComponent,
    AboutusComponent,
    PlansComponent,
    PrepaidplansComponent,
    PostpaidplansComponent,
    DongleplansComponent,
    PaymentComponent,
    RechargedoneComponent,
    ComplainsComponent,
    AdminaccountComponent,
    ComplainsinadminComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
