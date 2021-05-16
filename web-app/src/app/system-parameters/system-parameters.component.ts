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

  public specials: {
    id: number,
    title: string,
    tag: string
  }[] = [
    { id : 0, title: 'Алгоритм распределения не задается', tag: 'NO_SPEC'},
    { id : 1, title: 'Алгоритм распределения задается', tag: 'SPEC'}
  ];

  public imenniks: {
    id: number,
    title: string,
    tag: string
  }[] = [
    { id : 0, title: 'Алгоритм распределения не задается', tag: 'NO_IMENNIK'},
    { id : 1, title: 'Алгоритм распределения задается', tag: 'IMENNIK'}
  ];

  public assayworks: {
    id: number,
    title: string,
    tag: string
  }[] = [
    { id : 0, title: 'Алгоритм распределения не задается', tag: 'NO_ASSAY'},
    { id : 1, title: 'Алгоритм распределения задается', tag: 'ASSAY'}
  ];

  public chemicals: {
    id: number,
    title: string,
    tag: string
  }[] = [
    { id : 0, title: 'Алгоритм распределения не задается', tag: 'NO_CHEMICAL'},
    { id : 1, title: 'Алгоритм распределения задается', tag: 'CHEMICAL'}
  ];

  public markings: {
    id: number,
    title: string,
    tag: string
  }[] = [
    { id : 0, title: 'Алгоритм распределения не задается', tag: 'NO_MARKING'},
    { id : 1, title: 'Алгоритм распределения задается', tag: 'MARKING'}
  ];

  public statecontrols: {
    id: number,
    title: string,
    tag: string
  }[] = [
    { id : 0, title: 'Алгоритм распределения не задается', tag: 'NO_STATE'},
    { id : 1, title: 'Алгоритм распределения задается', tag: 'STATE'}
  ];

  constructor(private _guidsService: GuidsService, private fb: FormBuilder) {
  }

  ngOnInit(): void {
    this._guidsService.getDealType().subscribe(result => {this.dealTypes = result,
      console.log(this.dealTypes)
    });
    this._guidsService.getList().subscribe(result => {this.systemContractProperties = result,
      console.log(this.systemContractProperties.length),
      console.log(this.getValue(this.systemContractProperties, 14));
      console.log(this.systemContractProperties)
      if (this.systemContractProperties.length > 0) {
        this.form.get('distribution')?.setValue(this.getValue(this.systemContractProperties, 1));
        this.form.get('special')?.setValue(this.getValue(this.systemContractProperties, 14));
        this.form.get('imennik')?.setValue(this.getValue(this.systemContractProperties, 15));
        this.form.get('assaywork')?.setValue(this.getValue(this.systemContractProperties, 16));
        this.form.get('chemical')?.setValue(this.getValue(this.systemContractProperties, 17));
        this.form.get('marking')?.setValue(this.getValue(this.systemContractProperties, 18));
        this.form.get('statecontrol')?.setValue(this.getValue(this.systemContractProperties, 19));
      } else {
        this.form.get('distribution')?.setValue('HANDHELD');
        this.form.get('special')?.setValue('NO_SPEC');
        this.form.get('imennik')?.setValue('NO_IMENNIK');
        this.form.get('assaywork')?.setValue('NO_ASSAY');
        this.form.get('chemical')?.setValue('NO_CHEMICAL');
        this.form.get('marking')?.setValue('NO_MARKING');
        this.form.get('statecontrol')?.setValue('NO_STATE');
      }
    });
    this.form = this.fb.group({
      dealType: '',
      currency: '',
      distribution: new FormControl(''),
      special: new FormControl(''),
      imennik: new FormControl(''),
      assaywork: new FormControl(''),
      chemical: new FormControl(''),
      marking: new FormControl(''),
      statecontrol: new FormControl(''),
     });
    console.log(this.length);
  }

  onSubmit(): void {
    console.log(this.form.value);
  }

  getValue(systemContractProperties: SystemContractProperty[], id: number):any  {
    for(let i = 0; i < systemContractProperties.length; i++) {
      if (systemContractProperties[i].property_type_id === id) {
        return systemContractProperties[i].value;
      }
      return '';
    }
  }
}
