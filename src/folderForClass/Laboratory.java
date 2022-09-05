package folderForClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Laboratory {
    private Scanner in = new Scanner(System.in);
    private int playerScore = 0;
    private int pcScore = 0;
    private ArrayList<Integer> minAndMaxList = new ArrayList<>();

    public void alternativeMenu() {
        System.out.println("""
                1. Upp and down:
                2. Min and Max:
                3. Rock, paper, scissor:
                4. In Order:
                e. Exit:""");
        String alternative = in.nextLine();

        switch (alternative) {
            case "1" -> uppAndDown();
            case "2" -> minAndMax();
            case "3" -> rockPaperScissor();
            case "4" -> inOrder();
            case "e", "E" -> exit();
            default -> {
                System.out.println("You wrote something else then your options:");
                alternativeMenu();
            }
        }
        in.nextLine();
    }

    private void exit() {
        System.exit(0);
    }

    private void inOrder() {
        System.out.println("Please write five number, they will write out the Minimum, Maximum , Sum: ");
        String writer = in.nextLine();
        System.out.println();
        System.out.println(writer);

        String[] split = writer.split(" ");
        for (String a : split) {
            minAndMaxList.add(Integer.parseInt(a));
        }
        int sum = 0;
        for (Integer integer : minAndMaxList) {
            sum += integer;
        }

        Collections.sort(minAndMaxList);
        System.out.println("Second Max value: " + minAndMaxList.get(3));
        System.out.println("Second Min value: " + minAndMaxList.get(1));
        int min = Collections.min(minAndMaxList);
        int max = Collections.max(minAndMaxList);
        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min);
        System.out.println("Sum: " + sum);

        minAndMaxList.clear();
        System.out.println();
        alternativeMenu();
        in.nextLine();

    }

    private void rockPaperScissor() {
        System.out.println("3");
        Random random = new Random();
        int upperbound = 3;
        while (true) {
            System.out.println("Rock, Paper, Scissor What do you want to pick?");
            int randomNumber = random.nextInt(upperbound);
            String writer = in.nextLine();
            ;
            if (writer.equalsIgnoreCase("Rock") && randomNumber == 0) {
                printScoreForDraw();
            }
            if (writer.equalsIgnoreCase("Rock") && randomNumber == 1) {
                printScoreForPc();


            }
            if (writer.equalsIgnoreCase("Rock") && randomNumber == 2) {
                printScoreForPlayer();


            }
            if (writer.equalsIgnoreCase("Paper") && randomNumber == 0) {
                printScoreForPlayer();


            }
            if (writer.equalsIgnoreCase("Paper") && randomNumber == 1) {
                printScoreForDraw();
            }
            if (writer.equalsIgnoreCase("Paper") && randomNumber == 2) {
                printScoreForPc();


            }
            if (writer.equalsIgnoreCase("Scissor") && randomNumber == 0) {
                printScoreForPc();


            }
            if (writer.equalsIgnoreCase("Scissor") && randomNumber == 1) {
                printScoreForPlayer();


            }
            if (writer.equalsIgnoreCase("Scissor") && randomNumber == 2) {
                printScoreForDraw();
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
        System.out.println();
        alternativeMenu();
        in.nextLine();
    }

    private void printScoreForPlayer() {
        System.out.println("Player wins: ");
        playerScore++;
        System.out.println("PlayersScore: " + playerScore);
        System.out.println("PcScore: " + pcScore);
    }

    public void printScoreForPc() {
        System.out.println("PC wins: ");
        pcScore++;
        System.out.println("PlayersScore: " + playerScore);
        System.out.println("PcScore: " + pcScore);
    }

    private void printScoreForDraw() {
        System.out.println("Draw: ");
        System.out.println("PlayersScore: " + playerScore);
        System.out.println("PcScore: " + pcScore);
    }

    private void minAndMax() {
        System.out.println("Here is Min and Max of five numbers, so please type in five numbers:");
        int counter = 0;
        ArrayList<Integer> minAndMaxList = new ArrayList<>();
        while (counter != 5) {
            int writer = Integer.parseInt(in.nextLine());
            minAndMaxList.add(writer);
            counter++;
        }
        int min = Collections.min(minAndMaxList);
        int max = Collections.max(minAndMaxList);
        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min);

        System.out.println();
        minAndMaxList.clear();
        alternativeMenu();
        in.nextLine();
    }

    private void uppAndDown() {
        System.out.println("This is Upp and Down: ");
        System.out.println("If you don't want to add anymore things just type END: ");
        ArrayList<String> uppAndDownList = new ArrayList<>();
        while (true) {
            System.out.println("Please write a number: ");
            String writer = in.next();
            if (writer.equals("END")) {
                in.nextLine();
                break;
            }
            uppAndDownList.add(writer);
        }

        for (int i = uppAndDownList.size() - 1; i >= 0; i--) {
            System.out.println(uppAndDownList.get(i));

        }

        System.out.println();
        alternativeMenu();
    }
}
