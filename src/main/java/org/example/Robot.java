package org.example;

public class Robot {



    //Instance variables (HAS A)
    public String name;
   public  Weapon weapon;

   //Constructor
    public Robot() {
        this.name = "Rodger";
        this.weapon = new Weapon("Jackhammer", 75);

    }

    public void Attack() {
        System.out.println(this.name + " attacks with their " + this.weapon.name + " for " + this.weapon.power+ "damage!");
    }
}
