import { Component, OnInit } from '@angular/core';
import { complains } from 'src/models/complains';
import { ConnectService } from '../connect.service';

@Component({
  selector: 'app-complainsinadmin',
  templateUrl: './complainsinadmin.component.html',
  styleUrls: ['./complainsinadmin.component.css']
})
export class ComplainsinadminComponent implements OnInit {
  complains:complains[]=[]
  constructor(public connectservice:ConnectService) { }

  ngOnInit(): void {
    this.connectservice.getallcomplains().subscribe((data:complains[])=>{
      this.complains=data;
    })
  }

  
}
