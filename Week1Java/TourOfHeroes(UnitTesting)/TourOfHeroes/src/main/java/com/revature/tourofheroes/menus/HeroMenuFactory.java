package com.revature.tourofheroes.menus;

public class HeroMenuFactory {
    public IMenu getMenu(String heroType) {
        switch (heroType.toLowerCase()) {
            case "superhero":
                return new SuperHeroMenu();
            case "antihero":
                return new AntiHeroMenu();
            default:
                return null;

        }
    }
}
