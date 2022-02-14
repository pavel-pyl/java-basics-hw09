import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ArraysTest {

  /**
   * Test data for common array elements.
   *
   * @return test data array
   */
  @DataProvider(name = "ArrayUtil")
  public static Object[][] arrays() {
    return new Object[][]{
        {
            new String[]{"Python", "JAVA", "PHP", "C#", "C++", "SQL"},
            new String[]{"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"},
            new String[]{"JAVA", "SQL"}
        },
        {
            new String[]{"here", "is", "some", "text", ".", "text"},
            new String[]{"some", "text", "above", "."},
            new String[]{"some", "text", "."}
        },
        {
            new String[]{"Another", "small", "small", "string", ""},
            new String[]{"string", "not", "small", "as", "previous", "one", "", "small"},
            new String[]{"small", "string", ""}
        },
        {
            new String[]{"Android", "", "small", "string"},
            new String[]{},
            new String[]{}
        },
        {
            new String[]{"Android", "", "small", "string"},
            new String[]{"There", "is", "no", "repetitions"},
            new String[]{}
        }
    };
  }

  @Test(dataProvider = "ArrayUtil")
  public void testFindCommon(String[] array1, String[] array2, String[] expectedResult) {
    assertEquals(ArrayUtil.findCommon(array1, array2), expectedResult,
        "Common elements are not correct");
  }
}