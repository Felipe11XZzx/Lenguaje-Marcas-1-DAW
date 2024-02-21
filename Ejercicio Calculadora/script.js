var nombre = "Juan";
const edad = 25;
let esEstudiante = true;
var op1 = 4;
var op2 = 4;
var op3 = "4";
//suma
console.log("SUMA");
console.log(op1+op2);
//resta
console.log("RESTA");
console.log(op1-op2);
//multiplicacion
console.log("MULTIPLICACION");
console.log(op1*op2);
//division
console.log("DIVISION");
console.log(op1%op2);

//comparadores
console.log("COMPARADORES == Y ==="); 
console.log(op1==op3);
console.log(op1===op3);

console.log("COMPARADORES !== Y !==="); 
console.log(op1!=op3);
console.log(op1!==op3);

console.log("COMPARACION >=");
console.log(op1>=op3);
console.log("COMPARACION<=");
console.log(op1<=op3);

var bol1 = false;
var bol2 = true;
console.log("BOOLENAOS && || Y !");
console.log(bol1&&bol2);
console.log(bol1||bol2);
console.log(!bol1);

var edad2 = 20;

if (edad2 >= 18 ){
    console.log("Eres mayor de edad");
} else {
    console.log("Eres menor de edad");
}

for(var i= 0 ; i < 5 ; i++) {
    console.log(i);
}

let contador = 0;

while (contador < 5){
    console.log("Contador: " + contador); contador++;
}

// Funcion JS
function saludar (nombre, nombre2){
    console.log("Hola " + nombre + "!")
    return "Hola " + nombre2 + "!"
}

var retorno = saludar ("Ana", "Manolo");
    alert(retorno);

// Mostramos el primer elemento del Array.

var frutas = ["Manzana", "Pera", "Kiwi"]
console.log(frutas[0])

// Añadimos un elemento al Array

frutas.push("Banano");
alert(frutas[3])

// Recorrer un Array en JS

for (var i = 0; i < frutas.length; i++){
    console.log(frutas[i])
}

// Eliminamos los dos ultimos valores del Array

frutas.pop()
frutas.pop()

// Funcion para cambiar el texto
function CambiarTextoPagina(){

    var texto1 = "Antes";
    var texto2 = "Despues";

    document.getElementById("Parrafo 1").innerHTML = texto1;
    document.getElementById("Parrafo 2").innerHTML = texto2;
}


// Tipos De Variables y lo que imprimen

var cadena = "35";
var num = Number(cadena);
console.log("typeof");
console.log(typeof cadena);
console.log(typeof num);
const constante = 34;
console.log(typeof constante);
var booleano = true;
console.log(typeof booleano);
console.log(typeof frutas);
console.log("Suma De Cadenas")
var suma1 = cadena + 3;
console.log(suma1);
var suma2 = cadena + 3;
console.log(suma2);

// Invocar Esta Funcion

function saludar2 () {
    let name = prompt("¿Cual Es Tu Nombre?", "");
    alert (name);
}

function sumar(){
    alert(documento.getElementById("Sumar").value);
}

function calcular(){
    var display = document.getElementById("display").value;
    console.log(display);
    var resultado = eval(display);
    console.log(resultado)
}

var operacion = "2 + 2";
var resultado = eval(operacion);
console.log(resultado);


function digito(valor) {
    var operando1 = localStorage.getItem("operando1");
    if(operando1 != null || operando1 != ""){
        localStorage.setItem("operando1", valor)
        localStorage.setItem("operando2", valor)
    }
}

function operacion(valor){
    localStorage.setItem("operacion", valor)
    return;
}

function igual(){

    // Hay igualdad en los operadores, hay guardado alguno de los 3 elementos

    var operando1 = localStorage.getItem("operando1")
    console.log("Tipo de operando1: " + typeof operando1)
    console.log(operando1)
    var operando2 = localStorage.getItem("operando2")
    console.log(operando2)
    console.log("Tipo de operando2: " + typeof operando2)
    var operando3 = localStorage.getItem("operando1")
    console.log(operando3)
    console.log("Tipo de operando3: " + typeof operando3)
    var operacion = localStorage.getItem("operacion")
    console.log("Tipo de operacion:" + typeof operacion)
    console.log(operacion)

    if(operando1!=""&&operando2!=""&&operacion!=""){

        if (operacion = "+"){
            var resultado = Number(operando1) + Number(operando2);
            console.log(resultado);
            document.getElementById('display').value = resultado;
        }else if (operacion = "-"){
            var resultado = Number(operando1) - Number(operando2);
            console.log(resultado);
            document.getElementById('display').value = resultado;
        }else if (operacion = "*"){
            var resultado = Number(operando1) * Number(operando2);
            console.log(resultado);
            document.getElementById('display').value = resultado;
        }else if (operacion = "/"){
            var resultado = Number(operando1) / Number(operando2);
            console.log(resultado);
            document.getElementById('display').value = resultado;
        }else if (operacion = "%"){
            var resultado = Number(operando1) % Number(operando2);
            console.log(resultado);
            document.getElementById('display').value = resultado;
        }

        localStorage.removeItem("operando1");       
        localStorage.removeItem("operando2");
        localStorage.removeItem("operacion");

    }
}
