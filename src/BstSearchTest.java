import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BstSearchTest {

    @Test
    void NullIntTreeToContainsReturnFalse() {
        BinaryTreeNode<Integer> intTree = new BinaryTreeNode<Integer>(null);

        int target = 10;

        assertEquals(BstSearch.contains(intTree,target), false);
    }

}
