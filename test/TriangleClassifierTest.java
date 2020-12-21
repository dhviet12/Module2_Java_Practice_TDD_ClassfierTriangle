import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {
    @Test
    @DisplayName("test firstSide 2, secondSide 2,thirdSide 2")
    void testside2_2_2(){
        int first_side=2;
        int second_side=2;
        int third_side=2;
        String result = TriangleClassifier.classfier(first_side,second_side,third_side);
        String expect="Equilateral Triangle";
        assertEquals(expect,result);
    }

    @Test
    @DisplayName("test firstSide 2, secondSide 2,thirdSide 3")
    void testside2_2_3(){
        int first_side=2;
        int second_side=2;
        int third_side=3;
        String result = TriangleClassifier.classfier(first_side,second_side,third_side);
        String expect="Isosceles Triangle";
        assertEquals(expect,result);
    }
    @Test
    @DisplayName("test firstSide 3, secondSide 4,thirdSide 5")
    void testside3_4_5(){
        int first_side=3;
        int second_side=4;
        int third_side=5;
        String result = TriangleClassifier.classfier(first_side,second_side,third_side);
        String expect="Normal Triangle";
        assertEquals(expect,result);
    }
    @Test
    @DisplayName("test firstSide 8, secondSide 2,thirdSide 3")
    void testside8_2_3(){
        int first_side=8;
        int second_side=2;
        int third_side=3;
        String result = TriangleClassifier.classfier(first_side,second_side,third_side);
        String expect="Not a Triangle";
        assertEquals(expect,result);
    }

    @Test
    @DisplayName("test firstSide -1, secondSide 2,thirdSide 1")
    void testsideNegative1_2_1(){
        int first_side=-1;
        int second_side=2;
        int third_side=1;
        String result = TriangleClassifier.classfier(first_side,second_side,third_side);
        String expect="Not a Triangle";
        assertEquals(expect,result);
    }
    @Test
    @DisplayName("test firstSide 0, secondSide 1,thirdSide 1")
    void testsideNegative0_1_1(){
        int first_side=0;
        int second_side=1;
        int third_side=1;
        String result = TriangleClassifier.classfier(first_side,second_side,third_side);
        String expect="Not a Triangle";
        assertEquals(expect,result);
    }

}