package com.serenitydojo;

public class Dog {
    public String name;
    public String favoriteToy;
    public int age;
    private boolean isFed;
    public static final String DOG_NOISE = "Woof";


    public Dog(String name, String favoriteToy, int age) {
        this.name = name;
        this.favoriteToy = favoriteToy;
        this.age = age;

    }

    public Object getName() {
        return name;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public int getAge() {
        return age;
    }

    public String makeNoise() {
        return DOG_NOISE;
    }


    public boolean isFed() {
        return this.isFed;
    }

    public void feed() {
        this.isFed = true;
    }
}
