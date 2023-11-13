package ProjectsByOnyii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataExtractionTest {
    @Test
    void canExtractDataFromSet(){
        //Given
        DataExtraction dataExtraction = new DataExtraction();
        int[][] dataset =  {
                {4, 2, 4, 1},
                {6, 8, 3, 6},
                {2, 6, 8, 2},
                {5, 8, 2, 6}
        };
        int row = 2;
        int startPosition = 2;
        int endPosition = 4;

        //When
        int[] result = dataExtraction.extract(dataset, row, startPosition, endPosition);

        //Assert
        int[] expected = {8, 3, 6};
        assertEquals (expected, result);
        assertEquals( 3, result.length);

    }
}
