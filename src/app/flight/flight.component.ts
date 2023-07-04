import { Component, OnInit } from '@angular/core';
import { Flightlist } from '../flightlist';
import { FlightlistService } from '../flightlist.service';

@Component({
  selector: 'app-flight',
  templateUrl: './flight.component.html',
  styleUrls: ['./flight.component.css']
})
export class FlightComponent implements OnInit {

  boarding: any;
  departure: any;
  flights: Flightlist[] = [];

  constructor(private flightService:FlightlistService) { }

  ngOnInit(): void {
  }

  searchFlights() {
    this.flightService.getFlights(this.boarding, this.departure)
      .subscribe(flights => {
        this.flights = flights;
      });
  }

}
