public class Lexical {
    public int numOfChar(String input) {
        if (input.equals("")) return 0;
        int num = 0;
        String[] splitInput = input.split("\\W+");
        for (String s : splitInput) {
            num += s.length();
        }
        return num;
    }

    public int numOfWords(String input) {
        if (input.equals("")) return 0;
        int num = 0;
        String[] splitInput = input.split("\\W+");
        for (String s : splitInput) {
            num++;
        }
        return num;
    }


    public char numOfFreq(String input)
    {
        int count[] = new int[128];
        int freq = 0;
        char letter = ' ';

        for (int i=0; i<input.length(); i++){
            count[input.charAt(i)]++;
        }

        for (int i = 0; i < input.length(); i++) {
            if (freq < count[input.charAt(i)]) {
                freq = count[input.charAt(i)];
                letter = input.charAt(i);
            }
        }

        return letter;
    }


}
