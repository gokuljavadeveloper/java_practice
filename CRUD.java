package GOKU;
import java.util.*;
public class oop {
	HashMap<String,Integer> H1= new HashMap<>();
	String s2;
	void hash() {
		System.out.println("Student CRUD Operations");	
	List<String> li=new ArrayList<>();
		
	Scanner sc = new Scanner(System.in);
	Scanner sc1=new Scanner(System.in);
	System.out.println("Enter the value for how many studentdetails do you add");
	Scanner sc2=new Scanner(System.in);
	int a=sc2.nextInt();
	for(int j=0;j<a;j++) {
	System.out.println("Enter the SName");
	String s=sc.next();
	li.add(s);
		
	sc.nextLine();
	System.out.println("Enter the SID");
	int id=sc1.nextInt();

	H1.put(s,id);
	}
	System.out.println("If You Want To Read a SDetails  : Enter yes/no ");
	Scanner S=new Scanner(System.in);
	s2=S.nextLine();
if(s2.toLowerCase().contains("yes")) {
	System.out.println("STUDENT DETAILS");
	for(Map.Entry<String,Integer> name:H1.entrySet())            //Map.Entry<String,Integer > name:h.entrySet())
		{
		System.out.println(name.getKey()+":"+name.getValue());
	}
}elseif(!s2.matches("[a-zA-Z]")) {
System.out.println("Sorry u Gave a Numbers or Special characters,So I Cannot do Anything");
}


System.out.println("-----------------------------------------------------------------------------------------------------");

System.out.println("SNAMES LIST");
System.out.println((li));
System.out.println("If You Want To Update a SName : Enter UPDATE/DONT UPDATE");
Scanner sc3= new Scanner(System.in);
String s3=sc3.nextLine();
s3.toLowerCase();
if(s3.contains("update")) {
	System.out.println("Enter the SName for  remove sname & after update");
	Scanner sc4=new Scanner(System.in);
	System.out.println("enter the name");
	String snameremoved=sc4.nextLine();
	System.out.println("enter the id");
	Scanner sc5=new Scanner(System.in);
	int idremoved=sc5.nextInt();
	
  H1.remove(snameremoved,idremoved);
  System.out.println("removed= "+snameremoved+":"+idremoved);
  System.out.println("enter the SDetails for new student after removed ");
  Scanner sc6=new Scanner (System.in);
  System.out.println("enter the  update studentname");
  String upname= sc6.nextLine();
  System.out.println("enter the id");
  int updateid = sc6.nextInt();
  H1.put(upname, updateid);
  System.out.println("After Updated SNamelist");
  for(Map.Entry<String,Integer> list:H1.entrySet()) {
	  System.out.println(list.getKey()+":"+list.getValue());
  }
}
elseif(s2.matches(".*[^a-zA-Z0-9].*")){
System.out.println("Dont allowed special characters");
}
else {
	System.out.println("Dont Need to Update Now");
}

	}
void delete(String a,int n2) {
	H1.remove(a,n2);
	
}
}
