/*const toDoList=[
    'Make dinner',
    'Wasgh dishes',
    'Wash YouTube'
];
for (let  index=0; index<=toDoList.length-1;index++){
    const valueList = toDoList[index];
    console.log(valueList);
}
const nums = [1,1,3];
let total = 0;

for(let i=0; i<nums.length; i++){
    const num = nums[i];
    total+=num;
}
console.log(total);
const numsDouble = [];
for(let i=0; i<nums.length; i++){
    numsDouble.push(nums[i]*2);
}
console.log(numsDouble);
    
const array1 = [1,2,3]
const [firstValue, secondValue] = [4,5,6]


for(let i = 0;i<15;i++){
    if(i%3==1){
        console.log('Nop!');
        continue
    }
    console.log(i);
    if(i==12){
        break;
    }
};
let i=0;
while(i<=10){
    if(i%3 === 0){
        i++;
        console.log('Nop!!');
        continue;
    }
    console.log(i);
    i++;
}
*/

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

console.log('Hey')
console.log(doubleArray([1,2,3,4]));
console.log(doubleArray([2,4,6,8,0,1]));






document.querySelector('.js-dueDate').innerHTML = '1000-01-01'
const toDoList=[
    {name:"Make dinner", dueDate:'2025-03-11'},
    {name:"Wash dishes", dueDate:'2025-03-10'},
    {name:"Wash YouTube", dueDate:'2025-03-11'}
];

function renderTodoList(){
    let todoListHTML = '';

    for(let i=0; i<toDoList.length; i++){
        const todoObject = toDoList[i];
        //const name = todoObject.name;
        //const dueDAte = todoObject.dueDate;
        const { name, dueDate } = todoObject;

        const html = `
            <div>-> ${name}</div>
            <div> ${dueDate}</div>
            <button onclick ="
                toDoList.splice(${i},1);
                renderTodoList();
            " class = "delete-todoButton" >Delete</button> 
        `;//Generating HTML
        todoListHTML += html;
    }
    //console.log(todoListHTML);
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
/*
let i = 1;
            while(i<=5){
                console.log(i);
                //i=i+1;
                //i+=1;
                i++;   
            };


for(let i=-1;i<=5;i++){
    console.log(i);
}

let randomnumber = 0;
while(randomnumber<0.49){
    randomnumber = Math.random();
    console.log(randomnumber);
}

    */

