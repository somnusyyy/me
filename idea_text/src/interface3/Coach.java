package interface3;

public abstract class Coach extends Person {
    @Override
    public void eat() {
        System.out.println("coach eat dinner");
    }

    public abstract void teach();
}
