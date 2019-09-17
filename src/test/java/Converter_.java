import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Converter_ {

    @Test
    public void given_1_should_return_uno(){
        assertThat(new Converter().thisNumberSpelled(1)).isEqualTo("one");
    }
    @Test
    public void given_2_should_return_two(){
        assertThat(new Converter().thisNumberSpelled(2)).isEqualTo("two");
    }

}
