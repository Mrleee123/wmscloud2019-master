<%--
  Created by IntelliJ IDEA.
  User: shapelee
  Date: 2019-06-28
  Time: 15:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <script src="jQuery.js"></script>
    <script type="text/javascript">
        function show(){
            $.post("/user",{},
                function(result){
                    alert(result);
                }
            );
        }

    </script>
</head>
<body>
<button onclick="show()">显示信息</button>
</body>
</html>
