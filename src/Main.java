import car.Car;
import hmn.Human;

public class Main {
    public static void main(String[] args) {
        testHuman();
        System.out.println();
        testCar();
    }

    private static void testHuman() {
        var maxim = new Human("Максим", "Минск", 35, "бренд-менеджера");
        var ann = new Human("Аня", "Москва", 29, "методиста образовательных программ");
        var kate = new Human("Катя", "Калининград", 28, "продакт-менеджера");
        var artem = new Human("Артём", "Москва", 27, "директора по развитию бизнеса");
        var andrei = new Human("Андрей");
        var ivan = new Human("Ваня", "Казань");
        var noname = new Human();
        System.out.println(maxim);
        System.out.println(ann);
        System.out.println(kate);
        System.out.println(artem);
        System.out.println(andrei);
        System.out.println(ivan);
        System.out.println(noname);
    }

    private static void testCar() {
        var lada = new Car("Lada", "Grande", "России", "жёлтый",
                1.7, 2015);
        var audi = new Car("Audi", "A8 50 L TDI quattro", "Германии", "чёрный",
                3.0, 2020);
        var bmw = new Car("BMW", "Z8", "Германии", "чёрный",
                3.0, 2021);
        var kia = new Car("Kia", "Sportage 4 поколение", "Южной Корее", "красный",
                2.4, 2018);
        var hyundai = new Car("Hyundai", "Avante", "Южной Корее", "оранжевый",
                1.6, 2016);
        var mazda = new Car("Mazda", "CX 5", "Японии", "синий", 2, -1);

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
        System.out.println(mazda);
    }
}