import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Admission } from '../admission';
import { AdmissionService } from '../admission.service';

@Component({
  selector: 'app-admission-list',
  templateUrl: './admission-list.component.html',
  styleUrls: ['./admission-list.component.css']
})
export class AdmissionListComponent implements OnInit {

  admissions!:Observable<Admission[]>;

  constructor(private admissionService:AdmissionService, private router:Router) { }
    ngOnInit(): void {
      this.getData();
    
  }
  getData(){
    this.admissions=this.admissionService.getDetails();
  
    }
  }


