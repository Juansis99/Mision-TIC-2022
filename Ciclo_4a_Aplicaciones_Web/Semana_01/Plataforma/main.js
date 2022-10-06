//Alerta crea una ventana nueva con un texto
//alert("Mensaje de alerta");

//Variables
var nombre = "Judy"; //var es para definir variables en versiones antiguas
var nombre = 2344;
let edad = 23 //let es para definir variables en versiones nuevas
const nombre2 = "Judy";

//Print de JS
console.log(nombre2 + " tiene " + edad + " anios");

//Arrays
let nombres = ["Marcela", "Carlos"]; //arreglos se separan por comas pueden tener tipos mixtos de datos
nombres[2] = "Pedro"; //agregar valores a un array en una posicion 

//Esctructuras de control
//if-else
nombre = "Marcela";
let mensaje = "";
if(edad < 18){
    mensaje = nombre + " es menor de edad";
} else {
    mensaje = nombre + " es menor de edad";
}
console.log(mensaje);
 
//ciclos
//for
let mostrar = "Tabla del 8 </br>";
let mult = 0;
for(let i=0; i<10; i++){
    mult = 8*i;
    mostrar = mostrar + 8 + " x " + i + " = " + mult + "</br>"
}
let datos = document.getElementById("tabla");
datos.innerHTML = mostrar;

//Interaccion entre JS y HTML
//Con document.write se escribe directamente en la pagina en texto plano, no contiene formatos
let info = document.write(mensaje);
//con el getElementById y con el .innerHTML se asigna el valor al id de la etiqueta del html, aca si toma los estilos o formatos que tengan.
info = document.getElementById("dato");
info.innerHTML = mensaje;
