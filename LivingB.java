abstract class Living {
    int legs;
    abstract void move();
}

class Animal extends Living {
    void move() {
        System.out.println("walk");
    }
}

class Bird extends Living {
    void move() {
        System.out.println("fly");
    }

    public static void main(String[] args) {
        Bird b = new Bird();
        b.move();
        Animal a = new Animal();
        a.move();
    }
}
