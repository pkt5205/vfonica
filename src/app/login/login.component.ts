
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Login } from 'src/models/login';
import { ConnectService } from '../connect.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  login:Login=new Login();
  constructor(private connectservice:ConnectService,private router:Router) { }

  ngOnInit(): void {
  }

  public userLogin(){
    console.log(this.login);
    this.connectservice.loginUser(this.login).subscribe(data=>{
    this.router.navigate(['userAccount'])
    },error=>alert("enter correct id and password"));
  }

}
