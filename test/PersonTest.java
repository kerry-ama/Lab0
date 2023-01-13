import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;




/**
 * A JUnit test class for the Person class.
 */
public class PersonTest {
  /**
   * This is a comment for private Person John.
   */
  private Person john;

  /**
   * This is a comment for public void setup.
   */
  @Before
  public void setUp() {

    john = new Person("John", "Doe", 1945);
  }

  /**
   * This is a comment for public void testFirst.
   */
  @Test
  public void testFirst() {
    assertEquals("John", john.getFirstName());

  }

  /**
   * This is a comment for public void testSecond.
   */
  @Test
  public void testSecond() {
    assertEquals("Doe", john.getLastName());
  }

  /**
   * This is a comment for public void testYearOfBirth.
   */
  @Test
  public void testYearOfBirth() {
    assertEquals(1945, john.getYearOfBirth());
  }

}
