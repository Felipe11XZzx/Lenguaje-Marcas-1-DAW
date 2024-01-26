function validarFormulario() {
    // Obtener los valores del formulario
    var nombre = document.getElementById("nombre").value;
    var email = document.getElementById("email").value;

    // Validar el formato del correo electrónico
    var emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    var esEmailValido = emailRegex.test(email);

    var nombreRegex = /^([A-ZÁÉÍÓÚÑa-zñáéíóúñ]{1,}'?-?[A-ZÁÉÍÓÚÑa-zñáéíóú]+[\s]*)+$/;
    var esNombreValido = nombreRegex.test(nombre);

    var passwordRegex = /^[A-Za-z]\w{7,14}$/;
    var esPasswordValido = passwordRegex.test(password);


    var mensajeRegex =  /^([A-ZÁÉÍÓÚÑa-zñáéíóúñ]{1,}'?-?[A-ZÁÉÍÓÚÑa-zñáéíóú]+[\s]*)+$/;
    var esMensajeValido = mensajeRegex.test(mensaje);



    // Mostrar mensaje de error si el correo electrónico no es válido
    var emailError = document.getElementById("emailError");
    if (!esEmailValido) {
        emailError.innerHTML = "Ingrese Una Dirección Valida.";
    } else {
        emailError.innerHTML = ""; // Limpiar el mensaje de error si es válido
        // Aquí puedes enviar el formulario o realizar otras acciones si es válido
        alert("Formulario enviado correctamente.");
    }

    var nombreError = document.getElementById("nombreError");
    if (!esNombreValido) {
        nombreError.innerHTML = "Ingrese Un Nombre Valido.";
    } else {
        nombreError.innerHTML = ""; // Limpiar el mensaje de error si es válido
        // Aquí puedes enviar el formulario o realizar otras acciones si es válido
        alert("Formulario enviado correctamente.");
    }

    var passwordError = document.getElementById("passwordError");
    if (!esPasswordValido) {
        passwordError.innerHTML = "Ingrese Una Contraseña Valida.";
    } else {
        passwordError.innerHTML = ""; // Limpiar el mensaje de error si es válido
        // Aquí puedes enviar el formulario o realizar otras acciones si es válido
        alert("Contraseña enviada correctamente.");
    }

    var mensajeError = document.getElementById("mensajeError");
    if (!esMensajeValido){
        mensajeError.innerHTML = "Ingrese Un Mensaje Valido."
    } else {
        mensajeError.innerHTML = "";

        alert("Mensaje enviado correctamente")
    }
}