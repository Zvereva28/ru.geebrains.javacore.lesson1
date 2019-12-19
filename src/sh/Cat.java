package sh;

public class Cat implements  Moving{
    String name;
    int maxrun;
    int maxjump;

    public Cat(String name, int maxrun, int maxjump){
        this.name = name;
        this.maxrun = maxrun;
        this.maxjump = maxjump;
    }



    @Override
    public boolean run(Track track) {
        boolean bool = false;
        if(maxrun > track.tracklong){
            bool = true;
            System.out.println("Cat" + name + " может пробежать "+ track.name + "  " + track.tracklong + "км");}
        else System.out.println("Cat " + name + "НЕ может пробежать "+ track.name);
        return bool;

    }

    @Override
    public boolean jump(Wall wall) {
        boolean bool = false;
        if (wall.height < maxjump){
            bool = true;
            System.out.println("Cat " + name + " может перепрыгнуть " + wall.name + "  " +  wall.height + "м");}
        else System.out.println("Cat " + name + " НЕ может перепрыгнуть" + wall.name);
        return bool;

    }
}
