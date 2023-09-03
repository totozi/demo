<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>����-�ѱ���</h1>
	
	<h2>
		${msg }
	</h2>
	
    <button id="getRequestButton">GET ��û ������</button>
    
    <div id="translations"></div>

    <script>
        // ��ư Ŭ�� �� ������ �Լ�
        document.getElementById('getRequestButton').addEventListener('click', function() {
            // XMLHttpRequest ��ü ����
            var xhr = new XMLHttpRequest();
            
            // GET ��û�� ���� URL ����
            var url = '/demo/study/english'; 
            
            // GET ��û ������
            xhr.open('GET', url, true);
            xhr.onreadystatechange = function() {
                // ���� ������ �Ϸ�Ǹ� ����Ǵ� �ݹ� �Լ�
                if (xhr.readyState === 4 && xhr.status === 200) {
                   
                    //console.log(xhr.responseText); // ���� ������ �ֿܼ� ���
                    
                    const translationsDiv = document.getElementById("translations");
                    
                    const jsonData = JSON.parse(xhr.responseText);
                    
                    shuffleArray(jsonData);
                    
                    console.log(jsonData);
                    
                    jsonData.forEach((item, index) => {
                        const engText = item.eng;
                        const korText = item.kor;

                        // ���� �ؽ�Ʈ�� ���� ��ư�� �����մϴ�.
                        const translationElement = document.createElement("div");
                        translationElement.innerHTML = 
                            '<p>' + korText + '</p>' +
                            '<button class="translateButton">����</button>' +
                            '<p class="engText" style="display:none;">' + engText + '</p>';

                        translationsDiv.appendChild(translationElement);

                        // ��ư�� Ŭ�� �̺�Ʈ �����ʸ� �߰��մϴ�.
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
        
		// �迭�� �������� �����ϴ� �Լ�
		   function shuffleArray(array) {
		       for (let i = array.length - 1; i > 0; i--) {
		           const j = Math.floor(Math.random() * (i + 1));
		           [array[i], array[j]] = [array[j], array[i]];
		       }
		   }
	
    </script>
    
    
</body>
</html>