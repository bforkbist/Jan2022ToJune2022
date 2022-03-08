import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http'
import { environment } from 'src/environments/environment';
import { Employee } from './employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  private apiServerUrl: string = 'http://localhost:8080';

  constructor(private http: HttpClient) { }

  public getEmployee(): Observable<Employee[]>{
    return this.http.get<Employee[]>(`${this.apiServerUrl}/employee/all`);
  }

  public addEmployee(employee: Employee): Observable<Employee[]>{
    return this.http.post<Employee[]>(`${this.apiServerUrl}/employee/add`, employee);
  }

  public updateEmployee(employee: Employee): Observable<Employee[]>{
    return this.http.put<Employee[]>(`${this.apiServerUrl}/employee/update`, employee);
  }

  public deleteEmployee(id: number):Observable<void>{
    return this.http.delete<void>(`${this.apiServerUrl}/employee/delete/${id}`)
  }

}
