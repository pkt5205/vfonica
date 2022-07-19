import { Component, OnInit } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { newUser } from 'src/models/newUser';
import { ConnectService } from '../connect.service';


@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {
  newuser:newUser=new newUser();

  constructor(private connectservice:ConnectService,private router:Router) { }

  ngOnInit(): void {
  }

  public signup(){
    console.log(this.newuser);
    this.connectservice.signupUser(this.newuser).subscribe(data=>{alert("User Created")
    this.router.navigate(['Login'])},
    error=>alert("email already exist"));
    
    
}

}