import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Flightlist } from './flightlist';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class FlightlistService {
  private apiUrl = 'http://localhost:8080'; 

  constructor(private http: HttpClient) { }

  getFlights(boarding: string, departure: string): Observable<Flightlist[]> {
    const params = new HttpParams()
      .set('boarding', boarding)
      .set('departure', departure);

    return this.http.get<Flightlist[]>(`${this.apiUrl}/flightdetails`, { params });
  }

  public saveFlightData(flightlist: Flightlist) {
    return this.http.post<Flightlist>(`${this.apiUrl}/flightbooking`, flightlist);
   }
}
