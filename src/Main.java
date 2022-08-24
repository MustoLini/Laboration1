import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void alternativeMenu() {
        System.out.println("1. Upp and down ");
        System.out.println("2. Min and Max ");
        System.out.println("3. Rock, paper, scissor ");
        System.out.println("4. In Order ");
        System.out.println("e. Exit ");
        Scanner alternativeIn = new Scanner(System.in);
        String alternative = alternativeIn.next();
        if (alternative.equals("1")) {
            uppAndDown();
        }
        if (alternative.equals("2")) {
            minAndMax();
        }
        if (alternative.equals("3")) {
            rockPaperScissor();
        }
        if (alternative.equals("4")) {
            inOrder();

        }
        if (alternative.equals("e") || alternative.equals("E")) {
            exit();
        }


    }

    private static void exit() {
    }

    private static void inOrder() {
        System.out.println("4");
        Scanner writerAltern = new Scanner(System.in);
        int counter = 0;
        ArrayList<Integer> minAndMaxList = new ArrayList<>();
        while (counter != 5) {
            int writer = Integer.parseInt(writerAltern.next());
            minAndMaxList.add(writer);
            counter++;
        }
        int sum = 0;

        for (int i = 0; i < minAndMaxList.size(); i++) {
            sum += minAndMaxList.get(i);
        }

        for (int i = 0; i < minAndMaxList.size(); i++) {
            System.out.print(minAndMaxList.get(i) + " ");
        }
        Collections.sort(minAndMaxList);
        System.out.println();
        System.out.println("Second Max value: " + minAndMaxList.get(3));
        System.out.println("Second Min value: " + minAndMaxList.get(1));
        int min = Collections.min(minAndMaxList);
        int max = Collections.max(minAndMaxList);
        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min);
        System.out.println("Sum: " + sum);

    }

    private static void rockPaperScissor() {
        System.out.println("3");
        int playerScore = 0;
        int pcScore = 0;
        Random random = new Random();
        Scanner writerAlt = new Scanner(System.in);
        int upperbound = 3;
        while (true) {
            System.out.println("Rock, Paper, Scissor What do you want to pick?");
            int randomNumber = random.nextInt(upperbound);
            String writer = writerAlt.next();
            if (writer.equals("Rock") && randomNumber == 0) {
                System.out.println("Draw: ");
                System.out.println("PlayersScore: " + playerScore);
                System.out.println("PcScore: " + pcScore);
            }
            if (writer.equals("Rock") && randomNumber == 1) {
                System.out.println("PC wins: ");
                pcScore++;
                System.out.println("PlayersScore: " + playerScore);
                System.out.println("PcScore: " + pcScore);
            }
            if (writer.equals("Rock") && randomNumber == 2) {
                System.out.println("Player wins: ");
                playerScore++;
                System.out.println("PlayersScore: " + playerScore);
                System.out.println("PcScore: " + pcScore);
            }
            if (writer.equals("Paper") && randomNumber == 0) {
                System.out.println("Player wins: ");
                playerScore++;
                System.out.println("PlayersScore: " + playerScore);
                System.out.println("PcScore: " + pcScore);
            }
            if (writer.equals("Paper") && randomNumber == 1) {
                System.out.println("Draw: ");
                System.out.println("PlayersScore: " + playerScore);
                System.out.println("PcScore: " + pcScore);
            }
            if (writer.equals("Paper") && randomNumber == 2) {
                System.out.println("PC wins: ");
                pcScore++;
                System.out.println("PlayersScore: " + playerScore);
                System.out.println("PcScore: " + pcScore);
            }
            if (writer.equals("Scissor") && randomNumber == 0) {
                System.out.println("PC wins: ");
                pcScore++;
                System.out.println("PlayersScore: " + playerScore);
                System.out.println("PcScore: " + pcScore);
            }
            if (writer.equals("Scissor") && randomNumber == 1) {
                System.out.println("Player wins: ");
                playerScore++;
                System.out.println("PlayersScore: " + playerScore);
                System.out.println("PcScore: " + pcScore);
            }
            if (writer.equals("Scissor") && randomNumber == 2) {
                System.out.println("Draw: ");
                System.out.println("PlayersScore: " + playerScore);
                System.out.println("PcScore: " + pcScore);
            }
            if (playerScore == 3) {
                System.out.println("Player Wins!");
                break;
            }
            if (pcScore == 3) {
                System.out.println("Pc Wins!");
                break;
            }
        }
    }

    private static void minAndMax() {
        System.out.println("2");
        Scanner writerAlt = new Scanner(System.in);
        int counter = 0;
        ArrayList<Integer> minAndMaxList = new ArrayList<>();
        while (counter != 5) {
            int writer = Integer.parseInt(writerAlt.next());
            minAndMaxList.add(writer);
            counter++;
        }
        int min = Collections.min(minAndMaxList);
        int max = Collections.max(minAndMaxList);
        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min);

    }

    private static void uppAndDown() {
        System.out.println("1");
        Scanner writerAlt = new Scanner(System.in);
        ArrayList<String> uppAndDownList = new ArrayList<>();
        Boolean doNotStop = true;
        while (doNotStop) {
            String writer = writerAlt.next();
            if (writer.equals("END")) {
                break;
            }
            uppAndDownList.add(writer);
        }

        for (int i = uppAndDownList.size() - 1; i >= 0; i--) {
            System.out.println(uppAndDownList.get(i));

        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        alternativeMenu();

    }

}