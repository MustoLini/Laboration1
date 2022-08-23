import java.util.ArrayList;
import java.util.Collections;
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
    }

    private static void rockPaperScissor() {
        System.out.println("3");
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