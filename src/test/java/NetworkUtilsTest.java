import org.junit.Test;

public class NetworkUtilsTest {
    @Test(timeout = 1000) // в миллисекундах 1s = 1000ms
    public void getConnectionShouldReturnFasterThanOneSecond() {
        NetworkUtils.getConnection(); // тест завалится - спать 1.5 секунды
    }

}

