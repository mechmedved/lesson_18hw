package ru.maxima;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.maxima.radio_di.RadioPlayer;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("playerApplicationContext.xml");

        RadioPlayer radioPlayer = context.getBean("radioPlayer", RadioPlayer.class);
        radioPlayer.play();

        RadioPlayer radioPlayer1 = context.getBean("radioPlayer", RadioPlayer.class);

        System.out.println(radioPlayer == radioPlayer1);
        context.close();
    }
}
