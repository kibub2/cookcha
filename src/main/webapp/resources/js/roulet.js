window.onload = function(){
     
    var pArr = ["0","1","2","3","4:꽝","5","6","7","8","9"];
    var result = "";
 
    $('#start_btn').click(function(){
        rotation();
    });
 
    function rotation(){
        $("#ro_image").rotate({
          angle:0, 
          animateTo:360 * 5 + randomize(0, 360),
          center: ["50%", "50%"],
          easing: $.easing.easeInOutElastic,
          callback: function(){ 
                        var n = $(this).getRotateAngle();
                        endAnimate(n);
                    },
          duration:5000
       });
    }
 
    function endAnimate($n){
        var n = $n;
        $('#result_id').html("<p>움직인각도:" + n + "</p>");
        var real_angle = n%360 +18;
        var part = Math.floor(real_angle/36);
     
        $('#result_id2').html("<p>상품범위:" + part + "</p>");
 
        if(part < 1){
            $('#result_id3').html("<p>당첨내역:" + pArr[0] + "</p>");
			result = pArr[0];
			start_ajax();
            return;
        }
        if(part >= 10){
            $('#result_id3').html("<p>당첨내역:" + pArr[pArr.length-1] + "</p>");
            result = pArr[pArr.length-1];
            start_ajax();
            return;
        }
        $('#result_id3').html("<p>당첨내역:" + pArr[part] + "</p>");
        result = pArr[part];
      
        start_ajax();
    }
 
    function randomize($min, $max){
        return Math.floor(Math.random() * ($max - $min + 1)) + $min;
    }

    function start_ajax(){
    	alert(result);
    	
    	//ajax 통신
    	 $.ajax({
             url:'roulet.do',
             type:'post',
             data:{result:$('#result').val()},
             dataType:'json',
             cache:false,
             timeout:30000,
             success:function(data){
              
             },
             error:function(){
               alert('네트워크 오류 발생');
             }
          });
    	
    }

};