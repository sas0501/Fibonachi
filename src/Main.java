import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        System.out.println("Тигр начинает рычать :");
        tiger.animalVoice();

        Cat cat = new Cat();
        System.out.println("Кошка начинает мяукать :");
        cat.animalVoice();

        Osel osel = new Osel();
        System.out.println("Осел начинает кричать :");
        osel.animalVoice();

        Dog dog = new Dog();
        System.out.println("Собака начинает лаять :");
        dog.animalVoice();

        Random random = new Random();

        tiger.setSleep(random.nextBoolean());

        if (tiger.getSleep() == true) {
            tiger.animalSleep(tiger.getSleep());
        } else {
            System.out.println("Тигр спит, молчит");
        }
        tiger.setEat(random.nextBoolean());
        if (tiger.getEat() == true) {
            tiger.setSleep(true);
            tiger.animalEat(tiger.getEat());
        }

        cat.setSleep(random.nextBoolean());
        if (cat.getSleep() == true) {
            cat.animalSleep(cat.getSleep());
        } else {
        System.out.println("Кошка спит, молчит");
    }
        cat.setEat(random.nextBoolean());
        if (cat.getEat() == true) {
            cat.setSleep(true);
            cat.animalEat(cat.getEat());
        }

        osel.setSleep(random.nextBoolean());
        if (osel.getSleep() == true) {
            osel.animalSleep(osel.getSleep());
        } else {
            System.out.println("Осёл спит, молчит");
        }
        osel.setEat(random.nextBoolean());
        if (osel.getEat() == true) {
            osel.setSleep(true);
            osel.animalEat(osel.getEat());
        }

        dog.setSleep(random.nextBoolean());
        if (dog.getSleep() == true) {
            dog.animalSleep(dog.getSleep());
        } else {
            System.out.println("Собака спит, молчит");
        }
        dog.setEat(random.nextBoolean());
        if (dog.getEat() == true) {
            dog.setSleep(true);
            dog.animalEat(dog.getEat());
        }


    }
}
