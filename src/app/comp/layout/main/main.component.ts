import { Component } from '@angular/core';
import {HeaderComponent} from "../header/header.component";
import {FooterComponent} from "../footer/footer.component";
import {CardComponent} from "../card/card.component";
import {MatButtonModule} from "@angular/material/button";
import {MatIconModule} from "@angular/material/icon";
import {MatDialog} from "@angular/material/dialog";
import {PopupModelComponent} from "../popup/popup-model/popup-model.component";
import {UpdatePopupComponent} from "../popup/update-popup/update-popup.component";

@Component({
  selector: 'app-main',
  standalone: true,
  imports: [
    HeaderComponent,
    FooterComponent,
    CardComponent,
    MatButtonModule,
    MatIconModule
  ],
  templateUrl: './main.component.html',
  styleUrl: './main.component.css'
})
export class MainComponent {

  constructor(public dialog: MatDialog) {}

  popUpForm(){
    this.dialog.open(PopupModelComponent)
  }
}
