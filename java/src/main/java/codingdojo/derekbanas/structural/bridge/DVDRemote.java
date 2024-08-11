package codingdojo.derekbanas.structural.bridge;

public class DVDRemote extends RemoteButton {

    private boolean play = true;

    public DVDRemote(EntertainmentDevice newDevice) {
        super(newDevice);
    }

    @Override
    public void buttonNinePressed() {
        play = !play;
        System.out.println(play ? "DVD is playing" : "DVD is turned off");
    }

}
