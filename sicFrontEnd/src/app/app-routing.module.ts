import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { GestionComponent } from './pages/gestion/gestion.component';
import { LoginComponent } from './pages/login/login.component';

const routes: Routes = [
  { path: 'login', component: LoginComponent },
  { path: 'gestion', component: GestionComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { 

  
}
