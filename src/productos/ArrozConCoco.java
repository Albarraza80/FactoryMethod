package productos;

import creadores.Orden;

public class ArrozConCoco implements Plato{
    @Override
    public void preparar(){
        System.out.println("Arroz con coco preparado");
    }

    @Override
    public void emplatar(){
        System.out.println("Arroz con coco emplatado");
    }
}
