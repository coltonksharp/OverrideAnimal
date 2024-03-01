package Lab6_Animal;

class Animal {
    public String say() {
        return null;
    }
}

    class Cat extends Animal
    {
        @Override
        public String say() {
            return "meow-meow";
        }
    }

    class Dog extends Animal
    {
        @Override
        public String say() {
            return "woof-woof";
        }
    }

    class Duck extends Animal
    {
        @Override
        public String say() {
            return "quack-quack";
        }
    }