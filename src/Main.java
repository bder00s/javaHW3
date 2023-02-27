import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Hier mag je je code scrijven voor de hoofd-opdracht!


        //ARRAYS
        Integer[] numeric = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        String[] alphabetic = {"een", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "nul"};


        Converter converter = new Converter(alphabetic, numeric);

        boolean play = true;
        String ongeldig = "Ongeldige invoer - voer een geldig cijfer tussen 0-10 in";

        Scanner scanner = new Scanner(System.in);


        // WHILE LOOP MET USER INPUT
        while (play == true) {
            System.out.println("Type 'x' om te stoppen \nType 'v' om te vertalen");

            String input = scanner.nextLine();

            // IF STATEMENT, WIL GEBRUIKER DOORGAAN OF NIET?
            if (input.equals("x")) {
                play = false;
            } else if (input.equals("v")) {
                System.out.println("Voer een cijfer in van 0 t/m 9");
                int number = scanner.nextInt();

                scanner.nextLine();

            // PRINTEN VAN RESULTAAT
                if (number < 10) {
                    String result = converter.translate(number);
                    System.out.println("De vertaling van " + number + " is " + result);
                } else {
                    System.out.println(ongeldig);
                }
            } else {
                System.out.println(ongeldig);
            }

        }













// Onderstaande code is voor de bonus opdracht.
//        HashSet<Integer> secretnumber = randomnumbergenerator();
//        String stringnumber =  setToStringConverter(secretnumber);
//        System.out.println(stringnumber);
//        feedback();
//         deze regel mag je weg halen voor de bonus opdracht */
//
//        }

    /*
     Deze methode is voor de bonus opdracht.
     */
//    public static void feedback(String stringnumber) {
//        Scanner scanner = new Scanner(System.in);
//        StringBuilder feedback = new StringBuilder();
//        System.out.println("take a guess");
//        String guess = scanner.nextLine();
//        if (Objects.equals(guess, stringnumber)) {
//            System.out.println("gefeliciteerd je hebt het goed");
//        } else {
//            for (int i = 0; i < 4; i++) {
//                if (guess.substring(i, i + 1).equals(stringnumber.substring(i, i + 1))) {
//                    feedback.append("+");
//                } else if (stringnumber.contains(guess.substring(i, i + 1))) {
//                    feedback.append("0");
//                } else {
//                    feedback.append("X");
//                }
//            }
//        }
//        System.out.println(feedback.toString());
//    }
    }

}
