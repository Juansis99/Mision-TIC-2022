//Archivo index.js
import React from 'react'; //Importamos react
import ReactDOM from 'react-dom/client'; //importamos el DOM necesario para renderizar la aplicacion
import {App} from './hello-world';
import './styles.css'
//Componente

//Renderizacion
ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
    <App />
  </React.StrictMode>
);