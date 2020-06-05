package com.revature.tourofheroes.models;

import java.util.ArrayList;
import java.util.Objects;

//javabean vs POJO
public class Hero {
    private String heroName;
    private ArrayList<String> specialMoves;
    private int healthLevel;
    private boolean isAlive;
    private String heroType;

    public Hero() {
    }

    public Hero(String heroName, String heroType) {
        this.heroName = heroName;
        this.heroType = heroType;
    }

    public Hero(String heroName, ArrayList<String> specialMoves, int healthLevel, boolean isAlive, String heroType) {
        this(heroName, heroType);
        this.specialMoves = specialMoves;
        this.healthLevel = healthLevel;
        this.isAlive = isAlive;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public ArrayList<String> getSpecialMoves() {
        return specialMoves;
    }

    public void setSpecialMoves(ArrayList<String> specialMoves) {
        this.specialMoves = specialMoves;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        if (healthLevel < 0) throw new IllegalArgumentException();
        this.healthLevel = healthLevel;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public String getHeroType() {
        return heroType;
    }

    public void setHeroType(String heroType) {
        this.heroType = heroType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hero hero = (Hero) o;
        return heroName.equals(hero.heroName) &&
                specialMoves.equals(hero.specialMoves);
    }

    @Override
    public int hashCode() {
        return Objects.hash(heroName, specialMoves);
    }

    @Override
    public String toString() {
        return "Hero{" +
                "heroName='" + heroName + '\'' +
                ", specialMoves=" + specialMoves +
                ", healthLevel=" + healthLevel +
                ", isAlive=" + isAlive +
                ", heroType='" + heroType + '\'' +
                '}';
    }
}
