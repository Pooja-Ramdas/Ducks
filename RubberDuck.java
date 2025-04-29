public class RubberDuck extends Duck{
    public RubberDuck(){
        quackBehaviour = new Squeak();
        swimBehaviour = new Floating();
        flyBehaviour = new NoFly();
    }
    @Override
    public void display() {
        System.out.println("I am a Rubber Duck.");
    }
}
