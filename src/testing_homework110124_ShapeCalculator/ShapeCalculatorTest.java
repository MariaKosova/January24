package testing_homework110124_ShapeCalculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeCalculatorTest {
    ShapeCalculator shapeCalculator;
    private double res;
    Shape [] shapes;

    @BeforeEach
    public void setUp() {
        shapeCalculator = new ShapeCalculator();
        Shape circle = new Circle(4);
        Shape rectangle = new Rectangle(3, 3);
        Shape[] shapes = {circle,rectangle};

        res = circle.area() +rectangle.area();
    }

    @Test
    @DisplayName("ShapesSum_calculating")

    public void shapeSumCalculating() {

        assertEquals(res, shapeCalculator.totalSquare(shapes));
    }

    @Test
    public void test_zeroShape(){
        Shape[] actual = {};
        assertEquals(0, shapeCalculator.totalSquare(actual));
    }

    @Test
    public void test_oneShape(){
        Shape[] actual = {new Rectangle(5,10)};
        assertEquals(50.0, shapeCalculator.totalSquare(actual));
    }

    @Test
    public void test_twoShape(){
        Shape[] actual = {new Rectangle(5,10), new Circle(10)};
        assertEquals(364.0, shapeCalculator.totalSquare(actual));
    }

}





