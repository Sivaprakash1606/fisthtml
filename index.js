let btn = document.getElementById("btn");
let dis = document.getElementById("display")
btn.addEventListener("click",function(){
    let v1=document.getElementById("in1").value;
    let v2 = document.getElementById("in2").value;
dis.innerHTML=v1 + " " + v2
})