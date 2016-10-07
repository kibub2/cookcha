$(document).ready(function(){
	var checkIdDuplicated = 0;
	
	//아이디 중복 체크
	$('#confirmId').click(function(){
		if($('#id').val() == ''){
			alert('아이디를 입력하세요');
			$('#id').focus();
			return;
		}
		$('#id_signed').html(''); //메시지 초기화
		$('#loading').show(); //로딩 이미지 노출
		
		$.ajax({
			url: 'confirmId.do',
			type: 'post',
			data: {id: $('#id').val()},
			dataType: 'json',
			cache: false, //cache를 인정하게 되면 옛날 데이터가 보여지기 때문에 false
			timeout: 30000,
			success: function(data){
				$('#loading').hide(); //성공하면 로딩 이미지 감추기
				if(data.result == 'idNotFound'){
					$('#id_signed').css('color', '#000000').text('등록가능 ID');
					checkIdDuplicated = 1;
				}else if(data.result == 'idDuplicated'){
					$('#id_signed').css('color', 'red').text('중복된 ID');
					checkIdDuplicated = 0;
				}else{
					alert('아이디 중복 체크 오류 발생');
				}
			},
			error: function(){
				$('#loading').hide(); //에러나면 로딩 이미지 감추기
				alert('네트워크 오류 발생');
			}
			
		});
		
	});
	//아이디 중복 안내 메시지 초기화 및 아이디 중복 값 초기화
	$('#register_form #id').keyup(function(){
		checkIdDuplcated = 0;
		$('#id_signed').text('');
	});
	
	$('#register_form').submit(function(){
		if(checkIdDuplicated == 0) {
			alert('아이디 중복 체크 필수!');
			if($('#id').val() == '') {
				$('#id').focus();
			}else{
				$('#confirmId').focus();
			}
			return false; //submit 방지
		}
	});

});