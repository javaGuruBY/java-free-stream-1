package by.jrr.Service;

import by.jrr.bean.Dog;

public class DogVoice {
    public void voice(Dog dog){
        System.out.println("Меня зовут "+dog.getName()+" мне "+dog.getAge()+" года");
    }
}
