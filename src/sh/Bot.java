package sh;

public class Bot implements Moving{
    String  name;
    int maxrun;
    int maxjump;

    public Bot(String name, int maxrun, int maxjump){
        this.name = name;
        this.maxrun = maxrun;
        this.maxjump = maxjump;

    }

    @Override
    public void run(Track track) {
        if (track.tracklong < maxrun)
            System.out.println("Bot " + name + " может пробежать "+ track.name + "  " + track.tracklong + "км");
        else System.out.println("Bot " + name + "НЕ может пробежать "+ track.name);

    }

    @Override
    public void jump(Wall wall) {
        if (wall.height < maxjump)
            System.out.println("Bot " + name + " может перепрыгнуть " + wall.name + "  " +  wall.height + "м");
        else System.out.println("Bot " + name + " НЕ может перепрыгнуть" + wall.name);

    }
}
