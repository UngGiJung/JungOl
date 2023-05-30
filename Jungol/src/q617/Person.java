package q617;

public class Person {
    private String name;
    private int height;

    public Person(String name, int height) {
        this.name=name;
        this.height=height;
    }
    public void print() {
        System.out.println(name + " "+ height);
    }
    public int getHeight() {
        return height;
    }
}
