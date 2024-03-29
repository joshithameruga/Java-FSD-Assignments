import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Player } from './player';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PlayerService {

  constructor(private http:HttpClient) { }


  updatePlayer(body:Player):Observable<Player>{

    console.log(body);
  
      return this.http.put<Player>("http://localhost:8080/api/players/updatePlayerByQuery",body );
  
}

}
