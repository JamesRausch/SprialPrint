package bubbleSort;

public class SpiralPrint {
    public static void sPrint(int[][] a) {

        int rS = 0;
        int rLength = a.length - 1;
        int cS = 0;
        int cLength = a[0].length - 1;
        while( rS <= rLength && cS <= cLength){
            for ( int i = rS; i <= cLength; i++){
                System.out.print(a[rS][i] + " ");
            }
            for ( int i = rS + 1; i <= rLength; i++){
                System.out.print(a[i][cLength] + " " );
            }
            if(rS + 1 <= cLength){
                for(int i =cLength - 1; i >= cS; i--){
                    System.out.print(a[rLength][i] + " ");
                }
            }
            if(cS + 1 <= cLength){
                for (int i = rLength - 1; i > rS; i--){
                    System.out.print(a[i][cS] + " ");
                }
            }
            rS++;
            rLength++;
            cS++;
            cLength++;
        }
    }
    public static int[][] addMatrix(int[][] a, int[][] b){
        if(a.length != b.length){
            throw new IllegalArgumentException();
        }
        int[][] result = new int[a.length][a[0].length];
        for(int i = 0; i < a.length; i++){
            for (int k = 0; k < a[0].length; k++){
                result[i][k] = a[i][k] + b[i][k];
            }
        }
        return result;
    }
    public static int[][] mulMatrix(int[][] a, int[][] b){
        int aR = a.length;
        int aC = a[0].length;
        int bR = b.length;
        int bC = b[0].length;
        if( aC != bR){
            throw new IllegalArgumentException("Row mismatch");
        }
        int[][] product = new int[aR][bC];
        for(int i = 0; i < aR; i++){
            for(int j = 0; j < bC; j++){
                for(int k = 0; k < aC; k++){
                    product[i][j] = a[i][k] * b[k][j];
                }
            }
        }
        return product;
    }
    public static void main(String[] args) {
        int[][] b = new int[][]{{ 1 , 2 , 3 , 4 ,5}, {16 ,17, 18, 19, 6 },{ 15, 24, 25, 20, 7 },{ 14, 23, 22, 21, 8 },{13 ,12, 11 ,10 ,9 }};
        for(int i = 0; i < b.length; i++){
            for(int k = 0; k < b[0].length; k++){
                System.out.print(b[i][k] + " ");

            }
            System.out.println();
        }
        SpiralPrint.sPrint(b);
        int[][] result = SpiralPrint.addMatrix(b,b);
        for(int i = 0; i < result.length; i++){
            for(int k = 0; k < result[0].length; k++){
                System.out.print(result[i][k] + " ");

            }
            System.out.println();
        }
    }
}
