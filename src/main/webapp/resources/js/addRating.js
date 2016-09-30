/**
 * 별점추가시 평가 반영
 */
$(document).ready(function() {
	$("label[id*='-star-']").click(function(){
		alert($(this).attr("id"));
		$.ajax({
			url:'../addRating.do',
			type:'post',
			data:{id:$(this).attr("id")},
			dataType:'json',
			cache:false,
			timeout:30000,
			success:function(data){
				
				if(data.result=='success'){
					alert('평가가 완료되었습니다!');
					alert(data.shop_rating+$(this).attr('class'));
					
					/*if($(this).next('span').attr('class')=='ratedShop')
					{
						$(this).next('span').removeAttr("style").css("width","60%");
					}else{
						$(this).next('span').css("width","60%");
					}*/
					/*alert(data.shop_rating);*/
					/*$(this).attr(".item-price").text("data.shop_rating");*/
				}else if(data.result=='requireLogin'){
					alert('로그인하셔야 평가가 가능합니다!');
				}else if(data.result=='failure'){
					alert('평가정보 전송중 에러발생!');
				}else{
					alert('데이터 검색 오류!');
				}
			},
			error:function(){
				alert('네트워크 오류 발생!');
				
			}
		});
	});
	$(".ratedShop").next().remove();
	
});