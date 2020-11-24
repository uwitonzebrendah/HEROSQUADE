

package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class HeroTest {

    @Test
    public void newHero_instantiatesCorrectly_true() {
        Hero newHero = Hero.setUpNewHero();
        assertTrue(newHero instanceof Hero);
    }
    @Test
    public void newHero_getName_String() {
        Hero newHero = Hero.setUpNewHero();
        assertEquals("Brendah",newHero.getName());
    }
    @Test
    public void newHero_getAge_Int() {
        Hero newHero = Hero.setUpNewHero();
        assertEquals(23,newHero.getAge());
    }
    @Test
    public void newHero_getPower_String() {
        Hero newHero = Hero.setUpNewHero();
        assertEquals("flying",newHero.getPower());
    }
    @Test
    public void newHero_getWeakness_String() {
        Hero newHero = Hero.setUpNewHero();
        assertEquals("water",newHero.getWeakness());
    }
    @Test
    public void newHero_getAllInstances_true() {
        Hero newHero = Hero.setUpNewHero();
        Hero another = Hero.setUpNewHero();
        assertTrue(Hero.getAllInstances().contains(newHero));
        assertTrue(Hero.getAllInstances().contains(another));
    }
//    @Test
//    public void newHero_getId_Int() {
//        Hero.clearAllHeroes();
//        Hero newHero = Hero.setUpNewHero();
//        Hero another = Hero.setUpNewHero();
//        Hero another1 = Hero.setUpNewHero();
//        assertEquals(3,another1.getId());
//    }
//    @Test
//    public void newHero_findById_id() {
//        Hero.clearAllHeroes();
//        Hero newHero = Hero.setUpNewHero();
//        Hero another = Hero.setUpNewHero();
//        assertEquals(2,Hero.findById(another.getId()).getId());
//    }
}
























//package models;

//
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class HeroTest {
//    @Test
//    public void myHero()throws Exception{
//        Hero myHero = Hero.setNewHero();
//        assertTrue(myHero instanceof Hero);
//    }
//
//    @Test
//    public void HeroName()throws Exception{
//        Hero myHero = Hero.setNewHero();
//        assertEquals ("Jesus",myHero.getName ());
//    }
//    @Test
//    public void HeroAge()throws Exception{
//        Hero myHero = Hero.setNewHero();
//        assertEquals (20,myHero.getAge ());
//    }
//    @Test
//    public void HeroPower()throws Exception{
//        Hero myHero = Hero.setNewHero();
//        assertEquals ("flying",myHero.getPower ());
//    }
//    @Test
//    public void HeroWeakness()throws Exception{
//        Hero myHero = Hero.setNewHero();
//        assertEquals ("swimming",myHero.getWeakness ());
//    }
//
//}