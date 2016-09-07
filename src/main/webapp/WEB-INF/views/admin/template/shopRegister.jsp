<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<section id="main">
<section id="content">
<div class="container">
	<div class="card">
	    <div class="card-header">
	        <h2>Input Groups <small>Extend form controls by adding text or buttons before, after, or on both sides of any text-based inputs.</small></h2>
	    </div>
	    
	    <div class="card-body card-padding">
	        <h2>가게 정보 입력</h2>
	        
	        
	        <br/>
	        <!-- 가게 정보 입력 -->
	       	<form action="shopRegister.do" enctype="multipart/form-data" method="post">
	        <div class="row">
	        
	            <div class="col-sm-6">                       
	                <div class="input-group">
	                    <span class="input-group-addon"><i class="md md-account-box"></i></span>
	                    <div class="fg-line">
	                            <input type="text" class="form-control" name="name" id="name" placeholder="가게 이름"/>
	                    </div>
	                </div>
	                
	                <br/>
	                
	                <div class="input-group">
	                    <span class="input-group-addon"><i class="md md-local-phone"></i></span>
	                    <div class="fg-line">
	                        <input type="text" name="phone" id="phone" class="form-control" placeholder="가게 전화번호"/>
	                    </div>
	                </div>
	                
	                <br/>
	                
	                <div class="input-group">
	                    <span class="input-group-addon"><i class="md md-home"></i></span>
	                    <div class="fg-line">
	                        <input name="address" id="address" type="text" class="form-control" placeholder="가게 주소 (도/시/구)"/>
	                    </div>
	                </div>
	                
	                <br/>
	                
	                <div class="input-group">
	                    <span class="input-group-addon"><i class="md md-trending-neutral"></i></span>
	                    <div class="fg-line">
	                        <input name="sub_address" id="sub_address" type="text" class="form-control" placeholder="상세주소(동외 상세...)"/>
	                    </div>
	                </div>
	                 <br/>
	            </div>
	            
	            <div class="col-sm-6">                       
	                 <div class="input-group">
	                      <span class="input-group-addon"><i class="md md-label"></i></span>
	                       <div class="fg-line">
	                           <div class="select">
	                          
	                               <select name="classify" id="classify" class="form-control">
	                                   <option>가게 분류</option>
	                                   <option>한식</option>
	                                   <option>일식</option>
	                                   <option>중식</option>
	                                   <option>아시아퓨전</option>
	                                   <option>서양음식</option>
	                                   <option>패밀리레스토랑</option>
	                                   <option>분식</option>
	                                   <option>패스트푸드</option>
	                                   <option>피자</option>
	                                   <option>치킨</option>
	                                   <option>주점</option>
	                                   <option>기타</option>
	                               </select>
	                           </div>
	                        </div>
	                  </div>
	                  <br/>
	                  <div class="input-group">
	                      <span class="input-group-addon"><i class="md md-done"></i></span>
	                       <div class="fg-line">
	                           <div class="select">
	                               <select name="able_coupon" id="able_coupon" class="form-control">
	                                   <option>쿠폰 가능 여부</option>
	                                   <option>가능</option>
	                                   <option>불가능</option>
	                               </select>
	                           </div>
	                        </div>
	                  </div>
	                  <br/>
	                  <div class="input-group">
	                      <span class="input-group-addon"><i class="md md-done"></i></span>
	                       <div class="fg-line">
	                           <div class="select">
	                               <select name="able_book" class="form-control">
	                                   <option>예약 가능 여부</option>
	                                   <option>가능</option>
	                                   <option>불가능</option>
	                               </select>
	                           </div>
	                        </div>
	                  </div>
	                  <br/>
					<div class="input-group">
						<span class="input-group-addon"><i class="md md-filter-9-plus"></i></span>
						<div class="fg-line">
							<input name="maxtable" id="maxtable" type="text" class="form-control" placeholder="예약가능 테이블 수(숫자만...) "/>
						</div>
					</div>
				</div>
					
				<!-- 가게 정보 입력 -->
				
			</div>
			<br></br>
			<br></br>
			
				
			<!-- 사진 등록 -->
			
			<div class="row">
				<div class="col-sm-3">
					<div class="input-group">
						<p class="f-500 c-black m-b-20">Image Preview</p>
		               <div class="fileinput fileinput-new" data-provides="fileinput">
		                   <div class="fileinput-preview thumbnail" data-trigger="fileinput"></div>
		                   <div>
		                       <span class="btn btn-info btn-file">
		                           <span class="fileinput-new">Select image</span>
		                           <span class="fileinput-exists">Change</span>
		                           <input type="file" name="upload1" id="upload1">
		                       </span>
		                       <a href="#" class="btn btn-danger fileinput-exists" data-dismiss="fileinput">Remove</a>
		                   </div>
		               </div>
		            </div>
	               <br/>
	           </div>
	           <div class="col-sm-3">
	             	 <div class="input-group">
		            	<p class="f-500 c-black m-b-20">Image Preview</p>
	                	<div class="fileinput fileinput-new" data-provides="fileinput">
			               	<div class="fileinput-preview thumbnail" data-trigger="fileinput"></div>
			                   <div>
			                         <span class="btn btn-info btn-file">
			                             <span class="fileinput-new">Select image</span>
			                             <span class="fileinput-exists">Change</span>
			                             <input type="file" name="upload2" id="upload2">
			                         </span>
			                         <a href="#" class="btn btn-danger fileinput-exists" data-dismiss="fileinput">Remove</a>
							</div>
						</div>
					</div>
					
              	</div>
              	<div class="col-sm-3">
              		
              		<div class="fg-line">
                       <form:textarea path="introduction" class="form-control" rows="5" placeholder="가게 상세정보 입력...."/>
                    </div>
              	</div>
	        	
	        	<div>
					<button type="submit" class="btn btn-primary btn-sm m-t-10 waves-effect waves-button waves-float">Submit</button>
				</div>
				
	           
	           
			</div>
		
				
			
			</form>
		
		</div>
	</div>
	
</div>


</section>
</section>

