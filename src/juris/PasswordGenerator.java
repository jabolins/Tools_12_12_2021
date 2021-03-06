package juris;

import java.util.Random;

/**
 * generate password (String) from english characters and special symbols:
 * AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz!~@#$&*()_+-/*
 *
 * input length of password (int)
 * output password (String)
 */
public class PasswordGenerator {
    /**
     * characters for passwrd
     */
    private final static String CHARACTERS = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz!~@#$&*()_+-/*";

    /**
     *
     * @param passwordLength - length of password what need to generate
     * @return password (String)
     */
    public static String generate(int passwordLength) {
        Random rnd = new Random();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < passwordLength; i++) {
            char c = CHARACTERS.charAt(rnd.nextInt(CHARACTERS.length()));
            stringBuilder.append(c);
        }
        return stringBuilder.toString();

    }
}
