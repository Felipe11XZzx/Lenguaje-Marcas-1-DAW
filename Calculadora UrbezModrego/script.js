// Display
function digito(num) {
    // ELEMENTO EN EL DISPLAY
    var display = document.getElementById("resultado");
     if (display.value == "" || display.value == "0") {
      display.value = num;
    } else {
      display.value += num;
    }
  }
  
  // GUARDA 1º NUMERO Y OPERACION
  function operacion(op) {
    var display = document.getElementById("resultado");
    var operando1 = document.getElementById("operando1");
    var operando2 = document.getElementById("operando2");
    var operacion = document.getElementById("operacion");
    if (display.value != "") {
      operando1.value = display.value;
      display.value = "";
      operando2.value = "";
      operacion.value = op;
    }
  }
  
  //RESULTADO
  function igual() {
    var display = document.getElementById("resultado");
    var operando1 = document.getElementById("operando1");
    var operando2 = document.getElementById("operando2");
    var operacion = document.getElementById("operacion");
    if (display.value != "") {
      operando2.value = display.value;
      //REALIZAR OPERACION
      if (operando1.value != "" && operando2.value != "" && operacion.value != "") {
        var resultado = eval(operando1.value + operacion.value + operando2.value);
        //MOSTRAR RESULTADO
        display.value = resultado;
        operando1.value = "";
        operando2.value = "";
        operacion.value = "";
      }
    }
  }
  
  function limpiarDisplay() {
    var display = document.getElementById("resultado");
    var operando1 = document.getElementById("operando1");
    var operando2 = document.getElementById("operando2");
    var operacion = document.getElementById("operacion");

    display.value = "";
    operando1.value = "";
    operando2.value = "";
    operacion.value = "";
  }
    
  // CALCULO DE OPERACION
  function calcular() {
    igual();
    var display = document.getElementById("resultado");
    if (display.value != "") {
    }
  }
  