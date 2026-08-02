package GOKU;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class oop {
	HashMap<String,Integer> H1= new HashMap<>();
	String s2;
void hash(){
	System.out.println("Student CRUD Operations");	
	List<String> li=new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	Scanner sc1=new Scanner(System.in);
try {
	System.out.println("Enter the numbers for how many studentdetails do you add");
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
}
else {
System.out.println("Stores Details Successfully");
}
System.out.println("-----------------------------------------------------------------------------------------------------");
System.out.println("SNAMES LIST");
System.out.println((li));
System.out.println("If You Want To Update a SName : Enter yes/no");
Scanner sc3= new Scanner(System.in);
String s3=sc3.nextLine();
s3.toLowerCase();
if(s3.contains("yes")) {
	System.out.println("Enter the SName for  remove from file & after update");
	Scanner sc4=new Scanner(System.in);
	System.out.println("enter the name");
	String snameremoved=sc4.nextLine();
	System.out.println("enter the id");
	Scanner sc5=new Scanner(System.in);
	int idremoved=sc5.nextInt();
	
  H1.remove(snameremoved,idremoved);
  li.remove(snameremoved);
  System.out.println("removed= "+snameremoved+":"+idremoved);
  System.out.println("enter the SDetails for new student after removed old details ");
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
else {
	System.out.println("Dont Need to Update Now");
}
}catch(InputMismatchException e) {
		System.out.println("Invalid input: please enter the expected data type (e.g. a number where a number is required");
}catch(NoSuchElementException d) {
		System.out.println("Input ended unexpectedly. Please provide all required values.");
}catch(Exception e) {
		System.out.println("An unexpected error occurred: " + e.getMessage());
}
}
void delete(String a,int n2) {
	try {
		H1.remove(a,n2);
}catch(Exception e) {
		System.out.println("Error while deleting: " + e.getMessage());
}
}
void filewrite() {
try{
		File f= new File("E:\\Gokul\\gokufilehandle\\gokusproject.txt");
		
if(f.exists()) {
		f.createNewFile();
		System.out.println("file created");		
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(f))){
		for(Map.Entry<String,Integer> storelist:H1.entrySet()) {
			bw.write(storelist.getKey()+":"+storelist.getValue());
			bw.newLine();
}
	bw.flush();
try(BufferedReader br = new BufferedReader(new FileReader(f))){
String receiving ;
while((receiving=br.readLine())!=null) {
System.out.println(receiving);

}
}
}
}
}
catch(IOException e) {
System.out.println("some errors");
}
}
}
 








