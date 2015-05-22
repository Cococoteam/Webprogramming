<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; utf-8">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
    <link href='./stylesheets/style.css' rel='stylesheet' >
</head>

<body>
    <script src="http://code.jquery.com/jquery.js"></script>
    <div class='col-md-12'><!--상단바-->
        <p class="bg-primary" style="margin 0% -20% 0% -20%;">CAMPUSBOOK</p>
    </div>
    
    <div class='col-md-12'>
        <div class='col-md-7'><!--그림사진-->
            <center>
                <img src='/resources/inuimg.jpg' style='height:170px; margin:110px 0px 0px 0px;'>
                </br></br></br></br></br>
                <p style="font-size:20px;font-family:TD씨_씨고딕">인천대학교 Campusbook에 오신것을 환영합니다.</p>
                <p style="font-size:20px;font-family:씨고딕">Campusbook에서 나와 같은 수업을 듣는 친구들을 만나보세요.</p>
            </center>
        </div>
        
        <div class='col-md-5' style='padding:0px;' ><!--로그인div-->
            <div class='col-md-9'><!--로그인-->
                <input type='text' class='form-control' id="id" style='width:100%; margin: 90px 0px 0px 0px;' placeholder='학번'>
                <input type='password' class='form-control' id="password" style='width:100%; margin: 2% 0% 3% 0%' placeholder='비밀번호'>
                <div class="checkbox" style='margin:0% 0% 5% 0%'>
                    <label>
                        <input type="checkbox" value="">
                            자동 로그인
                    </label>
                </div>
            <!--회원가입-->
                <input type='text' class='form-control' id="id" style='width:100%; margin: 100px 0px 0px 0px;' placeholder='이름'>
                <input type='text' class='form-control' id="id" style='width:100%; margin: 2% 0% 0% 0%;' placeholder='학번'>
                <input type='password' class='form-control' id="password" style='width:100%; margin: 2% 0% 0% 0%' placeholder='비밀번호'>
                <input type='password' class='form-control' id="password" style='width:100%; margin: 2% 0% 0% 0%' placeholder='비밀번호 확인'>
            </div>
            <div class='col-md-3'><!--버튼-->
                <button type="button" id="login" class="btn btn-primary" style="width:90px; height:70px; margin: 90px 0px 0px -20px;">로그인</button>
                <button type="button" id="join" class="btn btn-primary" style="width:90px; height:70px; margin: 140px 0px 0px -20px;">회원가입</button>
            </div>
        </div>
    </div>


    <script>
    $("#join").click(function(){
    	location.href="/home"
    })
    
    </script>
    </body>
</html>