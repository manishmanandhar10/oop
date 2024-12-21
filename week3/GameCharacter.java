package Workshop3;


abstract class GameCharacter {
 public abstract void attack();
 public abstract void defend();
}


class Warrior extends GameCharacter {
 @Override
 public void attack() {
     System.out.println("Warrior attacks with a sword!");
 }

 @Override
 public void defend() {
     System.out.println("Warrior raises a shield to block the attack!");
 }
}


class Archer extends GameCharacter {
 @Override
 public void attack() {
     System.out.println("Archer shoots an arrow!");
 }

 @Override
 public void defend() {
     System.out.println("Archer dodges the attack swiftly!");
 }
}
