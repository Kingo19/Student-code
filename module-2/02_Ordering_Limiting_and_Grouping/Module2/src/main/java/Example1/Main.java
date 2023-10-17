package Example1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Animal.xml");
        Cat dog1 = context.getBean(Cat.class);

        System.out.println(dog1.getName());
        System.out.println(dog1.getNumberOfLegs());
        System.out.println(dog1.isAreCarniverous());
    }

}
