/**
 * 별점추가시 평가 반영
 */
$(document).ready(function() {
	$("label[id*='-star-']").click(function(){
		alert($(this).attr("id"));
		$.ajax({
			url:'addRating.do',
			type:'post',
			data:{id:$(this).attr("id")},
			dataType:'json',
			cache:false,
			timeout:30000,
			success:function(data){
				alert('전송성공!'+data);
				/*if(data.result=='nameDuplicated'){
					$('#validation').attr('class','input-group has-error has-feedback');
				}else if(data.result=='nameNotFound'){
					$('#validation').attr('class','input-group has-success has-feedback');
				}else{
					alert('데이터 검색 오류!');
				}*/
			},
			error:function(){
				alert('네트워크 오류 발생!');
				
			}
		});
	});
	
});