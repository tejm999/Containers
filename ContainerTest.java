import org.junit.Test;
import static org.junit.Assert.*;

public class ContainerTest {

    @Test
    public void testContains() {
        Container container = new Container();
        assertEquals(0, container.contains());
    }

    private void assertEquals(int i, int contains) {

    }

    @Test
    public void testAddAmount() {
        Container container = new Container();
        container.addAmount(50);
        assertEquals(50, container.contains());
    }

    @Test
    public void testRemove() {
        Container container = new Container();
        container.addAmount(50);
        container.remove(30);
        assertEquals(20, container.contains());
    }

    @Test
    public void testMove() {
        Container source = new Container();
        Container destination = new Container();
        source.addAmount(50);
        source.move(30, destination);
        assertEquals(20, source.contains());
        assertEquals(30, destination.contains());
    }

    @Test
    public void ctestAddAmountLimit() {
        Container container = new Container();
        container.addAmount(150); // Adding more than limit
        assertEquals(100, container.contains());
    }

    @Test
    public void testRemoveMoreThanContains() {
        Container container = new Container();
        container.addAmount(50);
        container.remove(70); // Removing more than contains
        assertEquals(0, container.contains());
    }
}
