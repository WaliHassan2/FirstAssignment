import javax.swing.JOptionPane;
public class ClassAssign{

	public static void main(String[] args) {
		
		
		
		double pi,cu,con;
		int radius=0;
		int depth=0;
		
				System.out.println("So I can finally get to work,\nWould you be so kind as to enter the radius in inches, \nand the depth in feet, please?");
		int radi = -1;
		while (radi < 0)
			
		{
				String input1 = JOptionPane.showInputDialog("Enter the radius");
			if(input1.length() > 0) {
				radius = Integer.parseInt(input1);
			}
			if(input1.length() !=0)
			
			{	
				radi++;
				
				
				System.out.println("C'mon hurry up!\nEnter the depth already, I don't have all day!");
				String input2 = JOptionPane.showInputDialog("Enter the depth");
				
			if(input2.length() > 0) {
				depth = Integer.parseInt(input2);
			}
			if(input2.length() !=0)	
				
			{
				radi++;
				System.out.println("Thanks!\n");
				pi = 3.1416;// pi, approximately
				cu = 7.48;// gallons per cubic foot
				con = 1728;// cubic inches to cubic feet conversion
				double gallons = ((((radius*radius)*(depth*12)*pi)/con)*cu);
				JOptionPane.showMessageDialog(null,"The number of gallons stored \nin the well casing is\n" + gallons);
				System.out.println("Now was that so difficult?!");
			
			}else
			
				JOptionPane.showMessageDialog(null, "You Can't leave the depth blank!","Gross Error", JOptionPane.ERROR_MESSAGE);
		
			}else
		
				JOptionPane.showMessageDialog(null, "C'mon get it together!\nYou Can't leave the radius blank!","Gross Error", JOptionPane.ERROR_MESSAGE);
			
		
		}
		}
		
}
	

