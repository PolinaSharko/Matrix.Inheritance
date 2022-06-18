package org.suai.laba3.Matrix;
import org.suai.laba3.sqMatrix.SquareMatrix;
import org.suai.laba3.exMatrix.MatrixException;
//import aeMatrix.AllEMatrix;
public class Matrix {
	
	protected int rows;
	protected int columns;
	protected int [][] mtx;
	
	public Matrix(int rows, int columns)throws MatrixException{
		if((rows <=0)||(columns<=0)){
		  throw new MatrixException ("Constructor error:Rows or columns are <= 0");
		}
		this.rows = rows;
		this.columns= columns;
		mtx = new int [rows][columns];
	}

	public void setElement(int row, int column, int value) throws MatrixException{
		if((row <0)||(column<0)){
	          throw new MatrixException ("Set error:Rows or columns are < 0");
		}
		if((row>=this.rows)||(column>=this.columns)){
	          throw new MatrixException("Set error: out of range");
		}
		mtx[row][column] = value;
	}

	public int getElement(int row, int column) throws MatrixException{
		if((row <0)||(column<0)){
		  throw new MatrixException ("Get error: Rows or columns are <0");
		}
		if((row>this.rows)||(column>this.columns)){
		  throw new MatrixException("Get error: out of range");
		}

		return(mtx[row][column]);
	}


	public Matrix sum(Matrix n)throws MatrixException{
		if((this.rows!=n.rows)||(this.columns!=n.columns)){
		  throw new MatrixException("Sum error: Wrong Parameters");
		}
		Matrix sum = new Matrix(this.rows, this.columns);
		for(int i = 0; i < this.rows; i++){
		  for(int j = 0; j<columns; j++){
	             sum.setElement(i,j,this.getElement(i,j)+n.getElement(i,j));
  		   }
		}
		return(sum);
	}
	
	public final Matrix product(Matrix n) throws MatrixException{
		if(this.columns!=n.rows){
		  throw new MatrixException("Prod error: Wrong parameters");
		}
	Matrix res= new Matrix(this.rows, n.columns);
		for(int i = 0; i<this.rows; i++){
		   for(int j = 0; j<n.columns; j++){
			  for(int k = 0; k<this.columns; k++){
			      res.setElement(i,j, this.getElement(i,k)*n.getElement(k,j)+res.getElement(i,j));
			  }
		     }
		}
		return(res);	
	}

	public final boolean equals(Object o){
		if (o==null){ 
	 	  return false;
		}
		else{ 
		  String mtx = this.toString();
		  String obj = o.toString();
		     for(int i = 0; i<mtx.length(); i++){
			if(mtx.charAt(i)!=obj.charAt(i)){
			   return(false);	
			}
		      }
		}
	return(true);
	}


	public final String toString(){
		StringBuilder buffer = new StringBuilder();
		for(int i=0; i<this.rows; i++){
		  for(int j=0; j<this.columns; j++){
		     buffer.append(mtx[i][j]).append(" ");
  		  }
		  buffer.append("\n");
 		}
		return buffer.toString();
	}
}

 