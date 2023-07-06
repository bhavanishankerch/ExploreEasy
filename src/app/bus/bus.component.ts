import { Component, OnInit } from '@angular/core';
import { BuslistService } from '../buslist.service';
import { Buslist } from '../buslist';

@Component({
  selector: 'app-bus',
  templateUrl: './bus.component.html',
  styleUrls: ['./bus.component.css']
})
export class BusComponent implements OnInit {

  boarding: any;
  departure: any;
  buses: Buslist[] = [];

  constructor(private busService: BuslistService) {}
  ngOnInit(): void {
  }

  searchBuses() {
    this.busService.getBuses(this.boarding, this.departure)
      .subscribe(buses => {
        this.buses = buses;
      });
  }

}

