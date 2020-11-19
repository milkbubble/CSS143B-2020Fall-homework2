import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem2Test {
    @Test
    public void testRemoveDuplicates() {
        int[][] inputs = {
                // DO NOT REMOVE OR CHANGE THE GIVEN TEST CASES!
                {0, 0, 1, 1, 1, 2, 2, 4, 4, 6},
                {0, 0, 1, 2, 4, 4, 4,},
                {0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 5, 6},
                {1, 1, 2, 2, 2, 2, 3, 3, 3, 3,},
                {0, 0, 1, 1, 1, 2, 3, 3, 4, 5, 5, 6},
                {0, 1, 1, 2, 3, 4, 5, 6, 6, 6,}
                // add more test cases
        };

        int[][] expects = {
                {0, 1, 2, 4, 6},
                {0, 1, 2, 4},
                {0, 1, 2, 3, 5, 6},
                {1, 2, 3},
                {0, 1, 2, 3, 4, 5, 6},
                {0, 1, 2, 3, 4, 5, 6}
                // add more test cases
        };

        assertEquals(expects.length, inputs.length);

        for (int i = 0; i < inputs.length; i++) {
            int actualLength = Problem2.remove(inputs[i]);
            String caseId = "case " + i;
            assertEquals(caseId + " output length FAILED", expects[i].length, actualLength);
            for (int j = 0; j < actualLength; j++) {
                assertEquals(caseId + " element comparison FAILED", expects[i][j], inputs[i][j]);
            }
        }
    }
}
