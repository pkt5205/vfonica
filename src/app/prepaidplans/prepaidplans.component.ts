import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { multicast } from 'rxjs';
import { Plans } from 'src/models/plans';
import { ConnectService } from '../connect.service';

@Component({
  selector: 'app-prepaidplans',
  templateUrl: './prepaidplans.component.html',
  styleUrls: ['./prepaidplans.component.css']
})
export class PrepaidplansComponent implements OnInit {
  plans:Plans[]=[];
  constructor(private connectservice:ConnectService,private router:Router) { }

  ngOnInit(): void {
    this.connectservice.prepaidPlans().subscribe((data:Plans[])=>{
      this.plans=data;
    })
  }
 
}
