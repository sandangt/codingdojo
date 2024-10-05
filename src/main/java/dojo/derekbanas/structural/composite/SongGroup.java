package dojo.derekbanas.structural.composite;

import java.util.ArrayList;

public class SongGroup extends SongComponent {

    private ArrayList<SongComponent> songComponents = new ArrayList<>();
    private String groupName;
    private String groupDescription;

    public SongGroup(String groupName, String groupDescription) {
        this.groupName = groupName;
        this.groupDescription = groupDescription;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getGroupDescription() {
        return groupDescription;
    }

    @Override
    public void add(SongComponent newSongComponent) {
        songComponents.add(newSongComponent);
    }

    @Override
    public void remove(SongComponent newSongComponent) {
        songComponents.remove(newSongComponent);
    }

    @Override
    public SongComponent getComponent(int idx) {
        return songComponents.get(idx);
    }

    @Override
    public void displaySongInfo() {
        System.out.printf("%s %s".formatted(groupName, groupDescription));
        for (SongComponent songInfo : songComponents) {
            songInfo.displaySongInfo();
        }

    }

}
