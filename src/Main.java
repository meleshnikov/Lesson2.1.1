import transport.Car;
import flw.Bouquet;
import flw.Flower;
import hmn.Human;

public class Main {
    public static void main(String[] args) {
//        testHuman();
//        System.out.println();
        testCar();
//        testFlower();

    }

    private static void testHuman() {
        var maxim = new Human("Максим", "Минск", 35, "бренд-менеджера");
        var ann = new Human("Аня", "Москва", 29, "методиста образовательных программ");
        var kate = new Human("Катя", "Калининград", 28, "продакт-менеджера");
        var artem = new Human("Артём", "Москва", 27, "директора по развитию бизнеса");
        var andrei = new Human("Андрей");
        var ivan = new Human("Ваня", "Казань");
        var noname = new Human();
        var vladimir = new Human("Владимир", "Казань", 21);
        System.out.println(maxim);
        System.out.println(ann);
        System.out.println(kate);
        System.out.println(artem);
        System.out.println(andrei);
        System.out.println(ivan);
        System.out.println(noname);
        System.out.println(vladimir);
    }

    private static void testCar() {
        var lada = new Car("Lada", "Grande", "России", "жёлтый",
                1.7, 2015, null, 0);
        var audi = new Car("Audi", "A8 50 L TDI quattro", "Германии", "чёрный",
                3.0, 2020, "хетчбэк", 5);
        var bmw = new Car("BMW", "Z8", "Германии", "чёрный",
                3.0, 2021, "седан", 4);
        var kia = new Car("Kia", "Sportage 4 поколение", "Южной Корее", "красный",
                2.4, 2018, "", 3);
        var hyundai = new Car("Hyundai", "Avante", "Южной Корее", "оранжевый",
                1.6, 2016, "универсал", 4);

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
        lada.setRegNumber("у709ос90");
        System.out.println(lada.getAllInfo());
        audi.setSeasonTires();
        System.out.println(audi.getAllInfo());
        System.out.println(lada.isValidRegNumber());

    }

    private static void testFlower() {
        var rosa = new Flower("Роза обыкновенная", "Голандии", 35.59);
        var chrysanthemum = new Flower("Хризантема", 15, 5);
        var peony = new Flower("Пион", "Англии", 69.9, 1);
        var gypsophila = new Flower("Гипсофила", "Турции", 19.5, 10);
        System.out.println(rosa);
        System.out.println(chrysanthemum);
        System.out.println(peony);
        System.out.println(gypsophila);

        Bouquet bq = new Bouquet(rosa, chrysanthemum, peony, gypsophila);
        System.out.println(bq.getCost());
        System.out.println(bq.getLifeSpan());
        System.out.println(bq);

    }


}