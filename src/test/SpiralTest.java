package test;

import main.Spiral;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SpiralTest {

    @Test
    void spiralPrintTest() {

        // test 2d array with size 4 X 4
        int[][] array4X4 = {{1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12},
                            {13,14,15,16}};
        Assertions.assertEquals(Spiral.spiralTraverse(array4X4),"1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10");

        // test 2d array with size 5 X 5
        int[][] array5X5 =  {{ 1, 2, 3, 4, 5},
                             { 6, 7, 8, 9,10},
                             {11,12,13,14,15},
                             {16,17,18,19,20},
                             {21,22,23,24,25}};
        Assertions.assertEquals(Spiral.spiralTraverse(array5X5),"1,2,3,4,5,10,15,20,25,24,23,22,21,16,11,6,7,8,9,14,19,18,17,12,13");

        // test 2d array with size 5 X 6
        int[][] array5X6 =  {{ 1, 2, 3, 4, 5},
                             { 6, 7, 8, 9,10},
                             {11,12,13,14,15},
                             {16,17,18,19,20},
                             {21,22,23,24,25},
                             {26,27,28,29,30}};
        Assertions.assertEquals(Spiral.spiralTraverse(array5X6),"1,2,3,4,5,10,15,20,25,30,29,28,27,26,21,16,11,6,7,8,9,14,19,24,23,22,17,12,13,18");

        // test 2d array with size 5 X 7
        int[][] array5X7 = {{ 1, 2, 3, 4, 5},
                            { 6, 7, 8, 9,10},
                            {11,12,13,14,15},
                            {16,17,18,19,20},
                            {21,22,23,24,25},
                            {26,27,28,29,30},
                            {31,32,33,34,35}};
        Assertions.assertEquals(Spiral.spiralTraverse(array5X7),"1,2,3,4,5,10,15,20,25,30,35,34,33,32,31,26,21,16,11,6,7,8,9,14,19,24,29,28,27,22,17,12,13,18,23,18");

        // test empty 2d array
        int[][] arrayEmpty = {{}};
        Assertions.assertEquals(Spiral.spiralTraverse(arrayEmpty),"");

        // test 2d array with size 1 X 1
        int[][] array1X1 = {{1}};
        Assertions.assertEquals(Spiral.spiralTraverse(array1X1),"1");

    }
}