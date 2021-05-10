import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {SystemParametersComponent} from "./system-parameters/system-parameters.component";

const routes: Routes = [
  {path:'contractorproperty/guids', component:SystemParametersComponent},
  {path:'**', redirectTo:'/contractorproperty/guids'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
