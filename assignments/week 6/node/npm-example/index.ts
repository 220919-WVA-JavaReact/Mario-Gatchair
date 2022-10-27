import { User } from './src/user'
import testFunctions from './src/interface-example'
function saySomething(something: string | number){
    console.log(something);
}

saySomething("Hello!");
saySomething(55);
// saySomething(true); // the function is expecting either a string or a number

function createAndPrintUser(){
    let me = new User(1, 'rio', 'pass');
    console.log(me);
    
    me.username = 'Mario';
    console.log(me.username);
}

createAndPrintUser;

testFunctions.testType((someUser: User) =>{
    console.log(someUser);
});