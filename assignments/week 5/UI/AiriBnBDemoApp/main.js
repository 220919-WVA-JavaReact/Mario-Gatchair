// Saintiy check
console.log("Main JS file loaded!");

// For right now we'll fake getting some results back so we can begin dyanmically load them in
let hotels = [
    {
        listingName: "Hampton Inn",
        price: "$50",
        roomType: "Private Room",
        imgUrl:""
    },
    {
        listingName: "Marriott",
        price: "$125",
        roomType: "Private Room",
        imgUrl:""
    },
    {
        listingName: "La Quinita",
        price: "$35",
        roomType: "Private Room",
        imgUrl:""
    },
    {
        listingName: "Double Tree",
        price: "$75",
        roomType: "Private Room",
        imgUrl:""
    }
]

// We have a few different goals that we want to achieve with this application

// Gather in the user input from the input fields

// The way I access the fields is by calling the specific object from the dom and taking it's value
let destination = document.getElementById("destination").value;
let checkIn = document.getElementById("check-in").value;
let checkOut = document.getElementById("check-out").value;
let guests = document.getElementById("guests").value;

// We really only want to do this after we click our button
console.log(destination,checkIn,checkOut,guests);

// We'll need to target our button and add some functionality for whenver we click on it
let searchButton = document.getElementById("search-button");
// We want something to happen upon an onclick event
searchButton.onclick = doEverything();

function printValues(){
    let destination = document.getElementById("destination").value;
    let checkIn = document.getElementById("check-in").value;
    let checkOut = document.getElementById("check-out").value;
    let guests = document.getElementById("guests").value;
    console.log(destination,checkIn,checkOut,guests);
}


// Use that input to search a Web API for hotels

// We'll worry about this piece later
function getData(){
    
}



// Use the returneed information to dynamically load a page

function populateDate(hotels){
    let hotelContainer = document.getElementById('room-container')
    // We want to target
    hotelContainer.innerHTML = "";

    for(room of hotels){
        hotelContainer.innerHTML += `<div style="border: 1px solid black; margin:20px;"> 
                                            <h3> ${room.listingName} </h3>
                                            <b> Price: ${room.price} <b>
                                            <p> Room Type: ${room.roomType} </p>
                                            <img src="${room.imgUrl}"/>
        
                                    </div>`
    }

    function doEverything(){
        printValues();
        populateDate(hotels);
    }
}