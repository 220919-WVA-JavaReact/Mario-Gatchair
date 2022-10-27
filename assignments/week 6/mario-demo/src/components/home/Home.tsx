import './Home.css';
function Home() {
    return (
        <main>
            <h3>It's a me Mario!</h3>
            <div className="divcontainer">
                <div id="History" className="h-bio">
                    <h3 className="biobox"> Jamaica: Beginnings of The Great Journey</h3>
                    <p className="biobox">
                        I was born in Kingston Jamaica on cool Wednesday night at 10pm on the dot on January 22nd, 1992.
                        I spent a good chuck of my early life there until the age of 7. Going to school, running around
                        and exploring my country. Not say it was always safe and not dangerous. But it was fun and home.
                        In December of 1999 my mother and I left Jamaica and flew to the U.S. It was an interesting time
                        I landed in Miami before the start of the new year and have been here since.
                    </p>
                </div>
                <figure>
                <img src={require('./train-ride.png')} id="pic" />
                <figcaption><h4>Train ride to my first developer interview.</h4></figcaption>
                </figure>
                <div id="Hobbies" className="hobbiebox">
                    <h3 className="text3"> Hobbies</h3>
                    <ul className="ltext" >
                        <li>Reading</li>
                        <li>Games</li>
                        <li>Gardening</li>
                        <li>Cooking</li>
                        <li>Tinkering</li>
                    </ul>
                </div>
            </div>
        </main>
    );
}

export default Home;