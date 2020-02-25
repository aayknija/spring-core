import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.Coach;

public class MyApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("application.xml");
        Coach baseballCoach= context.getBean("baseBallCoach",Coach.class);
        System.out.println(baseballCoach.getDailyWorkOut());

        Coach trackCoach= context.getBean("trackCoach",Coach.class);
        System.out.println(trackCoach.getDailyWorkOut());
    }
}
