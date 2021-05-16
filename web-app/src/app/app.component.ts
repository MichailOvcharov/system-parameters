import {Component, OnInit} from '@angular/core';
import {Router} from "@angular/router";
import {FormArray, FormBuilder, FormControl, FormGroup} from "@angular/forms";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {
  title = 'web-app';
  nameControl: FormControl;
  nameControl2: FormControl;
  fullNameControl: FormGroup;
  usersListControl: FormGroup;

  constructor(private router: Router, private formBuilder: FormBuilder){}
  goHome(){

    this.router.navigate(['']);
  }

  ngOnInit(): void {
    this.nameControl = new FormControl('John');
    this.nameControl2 = new FormControl;
    this.nameControl.valueChanges
      // .delay()
      // .swichMap()
      .subscribe(value => {console.log(value)})
    this.nameControl2.setValue(this.nameControl.value);
    this.nameControl.statusChanges.subscribe(status => {console.log(status)})

    this.fullNameControl = new FormGroup({
      firstName: new FormControl(),
      lastName: new FormControl()
    });
    this.fullNameControl.valueChanges.subscribe(value => {console.log(value)})

    // this.usersListControl = new FormGroup({
    //   users: new FormArray([
    //     new FormControl('John'),
    //     new FormControl('Alice'),
    //     new FormControl('Mikle')
    //   ])
    // });

    this.usersListControl = this.formBuilder.group({
      users: this.formBuilder.array([['John'],['Alice'],['Bob']])
    })

    this.usersListControl.valueChanges.subscribe(value => {console.log(value)})
  }

  getControls() {
    return (this.usersListControl.get('users') as FormArray).controls;
  }

  removeUserControl(index: any) {
    (this.usersListControl.controls['users'] as FormArray).removeAt(index);
  }

  addUserControl() {
    (this.usersListControl.controls['users'] as FormArray).push(new FormControl(''));
  }
}
