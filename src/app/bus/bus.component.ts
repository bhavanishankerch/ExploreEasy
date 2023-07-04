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

  
  openBookingModal(bus: any): void {
    // Optionally, you can perform additional operations based on the selected bus
    // For example, populate default values in the booking form based on the selected bus

    // Open the booking modal
    const modalElement = document.getElementById('bookingModal');
    if (modalElement) {
      modalElement.classList.add('show');
      modalElement.style.display = 'block';
    }
  }

  submitBooking(): void {
    // Perform validation if needed

    // Handle the submitted data (e.g., send it to the server)
    console.log(this.bookingData);

    // Close the booking modal
    const modalElement = document.getElementById('bookingModal');
    if (modalElement) {
      modalElement.classList.remove('show');
      modalElement.style.display = 'none';
    }
  }
  bookingData(bookingData: any) {
    throw new Error('Method not implemented.');
  }
}


declare var $:any;
var $ = require('jquery');

