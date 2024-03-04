import { Component } from '@angular/core';
import { Player } from '../player';
import { PlayerService } from '../player.service';

@Component({
  selector: 'app-update-player',
  templateUrl: './update-player.component.html',
  styleUrls: ['./update-player.component.css']
})
export class UpdatePlayerComponent {

  constructor(private service:PlayerService){}

  updatePlayer(data:Player){
        
    this.service.updatePlayer(data)
    .subscribe((player) => {console.log("player:"+player);})

    
  }
   

}
