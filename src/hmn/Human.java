package hmn;

import java.time.LocalDate;

public class Human {
    private final String name;
    private final String town;
    private final int yearOfBirth;

    private final String job;
    static private final String defaultMsg = "(Информация не указана)";

    public Human(String name, String town, int years, String job) {

        this.name = getValid(name);
        this.town = getValid(town);
        this.job = getValid(job);

        if (years <= 0) {
            yearOfBirth = 0;
        } else {
            yearOfBirth = Math.abs(LocalDate.now().getYear() - years);
        }

    }

    public Human(String name, String town, String job) {
        this(name, town, 0, job);
    }

    public Human(String name, String town) {
        this(name, town, defaultMsg);
    }

    public Human(String name) {
        this(name, defaultMsg);
    }

    public Human() {
        this(defaultMsg);
    }


    @Override
    public String toString() {
        return String.format("Привет! Меня зовут %s. Я из города %s. Я родился(ась) в %d году. " +
                "Я работаю на должности %s. Будем знакомы!", name, town, yearOfBirth, job);
    }

    private boolean isValid(String field) {
        return field != null && !field.isEmpty() && !field.isBlank();
    }

    private String getValid(String field) {
        if (isValid(field)) {
            return field.trim();
        }
        return defaultMsg;
    }


}
