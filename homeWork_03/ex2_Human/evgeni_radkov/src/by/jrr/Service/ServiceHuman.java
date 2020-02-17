package by.jrr.Service;

import by.jrr.Bean.Human;


public class ServiceHuman  {

        public void info(Human human){

            System.out.println("Hi, I'm " + human.getName() + " I'm " + human.getAge());
        }
}
