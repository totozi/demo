<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>영어-한국어</h1>
	
	<h2>
		${msg }
	</h2>
	
    <button id="getRequestButton">GET 요청 보내기</button>
    
    <div id="translations"></div>

    <script>
        // 버튼 클릭 시 실행할 함수
        document.getElementById('getRequestButton').addEventListener('click', function() {
            // XMLHttpRequest 객체 생성
            var xhr = new XMLHttpRequest();
            
            // GET 요청을 보낼 URL 지정
            var url = '/demo/study/english'; 
            
            // GET 요청 보내기
            xhr.open('GET', url, true);
            xhr.onreadystatechange = function() {
                // 서버 응답이 완료되면 실행되는 콜백 함수
                if (xhr.readyState === 4 && xhr.status === 200) {
                   
                    //console.log(xhr.responseText); // 응답 내용을 콘솔에 출력
                    
                    const translationsDiv = document.getElementById("translations");
                    
                    const jsonData = JSON.parse(xhr.responseText);
                    
                    shuffleArray(jsonData);
                    
                    console.log(jsonData);
                    
                    jsonData.forEach((item, index) => {
                        const engText = item.eng;
                        const korText = item.kor;

                        // 영어 텍스트와 번역 버튼을 생성합니다.
                        const translationElement = document.createElement("div");
                        translationElement.innerHTML = 
                            '<p>' + korText + '</p>' +
                            '<button class="translateButton">영어</button>' +
                            '<p class="engText" style="display:none;">' + engText + '</p>';

                        translationsDiv.appendChild(translationElement);

                        // 버튼에 클릭 이벤트 리스너를 추가합니다.
                        const translateButton = translationElement.querySelector(".translateButton");
                        const korTextElement = translationElement.querySelector(".engText");
                        
                        translateButton.addEventListener("click", function() {
                            korTextElement.style.display = "block";
                        });
                    });


                }
            };
            xhr.send();
        });
        
		// 배열을 랜덤으로 정렬하는 함수
		   function shuffleArray(array) {
		       for (let i = array.length - 1; i > 0; i--) {
		           const j = Math.floor(Math.random() * (i + 1));
		           [array[i], array[j]] = [array[j], array[i]];
		       }
		   }
	
    </script>
    
    
</body>
</html>