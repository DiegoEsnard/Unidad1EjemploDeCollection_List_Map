import java.util.ArrayList;
import java.util.Collection;

public class CollectionDeclarationExample {
    public static void main(String[] args) {
        //Declararemos una instancia de la interfaz Collection usando ArrayList//
        Collection<String> namesCollection = new ArrayList<>();

        //Agregar elementos a la collection
        namesCollection.add("Messi");
        namesCollection.add("Pedri");
        namesCollection.add("Araujo");
        namesCollection.add("Ter Stegen");

        //Mostrar los elementos de la collection//
        for(String name: namesCollection){
            System.out.println(name);
        } //llave del for//

        System.out.println("\n\tEste fue un ejemplo de Collection :)\n\t");

    } //llave del main//
} // última llave//
