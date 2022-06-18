package org.suai.laba3.exMatrix;
import org.suai.laba3.Matrix.Matrix;
//import aeMatrix.AllEMatrix;


public class MatrixException extends Exception{

	private int number;
	private String message;
	
	public MatrixException(String error){
	  message = error;
	}

	public String getMessage(){
	  return(message);
	}

}