public class Main {
    public static void main(String[] args) {
        Mallard md = new Mallard();
        RubberDuck rd = new RubberDuck();
        md.display();
        md.performQuack();
        md.performSwim();
        md.performFly();
        System.out.println("------------------");
        rd.display();
        rd.performQuack();
        rd.performSwim();
        rd.performFly();
        System.out.println("------------------");
    }
}