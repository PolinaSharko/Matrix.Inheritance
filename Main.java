import org.suai.laba3.sqMatrix.SquareMatrix;
import org.suai.laba3.exMatrix.MatrixException;
import org.suai.laba3.Matrix.Matrix;
import org.suai.laba3.aeMatrix.AllEqualMatrix;
public class Main {
	public static void main (String [] args){
		try{
			Matrix mtr1 = new Matrix(3,3);
			AllEqualMatrix m1 = new AllEqualMatrix(2);
			AllEqualMatrix m2 = new AllEqualMatrix(3);
			mtr1=m2.sum(m1);
			System.out.println(mtr1);
		}
		catch(MatrixException ex){
			System.out.println(ex.getMessage());
		}
			
	}
}
