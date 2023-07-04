import { Component, OnInit } from '@angular/core';
import { HotellistService } from '../hotellist.service';
import { Hotellist } from '../hotellist';

@Component({
  selector: 'app-hotel-booking',
  templateUrl: './hotel-booking.component.html',
  styleUrls: ['./hotel-booking.component.css']
})
export class HotelBookingComponent implements OnInit {
  hotellist: Hotellist;
  list:any;

  constructor(private hotellistService:HotellistService) {
    this.hotellist = new Hotellist()
   }

  ngOnInit(): void {
  }

  onConfirm(){
    this.hotellistService.saveHotelData(this.hotellist).subscribe(result => {
      console.log(result),
      alert('Booked Successfully');
    });
  }

}
