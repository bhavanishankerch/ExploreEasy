import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { HotelComponent } from './hotel/hotel.component';
import { FlightComponent } from './flight/flight.component';
import { BusComponent } from './bus/bus.component';
import { NavbarComponent } from './navbar/navbar.component';
import { BusBookingComponent } from './bus-booking/bus-booking.component';
import { FlightBookingComponent } from './flight-booking/flight-booking.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { HotelBookingComponent } from './hotel-booking/hotel-booking.component';
import { ChunkPipe } from './chunk.pipe';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    HotelComponent,
    FlightComponent,
    BusComponent,
    NavbarComponent,
    BusBookingComponent,
    FlightBookingComponent,
    HotelBookingComponent,
    ChunkPipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

declare var $:any;
var $ = require('jquery');
