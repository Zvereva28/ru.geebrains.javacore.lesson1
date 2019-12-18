package sh;

public class Main {

    public static void main(String[] args) {
        Bot bot1 = new Bot("Sasha", 35, 1);
        Track track1 = new Track("First", 2);

//        bot1.run(track1);
        	// write your code here
        track1.difficulty(bot1);
        System.out.println("+++++++++++++++++++++++++++++++");

        Moving moving[] = new Moving[6];
        moving[0] = new Bot ("Ibot", 32, 5);
        moving[1] = new Cat ("Murza", 3, 1);
        moving[2] = new Man ("Kola", 10, 1);
        moving[3] = new Man ("Lena", 5, 0);
        moving[4] = new Bot ("Jbot", 65, 3);
        moving[5] = new Bot ("Tbot", 6,3);

        Difficulty dif[] = new Difficulty[3];
        dif[0] = new Track("марафон", 42);
        dif[1] = new Track("полумарафон", 21);
        dif[2] = new Wall("забор", 1);

        for (int i = 0; i < 6; i++ ){
            for (int j = 0; j < 3; j++){
                dif[j].difficulty(moving[i]);

            }
        }
    }
}
