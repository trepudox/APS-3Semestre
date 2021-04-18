import java.util.ArrayList;
import java.util.Random;

public class AppTeste {
    
    public static void main(String[] args) {
        Random random = new Random();
        
        ArrayList<Lixo> lixoLista = new ArrayList<>();
        lixoLista.add(new Lixo());
        lixoLista.add(new Lixo());
        lixoLista.add(new Lixo());

        System.out.println(lixoLista.get(1));


    }

}
