<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	<body>
	</body>
	<script type="text/javascript">
		const originalData = [
		  { name: 'bo', age: 30, score: 90, gender: 1, lesson: 'math' },
		  { name: 'hou', age: 31, score: 80, gender: 1, lesson: 'math' }, 
		  { name: 'jian', age: 27, score: 70, gender: 0, lesson: 'math' }, 
		  { name: 'bo', age: 30, score: 80, gender: 1, lesson: 'english' }
		];
		
		function checkNameCount(name,originalData){
			var countName = 0;
			for(var i=0;i<originalData.length;i++){
				if(originalData[i].name == name){
					countName++;
				}
			}
			var rn=[];
			if(countName>1){
				for(var i=0;i<originalData.length;i++){
					if(originalData[i].name == name){
						rn.push(originalData[i]);
					}
				}
				return rn;
			}else{
				return null;
			}
			
		}
		console.log(checkNameCount('bo',originalData));
		function checkAge(age,originalData){
			var arr = [];
			for(var i=0;i<originalData.length;i++){
				if(originalData[i].age>age){
					arr.push(originalData[i])
				}
			}
			return arr;
		}
		console.log(checkAge(20,originalData))
		
		function avgScore(lesson,originalData){
			var rn = {};
			var genderOneScore=0;
			var countOne=0;
			var genderTwoScore=0;
			var countTwo=0; 
			for(var i=0;i<originalData.length;i++){
				if(originalData[i].lesson == lesson){
					if(originalData[i].gender==1){
						genderOneScore+=originalData[i].score;
						countOne++;
					}else{
						genderTwoScore+=originalData[i].score;
						countTwo++;
					}
				}
			}
			rn[lesson]={'1':(genderOneScore/countOne|0),'2':(genderTwoScore/countTwo|0)};
			return rn;
		}
		console.log(avgScore('english',originalData));
		
	</script>
	<script src="<%=basePath %>/js/dev.js" type="text/javascript" charset="utf-8"></script>
</html>
