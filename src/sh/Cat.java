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
    public void run(Track track) {
        if(maxrun > track.tracklong)
            System.out.println("Cat" + name + " может пробежать "+ track.name + "  " + track.tracklong + "км");
        else System.out.println("Cat " + name + "НЕ может пробежать "+ track.name);

    }

    @Override
    public void jump(Wall wall) {
        if (wall.height < maxjump)
            System.out.println("Cat " + name + " может перепрыгнуть " + wall.name + "  " +  wall.height + "м");
        else System.out.println("Cat " + name + " НЕ может перепрыгнуть" + wall.name);

    }
}
