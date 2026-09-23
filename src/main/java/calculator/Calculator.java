package calculator;

import java.util.HashSet;
import java.util.Set;

public class Calculator
{
    public static int add(int a, int b)
    {
        return a + b;
    }

    public static int div(int a, int b) throws ArithmeticException {
        if(b == 0){
            throw new ArithmeticException("Divison par 0 impossible");
        }

        return a / b;
    }

    public static Set<Integer> ensembleChiffres(int pNombre)
    {
        Set<Integer> chiffres = new HashSet<>();

        String texte = String.valueOf(Math.abs(pNombre));

        for (char c : texte.toCharArray()) {
            chiffres.add(Character.getNumericValue(c));
        }

        return chiffres;
    }
}
