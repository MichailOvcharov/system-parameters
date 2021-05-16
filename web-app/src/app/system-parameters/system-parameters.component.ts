import { Component, OnInit } from '@angular/core';
import {Guids} from "../_model/guids";
import {GuidsService} from "../_service/guids.service";
import {Currency} from "../_model/currency";
import {map} from "rxjs/operators";
import {DealType} from "../_model/deal-type";
import {FormArray, FormBuilder, FormControl, FormGroup} from "@angular/forms";
import {SystemContractProperty} from "../_model/system-contract-propety";

@Component({
  selector: 'app-system-parameters',
  templateUrl: './system-parameters.component.html',
  styleUrls: ['./system-parameters.component.scss']
})
export class SystemParametersComponent implements OnInit {

  guids?: Guids;
  public currency?: Currency[];
  public dealTypes?: DealType[];
  public systemContractProperties: SystemContractProperty[];
  public form: FormGroup;
  length: number;
  public distributions: {
    id: number,
    title: string,
    tag: string
  }[] = [
    { id : 0, title: 'В ручную', tag: 'HANDHELD'},
    { id : 1, title: 'Автоматически', tag: 'AUTOMATIC'}
  ];

  // public distributions: {
  //   id: number,
  //   title: string,
  //   tag: string
  // }[] = [
  //   { id : 0, title: 'Не задавать алгоритм', tag: 'NO'},
  //   { id : 1, title: 'Задавать алгоритм', tag: 'YES'}
  // ];

  favoriteSeason: string;
  seasons: string[] = ['Winter', 'Spring', 'Summer', 'Autumn'];

  constructor(private _guidsService: GuidsService, private fb: FormBuilder) {

  }
    // this.description

  ngOnInit(): void {
    // this._guidsService.getAll()
    // //   .pipe(
    // //   map(data => {this.currency = data.currences})
    // // )
    //   .subscribe(
    //   (res: Guids) => {
    //     this.guids = res;
    //     console.log('111', this.guids.getCurrency());
    //     if (res && res.currences) {
    //       this.currency = res.currences
    //       console.log('111', this.currency);
    //     }
    //   }
    // guids => this.guids = guids
    this._guidsService.getDealType().subscribe(result => {this.dealTypes = result,
      console.log(this.dealTypes)
    });
    this._guidsService.getList().subscribe(result => {this.systemContractProperties = result,
      console.log(this.systemContractProperties.length),
      console.log(this.getValue(this.systemContractProperties, 1));
      if (this.systemContractProperties.length > 0) {
        this.form.get('distribution')?.setValue(this.getValue(this.systemContractProperties, 1));
      } else {
        this.form.get('distribution')?.setValue('HANDHELD');
      }
    });
    // this.form.controls['distribution'].setValue('NO');
    this.form = this.fb.group({
      dealType: '',
      currency: '',
      distribution: new FormControl('')
      // references: this.fb.array([this.fb.control('')])
    });
    console.log(this.length);
    // if () {
    //   this.form.get('distribution')?.setValue('HANDHELD');
    // }
  }
  onSubmit(): void {
    console.log(this.form.value);
  }

  // get references(): FormArray {
  //   return this.form.get('references') as FormArray;
  // }

  getValue(systemContractProperties: SystemContractProperty[], id: number):any  {
    for(let i = 0; i < systemContractProperties.length; i++) {
      if (systemContractProperties[i].property_type_id === id) {
        return systemContractProperties[i].value;
      }
      return '';
    }
  }
}
