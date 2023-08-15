abstract class Animal {
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    abstract void eat();

    void walk() {
        System.out.println("esse animal tem " + legs + " patinhas.");
    }
}

interface Pet {
    void play();
    void beFriendly();
}

class Spider extends Animal {
    Spider() {
        super(8);
    }

    void eat() {
        System.out.println("a aranha esta comendo mosquinhas.");
    }
}

class Cat extends Animal implements Pet {
    Cat(String name) {
        super(4);
    }

    Cat() {
        this("");
    }

    void eat() {
        System.out.println("o gatinho está comendo um sandubão.");
    }

    public void play() {
        System.out.println("o gatinho está brincando com uma pelúcia de flamingo.");
    }

    public void beFriendly() {
        System.out.println("o gatinho chamado sett está sendo amigável.");
    }
}

class Fish extends Animal {
    Fish() {
        super(0);
    }

    void eat() {
        System.out.println("o peixinho está comendo * nhom nhom nhom *.");
    }

    void walk() {
        System.out.println("o peixinho não sabe andar.");
    }
}

public class Exercicio_Interface {
    public static void main(String[] args) {
        Animal[] animals = {
            new Fish(),
            new Cat("Robin"),
            new Fish(),
            new Spider()
        };

        for (Animal animal : animals) {
            animal.walk();
            animal.eat();

            if (animal instanceof Pet) {
                Pet pet = (Pet) animal;
                pet.play();
                pet.beFriendly();
            }

            System.out.println();
        }
    }
}
