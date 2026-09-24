import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BstSearchTest {

    @Test
    void NullIntTreeToContainsReturnFalse() {
        BinaryTreeNode<Integer> intTree = new BinaryTreeNode<Integer>(null);

        int target = 10;

        assertEquals(BstSearch.contains(intTree,target), false);
    }

    @Test
    void MartinFowlerFindComputer(){
        BinaryTreeNode<String> mFowlerTree = 
        new BinaryTreeNode<>("any",
            new BinaryTreeNode<>("a"),
            new BinaryTreeNode<>("fool",
                new BinaryTreeNode<>("can",
                    new BinaryTreeNode<>("can",
                        new BinaryTreeNode<>("can"),
                        null
                    ),
                    new BinaryTreeNode<>("code",
                        new BinaryTreeNode<>("code"),
                        new BinaryTreeNode<>("computer")
                    )
                ),
                new BinaryTreeNode<>("write",
                    new BinaryTreeNode<>("that",
                        new BinaryTreeNode<>("good",     
                            null,
                            new BinaryTreeNode<>("programmers",
                                new BinaryTreeNode<>("humans"),
                                new BinaryTreeNode<>("that")
                            )
                        ),
                        new BinaryTreeNode<>("understand",
                            new BinaryTreeNode<>("understand"),
                            new BinaryTreeNode<>("write")
                        )
                    ),
                    null
                )

            )
        );

        String targetWord = "code";

        assertEquals(BstSearch.contains(mFowlerTree,targetWord), true);
    }


    @Test
    void MartinFowlerFindAI(){
        BinaryTreeNode<String> mFowlerTree = 
        new BinaryTreeNode<>("any",
            new BinaryTreeNode<>("a"),
            new BinaryTreeNode<>("fool",
                new BinaryTreeNode<>("can",
                    new BinaryTreeNode<>("can",
                        new BinaryTreeNode<>("can"),
                        null
                    ),
                    new BinaryTreeNode<>("code",
                        new BinaryTreeNode<>("code"),
                        new BinaryTreeNode<>("computer")
                    )
                ),
                new BinaryTreeNode<>("write",
                    new BinaryTreeNode<>("that",
                        new BinaryTreeNode<>("good",     
                            null,
                            new BinaryTreeNode<>("programmers",
                                new BinaryTreeNode<>("humans"),
                                new BinaryTreeNode<>("that")
                            )
                        ),
                        new BinaryTreeNode<>("understand",
                            new BinaryTreeNode<>("understand"),
                            new BinaryTreeNode<>("write")
                        )
                    ),
                    null
                )

            )
        );

        String targetWord = "ai";

        assertEquals(BstSearch.contains(mFowlerTree,targetWord), false);
    }

}
