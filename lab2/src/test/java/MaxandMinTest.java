import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
class MaxandMinTest {
    MaxandMin A;
    int []x = {2, 10, 0, 4, 7};
    int max = 7;
    int min = 0;
    @BeforeEach
    public void init(){
        A = new MaxandMin();
    }
    @Nested
    class Maxtest{
        @Test
        @DisplayName("max value of the array")
        public void findemax() {
            assertEquals(max, A.findmax(x));
        }
    }
    @Nested
    class Mintest{
        @Test
        @DisplayName("min value of the array")
        public void findemin(){
            assertEquals(min,A.findmin(x));
        }
    }
    @AfterEach
    public void cleanup(){
        x=null;
    }
}
