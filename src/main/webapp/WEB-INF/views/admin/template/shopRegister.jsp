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
	       	<form:form commandName="shop" action="shopRegister.do"  method="post">
	        <div class="row">
	        
	            <div class="col-sm-6">                       
	                <div class="input-group">
	                    <span class="input-group-addon"><i class="md md-account-box"></i></span>
	                    <div class="fg-line">
	                    	<input type="text" class="form-control" name="name" id="name" placeholder="가게 이름"/>
	                    </div>
	                </div>
                    <div id="validation"></div>
	                
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
	                                   <option value="">가게 분류</option>
	                                   <option value="1">한식</option>
	                                   <option value="2">일식</option>
	                                   <option value="3">중식</option>
	                                   <option value="4">아시아퓨전</option>
	                                   <option value="5">서양음식</option>
	                                   <option value="6">패밀리레스토랑</option>
	                                   <option value="7">분식</option>
	                                   <option value="8">패스트푸드</option>
	                                   <option value="9">피자</option>
	                                   <option value="10">치킨</option>
	                                   <option value="11">주점</option>
	                                   <option value="12">기타</option>
	                               </select>
	                           </div>
	                        </div>
	                  </div>
	                  <br/>
	                  <div class="input-group">
	                      <span class="input-group-addon"><i class="md md-done"></i></span>
	                       <div class="fg-line">
	                           <div class="select">
	                               <form:select path="able_coupon" name="able_coupon" id="able_coupon" class="form-control">
	                                   <option value="">쿠폰 가능 여부</option>
	                                   <option value="1">가능</option>
	                                   <option value="0">불가능</option>
	                               </form:select>
	                           </div>
	                        </div>
	                  </div>
	                  <br/>
	                  <div class="input-group">
	                      <span class="input-group-addon"><i class="md md-done"></i></span>
	                       <div class="fg-line">
	                           <div class="select">
	                               <select name="able_book" id="able_book" class="form-control">
	                                   <option value="">예약 가능 여부</option>
	                                   <option value="1">가능</option>
	                                   <option value="0">불가능</option>
	                               </select>
	                           </div>
	                        </div>
	                  </div>
	                  <br/>
					<div class="input-group">
						<span class="input-group-addon"><i class="md md-filter-9-plus"></i></span>
						<div class="fg-line">
							<input name="maxtable" id="maxtable" type="text" class="form-control" placeholder="예약가능 테이블 수(숫자만...)"/>
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
              	<div class="col-sm-4">
              		
              		<div class="fg-line">
                       <textarea name="introduction" class="form-control" rows="9" placeholder="가게 상세정보 입력...."></textarea>
                    </div>
              	</div>
	        	
	        	<div class="col-sm-2">
					<button type="submit" class="btn btn-primary btn-sm waves-effect waves-button waves-float">등록</button>
				</div> 
				
	           
	           
			</div>
		
				
			
			</form:form>
		
		</div>
	</div>
	
</div>


</section>
</section>

