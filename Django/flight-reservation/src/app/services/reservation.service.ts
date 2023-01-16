import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { LoginService } from './login.service';


@Injectable({
  providedIn: 'root'
})
export class ReservationService {
  flightsUrl:string = "http://127.0.0.1:8000/flightApi/findFlights/";
  singleFlightUrl:string = "http://127.0.0.1:8000/flightApi/flights/";
  saveReservationUrl:string = "http://127.0.0.1:8000/flightApi/saveReservation/";
  flightData:any;

  constructor(private http:HttpClient, private loginService:LoginService) { }

  public getFlights(criteria:any){
    return this.http.post(this.flightsUrl, criteria, this.loginService.httpOptions);
  }

  public getFlight(id:number):any{
    return this.http.get(this.singleFlightUrl+id, this.loginService.httpOptions);
  }

  public saveReservation(reservation:any){
    return this.http.post(this.saveReservationUrl, reservation, this.loginService.httpOptions);
  }
}
