package africa.semicolon.chapterNine.QuadrilateralInheritance;

public class Trapezoid extends Quadrilateral {
    private int height;
    private int base1;
    private int base2;
    @Override
    public int calculateArea() {
        return (base1 +  base2) * height / 2;
    }
}
