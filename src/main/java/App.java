import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld otherBean =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat catBean = applicationContext.getBean(Cat.class);
        Cat catOtherBean = applicationContext.getBean(Cat.class);

        System.out.printf("bean==otherBean %b%ncatBean==catOtherBean %b%n",
                bean.equals(otherBean), catBean.equals(catOtherBean));
    }
}