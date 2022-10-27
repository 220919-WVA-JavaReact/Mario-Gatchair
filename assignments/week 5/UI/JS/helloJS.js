// This is a comment

/*
This a multline comment, these are the same as in Java
*/

// We can print to the console with console.log
console.log("Hello JS");

// Semicolons are optional just don't forget them in Java

/*
Javascript Datatypes
JS is loosely typed so you can variable to any data type you want
*/

// Numbers
// Integers
var n1 = 21;

console.log(n1);

//Float

var n2 = 15.5;
console.log(n2);

// Exponential notation
var n3 = 1.5e-4 // ---> 1.5*10^-4
var n4 = 1.5e4 // ---> 1.5*10^4

console.log(n3, n4);

// There is also a type of number called bigInt which stores numbers larger than 2^53
var bigInt = 12345678901234567890n;

// Since JS is loosely typed we can go about switching the datatypes of variables

var a = 12;

console.log(a);

a = "Twelve";

console.log(a);

a = null;

console.log(a);

a = undefined;

console.log(a);
// Undefined is similar to declaring a variable with no value

// Strings

a = "a string";

// Strings can be declared with both single and double quotes

var name = "John";

var last = 'Smith';

// You can use a single quote instead of a double quote

var c = "Let's go on an adventure"

var d = 'He said "Hello" and then left'

// YOu can still use escape characters to prevent any issues

var e = 'We\'ll never give up';
/* Exploring
var x;

function test (num){
    if (num <0){
        num = 5;
    } else {
        num = null;
    }
}

test(x);

console.log(x);
*/

console,log(name, last, c, d, e);

// Booleans
var t = true;
var f = false;

// Objects
var obj = {
    name: 'Bryan Serfozo',
    age: 25,
    height: 72,
    isTrainer: true
}

// How do we access the properties of an object?
// object.key notation
console.log('Name: ', obj.name);
// object['key'] notation
console.log("Is a trainer? ", obj['isTrainer']);

// We can assign values in a couple of different ways
// Let's first create some blank object to assign values to

var obj2 = new Object();
// This creates a "blank" object from it's constructor
obj2.name = 'Kevin';
obj2['isTrainer'] = true;

console.log(obj2);

//Let's talk a little bit about arrays
// You can create arrays by predefining their indexes
var arr1 = ['Bob', 'Rick', 'George'];

// You can use the new keyward
var arr2 = new Array(1,2,3,4,5,6);

// You can also miz and match datatypes

var arr3 = ['Bob', 1,2,true, {name: 'John'}];

console.log(arr3);

// you can also access indexes with bracket notations
console.log(arr3[3]);

//You can use some of the built in methods to alter the array
arr3.push(53);

console.log(arr3);

//shift() will remove the first element of the array
arr3.shift();
console.log(arr3);

var arr4 = [100,11,12,10];

arr4.sort();
console.log(arr4);

//index