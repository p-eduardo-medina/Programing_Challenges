
const arrImg = ["Add1.png",
        "Add2.png",
        "Add3.png",
        "shopCar.png",
        "showQuantity.png"];
const var2 = 3;// const is unvariable
var var3 = 3; // create a variable like <<let>>
const message = "Hello World";
let carQuantity = 0;
console.log(typeof message);

//Functions:
function printOnParra(strparameter){
    const printOn = document.querySelector('.funnyFaceParr');
    printOn.innerHTML = `Your input is: ${strparameter}`
}


let iAutoplay = false;
let intervalId;
/*
function autoPLay(){
    if(!iAutoplay){
        intervalId =  setInterval(function(){
            pickComputermove();
            playGame();
        },1000)    
        iAutoplay = true;
    }else{
        clearInterval(intervalId);
        iAutoplay = false;
    }
}
const autoPLay = () =>{
    if(!iAutoplay){
        intervalId =  setInterval(() => {
            pickComputermove();
            playGame();
        },1000)    
        iAutoplay = true;
    }else{
        clearInterval(intervalId);
        iAutoplay = false;
    }
}
*/
function autoPLay(){//This has HOISTING
    if(!iAutoplay){
        intervalId =  setInterval(() => { //Use of ArrowFunctions
            pickComputermove();
            playGame();
        },1000)    
        iAutoplay = true;
    }else{
        clearInterval(intervalId);
        iAutoplay = false;
    }
}

function playGame(){
    const ranNumber = getRandomInt(0,5);
    let strNewImag = "Images/"+arrImg[ranNumber]
    document.querySelector('.imgInParr1').src=strNewImag;
}
function pickComputermove(){
    const ranNumber = getRandomInt(0,5);
    let strNewImag = "Images/"+arrImg[ranNumber]
    document.querySelector('.imgInParr2').src=strNewImag;
}
function getRandomInt(min, max) {
    min = Math.ceil(min);
    max = Math.floor(max);
    return Math.floor(Math.random() * (max - min )) + min;
}