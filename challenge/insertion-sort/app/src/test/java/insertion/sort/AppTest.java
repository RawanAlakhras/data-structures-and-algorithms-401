/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package insertion.sort;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
    @Test void testInsertion(){
        int arr[]= {8, 4, 23, 42, 16, 15};
        App.insertionSort(arr);
       //after sort
        int acArr[]={4,8,15,16,23,42};
        assertArrayEquals(acArr,arr);
    }
}
