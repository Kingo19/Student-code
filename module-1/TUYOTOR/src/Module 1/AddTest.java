import org.junit.jupiter.api.*;
public class AddTest{

    @Test
    public void addTest() {
        Add test1 = new Add();
        int result = test1.total(10, 23);

        Assertions.assertEquals(33, result);
    }

    @Test
    public void multiply() {
        Add test2 = new Add();
        int sum = test2.prod(10, 10);
        Assertions.assertEquals(100, sum);
    }

}
