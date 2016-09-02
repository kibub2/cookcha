var now_point =prompt("현재 포인트를 입력하세요") 

var quantity=prompt("원하는 티켓수를 입력하세요");

var require_point = 1000*quantity;  //요구되는 포인트

if( now_point >= require_point ){

var after_point = now_point - require_point; //교환후 남은 포인트 

document.write("현재 포인트는"+now_point+"입니다.","<br />");

document.write("포인트를"+require_point+"만큼 차감 하겠습니다.","<br />");

document.write("남은 포인트는"+after_point+"입니다.","<br />");

document.write("총"+ quantity+"개를 신청하셧습니다.","<br />");
}else if(now_point < require_point){
	document.write("포인트 더 모아주세요")
}