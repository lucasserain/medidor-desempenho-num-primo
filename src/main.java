import service.CheckIsPrimo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.addAll(Arrays.asList(7,27,8421,13033,524287,664283,2147483647));
        CheckIsPrimo testaAlgoritmos = new CheckIsPrimo();
        testaAlgoritmos.Orquestrador(numeros);
    }

}
