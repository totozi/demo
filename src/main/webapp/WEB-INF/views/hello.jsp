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
	
    <button id="getRequestButton">GET ��û ������</button>

    <script>
        // ��ư Ŭ�� �� ������ �Լ�
        document.getElementById('getRequestButton').addEventListener('click', function() {
            // XMLHttpRequest ��ü ����
            var xhr = new XMLHttpRequest();
            
            // GET ��û�� ���� URL ����
            var url = '/demo/sample/test'; 
            
            // GET ��û ������
            xhr.open('GET', url, true);
            xhr.onreadystatechange = function() {
                // ���� ������ �Ϸ�Ǹ� ����Ǵ� �ݹ� �Լ�
                if (xhr.readyState === 4 && xhr.status === 200) {
                   
                    console.log(xhr.responseText); // ���� ������ �ֿܼ� ���
                }
            };
            xhr.send();
        });
    </script>
</body>
</html>