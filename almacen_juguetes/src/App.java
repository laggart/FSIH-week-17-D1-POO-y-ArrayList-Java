import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        Dimension jug1 = new Dimension(10, 5, 3);
        Juguetes juguete1 = new Juguetes("Peluche", 10, jug1);

        Dimension jug2 = new Dimension(8, 6, 4);
        Juguetes juguete2 = new Juguetes("Pelota", 5, jug2);

        ArrayList<Juguetes> juguete = new ArrayList<>();
        juguete.add(juguete1);
        juguete.add(juguete2);

        
        System.out.println("Lista de juguetes: ");
        imprimeJuguetes(juguete);

    }

    public static void imprimeJuguetes(ArrayList<Juguetes> juguetes) {
        for (Juguetes juguete : juguetes) {
            System.out.println(juguete);
        }
    }

    


}
