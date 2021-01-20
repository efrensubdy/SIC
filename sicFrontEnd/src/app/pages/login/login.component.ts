import { THIS_EXPR } from '@angular/compiler/src/output/output_ast';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { UserServiceService } from 'src/app/services/user-service.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
 
  mensajeError;
  signInForm:FormGroup;

  constructor(public formbuilder:FormBuilder,public userService:UserServiceService,
    private route: Router) { }

  ngOnInit(): void {

    this.signInForm= this.formbuilder.group({
      username:'',
      password:''

  })

  }

  doLogin(){
    console.log(this.signInForm);
    this.userService.login( this.signInForm.get('username').value, this.signInForm.get('password').value

    ).subscribe(loginResponse => {
      console.log(loginResponse)
      if(loginResponse !==null && loginResponse.id !==null){
        this.route.navigate(["gestion"])
      }
      else{
        this.mensajeError ='El usuario es incorrecto'
      }
    })
   
     
  }

}
