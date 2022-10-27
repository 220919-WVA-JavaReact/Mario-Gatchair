console.log('Hello World')

const jsContainer = document.getElementById('mountNode');
const reactContainer = document.getElementById('mountNode2');
const root = ReactDOM.createRoot(reactContainer);

function Demo(props){
    return (
        root.render(
            // JSX, not HTML
            <div className="demo">
                Hello {props.name}
                <input />
                <p>{new Date().toString()}</p>
            </div>
        )
    );
}

const update = () => {
    jsContainer.innerHTML = `
<div class="demo">
    Hello JS
    <input/>
    <p>${new Date()}</p>
</div>
`;

    // root.render(
    //     React.createElement(
    //         "div",
    //         { className: "demo" },
    //         "Hello react",
    //         React.createElement("input"),
    //         React.createElement(
    //             "p",
    //             null,
    //             new Date().toString()
    //         )
    //     )
    // );

    // root.render(
    //     <div className="demo">
    //         Hello React
    //         <input />
    //         <p>{new Date().toString()}</p>
    //     </div>
    // );

    root.render(
        <React.Fragmet>
            <Demo name={'Mario'}/>
            <Demo />
            <Demo />
            <Demo />
        </React.Fragmet>
    );

}
setInterval(update, 1000);