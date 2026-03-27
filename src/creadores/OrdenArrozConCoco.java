package creadores;

import productos.ArrozConCoco;
import productos.Plato;

public class OrdenArrozConCoco extends Orden{

    @Override
    Plato crearPlato(){
        return new ArrozConCoco();
    }
}
