package sh;

public class Track implements Difficulty {
    String name;
    int tracklong;

    public Track(String name, int tracklong){
        this.name = name;
        this.tracklong = tracklong;
    }

    @Override
    public boolean difficulty(Moving one) {
        return one.run(this);

    }

}

