package JUnit;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class First {

    @BeforeEach
    void beforeEach() {

    }

    List<String> todos = Arrays.asList("AWS", "Azire", "Devops");

    @Test
    void test(){
        int [] nums = {1,2,3};
        MyMath math = new MyMath();
        int result = math.calculateSum(nums);
        System.out.println(result);

        assertEquals(6, result);
    }

    @Test
    void testAsserrts(){
        boolean tets = todos.contains("AWS");
        boolean test2 = todos.contains("GCP");
        assertTrue(tets);
        assertEquals(3, test2.size());

    }

}
