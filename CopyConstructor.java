class Person{
    String name;
    int age;
    double weight;

    protected Person(){
        this.name = "";
        this.age = 0;
        this.weight = 0.0;
    }

    protected Person(String name, int age, int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    protected Person(Person person){
        this.name = person.name;
        this.age = person.age;
        this.weight = person.weight;
    }

    protected void display(){
        System.out.println("Name of the person is " + this.name);
        System.out.println("Age of the person is " + this.age);
        System.out.println("Weight of the person is " + this.weight);
    }
}


public class CopyConstructor{
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.display();

        Person person2 = new Person("Ishaan", 21, 61);
        person2.display();

        Person person3 = new Person(person2);
        person3.display();

//        Name of the person is
//        Age of the person is 0
//        Weight of the person is 0.0
//
//        Name of the person is Ishaan
//        Age of the person is 21
//        Weight of the person is 61.0
//
//        Name of the person is Ishaan
//        Age of the person is 21
//        Weight of the person is 61.0
    }
}