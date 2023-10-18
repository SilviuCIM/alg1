package alg1;
class Main {
    public static void InsertionSort(int []A){
        for(int j =1 ; j < A.length; j++) {
            int key = A[j];
            int i = j - 1;
            while(i >= 0 && A[i] > key) {
                A[i + 1] = A[i];
                i--;
            }
            A[i+1] = key;
        }
    }
    public static void SelectionSort(int []A, int n) {
        for(int i = 0; i < n - 1; i++) {
            int minj = i, minx = A[i];
            for(int j = i + 1; j < n; j++) {
                if(A[j] < minx) {
                    minj = j;
                    minx = A[j];
                }
            }
            A[minj] = A[i];
            A[i] = minx;
        }
    }
    public static int Euclid(int m, int n) {
        while(n != 0) {
            int temp = m % n;
            m = n;
            n = temp;
        }
        return m;
    }
    public static int Fibonacci(int n) {
        int i = 0, j = 1, s = 1;
        for(int k = 1; k < n; k++) {
            i = j;
            j = s;
            s = i + j;
        }
        return i;
    }
    public static int[][] Produs(int [][]A, int [][]B) {
        int m = A.length;
        int n = A[0].length;
        int p = B[0].length;
        int [][]C = new int[m][p];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < p; j++) {
                for(int k = 0; k < n; k++) {
                    C[i][j] = C[i][j]+A[i][k]*B[k][j];
                }
            }
        }
        return C;
    }
    public static int Russe(int a, int b) {
        int x[] = new int[1000], y[]= new int[1000];
        x[1] = a;
        y[1] = b;
        int i = 1;
        while(x[i] > 1) {
            x[i+1] = x[i] / 2;
            y[i+1] = 2*y[i];
            i++;
        }
        int prod = 0;
        while(i > 0) {
            if(x[i] % 2 != 0) {
                prod+=y[i];
            }
            i--;
        }
        return prod;
    }

    public static void printMatrix(int [][]Matrix) {
        for(int[] row : Matrix) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int []array = {5, 2, 4, 6, 1, 3};
        System.out.println("Insertion Sort");
        System.out.println("Sir nesortat: ");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println("\n");
        InsertionSort(array);
        System.out.println("Sir sortat: ");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println("\n");


        int []A = {4, 133, 70, 0, 101, 71};
        System.out.println("SelectionSort");
        int n = A.length;
        System.out.println("Sir nesortat: ");
        for (int i = 0; i < A.length; i++)
            System.out.print(A[i] + " ");
        SelectionSort(A, n);
        System.out.println();
        System.out.println("Sir sortat: ");
        for (int i = 0; i < A.length; i++)
            System.out.print(A[i] + " ");


        System.out.println("\n");
        System.out.println("Euclid");
        int c = 171, d = 27;
        System.out.print("m = " + c +  " si n = " +  d + " => ");
        System.out.println(Euclid(c, d));


        System.out.println("\n");
        System.out.println("Fibonacci Iterativ");
        int a = 13;
        System.out.println("Al " + a + "-lea termen din sirul lui Fibonacci este: " + Fibonacci(a));


        System.out.println("\n");
        System.out.println("Produsul a doua matrici");
        int[][] m1 = { {5, 8, -1}, {2, 0, 16} };
        int[][] m2 = { {1, -7}, {0, 12}, {3, 3} };
        int[][] produs = Produs(m1, m2);
        System.out.println("Prima matrice: ");
        printMatrix(m1);
        System.out.println();
        System.out.println("A doua matrice: ");
        printMatrix(m2);
        System.out.println();
        System.out.println("Produsul celor doua matrici: ");
        printMatrix(produs);


        System.out.println("\n");
        System.out.println("Inmultirea a la Russe");
        int x = 178, y = 344;
        System.out.println("a= " + x + " b=" + y + " => "  + Russe(x, y));
    }

}
