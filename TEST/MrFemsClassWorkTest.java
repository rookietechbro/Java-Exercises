import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MrFemisClassWorkTest {
    @Test
    public void testThatICanRemoveElementsInOddPositionsInAnArray(){
        Array myArraySet = new Array();
        myArraySet.elementsInOddPositionsInAnArray();
        assertEquals({2,4,6}, myArraySet.elementsInOddPositionsInAnArray());
    }
