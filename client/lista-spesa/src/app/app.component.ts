import { Component } from '@angular/core';
import { Prodotto } from './prodotto';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  prodotto : Prodotto = new Prodotto();
  prodotti : Prodotto[]= [];

  constructor(private http: HttpClient) { 
    let ox:  Observable<Prodotto[]>= http.get<Prodotto[]>("http://localhost:8080/add");
    ox.subscribe(
      (      u: Prodotto[])=>this.prodotti=u
    )
  }

  aggiungi(){
    console.log('Siamo di aggiungi');

  }

  rimuovi(){

  }

  mostraProdotti(){

  }
}
