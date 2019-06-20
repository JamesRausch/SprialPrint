package bubbleSort;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SpiralPrintTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream output = System.out;
    @BeforeEach
    public void setUpStream(){
        System.setOut(new PrintStream(outContent));

    }
    @AfterEach
    public void restoreStream(){
        System.setOut(output);
    }
    @Test
    void sPrint() {
        SpiralPrint sPrint  = new SpiralPrint();
        int[][] b = new int[][]{{ 1 , 2 , 3 , 4 ,5}, {16 ,17, 18, 19, 6 },{ 15, 24, 25, 20, 7 },{ 14, 23, 22, 21, 8 },{13 ,12, 11 ,10 ,9 }};
        sPrint.sPrint(b);
        assertEquals("1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25", outContent.toString());
    }

    @Test
    void addMatrix() {
        SpiralPrint sPrint = new SpiralPrint();
        int[][] a = new int[2][1];
        int[][] b = new int[2][1];
        int[][] c = new int[2][1];
        a[0][0] = 0;
        a[0][1] = 1;
        a[0][2] = 2;
        a[1][0] = 9;
        a[1][1] = 8;
        a[1][2] = 7;
        b[0][0] = 6;
        b[0][1] = 5;
        b[0][2] = 4;
        b[1][0] = 3;
        b[1][1] = 4;
        b[1][2] = 5;
        c[0][0] = 6;
        c[0][1] = 6;
        c[0][2] = 6;
        c[1][0] = 12;
        c[1][1] = 12;
        c[1][2] = 12;
        assertArrayEquals(c,sPrint.addMatrix(a,b));
    }

    @Test
    void mulMatrix() {
        SpiralPrint sPrint = new SpiralPrint();
        int[][] a = new int[1][2];
        int[][] b = new int[2][1];
        a[0][0] = 1;
        a[0][1] = 2;
        a[0][2] = 3;
        a[1][0] = 4;
        a[1][1] = 5;
        a[1][2] = 6;
        b[0][0] = 7;
        b[0][1] = 8;
        b[1][0] = 9;
        b[1][1] = 10;
        b[2][0] = 11;
        b[2][1] = 12;
        int[][] c = new int[1][1];
        c[0][0] = 58;
        c[0][1] = 64;
        c[1][0] = 139;
        c[1][1] = 154;
        assertArrayEquals(c,sPrint.mulMatrix(a,b));


    }
}
