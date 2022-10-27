import { User } from "./user";

export interface Point_2D{
    x: number,
    y: number,
    z: number
}

function drawPoint_1(x: number, y:number){
    //implementation
}

function drawPoint_2(point: Point_2D){

}

function drawPoint_3(xLnumber, y:number){
    //implementation
}

function drawPoint_4(xLnumber, y:number){
    //implementation
}

drawPoint_1(1,2);
drawPoint_2({x: 1, y: 2, z: 3});

function drawPoint_5(Point: {x: number, y: number})

let point: Point_2D = {
    x: 1, y: 2, z:3
};

drawPoint_5(point);


type CreateUserRequest ={
    user: User,
    creationTime: Date
}

type SendUserRequest = (user: User) => void;

interface sendSomethingRequest {
    sendSomething: (user: User) => void;
}

function testType(request: SendUserRequest){
    request();
}

function testInterface(request: sendSomethingRequest){
    request.sendSomething() //implement
}

export default{
    testInterface,
    testType
}