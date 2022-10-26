import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class yearloop_Test{

    //Når det er delelig med 4, men ikke 100
    @Test
    public void when_divided_by_4_not_100() {assertEquals( false, Yearloop.isLeapYear(1916));}

    //Når det er delelig med 400
    @Test
    public void when_divided_by_400_() {assertEquals(true, Yearloop.isLeapYear(2000));
    }

    //Når det ikke er delelig med 4
    @Test
    public void not_divides_by_4() {assertEquals(false, Yearloop.isLeapYear(1800));
    }

    @Test
    public void not_divides_by_400() {assertEquals(false, Yearloop.isLeapYear(2100));
    }

}
