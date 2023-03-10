import java.util.Scanner;

public class PrimerEj {
    public static void main(String[] args) {


        //ejercicio 1-1//

       /* int numeroInicio = 9;
        int numeroFin = 17;*/

        /*while (numeroInicio<=numeroFin) {
            System.out.println(numeroInicio);
            numeroInicio++;*/

        //ejercicio 1-2// //sout + tab//

       /* while(numeroInicio<=numeroFin) {

                    if (numeroInicio%2==0) {
                    System.out.println( numeroInicio);
                }

            numeroInicio++;

             }*/


        //ejercicio 1-3//

        /*System.out.println("ingrese 1 para mostrar en pantalla numeros impares y 2 numeros pares ");
        int ingresoValor;
        Scanner primerEscaner = new Scanner(System.in);
        ingresoValor= Integer.parseInt(primerEscaner.nextLine());
        switch (ingresoValor) {
            case 1:
                while (numeroInicio <= numeroFin) {
                    if (numeroInicio % 2 != 0) {
                        System.out.println(numeroInicio);
                    }
                    numeroInicio++;
                }
            case 2:
                while (numeroInicio <= numeroFin) {
                    if (numeroInicio % 2 == 0) {
                        System.out.println(numeroInicio);
                    }
                    numeroInicio++;
                }
            default:
            break;
           }*/
        //ejercicio 1_4//

        /*for (int numeroFor=17; numeroFor>=numeroInicio;numeroFor--){

            System.out.println(numeroFor);
        }*/

        //ejercicio numero 2//
        final int ingesoTotalesMax = 489083;
        final int vehiculosMax = 3;
        final int inmueblesMax = 3;
        Scanner entrada2 = new Scanner(System.in);
        char categoria1= 'A';
        char categora2= 'B';

        System.out.println("ingrese los ingreso totales");
        int ingresoTotales;
        ingresoTotales = entrada2.nextInt();

        System.out.println("ingrese los vehiculos que posee");
        int vehiculos;
        vehiculos = entrada2.nextInt();

        System.out.println("ingrese los inmuebles que posee");
        int inmuebles;
        inmuebles = entrada2.nextInt();

        System.out.println("ingrese si posee lujos");
        boolean respuesta;
        respuesta=entrada2.nextBoolean();




      if ((ingresoTotales >= ingesoTotalesMax) && (vehiculos >= vehiculosMax) && (inmuebles >= inmueblesMax)&&(respuesta)){

                    System.out.println("pertenece a la categoria "+ categoria1);
        }
      else {
          System.out.println("pertenece a la categoria "+ categora2);
      }
    }
}

