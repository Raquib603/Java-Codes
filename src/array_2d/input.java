package array_2d;

class input {
    private int q[][];

    public input() {
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                q[i][j] = Integer.parseInt(System.console().readLine());
    }


    public input( int a , int b ) {
        int mat[][] = new int [a][b];
        for(int i=0; i<mat.length; i++) {
            for(int j=0;j<mat[i].length;j++)
                q[i][j] = Integer.parseInt(System.console().readLine());
        }
    }



    public void show() {
        for(int i=0; i<q.length; i++) {
            for(int j=0;j<q[i].length;j++)
                System.out.println(q[i][j]+" ");
        }
    }
}

