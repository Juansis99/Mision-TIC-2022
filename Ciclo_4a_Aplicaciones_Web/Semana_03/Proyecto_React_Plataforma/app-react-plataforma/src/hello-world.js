import { Fragment } from "react";

//Componente
export const App = () => { //para retornar mas de una etiqueta genera error en React, por lo que se debe empaquetar con "Fragment" que se importa de react, normalmente se usa en funciones flecha
    return (<Fragment>
                <h1>Hola Mundo</h1>
                <p>Aprendamos React</p>
                <button onClick={Activar}>Activar boton</button>
            </Fragment>);
}

function Activar(){
    alert("El boton ha sido activado");
}
