package Application;

import creadores.Orden;
import creadores.OrdenArrozConCoco;
import creadores.OrdenCojinoaAlAjillo;
import creadores.OrdenHigadoEncebollado;

import java.util.function.Supplier;


public enum PlatosOfrecidos {

    //Se hacen modificaciones
    ARROZCOCO(OrdenArrozConCoco::new),
    COJINOAAJILLO(OrdenCojinoaAlAjillo::new),
    HIGADOENCEBOLLADO(OrdenHigadoEncebollado::new);

    private final Supplier<Orden> constructor;

    PlatosOfrecidos( Supplier<Orden> constructor) {
        this.constructor = constructor;
    }

    public Orden crear(){
        return constructor.get();
    }
}

