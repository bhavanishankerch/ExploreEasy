import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Buslist } from './buslist';

@Injectable({
  providedIn: 'root'
})

@Injectable({
  providedIn: 'root'
})
export class BuslistService {
  private apiUrl = 'http://localhost:8080'; 

  constructor(private http: HttpClient) {}

  getBuses(boarding: string, departure: string): Observable<Buslist[]> {
    const params = new HttpParams()
      .set('boarding', boarding)
      .set('departure', departure);

    return this.http.get<Buslist[]>(`${this.apiUrl}/busdetails`, { params });
  }

  public saveData(buslist: Buslist) {
    return this.http.post<Buslist>(`${this.apiUrl}/busbooking`, buslist);
   }
}


