package hmn;

import java.time.LocalDate;

public class Human {
    private final String name;
    private String town;
    private int yearOfBirth;
    private final String job;
    static private final String DEFAULT = "(Информация не указана)";

    public Human(String name, String town, int age, String job) {

        this.name = getValid(name);
        this.town = getValid(town);
        this.job = getValid(job);

        if (age < 0) {
            yearOfBirth = 0;
        } else {
            yearOfBirth = Math.abs(LocalDate.now().getYear() - age);
        }
    }

    public Human(String name, String town, int age) {
        this(name, town, age, DEFAULT);
    }


    public Human(String name, String town, String job) {
        this(name, town, 0, job);
    }

    public Human(String name, String town) {
        this(name, town, DEFAULT);
    }

    public Human(String name) {
        this(name, DEFAULT);
    }

    public Human() {
        this(DEFAULT);
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
        return DEFAULT;
    }

    public String getTown() {
        return town;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setTown(String town) {
        this.town = getValid(town);
    }

    public void setYearOfBirth(int year) {
        if (year < 0) {
            yearOfBirth = 0;
        } else {
            yearOfBirth = Math.abs(LocalDate.now().getYear() - year);
        }
    }


}
