import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { AdmissionListComponent } from './admission-list/admission-list.component';
import { CreateAdmissionComponent } from './create-admission/create-admission.component';

const routes: Routes = [
  {path:'admin', component:AdmissionListComponent},
  {path:'add',component:CreateAdmissionComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
