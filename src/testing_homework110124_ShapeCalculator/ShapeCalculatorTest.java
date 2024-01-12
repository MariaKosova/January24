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
}





