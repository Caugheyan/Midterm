import org.junit.Test;

public class add {
    public add(int a, int b) {
        int c = a + b;
        System.out.println (c);
    }

    @Test
    public void testadd() {
        assert(new add (4,5) == 9);
    }

}

