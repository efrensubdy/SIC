import { Injectable } from '@angular/core';
import { APIService } from '../common/apiservice';

@Injectable({
  providedIn: 'root'
})
export class UserServiceService  extends APIService {

  public   login( username:any,password:any):any{
    return this.get('http://localhost:8080/user/login/' + username + '/' + password);
  }

}
