import java.util.Date;
import java.util.Scanner;
import java.sql.Time;

public class StopWatch {
    long startTime, endTime;
    Scanner scanner = new Scanner(System.in);

    private void startTime() {

        int start;
        do {
            System.out.println("please enter '1' to start!");
            start = scanner.nextInt();
        } while (start != 1);
        Date now = new Date();
        System.out.println("start is: " + now);
        startTime = System.currentTimeMillis();
    }

    private void endTime() {
        int end;
        do {
            System.out.println("please enter '0' to end!");
            end = scanner.nextInt();
        } while (end != 0);
        endTime = System.currentTimeMillis();
        Date now = new Date();
        System.out.println("end is: " + now);
        System.out.printf("the time is: (millis =%d)", endTime - startTime);
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.startTime();
        stopWatch.endTime();
    }
}