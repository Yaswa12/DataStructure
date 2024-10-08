class RotateImage{
    public void rotate(int[][] matrix){
        transposeMatrix(matrix);
        reverseMatrix(matrix);
    }
    //transposing of the matrix
    private void transposeMatrix(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for (j=0;j<=i;j++){
                int temp = matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i]=temp;
            }
        }

    }
    //reversing the matrix
    private void reverseMatrix(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            // two pointer 
            int left=0;
            int right=matrix.length-1;
            while(left<right){
                int temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;
                left++;
                right--;
            }
        }

    }
    public static void main(String[] args) {
        RotateImage rotateImage = new RotateImage();
        int[][] matrix = {
            {5, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
                    };
                    rotateImage.rotate(matrix);
    }
}
