import { Component, OnInit } from '@angular/core';
import { BuslistService } from '../buslist.service';
import { Buslist } from '../buslist';
import { FormGroup } from '@angular/forms';

@Component({
  selector: 'app-bus-booking',
  templateUrl: './bus-booking.component.html',
  styleUrls: ['./bus-booking.component.css']
})
export class BusBookingComponent implements OnInit {
  buslist: Buslist;
  buslists: Buslist[] = [];
  list:any;

  constructor(private buslistservice: BuslistService) { 
    this.buslist = new Buslist(); 
  }

  ngOnInit(): void {
    this.searchBuses();
  }

  searchBuses(): void {
    console.log('busData', this.buslist.boarding);
    
    if (this.buslist.boarding && this.buslist.departure) {
      this.buslistservice.getBuses(this.buslist.boarding, this.buslist.departure).subscribe(data => {
        this.buslists = data;
      });
    }
  }

  onConfirm(){
    this.buslistservice.saveData(this.buslist).subscribe(result => {
      console.log(result),
      alert('Booked Successfully');
    });
  }

}




