import { Component } from '@angular/core';
import {MatCardModule} from "@angular/material/card";
import {MatButtonModule} from "@angular/material/button";
import {MatIconModule} from "@angular/material/icon";
import {UpdatePopupComponent} from "../popup/update-popup/update-popup.component";
import {MatDialog} from "@angular/material/dialog";

@Component({
  selector: 'app-card',
  standalone: true,
  imports: [
    MatCardModule,
    MatButtonModule,
    MatIconModule
  ],
  templateUrl: './card.component.html',
  styleUrl: './card.component.css'
})
export class CardComponent {
  constructor(public dialog: MatDialog) {}

  updatePopUp(){
    this.dialog.open(UpdatePopupComponent)
  }
}
