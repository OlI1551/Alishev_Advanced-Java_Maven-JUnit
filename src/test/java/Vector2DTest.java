import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Vector2DTest {
    private final double EPS = 1e-9; // из всех методов вынесем константу -
    // значение delta при проверке мы указывали прямо в параметрах метода
    private static Vector2D v1; // переменную объекта класса также выносим из методов

//    @Before // аннотация выполняется для объектов класса тестового
//            // выполняется каждый раз перед каждым методом @Test
//    public void createNewVector() {
//        v1 = new Vector2D();
//    }

    @BeforeClass // так как объект один и тот же используется в каждом методе,
            // то можно использовать аннотацию класса - выполняется 1 раз
            // перед запуском всех методов @Test
    public static void createNewVector() { // метод должен быь статическим
        // и используемая в нем переменная v1 тоже должна быть статической
        v1 = new Vector2D();
    }

    @Test
    public void newVectorShouldHaveZeroLength() {
//        Vector2D v1 = new Vector2D(); // action

        // assertion
        // 1e-9 = 0.000_000_000_1
        Assert.assertEquals(0, v1.length(), EPS);
    }

    @Test
    public void newVectorShouldHaveZeroX() {
//        Vector2D v1 = new Vector2D(); // создание вектора вынесли в метод класса @Before
        Assert.assertEquals(0, v1.getX(), EPS);
    }

    @Test
    public void newVectorShouldHaveZeroY() {
//        Vector2D v1 = new Vector2D(); // action вынесен
        Assert.assertEquals(0, v1.getY(), EPS);
    }

//    @Test
//    public void newVectorShouldHaveZeroXAndZeroY() { // так делать не нужно -
    // хорошей практикой считается каждый метод тестировать отдельно
//        Assert.assertEquals(0, v1.getX(), EPS);
//        Assert.assertEquals(0, v1.getY(), EPS);
//    }


}
