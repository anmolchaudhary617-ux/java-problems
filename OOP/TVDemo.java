class TV {

    // States
    private int channel;
    private int volume;
    private boolean powerOn;

    // Constructor
    public TV() {
        channel = 1;
        volume = 10;
        powerOn = false;
    }

    // Turn TV ON
    public void turnOn() {
        powerOn = true;
        System.out.println("TV is ON");
    }

    // Turn TV OFF
    public void turnOff() {
        powerOn = false;
        System.out.println("TV is OFF");
    }

    // Change channel
    public void changeChannel(int newChannel) {
        if (powerOn && newChannel >= 1 && newChannel <= 100) {
            channel = newChannel;
            System.out.println("Channel: " + channel);
        } else {
            System.out.println("Cannot change channel");
        }
    }

    // Increase volume
    public void volumeUp() {
        if (powerOn && volume < 100) {
            volume++;
        }
        System.out.println("Volume: " + volume);
    }

    // Decrease volume
    public void volumeDown() {
        if (powerOn && volume > 0) {
            volume--;
        }
        System.out.println("Volume: " + volume);
    }

    // Display TV status
    public void displayStatus() {
        System.out.println("Power: " + (powerOn ? "ON" : "OFF"));
        System.out.println("Channel: " + channel);
        System.out.println("Volume: " + volume);
        System.out.println();
    }
}

public class TVDemo {
    public static void main(String[] args) {

        TV tv = new TV();

        tv.turnOn();
        tv.changeChannel(5);
        tv.volumeUp();
        tv.volumeUp();
        tv.displayStatus();

        tv.turnOff();
    }
}
