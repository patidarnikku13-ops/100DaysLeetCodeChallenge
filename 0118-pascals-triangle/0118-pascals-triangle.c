/**
 * Return an array of arrays of size *returnSize.
 * The sizes of the arrays are returned as *returnColumnSizes array.
 * Note: Both returned array and *columnSizes array must be malloced, assume caller calls free().
 */
int** generate(int numRows, int* returnSize, int** returnColumnSizes) {
    *returnSize = numRows;
    *returnColumnSizes = (int*)malloc(numRows * sizeof(int));//allote size of array
    int** result = (int**)malloc(numRows * sizeof(int*));//allot size of row pointer

 for(int i =0;i<numRows;i++){
    (*returnColumnSizes)[i] = i+1;// row lenght
    result[i] = (int*)malloc((i+1) * sizeof(int));

    int value=1;
    for(int j=0;j<=i;j++){
     result[i][j] = value;
    value =(value*(i-j))/(j+1);
    }
   
 } 
 return result;
}

