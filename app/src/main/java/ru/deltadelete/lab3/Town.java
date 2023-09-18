package ru.deltadelete.lab3;

import androidx.annotation.DrawableRes;

import com.github.javafaker.Faker;

public class Town {
    private int id;
    private String name;
    private String country;
    @DrawableRes
    private int flag;

    public Town(String name, String country, @DrawableRes int flag) {
        this.name = name;
        this.country = country;
        this.flag = flag;
    }

    public static Town fromFaker(Faker faker) {
        var num = faker.random().nextInt(4);
        int img;
        if (num == 0) {
            img = R.drawable.ru;
        } else if (num == 1) {
            img = R.drawable.de;
        } else if (num == 2) {
            img = R.drawable.us;
        } else if (num == 3) {
            img = R.drawable.gb;
        } else {
            img = R.drawable.ru;
        }
        return new Town(faker.address().city(), faker.country().name(), img);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
}
