import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BaseBall_upgrade {

    private static final int MAX_ATTEMPTS = 3;
    private static final int NUM_DIGITS = 3;

    private int gameNum;
    private int totalAttempts;
    private int totalAttemptsCount;
    private Random random;
    private Scanner scanner;

    public BaseBall_upgrade() {
        gameNum = 0;
        totalAttempts = 0;


        totalAttemptsCount = 0;
        random = new Random();
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        BaseBall_upgrade game = new BaseBall_upgrade();
        game.start();
    }

    public void start() {
        System.out.println("몇 게임 하실래요?");
        gameNum = scanner.nextInt();

        for (int i = 0; i < gameNum; i++) {
            int[] comNumber = generateRandomNumber();
            System.out.println(Arrays.toString(comNumber));
            int attempts = playGame(comNumber);
            totalAttempts += attempts;
            totalAttemptsCount++;
        }

        System.out.println("평균 성공 시도 횟수: " + (totalAttempts / (double) totalAttemptsCount));
    }

    private int[] generateRandomNumber() {
        int[] comNumber = new int[NUM_DIGITS];
        boolean[] used = new boolean[10];
        for (int i = 0; i < NUM_DIGITS; i++) {
            int digit;
            do {
                digit = random.nextInt(10);
            } while (used[digit]);
            comNumber[i] = digit;
            used[digit] = true;
        }
        return comNumber;
    }

    private int[] inputNumber() {
        int[] myNumber = new int[NUM_DIGITS];
        while (true) {
            System.out.println("Input three numbers:");
            String input = scanner.next();
            if (input.length() != NUM_DIGITS) {
                System.out.println("잘못된 입력입니다. 다시 시도하세요.");
                continue;
            }
            boolean validInput = true;
            for (int i = 0; i < NUM_DIGITS; i++) {
                char c = input.charAt(i);
                if (!Character.isDigit(c)) {
                    System.out.println("잘못된 입력입니다. 숫자만 입력하세요.");
                    validInput = false;
                    break;
                }
                myNumber[i] = c - '0';
            }
            if (validInput) {
                break;
            }
        }
        return myNumber;
    }

    private int playGame(int[] comNumber) {
        int attempts = 0;
        while (true) {
            int[] myNumber = inputNumber();
            int strike = countStrike(comNumber, myNumber);
            int ball = countBall(comNumber, myNumber);
            System.out.println("Strike: " + strike + " / Ball: " + ball);
            attempts++;
            if (strike == NUM_DIGITS) {
                System.out.println("성공! " + attempts + "번 만에 성공하셨습니다.");
                break;
            }
        }
        return attempts;
    }

    private int countStrike(int[] comNumber, int[] myNumber) {
        int strike = 0;
        for (int i = 0; i < NUM_DIGITS; i++) {
            if (myNumber[i] == comNumber[i]) {
                strike++;
            }
        }
        return strike;
    }

    private int countBall(int[] comNumber, int[] myNumber) {
        int ball = 0;
        for (int i = 0; i < NUM_DIGITS; i++) {
            for (int j = 0; j < NUM_DIGITS; j++) {
                if (i != j && myNumber[i] == comNumber[j]) {
                    ball++;
                }
            }
        }
        return ball;
    }
}
