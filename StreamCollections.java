 package Lambdafunction;
 import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class LambdaExpression{
	 public static void main(String args[]) {
HashMap<String,Integer>HP= new HashMap<>();
HP.put("ImranaParvin",18);
HP.put("Mukesh",20);
HP.put("Gowtham",25);
HP.put("MadhuVarshan",23);

ArrayList<String> Friendnames = HP.entrySet()
.stream()
.filter(no -> no.getValue() > 20)
.map(Map.Entry::getKey)
.collect(Collectors.toCollection(ArrayList::new));
System.out.println(Friendnames);

HashSet<String> hs=new HashSet<>();
hs.add("Boomika");
hs.add("Dharshni");
hs.add("Maha");
hs.add("Hema");
hs.add("Hasini");
hs.add("Dharni");
hs.add("Bhanumadhi");
//make a list
List<String> MyclassGirlsNames=hs.stream()
.collect(Collectors.toList());
System.out.println(hs);
//Usegroupby
Map<Character,List<String>>groupbyfirstcharacter=hs.stream()
.collect(Collectors.groupingBy(word->word.charAt(0)));
System.out.println(groupbyfirstcharacter);
}}