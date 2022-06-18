package org.suai.laba3.sqMatrix;
import org.suai.laba3.Matrix.Matrix;
import org.suai.laba3.exMatrix.MatrixException;

public class SquareMatrix extends Matrix {
	
	public SquareMatrix(int newSize)throws MatrixException{
		super(newSize, newSize);
		for(int i = 0; i < newSize; i++){
		  mtx[i][i] = 1;
		}
	}

	@Override 
	public Matrix sum(Matrix n)throws MatrixException{
		SquareMatrix sum = new SquareMatrix(this.rows);
		for(int i = 0; i < this.rows; i++){
		  for(int j = 0; j<columns; j++){
		     sum.mtx[i][j] = mtx[i][j] + n.getElement(i,j);
  		   }
		}
		return(sum);	
	}

}