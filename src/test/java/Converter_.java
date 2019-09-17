import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Converter_ {
    @Test
    public void given_number_between_1_and_15_should_return_his_text_format(){
        assertThat(new Converter().thisNumberSpelled(1)).isEqualTo("one");
        assertThat(new Converter().thisNumberSpelled(2)).isEqualTo("two");
        assertThat(new Converter().thisNumberSpelled(3)).isEqualTo("three");
        assertThat(new Converter().thisNumberSpelled(4)).isEqualTo("four");
        assertThat(new Converter().thisNumberSpelled(5)).isEqualTo("five");
        assertThat(new Converter().thisNumberSpelled(6)).isEqualTo("six");
        assertThat(new Converter().thisNumberSpelled(7)).isEqualTo("seven");
        assertThat(new Converter().thisNumberSpelled(8)).isEqualTo("eight");
        assertThat(new Converter().thisNumberSpelled(9)).isEqualTo("nine");
        assertThat(new Converter().thisNumberSpelled(10)).isEqualTo("ten");
        assertThat(new Converter().thisNumberSpelled(11)).isEqualTo("eleven");
        assertThat(new Converter().thisNumberSpelled(12)).isEqualTo("twelve");
        assertThat(new Converter().thisNumberSpelled(13)).isEqualTo("thirteen");
        assertThat(new Converter().thisNumberSpelled(14)).isEqualTo("fourteen");
        assertThat(new Converter().thisNumberSpelled(15)).isEqualTo("fifteen");

    }

    @Test
    public void given_16_should_return_sixteen(){
        assertThat(new Converter().thisNumberSpelled(16)).isEqualTo("sixteen");
    }

}

