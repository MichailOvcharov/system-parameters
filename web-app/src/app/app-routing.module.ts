import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {SystemParametersComponent} from "./system-parameters/system-parameters.component";
import {AppComponent} from "./app.component";
import {HomeComponent} from "./home/home.component";
import {UserComponent} from "./user/user.component";

const routes: Routes = [
  {path:'', component:HomeComponent},
  {path:'users', component:UserComponent},
  {path:'systemparameters', component:SystemParametersComponent}
  // {path:'users', redirectTo:''}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)], //, {useHash: true}
  exports: [RouterModule]
})
export class AppRoutingModule { }
