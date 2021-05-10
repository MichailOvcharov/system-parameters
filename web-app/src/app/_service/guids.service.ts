import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Guids} from "../_model/guids";

@Injectable({
  providedIn: 'root'
})
export class GuidsService {

  constructor(private _httpClient: HttpClient) { }

  getAll(): Observable<Guids> {
    const href = '/api/contractorproperty/guids';
    return this._httpClient.get<Guids>(href);
  }
}
