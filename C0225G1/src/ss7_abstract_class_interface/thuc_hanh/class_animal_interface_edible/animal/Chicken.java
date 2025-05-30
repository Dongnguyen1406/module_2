package ss7_abstract_class_interface.thuc_hanh.class_animal_interface_edible.animal;

import ss7_abstract_class_interface.thuc_hanh.class_animal_interface_edible.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
