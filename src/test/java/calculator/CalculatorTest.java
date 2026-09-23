package calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {

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