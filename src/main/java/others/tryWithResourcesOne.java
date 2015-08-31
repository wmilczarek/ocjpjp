package others;

import java.io.FileInputStream;

//FileInputStream must be declare inside resources to compile;

public class tryWithResourcesOne {

	public static void main(String[] args) {
		FileInputStream fileInputStream;

		try ( /* fileInputStream */ FileInputStream inputStream= new FileInputStream("java.txt")){
			System.out.println("some MSG");
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}
