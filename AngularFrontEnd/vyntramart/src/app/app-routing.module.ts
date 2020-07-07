import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {HomeComponent} from './home/home.component';
import {AboutusComponent} from './aboutus/aboutus.component';

const routes: Routes = [
{ path: '', redirectTo: '/Home', pathMatch: 'full' },
{ path: 'Home', component: HomeComponent },
{ path: 'AboutUs', component: AboutusComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
