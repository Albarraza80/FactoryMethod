package creadores;

import productos.HigadoEncebollado;
import productos.Plato;

public class OrdenHigadoEncebollado extends Orden{
    @Override
    Plato crearPlato(){
        return new HigadoEncebollado();
    }
}
