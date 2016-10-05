$(function(){
	var currentPage;
	var selectPage
	var count;
	var pageNum;
	var keyField;
	var keyWord;
	
	/*$('#list-table').on('click','#delete',function(){
		var clickedRow=$(this).parent().parent();
		var id=clickedRow.find('td:eq(0)').text();
		$.ajax({
			type:'post',
			url:'memberListAjax.do',
			data:{pageNum:pageNum, keyField:keyField, keyWord:keyWord},
			dataType:'json',
			cache:false,
			timeout:30000,
			success:function(data){
				deleteList();
				loadList(pageNum, keyField, keyWord);
			}
		});
	});
		*/
	$('#list-table').on('click','#delete',function(){
		var clickedRow=$(this).parent().parent();
		var id=clickedRow.find('td:eq(0)').text();
		deleteList();
		loadList(pageNum, keyField, keyWord, id);
		alert('삭제되었습니다.');
		
	});
	//목록 정렬
	$('#load-member-list').click(function(){
		deleteList();
		//초기 데이터 호출
		loadList (1);
		
	});
	//리스트 불러오기
	function loadList(pageNum, keyField, keyWord, deleteId){
		currentPage=pageNum;
		
		if(pageNum==1){
			$('#output').empty();
		}
		
		$.ajax({
			type:'post',
			url:'memberListAjax.do',
			data:{pageNum:currentPage, keyField:keyField, keyWord:keyWord, deleteId:deleteId},
			dataType:'json',
			cache:false,
			timeout:30000,
			success:function(data){
				count=data.count;
				var list=data.list;
				if(count < 0 || list==null){
					alert('목록이 없습니다!');
				}else{
					//리스트목록 호출, 태그생성
					$(list).each(function(index, item){
						var output='';
						output+='<tr>';
						output+='<td class="fix" id="id">'+item.id+'</td>';
						output+='<td class="editable">'+item.name+'</td>';
						output+='<td class="editable">'+item.evaluation_count+'</td>';
						output+='<td class="fix">'+item.register+'</td>';
						output+='<td class="editable">'+item.birth+'</td>';
						output+='<td class="editable">'+item.sex+'</td>';
						output+='<td class="editable">'+item.grade+'</td>';
						output+='<td><button class=" btn btn-xs btn-default">수정</button>'
						output+='<button class="btn btn-xs btn-default" id="delete">삭제</button>'
						output+='<button class="btn btn-xs btn-success">저장</button></td>';
						output+='</tr>';

						//#output태그에 붙이기
						$('#output').append(output);
						$('.btn-success').hide();
					});

					//paging된 HTML태그를 #paging태그에 붙이기
					var pagingHtml=data.pagingHtml;
					$('#paging').append(pagingHtml);
				}
				$("#list-table").trigger("update");
				
			}	
		});
	}
	//리스트 없애기
	function deleteList(){
		//기존데이터 제거
		$('#output').empty();
		//페이징 데이터 제거
		$('#paging').empty();
	}
	
	
	
	$('#search-button').click(function(){
		//form에 있는 데이터를 불러와서 -> Array형으로 변환
		var formData=$('#search-form').serializeArray();
		keyField=formData[0].value;
		keyWord=formData[1].value;
		//기존 목록리스트를 제거->검색한 리스트 불러오기
		deleteList();
		loadList(1,keyField, keyWord);
		
	});
	//페이지별 호출
	$(document).on('click','#paging a', function(){//#paging a 태그는 동적으로 생성해서 on으로 처리
		currentPage=$(this).attr('target');//target:이동하고자 하는 page 번호
											//target의 정보->currentPage에 넣어줌
		deleteList();//기존 목록 삭제후
		loadList(currentPage); // 새로운 목록 호출->넣어준 currentPage로 목록 호출
	});
	
	//테이블 정렬 (plugin사용)
	$('#list-table').tablesorter();
	
	/*//수정불가 태그 클릭->다른색깔로 표시
	$('#list-table').on('click','td',function(){
		//수정불가 태그 클릭->다른색깔로 표시
		if($(this).attr('class')!='editable'){
			$(this).mousedown(function(){$('td[id=fix]').attr('style','background-color:#f3e7f1');});
			$(this).mouseup(function(){$('td[id=fix]').removeAttr('style');});
		}
	});
	*/
	
	
	
	
});