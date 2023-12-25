import { Component } from '@angular/core';
import {NgClass} from "@angular/common";

@Component({
  selector: 'app-auth',
  standalone: true,
  imports: [
    NgClass
  ],
  templateUrl: './auth.component.html',
  styleUrl: './auth.component.css'
})
export class AuthComponent {
  isRegister= false;
}
