/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quick.sort;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
    @Test void testQuickSort(){
        int[] arr = { 8, 4, 23, 24, 16, 15 };
        int n = arr.length;

        App.quickSort(arr, 0, n - 1);
       int resArr[]={4,8, 15, 16, 23, 24};
       assertArrayEquals(resArr,arr);
    }
}
