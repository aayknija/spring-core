import dto.Player;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.Coach;

public class MyApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("application.xml");
        Coach baseballCoach= context.getBean("baseBallCoach",Coach.class);
        System.out.println(baseballCoach.getDailyWorkOut());

        Coach trackCoach= context.getBean("trackCoach",Coach.class);
        System.out.println(trackCoach.getDailyWorkOut());

        Player player1= context.getBean("player1", Player.class);
        System.out.println(player1.toString());

        Player player2= context.getBean("player2", Player.class);
        System.out.println(player2.toString());
    }
}
