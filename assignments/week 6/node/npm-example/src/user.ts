export class User{

    /// fields or methods with no explicit access modifier are implicitely public
    id: number | string; // public id: number | string; // implicitely

    // private fields are only accessible from the class
    // convention for private fields is to prepend a _ to the name
    private _username: string;
    
    // protected fields are only accessible within the class scope and any child class
    protected password: string;

    // Just like in JS, just one constructor
    constructor(id: number | string, username: string, password: string){
        this.id = id;
        this._username = username;
        this.password = password;
    }

    public get username(){
        return this._username;
    }

    public set username(uname: string){
        //not null nor ' '
        if(uname){
            this._username = uname;
        }
    }
}