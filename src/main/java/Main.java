import java.util.Random;

/**
 * Created by Sid775 on 31.03.2017.
 */
public class Main {

    public static void main(String[] args) {
        KillDragon killDragon;

        Random randomForScaleDensity = new Random();

        int scaleDensity = randomForScaleDensity.nextInt(100) ;

        if (scaleDensity > 50){
            killDragon = new KillBySword();
        }else {
            killDragon = new KillBySpear();
        }
        System.out.println(scaleDensity);
        System.out.println(killDragon.kill());
    }
}
