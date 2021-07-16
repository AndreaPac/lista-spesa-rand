import { Component } from '@angular/core';
import { Prodotto } from './prodotto';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  prodotto : Prodotto = new Prodotto();
  prodotti : Prodotto[]= [{nome:"mela"}];

  aggiungi(){

  }

  rimuovi(){

  }
}
