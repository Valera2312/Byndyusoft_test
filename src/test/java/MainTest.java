import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MainTest {
    static int[] emptyArray = {};
    static int[] arrayWithTheSameElements = new int[10];
    static int[] arrayWithMillionElements = new int[1000000];
    static long start;
    @BeforeEach
    void initTime() {
        start = System.currentTimeMillis();
    }


    @BeforeAll
    static void init() {

        for (int i = 0; i < 10; i++) {
            arrayWithTheSameElements[i] = 1;
        }
        for (int i = 0; i < 1000000; i++) {
            arrayWithMillionElements[i] = i;
        }
    }

    @Test
    void sumOfTwoMinimalNumbersInArrayMillionElements() {

       Assertions.assertEquals( 1,Main.sumOfTwoMinimalNumbersInArray(arrayWithMillionElements));
        System.out.print("sumOfTwoMinimalNumbersInArrayMillionElements ");
        System.out.println(System.currentTimeMillis() - start);
    }
    @Test
    void sumOfTwoMinimalNumbersInArraysTheSameElements() {

        Assertions.assertEquals( 1,Main.sumOfTwoMinimalNumbersInArray(arrayWithTheSameElements));
        System.out.print("sumOfTwoMinimalNumbersInArraysTheSameElements ");
        System.out.println(System.currentTimeMillis() - start);
    }
    @Test
    void sumOfTwoMinimalNumbersInArraysEmptyArray() {

        Assertions.assertEquals( 0,Main.sumOfTwoMinimalNumbersInArray(emptyArray));
        System.out.print("sumOfTwoMinimalNumbersInArraysEmptyArray ");
        System.out.println(System.currentTimeMillis() - start);
    }
    @Test
    void sumOfTwoMinimalNumbersInArrayStreamMillionElements() {
        Assertions.assertEquals( 1,Main.sumOfTwoMinimalNumbersInArrayStream(arrayWithMillionElements));
        System.out.print("sumOfTwoMinimalNumbersInArrayStreamMillionElements ");
        System.out.println(System.currentTimeMillis() - start);
    }
    @Test
    void sumOfTwoMinimalNumbersInArrayTheSameElementsStream() {

        Assertions.assertEquals( 1,Main.sumOfTwoMinimalNumbersInArrayStream(arrayWithTheSameElements));
        System.out.print("sumOfTwoMinimalNumbersInArrayTheSameElementsStream ");
        System.out.println(System.currentTimeMillis() - start);
    }
    @Test
    void sumOfTwoMinimalNumbersInArraysEmptyArrayStream() {

        Assertions.assertEquals( 0,Main.sumOfTwoMinimalNumbersInArrayStream(emptyArray));
        System.out.print("sumOfTwoMinimalNumbersInArraysEmptyArrayStream ");
        System.out.println(System.currentTimeMillis()- start);
    }

}