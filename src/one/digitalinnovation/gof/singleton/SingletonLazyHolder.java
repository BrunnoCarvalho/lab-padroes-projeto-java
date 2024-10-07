package one.digitalinnovation.gof.singleton;

/**
 * Singleton "Lazy Holder"
* @see <a href = "https://stackoverflow.com/a/24018148">Referencia</a>
*
* @author falvojr
 */
public class SingletonLazyHolder {

    private static class Holder{ //Esta classe tem a função de encapsular esta instância
        private static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstancia(){
        return Holder.instancia;
    }
}
