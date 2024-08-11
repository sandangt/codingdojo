package codingdojo.derekbanas.structural.bridge;

public class DVDDevice extends EntertainmentDevice {

    public DVDDevice(int newDeviceState, int newMaxSetting) {
        deviceState = newDeviceState;
        maxSetting = newMaxSetting;
    }

    @Override
    public void buttonFivePressed() {
        System.out.println("Channel Down");
        deviceState--;
    }

    @Override
    public void buttonSixPressed() {
        System.out.println("Channel Up");
        deviceState++;
    }

}
