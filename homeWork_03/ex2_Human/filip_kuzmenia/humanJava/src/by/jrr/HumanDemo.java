package by.jrr;

import by.jrr.Service.HumanInfo;
import by.jrr.bean.Human;

public class HumanDemo {
    public static void main(String[] args) {
        Human firstHuman = new Human("Влад",29);
        HumanInfo humanInfo = new HumanInfo();
        humanInfo.info(firstHuman);


    }



}
