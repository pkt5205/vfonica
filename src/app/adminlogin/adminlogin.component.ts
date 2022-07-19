import { Component, OnInit } from '@angular/core';
import { Login } from 'src/models/login';
import { ConnectService } from 'src/app/connect.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-adminlogin',
  templateUrl: './adminlogin.component.html',
  styleUrls: ['./adminlogin.component.css']
})
export class AdminloginComponent implements OnInit {


  login:Login=new Login();

  constructor(private connectService:ConnectService,private router:Router) { }


  ngOnInit(): void {
  }

  adminLogin(){
    console.log(this.login);
    this.connectService.loginAdmin(this.login).subscribe(data=>{
      alert("Login Succesful"),this.router.navigate(['adminAccount'])
    },error=>alert("Sorry Please enter correct id and password"));
  }

  
}