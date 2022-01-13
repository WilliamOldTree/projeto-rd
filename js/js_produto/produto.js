var img1 = document.querySelector(".imgproduto1")
var img2 = document.querySelector(".imgproduto2")
var img3 = document.querySelector(".imgproduto3")
var img4 = document.querySelector(".imgproduto4")

img3.addEventListener("click", function(){
    img2.style.display = "none"
    img1.style.display = "block"
})

img4.addEventListener("click", function(){
    img1.style.display = "none"
    img2.style.display = "block"
})