import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-gestion',
  templateUrl: './gestion.component.html',
  styleUrls: ['./gestion.component.css']
})
export class GestionComponent implements OnInit {

  constructor( private route: Router) { }

  ngOnInit(): void {
  }
  cerrar(){
    this.route.navigate(["login"])

  }

}
