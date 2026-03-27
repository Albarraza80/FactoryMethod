package creadores;

import productos.Plato;

public abstract class Orden{
    abstract Plato crearPlato();

    public void fabricaDePlatos(){
        Plato plato = crearPlato();
        plato.preparar();
        plato.emplatar();
    }
}
