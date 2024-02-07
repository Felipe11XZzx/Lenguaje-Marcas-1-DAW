<!DOCTYPE html>
<html lang="en">

<link>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="style.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Fornulario</title>
    <script src="script.js"></script>
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Honk&display=swap');
      </style>
</head>

<body>

    <div class="container">
        <h1 id="title"> Formulario 1</h1>

        <form id="myForm">

            <div class="Input-group">

                <label for="nombre">Nombre</label>
                <input type="text" id="nombre" name="nombre" required>
                <p id="nombreError" class="error-message"></p>
            </div>

            <div class="Input-group">
                <label for="email">Correo Electrónico</label>
                <input type="email" id="email" name="email" required>
                <p id="emailError" class="error-message"></p>
            </div>

            <div class="Input-group">
                <label for="password">Password</label>
                <input type="password" id="password" name="password" required>
                <p id="passwordError" class="error-message"></p>
            </div>

            <div class="Input-group">
                <label for="mensaje">Mensaje</label>
                <textarea id="mensaje" name="mensaje" required></textarea>
                <p id="mensajeError" class="error-message"></p>
            </div>

            <div class="Input-group">
                <label for="genero">Género:</label>
                <select id="genero" name="genero">
                    <option value="masculino">Masculino</option>
                    <option value="Femenino">Femenino</option>
                    <option value="otro">Otro</option>
                </select>
            </div>

            <div id="Pruebas">
             
                 <form id="check">
                    <input type="checkbox" id="Doc1" name="Doc1" value="DNI"> DNI
                    <input type="checkbox" id="Doc2" name="Doc2" value="NIE"> NIE
                    <input type="checkbox" id="Doc3" name="Doc3" value="PASS"> PASAPORTE
                 </form>

                 <form id="color">
                    <input type="color" id="Color-fav" name="Color-fav">
                 </form>

                 <form id="fecha">
                    <label for="Fecha">Fecha:</label>
                    <input type="date" id="Fecha" name="Fecha">
                 </form>

                 <form id="local">
                    <label for="fecha-uso">Hora:</label>
                    <input type="datetime-local" id="fecha-uso" name="fecha-uso">
                 </form>

                 <form id="boton">
                    <input id="Button-R" type="button" onclick="alert('No Se Puede Reiniciar La Pagina')" value="Reiniciar">
                    <input id="Button-Z" type="button" onclick="alert('El Formulario Se Ha Enviado')" value="Enviar">
                 </form>

            </div>

    </div>
</body>

</html>
