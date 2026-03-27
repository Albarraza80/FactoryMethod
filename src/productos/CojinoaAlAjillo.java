package productos;

public class CojinoaAlAjillo implements Plato{
    @Override
    public void preparar(){
        System.out.println("Cojinoa al ajillo preparada");
    }

    @Override
    public void emplatar(){
        System.out.println("Cojinoa al ajillo emplatada");
    }
}
