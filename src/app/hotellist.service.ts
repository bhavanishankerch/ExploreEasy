import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Hotellist } from './hotellist';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class HotellistService {
  private apiUrl = 'http://localhost:8080'; 

  constructor(private http: HttpClient) { }

  getHotels(city_name: string): Observable<Hotellist[]> {
    const params = new HttpParams()
      .set('city_name', city_name)

    return this.http.get<Hotellist[]>(`${this.apiUrl}/hoteldetails`, { params });
  }

  public saveHotelData(hotellist: Hotellist) {
    return this.http.post<Hotellist>(`${this.apiUrl}/hotelbooking`, hotellist);
   }
}
