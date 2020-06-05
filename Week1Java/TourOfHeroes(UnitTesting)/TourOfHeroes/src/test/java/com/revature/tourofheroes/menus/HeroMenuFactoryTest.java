package com.revature.tourofheroes.menus;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class HeroMenuFactoryTest {

    @Test
    public void menuFactoryGetShouldReturnProperMenu(){
        //arrange
        HeroMenuFactory menuFactory = new HeroMenuFactory();
        //act
        IMenu testMenu = menuFactory.getMenu("superhero");
        //assert
        assertThat(testMenu, instanceOf(SuperHeroMenu.class));
    }
}
