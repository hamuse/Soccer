package com.soccer.web.domains;

import java.io.Serializable;

import lombok.Data;

@Data
public class PlayerBean implements Serializable {
      private String playerId, teamId, playerName, ePlayerName,
      				nickName, joinYYYY , position, backNo, nation, birthDate,
      				solar, height, weight ;				
      				
}
