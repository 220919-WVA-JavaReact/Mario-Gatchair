console.log("Hello Functions");

// Let's take a look at truthy and falsy
if ('0'){
    console.log('truthy')
} else{
    console.log('Bryan retires');

}

var x = 5;

var y = '5';

console.log(x == y);

console.log(x === y);

function simpleIf(){
    if (5>6){
        console.log('yay');
    } else{
        console.log('boo');
    }
}

simpleIf();


function simpleEsleIf(num){
    if (num<0){
        console.log("number is negative")
    } else if (num > 0) {
        console.log("number is positive")
    } else {
        console.log("number is zero")
    }
}


simpleEsleIf(-10);

// Looping
var arr = [1,2,3,4,5,6,7];

// sUm of array

function sumOfArray(){
    var sum = 0;
    for(i=0; i<arr.length; i++){
        sum += arr[i];
    }
    return sum;
}

console.log('the sum of the array is', sumOfArray());

// A simple while loop
var num = 0;
while(num < 10){
    console.log(num);
    num++;
}

console.log('The value of the num is', num);
// one loop we should've seen before was a do while loop

do{
    console.log(num)
    num++;
}while(num<=9)

// There are some new loops in JS that don't exist directly in Java
// For of loop

// For of is used for arrays and array like objects
for(n of arr){
    console.log(n*n);
}

// For in loop
// For in is used to access properties of objects

var obj = {name:'bob', age: 32};

// I can loop over the properties using a for in loop

for (property in obj){
    console.log(property + ' : '+ obj[property]);
}

// We can assign the return vaule of these functions

function add(num1, num2){
    return num1 + num2;
}

var answer = add(10,34);
console.log(answer);

var coolFuntion = function(){
    console.log("I am anonymous");
}

coolFuntion();

// Callback function are used everywhere. Array methods like find(), map(), filter(), and reduce()
// use callback to operate on datea

// Array find returns the first

var greaterThan = arr.find(function(n){
    return n > 2;
});

console.log(greaterThan);

// Array.filer() works similarly as well but returns an array of all the values that pass

var greaterThanFilter = arr.filter(function(n){
    return n > 3;
})

console.log(greaterThanFilter);

// Array.map allows us to apply a callback function to every value in an array and create a new array based off that

var squares = arr.map(function(n){
    return n*n:
})

console.log(squares);

// default parameters
function defaultParmas(a.b=1){
    return a*b;
}
console.log('Inputting two paramters', defaultParmas(5,2));

console.log("Using the default parameter", defaultParmas(5));
