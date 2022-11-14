package practice.class_animal_and_interface_edible;
public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals){
            animal.makeSound();

            if (animal instanceof Chicken){
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }
        Fruit[] fruit = new Fruit[2];
        fruit[0] = new Orange();
        fruit[1] = new Apple();
        for (Fruit fruit1 : fruit){
            System.out.println(fruit1.howToEat());
        }
    }
}
