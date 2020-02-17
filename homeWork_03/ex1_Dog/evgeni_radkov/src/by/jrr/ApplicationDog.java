package by.jrr;

import by.jrr.bean.Dog;
import by.jrr.service.ServiceEat;
import by.jrr.service.ServiceSleep;
import by.jrr.service.ServiceVoice;

public class ApplicationDog {
    public static void main(String[] args) {
        Dog boss = new Dog("Bil", 8, "Grey");
        ServiceVoice lvl1 = new ServiceVoice();
        ServiceSleep lvl2 = new ServiceSleep();
        ServiceEat lvl3 = new ServiceEat();
        lvl1.voice(boss);
        lvl2.sleep(boss);
        lvl3.eat(boss);

    }
}
