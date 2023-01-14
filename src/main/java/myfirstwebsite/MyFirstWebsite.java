

<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="=IE=edge">
<meta name = "viewport" content="width=device-width , initial-scale=1.0">
<title>Hello Name</title>
</head>
<body>
<h1>Hi there, Enter your name please :) </h1>
<input id="userInput"> <br>  <br>
<button onclick="myFunction()" > Done</button>
<h1 id = "message"> </h1> 

<style>
body {background-color: lightslategray; text-align: left; color: rgb(0, 0, 0);}

</style> 

<script>
function myFunction() {
let userInput = document.querySelector("#userInput");
let message = document.querySelector("#message"); 

message.innerHTML = " Welcome to my website, "  + userInput.value; 
 
         } 

    </script> 

</body>
</html>

