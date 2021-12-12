package juris;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println(PasswordGenerator.generate(12));

        System.out.println(StringAnalyzer.countOfCombination("AbabacbadaabAb", "ab"));

        ArrayList<Integer> startPositionsForPrint= new ArrayList<>();
        startPositionsForPrint= StringAnalyzer.startPositions("AbabacbadaabAb", "ab");
        System.out.println(startPositionsForPrint.toString());
    }
}
