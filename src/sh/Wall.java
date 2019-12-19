package sh;

public class Wall implements Difficulty {
    String name;
    int height;

    public Wall (String name, int height){
        this.name = name;
        this.height = height;
    }


    @Override
    public boolean difficulty(Moving one) {
       return one.jump(this);}
}
