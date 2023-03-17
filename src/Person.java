public class Person {

    String name;
    int age;
    double weight;
    double height;

    public Person(String n, int a, double w, double h) {
        name = n;
        age = a;
        weight = w;
        height = h;
    }

    public void jump() {
        System.out.println("You jumped " + (int) (Math.random() * 20) + 10 + " inches");
    }

    public void run() {
        System.out.println("You went out for a run");
    }

    public void eat() {
        System.out.println("You went out to eat");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }
}
