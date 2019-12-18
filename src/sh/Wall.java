package sh;

public class Wall implements Difficulty {
    String name;
    int height;

    public Wall (String name, int height){
        this.name = name;
        this.height = height;
    }


    @Override
    public void difficulty(Moving one) {
        one.jump(this);
    }
}
