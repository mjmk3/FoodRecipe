import { Component } from '@angular/core';
import {MatInputModule} from "@angular/material/input";
import {FormsModule} from "@angular/forms";
import {MatButtonModule} from "@angular/material/button";

@Component({
  selector: 'app-popup-model',
  standalone: true,
  imports: [
    MatInputModule,
    FormsModule,
    MatButtonModule
  ],
  templateUrl: './popup-model.component.html',
  styleUrl: './popup-model.component.css'
})
export class PopupModelComponent {

}
