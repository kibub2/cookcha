/**
 * 
 */

$(document).ready(function(){
	var width, height;
	width = $("#findShop").width();
	height = $("#findShop").height();
	//height = $("#findShop").height();
	
	var coordinateX = 0, coordinateY = 0, mapScale = 1;
	var g;
    var proj, path;
    
    var svg = d3.select('#findShop').append("svg")
    								.attr("id", "map_svg")
      								.attr("width", width)
      								.attr("height", height);
    
    svg.append("rect")
    	.attr("width", width)
    	.attr("height", height)
    	.on("click", mapScratch);
    
    mapScratch();

    $(window).resize(function(){
    	width = $("#findShop").width();
    	svg.attr("width", width);
    	svg.select('rect')
    		.attr("width", width);
    	//mapScratch();
    });
    
    $(".likeButton").on("click", function(){
    	var img = this.getElementsByTagName("img")[0];
    	if(this.value == 0){
    		img.src = "/final-kibeob2/resources/img/icon/heart.png";
    		this.value = 1;
    	}else{
    		img.src = "/final-kibeob2//resources/img/icon/heart-empty.png";
    		this.value = 0;
    	}
    });


    function mapScratch(eng_name){
    	var str = eng_name;
    	
    	//svg 태그에 있는 지도를 지운다
    	svg.select('g').remove();
    	
    	if(str == null){
    		str = 'Korea';
    		//서울의 대략적인 경도와 위도 [126.9895, 37.5651] (충청북도 [127, 36] 충청북도를 중심으로 수정..)
    		//메르카토르(mercator) 도법으로 위도와 경도를 x, y 좌표를 계산
    		//이 메소드는 기본적으로 전세계를 960x500 공간에 표현하도록 설계되어 있음
    		//(기본값으로 scare은 500, translate은 [480, 250] 이는 경도,위도가 0도 인 'null island'가 중심이도록 작성 됨) 
    		proj = d3.geo.mercator()
        			 .center([127, 36])
        			 .scale(3500)
        			 .translate([width/2, height/2])
    	}
    	
    	path = d3.geo.path().projection(proj);
    	
	    d3.json("/final-kibeob2/resources/mapdata/"+ str +".json", function(error, kor) {

    		if (error) return console.error(error);
    		
    		g=svg.append('g')
    			.attr('id', str)
    			.selectAll('path')
       	 	 	.data(kor.features)
       	 	 	.enter()
       	 	 	.append('path')
       	 	 	.attr('d', path)
       	 	 	.attr('class', 'municipality')
       	 	 	.attr('id', function(d){
       	 	 		return d.properties['eng_name'];
       	 	});
    		
    		if(str == 'Korea'){
    			g.on('click', function(d){
    				calc_center(d);
    				mapScratch(this.id);
    			});
    		}else{
    			g.transition()
    			 .duration(750)
    			 .attr("transform", "translate(" + width / 2 + "," + height / 2 + ")scale(" + mapScale + ")translate(" + -coordinateX + "," + -coordinateY + ")")
    			 .style("stroke-width", 1.5 / mapScale + "px");
    			
    			/*//구역에서 가장 맛이 있는 음식점 추천
    			g.on('',);*/
    		}
    	});
    }
    
    function calc_center(d) {
		if (d) {
			//centroid 영역의 중심 좌표를 리턴
			var centroid = path.centroid(d);
			coordinateX = centroid[0];
			coordinateY = centroid[1];
			mapScale = 3;
		    //centered = d;
		} 
    }
});