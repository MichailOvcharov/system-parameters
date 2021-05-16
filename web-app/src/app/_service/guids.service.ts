import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Guids} from "../_model/guids";
import {DealType} from "../_model/deal-type";
import {SystemContractProperty} from "../_model/system-contract-propety";

@Injectable({
  providedIn: 'root'
})
export class GuidsService {

  constructor(private _httpClient: HttpClient) { }

  getAll(): Observable<Guids> {
    const href = '/api/contractorproperty/guids';
    return this._httpClient.get<Guids>(href);
  }

  getDealType(): Observable<DealType[]> {
    const href = '/api/dealtype';
    return this._httpClient.get<DealType[]>(href);
  }

  getList(): Observable<SystemContractProperty[]> {
    const href = '/api/contractorproperty/1';
    return this._httpClient.get<SystemContractProperty[]>(href);
  }

}
