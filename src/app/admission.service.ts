import { Injectable } from '@angular/core';
import { HttpClient}  from  '@angular/common/http'
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class AdmissionService {
  private baseUrl="http://localhost:8080/api/AdmissionDetails"

  constructor(private http:HttpClient) { }
  getDetails():Observable<any>{
    return this.http.get(`${this.baseUrl}`);
  }
}
