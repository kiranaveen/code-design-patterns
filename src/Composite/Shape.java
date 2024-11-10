package Composite;

public class Shape implements Component
{
    @Override
    public void render()
    {
        System.out.println("Render Class");

    }

    @Override
    public void move() {
        System.out.println("Move Shape");
    }
}
