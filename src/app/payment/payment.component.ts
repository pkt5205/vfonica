import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Plans } from 'src/models/plans';
import { ConnectService } from '../connect.service';

@Component({
  selector: 'app-payment',
  templateUrl: './payment.component.html',
  styleUrls: ['./payment.component.css']
})
export class PaymentComponent implements OnInit {
  plans!:Plans;
  price!:number;
  description!:string;
  validty!:string;
  constructor(public connectservice:ConnectService,public route:ActivatedRoute) { }

  ngOnInit(): void {
    this.price=this.route.snapshot.params['pprice'];
    this.description=this.route.snapshot.params['pdescription'];
    this.validty=this.route.snapshot.params['pvalidity'];
    this.connectservice.prepaidPlansById(this.price).subscribe((data:Plans)=>{this.plans=data;})
    console.log(this.plans);
  }
  

}
