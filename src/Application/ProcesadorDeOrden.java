package Application;

import creadores.Orden;
import creadores.OrdenArrozConCoco;

import java.util.Scanner;

public class ProcesadorDeOrden{

    public void tomarOrden(){

        Scanner sc = new Scanner(System.in);

        System.out.print( """
            ******MENÚ RESTAURANTE*****
            1. Arroz con coco
            2. Cojinoa al ajillo
            3. Higado encebollado

            Seleccione un plato: >""" + " ");

        int seleccion = sc.nextInt();

        Orden ordenPedida = switch (seleccion) {
            case 1 -> PlatosOfrecidos.ARROZCOCO.crear();
            case 2 -> PlatosOfrecidos.COJINOAAJILLO.crear();
            case 3 -> PlatosOfrecidos.HIGADOENCEBOLLADO.crear();
            default -> {
                System.out.println("Opción no válida.");
                yield PlatosOfrecidos.ARROZCOCO.crear();
            }
        };

      //ordenPedida.fabricaDePlatos();
    }
}
