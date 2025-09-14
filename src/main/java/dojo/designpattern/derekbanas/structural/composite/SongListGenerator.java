package dojo.designpattern.derekbanas.structural.composite;

public class SongListGenerator {

    public static void main(String[] args) {
        SongComponent industrialMusic = new SongGroup("Industrial", "Industrial music");
        SongComponent heavyMetalMusic = new SongGroup("Heavy Metal", "Heavy metal music");
        SongComponent dubstepMusic = new SongGroup("Dubstep", "Dubstep music");
        SongComponent everySong = new SongGroup("Song list", "Every song available");

        everySong.add(industrialMusic);
        everySong.add(heavyMetalMusic);
        everySong.add(dubstepMusic);

        industrialMusic.add(new Song("Head Like a Hole", "NIN", 1990));
        industrialMusic.add(new Song("Headhunter", "Front 242", 1988));
        industrialMusic.add(dubstepMusic);
        dubstepMusic.add(new Song("Centipede", "Knife Party", 2012));
        dubstepMusic.add(new Song("Tetris", "Doctor P", 2011));
        heavyMetalMusic.add(new Song("War Pigs", "Black Sabath", 1970));
        heavyMetalMusic.add(new Song("Ace of Spades", "Motorhead", 1980));
        DiscJockey crazyLarry = new DiscJockey(everySong);
        crazyLarry.getSongList();
    }

}
