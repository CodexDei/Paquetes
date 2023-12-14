//si solo necesitamos la clase Utileria
//import com.codexdei.Utileria;
//si necesitamos mas clases
//comentamos la siguiente linea para usar la mejor manera
//
//Para metodos estaticos la mejor forma es
import static com.codexdei.Utileria.imprimir;

public class EjemploPaquetesPrueba {
    
    public static void main(String[] args) {

        //Utilizando el nombre de la clase completamente calificado
        //fully qualified name
        //comentamos la siguiente linea porque no es muy comun usarla asi
//        com.codexdei.Utileria.imprimir("hola");

        //haciendo un import de la clase
        imprimir("Hola");
    }
}
