import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("task1");
        System.out.println(sameLetterPattern("ABAB", "CDCD")); // true
        System.out.println(sameLetterPattern("ABCBA", "BCDCB")); // true
        System.out.println(sameLetterPattern("FFGG", "CDCD")); // false
        System.out.println(sameLetterPattern("FFFF", "ABCD")); // false

        System.out.println("task2");
        System.out.println(shortestPath(2, 'C', 3, 'E'));

        System.out.println("task3");
        System.out.println(digitsCount(12456));

        System.out.println("task4");


        System.out.println("task5");


        System.out.println("task6");

        System.out.println("task7");


        System.out.println("task8");


        System.out.println("task9");


        System.out.println("task10");

    }


    //task3.1
    public static boolean sameLetterPattern(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        Map<Character, Character> mapping1 = new HashMap<>();
        Map<Character, Character> mapping2 = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);

            if (mapping1.containsKey(char1)) {
                if (mapping1.get(char1) != char2) {
                    return false;
                }
            } else {
                mapping1.put(char1, char2);
            }

            if (mapping2.containsKey(char2)) {
                if (mapping2.get(char2) != char1) {
                    return false;
                }
            } else {
                mapping2.put(char2, char1);
            }
        }

        return true;
    }


    //task3.2
    static double shortestPath(int spiderRing, char spiderRadial, int flyRing, char flyRadial) {
        int spiderRadialIndex = spiderRadial - 'A';
        int flyRadialIndex = flyRadial - 'A';

        double angleBetweenRadials = 45.0;
        double ringDistance = 1.0; //x

        double angle = Math.abs(spiderRadialIndex - flyRadialIndex) * angleBetweenRadials;

        double shortestPath = Math.sqrt((spiderRing*spiderRing*ringDistance)+(flyRing*flyRing*ringDistance)-(2*spiderRing*flyRing*Math.cos(angle)*ringDistance*ringDistance));

        return shortestPath;
    }


//task3.3

    public static int digitsCount(int a) {
        if (a < 10) {
            return 1;
        }
        else {
            int remainingDigits = (int) Math.floor(a / 10);
            return digitsCount(remainingDigits) + 1;
        }
    }
    /*
    //task3.4
    public static boolean numCheck(int num) {

    }

    //task3.5
    public static int countRoots(int[] coefficients) {

    }
    //task3.6
    public static List<String> salesData(List<List<String>> sales) {

    }

    public static int findMaxLength(List<List<String>> sales) {

    }

    //task3.7
    public static Boolean validSplit(String sentence) {

    }


    //task3.8

    public static Boolean waveForm(int[] numbers) {

    }
    //task3.9
    public static char commonVowel(String sentence) {

    }

    //task3.10
    public static void dataScience(int[][] matrix) {

    }*/
}