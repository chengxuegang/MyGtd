document.writeln("<!DOCTYPE html>");
document.writeln("<html>");
document.writeln("");
document.writeln("	<head>");
document.writeln("		<meta charset=\'utf-8\'>");
document.writeln("		<title>Bootstrap 实例 - 默认的导航栏</title>");
// document.writeln("		<link rel=\'stylesheet\' href=\'https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css\'>");
// document.writeln("		<script src=\'https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js\'></script>");
// document.writeln("		<script src=\'https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js\'></script>");
document.writeln("");
document.writeln("		<style>");
document.writeln("			body {");
document.writeln("				font-size: 16px!important;");
document.writeln("				font-family: \'微软雅黑\';");
document.writeln("				/*background-color: cornflowerblue;*/");
document.writeln("			}");
document.writeln("			");
document.writeln("			#top a {");
document.writeln("				margin: 20px 30px;");
document.writeln("				color: #000000;");
document.writeln("			}");
document.writeln("			");
document.writeln("			#top a:hover {");
document.writeln("				color: #000000;");
document.writeln("				text-decoration: none;");
document.writeln("				text-underline-style: non;");
document.writeln("				border-bottom: 2px #000000 solid;");
document.writeln("				padding-bottom: 10px;");
document.writeln("			}");
document.writeln("			");
document.writeln("			#top {");
document.writeln("				margin-top: 10px;");
document.writeln("				padding-bottom: 10px;");
document.writeln("				border-bottom: 1px rgb(231, 231, 231) solid;");
document.writeln("			}");
document.writeln("			");
document.writeln("			#top img {");
document.writeln("			    z-index: -1;");
document.writeln("				height: 120px;");
document.writeln("				padding-left: 30px;");
document.writeln("			}");
document.writeln("			");
document.writeln("			#top div {");
document.writeln("				height: 120px;");
document.writeln("				background-image: url(img/2.jpg);");
document.writeln("			}");
document.writeln("		</style>");
document.writeln("	</head>");
document.writeln("");
document.writeln("	<body>");
document.writeln("		<nav id=\'top\'>");
document.writeln("			<div class=\"row\">");
document.writeln("			<p aligin=\"left\"><img style=\'\' id=\"logo\" src=\'img/1.jpg\' class=\"logo\"/></p>");

document.writeln("			</div>");
document.writeln("		</nav>");
document.writeln("	</body>");
/*document.writeln("	<script>");
document.writeln("		function getCurDate() {");
document.writeln("			var d = new Date();");
document.writeln("			var week;");
document.writeln("			switch(d.getDay()) {");
document.writeln("				case 1:");
document.writeln("					week = \'星期一\';");
document.writeln("					break;");
document.writeln("				case 2:");
document.writeln("					week = \'星期二\';");
document.writeln("					break;");
document.writeln("				case 3:");
document.writeln("					week = \'星期三\';");
document.writeln("					break;");
document.writeln("				case 4:");
document.writeln("					week = \'星期四\';");
document.writeln("					break;");
document.writeln("				case 5:");
document.writeln("					week = \'星期五\';");
document.writeln("					break;");
document.writeln("				case 6:");
document.writeln("					week = \'星期六\';");
document.writeln("					break;");
document.writeln("				default:");
document.writeln("					week = \'星期天\';");
document.writeln("			}");
document.writeln("			var years = d.getFullYear();");
document.writeln("			var month = add_zero(d.getMonth() + 1);");
document.writeln("			var days = add_zero(d.getDate());");
document.writeln("			var hours = add_zero(d.getHours());");
document.writeln("			var minutes = add_zero(d.getMinutes());");
document.writeln("			var seconds = add_zero(d.getSeconds());");
document.writeln("			var ndate = years + \'-\' + month + \'-\' + days + \' \' + hours + \':\' + minutes + \':\' + seconds + \' \' + week;");
document.writeln("			time.innerHTML = ndate;");
document.writeln("		}");
document.writeln("");
document.writeln("		function add_zero(temp) {");
document.writeln("			if(temp < 10) return \'0\' + temp;");
document.writeln("			else return temp;");
document.writeln("		}");
document.writeln("");
document.writeln("		setInterval(\'getCurDate()\', 100);");
document.writeln("	</script>");*/
document.writeln("");
document.writeln("</html>");