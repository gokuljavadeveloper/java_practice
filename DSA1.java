public class DSA1{
	public static void main(String[] args) {
		oop p1=new oop();
		p1.hash();
		System.out.println("If you want Delete any StudentDetail:enter delete OR you dont want to delete :enter dont");
		Scanner sc = new Scanner(System.in);
		String s1=sc.nextLine();
		s1=s1.toLowerCase();

		if(s1.contains("delete")) {
			System.out.println("Enter name");
			Scanner sc2=new Scanner(System.in);
		String s2=sc2.nextLine();
		System.out.println("enter id");
		Scanner sc1=new Scanner(System.in);
		int id=sc1.nextInt();
	p1.delete(s2, id);
	     }
    elseif(s1.matches(".*[^a-zA-Z0-9].*"))
    {
System.out.println("Dont allowed special characters");
    }
    	else 
        {
			System.out.println("you choose dont delete option");
		}
	}
}