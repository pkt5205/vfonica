import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Login } from 'src/models/login';
import { Observable } from 'rxjs';
import { newUser } from 'src/models/newUser';
import { Plans } from 'src/models/plans';
import { complains } from 'src/models/complains';


@Injectable({
  providedIn: 'root'
})
export class ConnectService {

  constructor(private httpClient:HttpClient) { }

  loginAdmin(login:Login):Observable<object>{
    console.log(login)
    return this.httpClient.post("http://localhost:8083/admin/adminlogin",login);

  }
  signupUser(newuser:newUser):Observable<object>{
    console.log(newuser)
    return this.httpClient.post("http://localhost:8083/userdetails/save",newuser);
  }
  loginUser(login:Login):Observable<object>{
    console.log(login)
    return this.httpClient.post("http://localhost:8083/userdetails/userlogin",login);
  }
  prepaidPlans():Observable<any>{
    return this.httpClient.get("http://localhost:8083/plans/getallprepaidplans");
  }
  prepaidPlansById(price:number):Observable<any>{
    return this.httpClient.get("http://localhost:8083/plans/getprepaidplansbyprice/"+price);
  }
  registerComplains(complains:complains):Observable<object>{
    console.log(complains)
    return this.httpClient.post("http://localhost:8083/complains/saveComplains",complains);
  }
  getallcomplains():Observable<any>{
    return this.httpClient.get("http://localhost:8083/complains/getallcomplains");
  }
}
