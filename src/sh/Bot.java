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
    public boolean run(Track track) {
        boolean bool = false;
        if (track.tracklong < maxrun) {
            bool = true;
            System.out.println("Bot " + name + " может пробежать "+ track.name + "  " + track.tracklong + "км");
        }
        else {
            System.out.println("Bot " + name + "НЕ может пробежать "+ track.name);}
        return bool;

    }

    @Override
    public boolean jump(Wall wall) {
        boolean bool = false;
        if (wall.height < maxjump){
            bool = true;
            System.out.println("Bot " + name + " может перепрыгнуть " + wall.name + "  " +  wall.height + "м");}

        else System.out.println("Bot " + name + " НЕ может перепрыгнуть" + wall.name);
        return bool;

    }
}
