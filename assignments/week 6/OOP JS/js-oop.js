
window.onload = () =>{
    console.log('Hello World!');
    console.log(objectLiteral.sayMyName());
    console.log(objectLiteral2.sayMyName());
    let cus1 = new Customer('Lesly', 'pass');
    let cus2 = new Customer('Victoria', 'pass');

    cus1.sayMyName();
    cus2.sayMyName();

    let emp1 = new Employee('Tyler', 'pass', 'BASIC_USER');
    let emp2 = new Employee('Cory', 'pass', 'MANAGER');

    emp1.sayMyName();
    emp2.sayMyName();

    console.log('-------------------');
    console.log(objectLiteral);
    console.log(cus1);
    console.log(emp1);

    console.log('-------------------');
    console.log('default values');
    let emp3 = new Employee();
    console.log(emp3);

    let cus3 = new Customer();
    console.log(cus3);

    console.log('-------------------');
    console.log(cus3.getType());

    cus1.sayMyName('arg1', 'arg2');

    console.log('-------------------');
// this = [object Window], because this is running inside the browser, this binds to the global object
// everything is scoped in JS, in this case global scope/context
    namedFunction();
    someObject.someObject_namedFunction();
    someObject.someObject_anonFunction();
    someObject.someObject_arrowFunction(); // this is bound to the global object, does not adopt context, always bind to the global object

    console.log('-------------------');

    let map = new PoorMansMap();
    map.put('Kevin', 'pass');
    map.put('Victoria', 'pass');
    console.log(map.get('Kevin'));
    map.put('Kevin', 'passowrd');
    console.log(map.get('Kevin'));
    console.log(map.getKeyIfExists('Kevin'));
}

/*
OOP
*/

// Object Literal Notation - creating an object inline
let objectLiteral = {
    name: 'Kevin',
    age: 42,
    sayHello: function() {
        return 'Hello';
    },
    sayMyName: function() {
        return 'Hello my name is: ' + this.name; // refer to this object's name
    }
}

let objectLiteral2 = {
    name: 'Lukas',
    age: 42,
    sayHello: function() {
        return 'Hello';
    },
    sayMyName: function() {
        return `Hello my name is: ${this.name}`;
    }
}

// Creating Objects via functions/classes
function Customer(username = 'default username', password = 'default pass'){
    this.username = username;
    this.password = password;

    this.sayMyName = function(){
        console.log(`Hello my name is: ${this.username}`);
    }
// example of method overriding
// JS engine, find the method declared in Customer therefore does not need to check its prototype (User)
    this.getType = function(){ 
        return 'Overriden behavior';
    }
}

class Employee{
    constructor(username, password, role){
        this.username = username || 'username-missing';
        this.password = password || 'pass-missing';
        this.role = role || 'BASIC_USER';
    }

    sayMyName(){
        console.log(`Hello my name is: ${this.username}`);
    }
}

/*
    Abstraction in JS
        - no interfaces, no abstract classes
        - concept of having logic in functions to be reused
            - focusing on input/output rather than implementation
*/

/*
    Inheritance in JS
        - prototype
*/
function User(type){
    this.type = type;

    this.getType = function () {
        return this.type;
    }
}

Customer.prototype = new User('Customer');


/*
    In Java, "this" refers to the intance of the class at runtime, here it's inheriting the context from Window
*/
// Functions
function namedFunction(){
    console.log('named function invoked, this: ');
    console.log(this);  // this is bound to the global object
}

// var location = 'https://www.google.com';

let someObject = {
    someObject_namedFunction: function someFunc(){
        console.log('someObject_namedFunction function invoked, this: ');
        console.log(this); 
    },
    someObject_anonFunction: function (){
        console.log('someObject_anonFunction function invoked, this: ');
        console.log(this); 
    },
    someObject_arrowFunction: () => {
        console.log('someObject_arrowFunction function invoked, this: ');
        console.log(this); 
    }
}

/*
    Create a custom Map
        - Maps have key-value pairs
        - put(K,V);
            - add a k/v
            - override v if k already exists
        - get(k);
            - retrieve the v associated k
*/
function PoorMansMap(){
    let arr = [];

    function getKeyIfExists(key){
        for(let i = 0; i < arr.length - 1; i += 2){
            // checking if the key === value of the key in the array
            if(key === arr[i]){
                // if yes, retrieve 
                return i;
            }
        }
        return -1; // case key doesn't exist
    }

    function getK(key){
        // check arr to see if key exists
        let index = getKeyIfExists(key);
        if( index === -1){
            return;
        } else {
            return arr[index + 1];
        }
    }

    function putKV(key, value){
        // check if the key exists
        let index = getKeyIfExists(key);
        if( index === -1){
            arr.push(key);
            arr.push(value);
        } else {
            arr[index + 1] = value;
        }
        // if true
        // if false
            // push (key)
            // push (value)
    }

    return {
        get: getK,
        put: putKV
    }
}