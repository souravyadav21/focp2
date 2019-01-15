import java.util.Scanner;
public class check_letters
{
public static void main(String args[]) {
Scanner input=new Scanner(System.in);

System.out.println("Input an alphabet: ");
String x = input.next().toLowerCase();

if ((x.length() > 1) || (!Character.isAlphabetic(x.charAt(0)))) {
System.err.println("Only letters allowed");
} else {
if ((x.charAt(0) == 'a') || (x.charAt(0) == 'e') || (x.charAt(0) == 'i')
|| (x.charAt(0) == 'o') || (x.charAt(0) == 'u')) {
System.out.println("Input letter is a Vowel");
} else {
System.orsut.println("Input letter is a Consonant");
}
}
}
}