package calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void add_devrait_calculer_somme_deux_entier()
    {
        //GIVEN
        int a = 6;
        int b = 3;

        //WHEN
        int res = calculator.add(a, b);

        //THEN
        assertThat(res).isEqualTo(9);
    }

    @Test
    void div_devrait_calculer_division_deux_entier()
    {
        //GIVEN
        int a = 6;
        int b = 2;

        //WHEN
        int res = calculator.div(a, b);

        //THEN
        assertThat(res).isEqualTo(3);
    }
}