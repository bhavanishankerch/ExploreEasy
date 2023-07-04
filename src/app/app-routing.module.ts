import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BusComponent } from './bus/bus.component';
import { FlightComponent } from './flight/flight.component';
import { HotelComponent } from './hotel/hotel.component';
import { HomeComponent } from './home/home.component';
import { NavbarComponent } from './navbar/navbar.component';
import { BusBookingComponent } from './bus-booking/bus-booking.component';
import { FlightBookingComponent } from './flight-booking/flight-booking.component';
import { HotelBookingComponent } from './hotel-booking/hotel-booking.component';

const routes: Routes = [
  {path:'', redirectTo:'/home', pathMatch:'full'},
  {path:"navbar", component:NavbarComponent},
  {path:"home", component:HomeComponent},
  {path:"bus", component:BusComponent},
  {path:"flight", component:FlightComponent},
  {path:"hotel", component:HotelComponent},
  {path:"bus_booking", component:BusBookingComponent},
  {path:"flight_booking", component:FlightBookingComponent},
  {path:"hotel_booking", component:HotelBookingComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
