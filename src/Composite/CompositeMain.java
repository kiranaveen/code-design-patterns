package Composite;

public class CompositeMain
{
    public static void main(String[] args) {
        var group1 = new Group();
        group1.add(new Shape()); // Squery
        group1.add(new Shape()); // Squery

        var group2 = new Group();
        group2.add(new Shape()); //Circle
        group2.add(new Shape()); //Circle

        var group = new Group();
        group.add(group1);
        group.add(group2);
        group.render();
        group.move();
    }
}
