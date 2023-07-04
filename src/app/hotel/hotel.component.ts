import { Component, OnInit } from '@angular/core';
import { Hotellist } from '../hotellist';
import { HotellistService } from '../hotellist.service';

@Component({
  selector: 'app-hotel',
  templateUrl: './hotel.component.html',
  styleUrls: ['./hotel.component.css']
})
export class HotelComponent implements OnInit {

  city_name:any;
  hotels: Hotellist[] = [];

  constructor(private hotelService:HotellistService) { }

  ngOnInit(): void {
  }

  searchHotels() {
    this.hotelService.getHotels(this.city_name)
      .subscribe(hotels => {
        this.hotels = hotels;
      });
  }

}
