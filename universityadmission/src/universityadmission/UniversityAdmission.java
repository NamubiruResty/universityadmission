package universityadmission;
import java.util.Scanner;
public class UniversityAdmission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user =new Scanner(System.in);
		int Ordinarylevelpasses, Advancedlevelpasses;
		
		while(true) {
			System.out.print("Enter Ordinary Level passes(6+ to proceed):");
			Ordinarylevelpasses=user.nextInt();
			
			
			System.out.print("Enter Advanced Level principal passes(2+ to proceed):");
			 Advancedlevelpasses=user.nextInt();
			 
			 
			if(Ordinarylevelpasses>=6 &&  Advancedlevelpasses>=2) {
				System.out.println("Admission granted!");
				break;
			}else {
				System.out.println("Admission denied. Please re-enter grades.");
			}
		} 
	}

}
