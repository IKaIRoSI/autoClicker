import java.awt.*;
import java.awt.event.InputEvent;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) throws AWTException {
        // Create a new Timer
        Timer timer = new Timer();

        // Create a new TimerTask
        TimerTask task = new TimerTask() {
            public void run() {
                try {
                    // Create a new Robot
                    Robot robot = new Robot();
                    // Simulate a mouse click
                    robot.mousePress(InputEvent.BUTTON1_MASK);
                    robot.mouseRelease(InputEvent.BUTTON1_MASK);
                } catch (AWTException e) {
                    e.printStackTrace();
                }
            }
        };

        // Schedule the task to run every 5 seconds
        timer.scheduleAtFixedRate(task, 0, 1000);
    }
}