import './TTAAL.css';
import Fact from '../fact/Facts';

interface IPropsTTAAL{

}

function TTAAL(props: IPropsTTAAL) {
    const facts = [
        {
            id: 1,
            fact: 'I walked acrossed a bridge during a hurricane and almost got washed over as a child.',
            isTrue: 'truth'
        },
        {
            id: 2,
            fact: 'I\'m missing all of my canines and have denture replacements.',
            isTrue: 'lie'
        },
        {
            id: 3,
            fact: 'I stole about $200 in trading cards throughout middle school and highschool.',
            isTrue: 'truth'
        },
    ]
    return(
        <main>
            <h3>Two truth and a lie:</h3>
            <table>
                {
                    facts.map( fact => (
                        <Fact id={fact.id} fact={fact.fact} isTrue={fact.isTrue} />
                    ))
                }
            </table>
        </main>
    );
}

export default TTAAL;