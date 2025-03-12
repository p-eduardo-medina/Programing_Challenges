console.log('Hey')
console.log(doubleArray([1,2,3,4]));
console.log(doubleArray([2,4,6,8,0,1]));






document.querySelector('.js-dueDate').innerHTML = '1000-01-01'
const toDoList=[
    {name:"Make dinner", dueDate:'2025-03-11'},
    {name:"Wash dishes", dueDate:'2025-03-10'},
    {name:"Wash YouTube", dueDate:'2025-03-11'}
];


// <<<<< Functions >>>>>
function doubleArray(nums){
    const dubNums = [];

    for(let i=0;i<nums.length;i++){
        if(nums[i]===0){
            return dubNums;
        }
        dubNums.push(nums[i]*2);
    }
    return dubNums;
}

function renderTodoList(){
    let todoListHTML = '';

    toDoList.forEach((todoObject, index) => {
        const { name, dueDate } = todoObject;

        const html = `
            <div>-> ${name}</div>
            <div> ${dueDate}</div>
            <button onclick ="
                toDoList.splice(${index},1);
                renderTodoList();
            " class = "delete-todoButton" >Delete</button> 
        `;

        todoListHTML += html;
    })
    const division = document.querySelector('.js-toDoList');
    division.innerHTML = todoListHTML;
}

function addTodo(){

    const inputElement  = document.querySelector('.js-input');
    const name          = inputElement.value;

    const dueDateElement    = document.querySelector('.js-dueDate');
    const dueDate           = dueDateElement.value;

    if(name!=""){
        toDoList.push({
            //name:name,
            //dueDate:dueDate,
            name,  //The short hand property
            dueDate
        });
        console.log(toDoList);
    }    

    renderTodoList();

    inputElement.value='';
}

let savedInfo = true;
let intervalId;
function changeInnrerText(){
    const trButton = document.querySelector('.trainButton');
    if(savedInfo){
        intervalId = setInterval(function(){
            if(trButton.innerText==="There!"){
                trButton.innerText = "Hey!"
            }else{trButton.innerText = "There!";}            
            if(!trButton.classList.contains("newButtonStyle")){
                trButton.classList.add("newButtonStyle");
            }
        },1500);
        savedInfo = !savedInfo;
    }else{
        clearInterval(intervalId);
        trButton.classList.remove("newButtonStyle");
        trButton.innerText = "Push for secret message";
        savedInfo = !savedInfo;
    }
}

