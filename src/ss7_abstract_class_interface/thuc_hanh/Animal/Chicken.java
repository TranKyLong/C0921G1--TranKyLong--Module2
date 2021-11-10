package ss7_abstract_class_interface.thuc_hanh.Animal;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "cluck cluck";
    }

    @Override
    public String howToEat() {
        return "chiên";
    }
}



