// Scopes

//Anything out here is globabl scoped
var sc1 = "I am globl scope";

// Anything insde of a block of code is local scoped

function scopes(){
    var sc2 = 'I am functional scope';
    if (sc){
        var sc3 = 'I am block scope';
    }
    console.log(sc3);
}

scopes();

hoistEx();

// Hoisting example
function hoistEx(){
    console.log("I am hoisted!");
}

function printMe(x){
    console.log(x);
}

printMe(sampleText);

let sampleText = "Text sample"