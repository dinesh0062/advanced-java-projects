//program on unchecked exception (not serious)
//ex (FileNotFoundException,InterruptedException,SQLException)
//for checked exception try-catch is mandatory
//throws is an alternate solution for try-catch
//ignoring exception
package classobjectDEEMO;

public class test7 {

	public static void main(String[] args) {
		try {
		
		System.out.println("Program begins");
		//throw new InterruptedExeption("Devision by zero");
		throw new InterruptedException("Thread Interruption");
		}catch(InterruptedException e) {
			System.out.println(e);
		}

	}

}
