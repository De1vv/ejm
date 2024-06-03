//Importamos las librerias de arreglos (ArrayList)
import java.util.ArrayList;
import java.util.Scanner;

//Declaramos nuestra clase que es donde se va a encontrar nuestros arreglos, variables, ciclos e impresiones de pantalla 
public class Arreglo {

    public static void main(String[] args) {
       
       //Inicializamos nuestro primer arreglo con ayuda de del Arraylist, el String refiere al tipo de dato que se e va insertar  personas al nombre de la variable  
        ArrayList<ArrayList<String>> personas = new ArrayList<>();

        //Inicializamos nuestro escaner 
        Scanner scanner = new Scanner(System.in);

       //Con ayuda de este for vamos a hacer que el ciclo se repita 3 veces 
        for (int i = 0; i < 3; i++) {
              //Iniciamos nuestro segundo arreglo para realizar la matriz, en este caso se va a llamar cualidades
            ArrayList<String> cualidades = new ArrayList<>();

            // Pedimos al usuario que ingrese los datos, imprimiendo en la la pantalla "Ingrese el nombre"
            System.out.print("Ingrese el nombre " + (i + 1) + ": ");
            //Con ayuda del sacnner guardamos los datos ingresados en una variable nombre
            String nombre = scanner.nextLine();
            //Hacemos que los datos se almacenen en nuestro segundo arreglo "cualidades"
            cualidades.add(nombre);
            // Pedimos al usuario que ingrese los datos, imprimiendo en la la pantalla "Ingrese el apellido paterno"
            System.out.print("Ingrese el apellido paterno " + (i + 1) + ": ");
            //Con ayuda del sacnner guardamos los datos ingresados en una variable apellido_Paterno
            String apellidoPaterno = scanner.nextLine();
            //Hacemos que los datos se almacenen en nuestro segundo arreglo "cualidades"
            cualidades.add(apellidoPaterno);

            // Pedimos al usuario que ingrese los datos, imprimiendo en la la pantalla "Ingrese el apellido materno"
            System.out.print("Ingrese el apellido materno " + (i + 1) + ": ");
            //Con ayuda del sacnner guardamos los datos ingresados en una variable apellido_Materno
            String apellidoMaterno = scanner.nextLine();
            //Hacemos que los datos se almacenen en nuestro segundo arreglo "cualidades"
            cualidades.add(apellidoMaterno);

            //// Pedimos al usuario que ingrese los datos, imprimiendo en la la pantalla "Ingrese la edad"
            System.out.print("Ingrese la edad " + (i + 1) + ": ");
             //Con ayuda del sacnner guardamos los datos ingresados en una variable edad
            String edad = scanner.nextLine();
            //Hacemos que los datos se almacenen en nuestro segundo arreglo "cualidades"
            cualidades.add(edad);

            // Agregamos el arreglo "cualidades" a nuestro primer arreglo "personas" con el fin de hacer una matriz
            personas.add(cualidades);

           //Imprimimos en patalla nuestra matriz 
            System.out.println(personas);
        }
        //Cerramos el scanner
        scanner.close();

        //Aseguramos con el if que el numero de personas ingresadas (Nombre, Apellido Paterno, Apellido Materno) sean 3 
        if (personas.size() == 3) {
            //Imprimos los datos en la pantalla 
            System.out.println("Los datos ingresados son:");
            //Utilizaremos un ciclo for para determinar como queremos que recorra la lista "Personas"
            for (int y = 0; y < personas.size(); y++) {
                //Imprimimos en pantalla 
                System.out.println("Persona " + (y + 1) + ":");
                // Utilizamos otro ciclo for esta vez para determinar como se va a recorrer la lista "Cualidades"
                for (int x = 0; x < personas.get(y).size(); x++) {
                    //Obtenemos las cualidades especificas de las personas segun los ejes y coordenandas 
                    String cualidad = personas.get(y).get(x);
                    //utilizamos un switch case para determinar que es lo qu va a imprimirsegun el caso
                    switch (x) {
                        case 0:
                            // en el caso 0 imprimira el primer nombre ingresado 
                            System.out.println("Nombre: " + cualidad);
                            // Rompemos o terminamos el primer caso para no hacer un bucle
                            break;
                        case 1:
                            // en el caso 1 imprimira el primer apelllido paterno de la lista de cualidad
                            System.out.println("Apellido Paterno: " + cualidad);
                            // Rompemos o terminamos el primer caso para no hacer un bucle
                            break;
                        case 2:
                            //En el caso 2 imprime el primer apellido materno de la lista cualidad
                            System.out.println("Apellido Materno: " + cualidad);
                            // Rompemos o terminamos el primer caso para no hacer un bucle
                            break;
                        case 3: 
                        // En el caso 3 imprime el la edad ingresada por el usuario de la lista cualidad 
                            System.out.println("Edad: " + cualidad);
                            // Rompemos o terminamos el primer caso para no hacer un bucle
                            break;
                    }
                }
            }
            // el else nos ayudara por si no se insertan los 3 datos mandara a imprimir un mesaje en la pantalla
        } else {
            System.out.println("No se han ingresado los datos de las tres personas requeridas.");
        }
    }
}

