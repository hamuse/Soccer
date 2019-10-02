var app = (()=>{
	return {
		init  :  (ctx) =>{
			playerService.login(ctx);
			playerService.join(ctx);
			playerService.moveJoin(ctx);
			playerService.btn2(ctx);
				}
		};
})();
/*playerId, //id
teamId, playerName, ePlayerName,
		nickName, joinYYYY , position, backNo, nation, birthDate,
		solar,//pw
		height, weight ;	*/
var player = (()=>{
	var _playerId, _playerName, _teamId, _ePlayerName, _nickName, _joinYYYY, _position, _backNo, _nation, _birthDate, _solar, _height, _weight;
	var setPlayerId = (playerId)=>{this._playerId = playerId;}
	var setSolar = (solar)=>{this._solar = solar;}
	var getPlayerId = ()=>{return this._playerId;}
	var getSolar = ()=>{return this._solar;}
	return {
		setPlayerId : setPlayerId,
		setSolar : setSolar,
		getPlayerId : getPlayerId,
		getSolar : getSolar
	};
})();

var playerService = (()=>{
	return {
		login : (ctx)=>{
			$('#login_btn').click(()=>{
				if(	$('#playerId').val()==='' ||
						$('#solar').val()===''){
					alert('필수값이 없습니다. ')
				}else{
					alert('입력한 아이디값: '+	$('#username').val());
					$('#login_form').attr('action',ctx+'/player.do');
				$('#login_form').attr('method','POST');
					$('#login_form').submit();
				}
				
			});
		},
		join : (ctx)=>{
			$('#join_btn').click(()=>{
				if(	$('#join_playerId').val()==='' ||
						$('#join_solar').val()===''){
					alert('필수값이 없습니다. ')
				}else{
					alert('입력한 아이디값: '+	$('#join_playerId').val());
					$('#join_form').attr('action',ctx+'/player.do');
					$('#join_form').attr('method','GET');
					$('#join_form').submit();
				}
			});
		},
		moveJoin : (ctx)=>{
			$('#a_join').click(()=>{
				location.assign(ctx+'/facade.do?action=move&page=join');
			});
			},
			btn2 : (ctx)=>{
				$('#position').click(()=>{
					alert('position');
					location.assign('player.do?action=search&page=2_positions_a');
				});
			}
	};
})();

var playerbtn2 = (()=>{
	return{
		btn2 : (ctx)=>{
			$('#position').click(()=>{
				alert('position');
				location.assign(ctx+'/player.do?action=move&page=2_positions_a');
			});
		}
	};
})();