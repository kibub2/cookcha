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
					$('#validation').attr('class','input-group has-error has-feedback');
				}else if(data.result=='nameNotFound'){
					$('#validation').attr('class','input-group has-success has-feedback');
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





