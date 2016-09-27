$(document).ready(function(){
    //Welcome Message (not for login page)
    function notify(message, type){
        $.growl({
            message: message
        },{
            type: type,
            allow_dismiss: false,
            label: 'Cancel',
            className: 'btn-xs btn-inverse',
            placement: {
                from: 'top',
                align: 'right'
            },
            delay: 2500,
            animate: {
                    enter: 'animated bounceIn',
                    exit: 'animated bounceOut'
            },
            offset: {
                x: 20,
                y: 85
            }
        });
    };
    
    $("#maxtable").keyup(function(){$(this).val( $(this).val().replace(/[^0-9]/g,"") );} );
    
    $("form").submit(function(){
    	if($("#name").val().trim() == ""){
    		alert("이름을 입력해주세요.");
    		$("#name").focus();
    		return false;
    	}
    	if($("#phone").val().trim() == ""){
    		alert("번호를 입력해주세요.");
    		$("#phone").focus();
    		return false;
    	}
    	if($("#address").val().trim() == ""){
    		alert("주소를 입력해주세요.");
    		$("#address").focus();
    		return false;
    	}
    	if($("#sub_address").val().trim() == ""){
    		alert("상세주소를 입력해주세요.");
    		$("#sub_address").focus();
    		return false;
    	}
    	if($("#classify").val().trim() == ""){
    		alert("가게분류를 선택해주세요.");
    		$("#classify").focus();
    		return false;
    	}
    	if($("#able_coupon").val().trim() == ""){
    		alert("쿠폰 가능 여부를 선택해주세요.");
    		$("#able_coupon").focus();
    		return false;
    	}
    	if($("#able_book").val().trim() == ""){
    		alert("예약 가능 여부를 선택해주세요.");
    		$("#able_book").focus();
    		return false;
    	}
    	if($("#maxtable").val().trim() == ""){
    		alert("예약가능 테이블 수를 입력해주세요.");
    		$("#maxtable").focus();
    		return false;
    	}
    });
    
    if (!$('.login-content')[0]) {
        notify('Welcome back Mallinda Hollaway', 'inverse');
    } 
    
    //가게이름 중복체크
    $('#name').focusout(function(){
		$.ajax({
			url:'checkShop.do',
			type:'post',
			data:{name:$('#name').val()},
			dataType:'json',
			cache:false,
			timeout:30000,
			success:function(data){
				
				if(data.result=='nameDuplicated'){
					$('#validation').html("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;중복된 이름입니다.").css("color", "red");
				}else if(data.result=='nameNotFound'){
					$('#validation').html("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;사용 가능한 이름입니다.").css("color", "blue");
				}else{
					alert('데이터 검색 오류!');
				}
			},
			error:function(){
				alert('네트워크 오류 발생!');
				
			}
		});
	});
    
   
    
  
    
    //예약가능일때만 예약테이블 수 수정가능하도록
    $('#able_book').focusout(function(){
    	if($(this).val()=='0'){
    		$('#maxtable').attr('disabled','disabled');
    	}else{
    		$('#maxtable').prop('disabled',false);
    	}
    });
    
});





