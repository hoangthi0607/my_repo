class Animal {
    private String color;

    Animal() {

    }

    Animal(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void eat() {
        System.out.println("I can eat");
    }

    public String toString() {
        return color;
    }
}

class Dog extends Animal {
    private String owner;

    Dog(String color, String owner) {
        super(color);
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void eat() {
        System.out.println("Eat rice & meat");
    }

    public void bark() {
        System.out.println("I can bark!");
    }

    public String toString() {
        return getColor() + " " + getOwner();
    }
}

class Lion extends Animal {
    private String jungle;

    Lion(String color, String jungle) {
        super(color);
        this.jungle = jungle;
    }

    public String getJungle() {
        return jungle;
    }

    public void eat() {
        System.out.println("Only eat raw meat");
    }

    public void roar() {
        System.out.println("I can roar");
    }

    public String toString() {
        return getColor() + " " + getJungle();
    }
}

class Main {
    public static void main(String[] args) {

        Animal[] a = new Animal[3];
        a[0] = new Dog("yellow", "thi");
        a[1] = new Lion("blue", "chau a");
        a[2] = new Animal("Yellow");
        for (int i = 0; i < 3; i++) {
            System.out.println(a[i].toString());
            a[i].eat();
            if (a[i] instanceof Lion) {
                ((Lion) a[i]).roar();
            }
        }
    }

}
