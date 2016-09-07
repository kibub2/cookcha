<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link href="${pageContext.request.contextPath}/resources/admin/css/input.css" rel="stylesheet">

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
	       
	        <div class="row">
	            <div class="col-sm-6">                       
	                <div class="input-group">
	                    <span class="input-group-addon"><i class="md md-account-box"></i></span>
	                    <div class="fg-line">
	                            <input type="text" class="form-control" placeholder="가게 이름">
	                    </div>
	                </div>
	                
	                <br/>
	                
	                <div class="input-group">
	                    <span class="input-group-addon"><i class="md md-local-phone"></i></span>
	                    <div class="fg-line">
	                        <input type="text" class="form-control" placeholder="가게 전화번호">
	                    </div>
	                </div>
	                
	                <br/>
	                
	                <div class="input-group">
	                    <span class="input-group-addon"><i class="md md-home"></i></span>
	                    <div class="fg-line">
	                        <input type="text" class="form-control" placeholder="가게 주소 (도/시/구)">
	                    </div>
	                </div>
	                
	                <br/>
	                
	                <div class="input-group">
	                    <span class="input-group-addon"><i class="md md-trending-neutral"></i></span>
	                    <div class="fg-line">
	                        <input type="text" class="form-control" placeholder="상세주소(동외 상세...)">
	                    </div>
	                </div>
	                 <br/>
	            </div>
	            
	            <div class="col-sm-6 col-md-6">                       
	                 <div class="input-group">
	                      <span class="input-group-addon"><i class="md md-label"></i></span>
	                       <div class="fg-line">
	                           <div class="select">
	                               <select class="form-control">
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
	                               <select class="form-control">
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
	                               <select class="form-control">
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
							<input type="text" class="form-control" placeholder="예약가능 테이블 수(숫자만...) ">
						</div>
					</div>
				</div>
					<br/>
				<!-- 가게 정보 입력 -->
			</div>
			
				
			<!-- 사진 등록 -->
			
			
				<div class="col-sm-6 col-md-6 inputPic">
					<div class="input-group">
						<p class="f-500 c-black m-b-20">Image Preview</p>
		               <div class="fileinput fileinput-new" data-provides="fileinput">
		                   <div class="fileinput-preview thumbnail" data-trigger="fileinput"></div>
		                   <div>
		                       <span class="btn btn-info btn-file">
		                           <span class="fileinput-new">Select image</span>
		                           <span class="fileinput-exists">Change</span>
		                           <input type="file" name="...">
		                       </span>
		                       <a href="#" class="btn btn-danger fileinput-exists" data-dismiss="fileinput">Remove</a>
		                   </div>
		               </div>
		            </div>
	               <br/>
               </div>
	               
	           
	            <div class="col-sm-6 col-md-6 inputPic">
	            	<div class="input-group">
		            	<p class="f-500 c-black m-b-20">Image Preview</p>
	                	<div class="fileinput fileinput-new" data-provides="fileinput">
			               	<div class="fileinput-preview thumbnail" data-trigger="fileinput"></div>
			                   <div>
			                         <span class="btn btn-info btn-file">
			                             <span class="fileinput-new">Select image</span>
			                             <span class="fileinput-exists">Change</span>
			                             <input type="file" name="...">
			                         </span>
			                         <a href="#" class="btn btn-danger fileinput-exists" data-dismiss="fileinput">Remove</a>
							</div>
						</div>
					</div>
				</div>
			
		</div>
	</div>
</div>


</section>
</section>

