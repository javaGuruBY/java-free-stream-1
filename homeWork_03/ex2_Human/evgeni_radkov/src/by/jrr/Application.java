package by.jrr;

import by.jrr.Bean.Human;
import by.jrr.Service.ServiceHuman;


public class HumanDemo {

        public static void main(String[] args) {
            Human human1 = new Human("Tommy", 35);
            ServiceHuman her = new ServiceHuman();
            her.info(human1);

        }
    }


