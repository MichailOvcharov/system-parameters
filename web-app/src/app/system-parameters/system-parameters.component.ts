import { Component, OnInit } from '@angular/core';
import {Guids} from "../_model/guids";
import {GuidsService} from "../_service/guids.service";
import {Currency} from "../_model/currency";
import {map} from "rxjs/operators";

@Component({
  selector: 'app-system-parameters',
  templateUrl: './system-parameters.component.html',
  styleUrls: ['./system-parameters.component.scss']
})
export class SystemParametersComponent implements OnInit {

  guids?: Guids;
  public currency?: Currency[];

  constructor(private _guidsService: GuidsService) { }

  ngOnInit(): void {
    this._guidsService.getAll()
    //   .pipe(
    //   map(data => {this.currency = data.currences})
    // )
      .subscribe(
      (res: Guids) => {
        this.guids = res;
        console.log('111', this.guids.getCurrency());
        if (res && res.currences) {
          this.currency = res.currences
          console.log('111', this.currency);
        }
      }
      // guids => this.guids = guids
      );
  }
}
