package productos;

public class HigadoEncebollado implements Plato{
    @Override
    public void preparar(){
        System.out.println("Hígado encebollado preparado");
    }

    @Override
    public void emplatar(){
        System.out.println("Hígado encebollado emplatado");
    }
}
