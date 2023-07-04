import { Component, OnInit } from '@angular/core';
import { Flightlist } from '../flightlist';
import { FlightlistService } from '../flightlist.service';

@Component({
  selector: 'app-flight-booking',
  templateUrl: './flight-booking.component.html',
  styleUrls: ['./flight-booking.component.css']
})
export class FlightBookingComponent implements OnInit {
  flightlist:Flightlist;

  constructor(private flightlistService:FlightlistService) { 
    this.flightlist = new Flightlist()
  }

  ngOnInit(): void {
  }

  onConfirm(){
    this.flightlistService.saveFlightData(this.flightlist).subscribe(result => {
      console.log(result);
      alert("Booked Successfully");
    });
  }

}
