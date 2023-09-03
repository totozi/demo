<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello World!!</h1>
	
	<h2>
		${msg }
	</h2>
	
    <button id="getRequestButton">GET 요청 보내기</button>

    <script>
        // 버튼 클릭 시 실행할 함수
        document.getElementById('getRequestButton').addEventListener('click', function() {
            // XMLHttpRequest 객체 생성
            var xhr = new XMLHttpRequest();
            
            // GET 요청을 보낼 URL 지정
            var url = '/demo/sample/test'; 
            
            // GET 요청 보내기
            xhr.open('GET', url, true);
            xhr.onreadystatechange = function() {
                // 서버 응답이 완료되면 실행되는 콜백 함수
                if (xhr.readyState === 4 && xhr.status === 200) {
                   
                    console.log(xhr.responseText); // 응답 내용을 콘솔에 출력
                }
            };
            xhr.send();
        });
    </script>
</body>
</html>