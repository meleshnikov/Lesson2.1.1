package car;

public class Car {

    private final String brand;
    private final String model;
    private final String productionCountry;
    private final String color;
    private final double engineVolume;
    private final int productionYear;
    static private final String DEFAULT_CAR = "default";
    static private final String DEFAULT_COLOR = "белый";
    static private final int DEFAULT_YEAR = 2000;
    static private final double DEFAULT_ENGINE = 1.5;

    public Car(String brand, String model, String productionCountry, String color, double engineVolume, int productionYear) {
        this.brand = getValid(brand);
        this.model = getValid(model);
        this.productionCountry = getValid(productionCountry);

        if (isValid(color)) {
            this.color = color;
        } else {
            this.color = DEFAULT_COLOR;
        }

        if (isValid(engineVolume)) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = DEFAULT_ENGINE;
        }

        if (isValid(productionCountry)) {
            this.productionYear = productionYear;
        } else {
            this.productionYear = DEFAULT_YEAR;
        }
    }

    public Car(String brand, String model, String productionCountry, String color, double engineVolume) {
        this(brand, model, productionCountry, color, engineVolume, DEFAULT_YEAR);
    }

    public Car(String brand, String model, String productionCountry, String color) {
        this(brand, model, productionCountry, color, DEFAULT_ENGINE);
    }

    public Car(String brand, String model, String productionCountry) {
        this(brand, model, productionCountry, DEFAULT_COLOR);
    }

    public Car(String brand, String model) {
        this(brand, model, DEFAULT_CAR);
    }

    public Car(String brand) {
        this(brand, DEFAULT_CAR);
    }

    public Car() {
        this(DEFAULT_CAR);
    }


    @Override
    public String toString() {
        return String.format("%s %s, %d год выпуска, сборка в %s, цвет кузова %s, объем двигателя - %s литра",
                brand, model, productionYear, productionCountry, color, engineVolume);
    }

    private boolean isValid(String field) {
        return field != null && !field.isEmpty() && !field.isBlank();
    }

    private boolean isValid(double field) {
        return field >= 0;
    }


    private String getValid(String field) {
        if (isValid(field)) {
            return field.trim();
        }
        return DEFAULT_CAR;
    }

}
