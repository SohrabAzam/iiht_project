import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'exampleAgular';
  public firstname:string;
  public lastname:string;
  public rows:Array<{firstname:string,lastname:string}>=[];

  buttonClicked(){
    this.rows.push({firstname:this.firstname, lastname:this.lastname});
    this.firstname="";
    this.lastname="";
  }
}
