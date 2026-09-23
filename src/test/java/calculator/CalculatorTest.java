package calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {

    @ParameterizedTest
    @CsvSource({
            "0, 1, 1",
            "1, 2, 3",
            "-2, 2, 0",
            "0, 0, 0",
            "-1, -2, -3",
    })
    public void add_devrait_calculer_somme_deux_entier(int a, int b, int attendu){
        assertThat(Calculator.add(a, b)).isEqualTo(attendu);
    }

    @Test
    void add_devrait_calculer_somme_deux_entier()
    {
        //GIVEN
        int a = 6;
        int b = 3;

        //WHEN
        int res = Calculator.add(a, b);

        //THEN
        assertThat(res).isEqualTo(9);
    }

    @Test
    void div_devrait_calculer_division_deux_entier() {
        //GIVEN
        int a = 6;
        int b = 2;

        //WHEN
        int res = Calculator.div(a, b);

        //THEN
        assertThat(res).isEqualTo(3);
    }
}