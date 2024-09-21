import javax.swing.SwingUtilities;

public class TestClock {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ClockGUI();  // Start the Clock GUI
            }
        });
    }
}
