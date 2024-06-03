<?php
// Inicializamos un arreglo vacío para almacenar los datos
$personas = array();

// Solicitamos nombre, apellido paterno, apellido materno y edad tres veces
for ($i = 0; $i < 3; $i++) {
    // Inicializamos un arreglo para almacenar las cualidades de cada persona
    $cualidades = array();

    // Pedimos al usuario que ingrese los datos
    echo "Ingrese el nombre " . ($i + 1) . ": ";
    $nombre = trim(fgets(STDIN));
    $cualidades[] = $nombre;

    echo "Ingrese el apellido paterno " . ($i + 1) . ": ";
    $apellido_paterno = trim(fgets(STDIN));
    $cualidades[] = $apellido_paterno;

    echo "Ingrese el apellido materno " . ($i + 1) . ": ";
    $apellido_materno = trim(fgets(STDIN));
    $cualidades[] = $apellido_materno;

    echo "Ingrese la edad " . ($i + 1) . ": ";
    $edad = trim(fgets(STDIN));
    $cualidades[] = $edad;

    // Agregamos el arreglo de cualidades al arreglo de personas
    $personas[] = $cualidades;

    // Mandamos a imprimir en pantalla el arreglo
    print_r($personas);
}

// Esta parte del código nos permite confirmar que se ingresaron datos 3 veces
if (count($personas) == 3) {
    // Manda a imprimir en la pantalla los datos
    echo "Los datos ingresados son:\n";
    // Recorre la lista según las coordenadas, en este caso del arreglo de personas
    for ($y = 0; $y < count($personas); $y++) {
        echo "Persona " . ($y + 1) . ":\n";
        // Recorre la lista mediante coordenadas, en este caso en el arreglo de cualidades
        for ($x = 0; $x < count($personas[$y]); $x++) {
            // Imprime en pantalla el arreglo de personas según las coordenadas de x, y
            switch ($x) {
                case 0:
                    echo "Nombre: " . $personas[$y][$x] . "\n";
                    break;
                case 1:
                    echo "Apellido Paterno: " . $personas[$y][$x] . "\n";
                    break;
                case 2:
                    echo "Apellido Materno: " . $personas[$y][$x] . "\n";
                    break;
                case 3:
                    echo "Edad: " . $personas[$y][$x] . "\n";
                    break;
            }
        }
    }
} else {
    echo "No se han ingresado los datos de las tres personas requeridas.\n";
}
?>
