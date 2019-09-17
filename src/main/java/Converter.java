public class Converter {
    private final String [] words = {"", "one", "two", "three", "four", "five","six","seven","eight","nine","ten",
            "eleven","twelve","thirteen","fourteen","fifteen"};

    public String thisNumberSpelled(int number) {

        return number == 16 ? "sixteen" :  words[number];
    }
}
