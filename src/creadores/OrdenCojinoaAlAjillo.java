package creadores;

import productos.CojinoaAlAjillo;
import productos.Plato;

public class OrdenCojinoaAlAjillo extends Orden{
    @Override
    Plato crearPlato(){
        return new CojinoaAlAjillo();
    }
}
