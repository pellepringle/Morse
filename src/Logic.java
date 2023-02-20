import java.util.HashMap;
import java.util.Map.Entry;

public class Logic {
    boolean stop;

    public static String translate(String input) {
        HashMap<Character, String> morse = new HashMap<Character, String>();
        morse.put('a', ".-");
        morse.put('b', "-...");
        morse.put('c', "-.-.");
        morse.put('d', "-..");
        morse.put('e', ".");
        morse.put('f', "..-.");
        morse.put('g', "--.");
        morse.put('h', "....");
        morse.put('i', "..");
        morse.put('j', ".---");
        morse.put('k', "-.");
        morse.put('l', ".-..");
        morse.put('m', "--");
        morse.put('n', "-.");
        morse.put('o', "---");
        morse.put('p', ".--.");
        morse.put('q', "--.-");
        morse.put('r', ".-.");
        morse.put('s', "...");
        morse.put('t', "-");
        morse.put('u', "..-");
        morse.put('v', "...-");
        morse.put('w', ".--");
        morse.put('x', "-..-");
        morse.put('y', "-.--");
        morse.put('z', "--..");
        morse.put(' ', " ");

        boolean isMorse = false;
        String output = "";
        char[] inputArr = new char[input.length()];

        for (int i = 0; i < input.length(); i++) {
            inputArr[i] = input.charAt(i);
        }
        if (input.charAt(0) == '.') isMorse = true;
        if (input.charAt(0) == '-') isMorse = true;

        if (isMorse) {
            String test5 = input.replace("/", " space ");
            String[] test = test5.split(" ");

            for (int i = 0; i < test.length; i++) {
                if (test[i].matches("space")) {
                    output = output + " ";
                }
                for (Entry<Character, String> entry : morse.entrySet()) {
                    if (entry.getValue().equals(test[i])) {
                        output = output + entry.getKey();
                        break;
                    }
                }
            }
        } else {
            for (int i = 0; i < inputArr.length; i++) {
                output = output + morse.get(inputArr[i]);
            }
        }

        return output;

    }

    public void checkStop(String input) {
        if (input.equals("*")) {
            stop = true;
        }
    }

    public void checkSwedishLetters(String input) {
        if (input.contains("å") || input.contains("ä") || input.contains("ö")) {
            System.out.println("Du kan inte skriva å,ä eller ö, skriv på engelska eller i morse och försök igen!");
        }
    }

    public boolean getStop() {
        return stop;
    }

}

