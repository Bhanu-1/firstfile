//document.write("hello")
//console.log("hi")
function print(){
    let x=parseInt(document.getElementById("inp1").value)
    let y=parseInt(document.getElementById("inp2").value)
    document.getElementById("inp5").value=x+y
    document.getElementById("inp6").value=x-y
    document.getElementById("inp7").value=x*y
    document.getElementById("inp8").value=x/y   
    
}
