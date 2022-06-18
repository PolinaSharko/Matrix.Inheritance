package org.suai.laba3.aeMatrix;
import org.suai.laba3.Matrix.Matrix;
import org.suai.laba3.exMatrix.MatrixException;

public class AllEqualMatrix extends Matrix {
	protected int value;
	protected int row;
	protected int column;
	public AllEqualMatrix(int row, int column, int value)throws MatrixException{
		super(1,1);		
		this.row = row;
		this.column = column;
		this.value = val;
	}

	public void setElement(int row, int column, int value) throws 	MatrixException{
		if((row <0)||(column<0)){
	          throw new MatrixException ("Set error:Rows or columns are < 0");
		}
		if((row!=0)||(column!=0)){
	          throw new MatrixException("Set error: out of range");
		}
		this.value = value;
	}


	public int getElement(int row, int column) throws MatrixException{
		if((row <0)||(column<0)){
		  throw new MatrixException ("Get error: Rows or columns are <0");
		}
		if((row!=0)||(column!=0)){
		  throw new MatrixException("Get error: out of range");
		}
		return(value);
	}
}