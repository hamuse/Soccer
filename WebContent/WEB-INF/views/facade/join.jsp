<%@ page language="java" contentType="text/html; charset=UTF-8"
     pageEncoding="UTF-8"%>
<body>
     회원가입 화면
     <h3>
         <a id="back" href="#">뒤로가기</a>
     </h3>
     <form id="join_form">
         <!-- playerId, teamId, playerName, ePlayerName,nickName, joinYYYY , position, backNo, nation, birthDate,solar,height, weight ;            -->
         <div class="input_class1">
              아이디:<input type="text" id="join_playerId" name="playerId" />
              비밀번호(solar):<input type="text" id="join_solar" name="solar" /> 이름:<input
                  type="text" name="playerName" /> 영어이름:<input type="text"
                  name="ePlayerName" /> 별명:<input type="text" name="nickName" />
              가입날짜:<input type="text" name="joinYYYY" /> 포지션:<input type="text"
                  name="position" /> 등번호:<input type="text" name="backNo" /> 지역:<input
                  type="text" name="nation" /> 생일:<input type="text" name="birthDate" />
              키:<input type="text" name="height" /> 몸무게:<input type="text"
                  name="weight" /> <input type="hidden" name="action" value="create" />
              <input type="hidden" name="page" value="login" /> <input
                  type="hidden" name="domain" value="player" /> <input id="join_btn"
                  type="button" value="전송" />
         </div>
     </form>
     <script>
         app.init('${ctx}');
     </script>
</body>