package transport;

import java.time.LocalDate;

public class Car {

    private final String brand;
    private final String model;
    private final String productionCountry;
    private final String color;
    private final int productionYear;
    private final String bodyType;
    private final int seatsCount;
    private double engineVolume;
    private String transmission;
    private String regNumber;
    private String tires;

    private static final String DEFAULT_CAR = "default";
    private static final String DEFAULT_COLOR = "белый";
    private static final int DEFAULT_YEAR = 2000;
    private static final double DEFAULT_ENGINE = 1.5;

    private static final String DEFAULT_TRANSMISSION = "механическая";
    private static final String DEFAULT_TIRES = "летняя";
    private static final String DEFAULT_BODY_TYPE = "седан";
    private static final int DEFAULT_SEATS_COUNT = 4;
    private static final String DEFAULT_NUMBER = "Х000Х000";


    public Car(String brand,
               String model,
               String productionCountry,
               String color,
               double engineVolume,
               int productionYear,
               String bodyType,
               int seatsCount) {

        this.brand = getValid(brand);
        this.model = getValid(model);
        this.productionCountry = getValid(productionCountry);
        this.color = isValid(color) ? color : DEFAULT_COLOR;
        setEngineVolume(engineVolume);
        this.productionYear = isValid(productionYear) ? productionYear : DEFAULT_YEAR;
        this.bodyType = isValid(bodyType) ? bodyType : DEFAULT_BODY_TYPE;
        this.seatsCount = (seatsCount >= 2) ? seatsCount : DEFAULT_SEATS_COUNT;
        this.transmission = DEFAULT_TRANSMISSION;
        this.regNumber = DEFAULT_NUMBER;
        this.tires = DEFAULT_TIRES;
    }


    @Override
    public String toString() {
        return String.format("%s %s, %d год выпуска, сборка в %s, цвет кузова %s, объем двигателя - %s литра",
                brand, model, productionYear, productionCountry, color, engineVolume);
    }

    public String getAllInfo() {
        return this.toString() + String.format(" , коробка передач - %s, тип кузова - %s, номер - %s " +
                "количество мест - %d, резина - %s", transmission, bodyType, regNumber.toUpperCase(), seatsCount, tires);
    }

    private boolean isValid(String field) {
        return field != null && !field.isEmpty() && !field.isBlank();
    }

    private boolean isValid(double field) {
        return field > 0;
    }


    private String getValid(String field) {
        if (isValid(field)) {
            return field.trim();
        }
        return DEFAULT_CAR;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public int getSeatsCount() {
        return seatsCount;
    }

    public String getTires() {
        return tires;
    }


    public void setEngineVolume(double engineVolume) {
        this.engineVolume = isValid(engineVolume) ? engineVolume : DEFAULT_ENGINE;
    }

    public void setTransmission(String transmission) {
        this.transmission = isValid(transmission) ? transmission : DEFAULT_TRANSMISSION;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = isValidRegNumber(regNumber) ? regNumber : DEFAULT_NUMBER;
    }

    public void setTires(String tires) {
        this.tires = isValid(tires) ? tires : DEFAULT_TIRES;
    }

    private boolean isSummerSeason() {
        int m = LocalDate.now().getMonthValue();
        if ((6 <= m) && (m <= 8)) {
            return true;
        }
        return false;
    }

    public void setSeasonTires() {
        String tires = isSummerSeason() ? "летняя" : "зимняя";
        setTires(tires);
    }

    private boolean isValidRegNumber(String regNumber) {

        if (regNumber == null) {
            return false;
        }

        if ((regNumber.length() != 8) && (regNumber.length() != 9)) {
            return false;
        }

        for (int i = 0; i < regNumber.length(); i++) {
            if ((i == 0) || (i == 4) || (i == 5)) {
                if (!Character.isAlphabetic(regNumber.charAt(i))) {
                    return false;
                }
            } else if ((!Character.isDigit(regNumber.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    public boolean isValidRegNumber() {
        return isValidRegNumber(this.regNumber);
    }


}
