<!DOCTYPE html>

<html lang="en">

<head>

<meta charset="UTF-8">

<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>H Sree Narayane Portfolio</title>



<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css">



<style>



\*{

margin:0;

padding:0;

box-sizing:border-box;

font-family:Segoe UI,sans-serif;

scroll-behavior:smooth;

}



body{

background:#0f172a;

color:white;

overflow-x:hidden;

}



.bg{

position:fixed;

width:100%;

height:100%;

background:linear-gradient(-45deg,#00d4ff,#6a11cb,#ff0080,#00d4ff);

background-size:400% 400%;

animation:bgmove 12s infinite;

z-index:-1;

}



@keyframes bgmove{

0%{background-position:0% 50%;}

50%{background-position:100% 50%;}

100%{background-position:0% 50%;}

}



nav{

display:flex;

justify-content:space-between;

padding:20px 8%;

background:rgba(255,255,255,.08);

backdrop-filter:blur(10px);

position:sticky;

top:0;

}



nav ul{

display:flex;

gap:20px;

list-style:none;

}



nav a{

color:white;

text-decoration:none;

}



.hero{

height:100vh;

display:flex;

justify-content:center;

align-items:center;

text-align:center;

padding:20px;

}



.glass{

background:rgba(255,255,255,.1);

backdrop-filter:blur(15px);

padding:40px;

border-radius:25px;

width:90%;

max-width:800px;

box-shadow:0 0 25px rgba(0,255,255,.3);

}



.profile{

width:180px;

height:180px;

border-radius:50%;

border:5px solid cyan;

object-fit:cover;

margin-bottom:20px;

}



h1{

font-size:3rem;

text-shadow:0 0 10px cyan;

}



.typing{

color:cyan;

font-size:1.4rem;

margin-top:10px;

}



.btn{

display:inline-block;

margin-top:20px;

padding:12px 30px;

background:cyan;

color:black;

border-radius:30px;

text-decoration:none;

font-weight:bold;

}



section{

padding:80px 10%;

}



.title{

text-align:center;

font-size:2.5rem;

margin-bottom:40px;

}



.cards{

display:grid;

grid-template-columns:repeat(auto-fit,minmax(250px,1fr));

gap:25px;

}



.card{

background:rgba(255,255,255,.1);

backdrop-filter:blur(12px);

padding:25px;

border-radius:20px;

transition:.4s;

}



.card:hover{

transform:translateY(-10px) scale(1.03);

box-shadow:0 0 20px cyan;

}



.skill{

margin:15px 0;

}



.bar{

height:10px;

background:#222;

border-radius:20px;

overflow:hidden;

}



.fill{

height:100%;

background:cyan;

}



.contact{

text-align:center;

}



.social a{

color:white;

font-size:30px;

margin:10px;

transition:.3s;

}



.social a:hover{

color:cyan;

}



footer{

text-align:center;

padding:20px;

background:#020617;

}



</style>

</head>



<body>



<div class="bg"></div>



<nav>

<h2>SREE</h2>

<ul>

<li><a href="#about">About</a></li>

<li><a href="#skills">Skills</a></li>

<li><a href="#projects">Projects</a></li>

<li><a href="#contact">Contact</a></li>

</ul>

</nav>



<section class="hero">



<div class="glass">



<img src="myphoto.jpg" class="profile">



<h1>H Sree Narayane</h1>



<div class="typing" id="type"></div>



<a href="#" class="btn">Download Resume</a>



</div>



</section>



<section id="about">



<h2 class="title">About Me</h2>



<div class="card">

BE Computer Science Engineering Student passionate about Programming, AI, Web Development and Problem Solving.

Current CGPA: 8.66

</div>



</section>



<section id="skills">



<h2 class="title">Skills</h2>



<div class="card">



<div class="skill">Python</div>

<div class="bar"><div class="fill" style="width:95%"></div></div>



<div class="skill">Java</div>

<div class="bar"><div class="fill" style="width:85%"></div></div>



<div class="skill">SQL</div>

<div class="bar"><div class="fill" style="width:90%"></div></div>



<div class="skill">HTML CSS</div>

<div class="bar"><div class="fill" style="width:92%"></div></div>



</div>



</section>



<section id="projects">



<h2 class="title">Projects</h2>



<div class="cards">



<div class="card">

<h3>Portfolio Website</h3>

<p>Modern Responsive Portfolio using HTML CSS JavaScript.</p>

</div>



<div class="card">

<h3>AI Internship Project</h3>

<p>Artificial Intelligence based application.</p>

</div>



<div class="card">

<h3>CRUD Application</h3>

<p>Full Stack CRUD Web Application.</p>

</div>



</div>



</section>



<section id="contact" class="contact">



<h2 class="title">Contact</h2>



<div class="social">

<a href="#"><i class="fab fa-github"></i></a>

<a href="#"><i class="fab fa-linkedin"></i></a>

<a href="#"><i class="fas fa-envelope"></i></a>

</div>



<p>Email: ammusree272005@gmail.com</p>



</section>



<footer>

© 2026 H Sree Narayane

</footer>



<script>



let txt=\[

"Python Developer",

"AI Enthusiast",

"Web Developer",

"Problem Solver"

];



let i=0;

let j=0;

let cur="";



function type(){



if(j<txt\[i].length){



cur+=txt\[i]\[j];

document.getElementById("type").innerHTML=cur;

j++;



setTimeout(type,100);



}else{



setTimeout(()=>{

cur="";

j=0;

i=(i+1)%txt.length;

document.getElementById("type").innerHTML="";

type();

},1500);



}



}



type();



</script>



</body>

</html>

