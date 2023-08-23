import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Crear un HashMap que almacena nombres y edades
        HashMap<String, Integer> personMap = new HashMap<>();

        // Agregar variables al HashMap utilizando el método put()
        personMap.put("Pedri", 22);
        personMap.put("Gavi", 20);
        personMap.put("Yamal", 16);

        System.out.println("\n\t HashMap antes de la eliminación: \n\t");
        System.out.println(personMap);

        // Remover una variable del HashMap utilizando el método remove()
        String nombreARemover = "Pedri";
        personMap.remove(nombreARemover);

        System.out.println("\n\t HashMap después de la eliminación de " + nombreARemover + ":");
        System.out.println(personMap);
    }
}

