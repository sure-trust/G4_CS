import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MaceCodeEncodeAndDecode {

	static HashMap<String, String> morce = new HashMap<>();
	static {
		morce.put(".-", "A");
		morce.put("-...", "B");
		morce.put("-.-.", "C");
		morce.put("-..", "D");
		morce.put(".", "E");
		morce.put("..-.", "F");
		morce.put("--.", "G");
		morce.put("....", "H");
		morce.put("..", "I");
		morce.put(".---", "J");
		morce.put("-.-", "K");
		morce.put(".-..", "L");
		morce.put("--", "M");
		morce.put("-.", "N");
		morce.put("---", "O");
		morce.put(".--.", "P");
		morce.put("--.-", "Q");
		morce.put(".-.", "R");
		morce.put("...", "S");
		morce.put("-", "T");
		morce.put("..-", "U");
		morce.put("...-", "V");
		morce.put(".--", "W");
		morce.put("-..-", "X");
		morce.put("-.--", "Y");
		morce.put("--..", "Z");
		morce.put(".----", "1");
		morce.put("..---", "2");
		morce.put("...--", "3");
		morce.put("....-", "4");
		morce.put(".....", "5");
		morce.put("-....", "6");
		morce.put("--...", "7");
		morce.put("---..", "8");
		morce.put("----.", "9");
		morce.put("-----", "0");
		morce.put( "..--..","?");
		morce.put("-.-.--","!");
		morce.put(".-.-.-",".");
		morce.put( "--..--",",");
		morce.put( "-.-.-.",";");
		morce.put( "---...",":");
		morce.put(".-.-.","+");
		morce.put( "-....-","-");
		morce.put( "-..-.","/");
		morce.put( "-...-","=");
		morce.put(".-.-.", "@");
		morce.put(".....-...", "#");
		morce.put(".-..-..-.", "$");
		morce.put("..---.--", "%");
		morce.put("..-.--..", "^");
		morce.put(".--.-.", "&");
		morce.put("...-.-.-.","*");
		morce.put("-.-..-..---.....----", "(");
		morce.put("-.-..-..---......---", ")");
		morce.put("..--.-..---", "_");
		morce.put("-.-...-.-..-..-.--.----", "{");
		morce.put("-.-...-.-..-..-.--..---", "}");
		morce.put("...--.-.-.", "[");
		morce.put("...--.-.-.---", "]");
		morce.put(".--....--..", "|");
		morce.put(".-.........", "<");
		morce.put("--..-- ..-.", ">");
		morce.put(null, null);
		
	//	System.out.println(" static "+ morce.size()+ " "+(13-59));
	}

	static HashMap<String, String> morceD = new HashMap<>();

	static {
		for (Map.Entry m : morce.entrySet()) {
			morceD.put((String) (m.getValue()), (String) m.getKey());
		}
	}

	public static void main(String[] args) {
		String s = "gater";
		String o = "";
		o = encode(s);
		System.out.println(o);
		System.out.println(decode(o));
	}

	static String encode(String s) {
		String o = "";
		s=s.toUpperCase();
		for (char c : s.toCharArray()) {
			if (c == ' ')
				o += "/ ";
			else 
				o += morceD.get(c + "")+" ";
		}
		return o;
	}

	public static String decode(String s) {
		String s1[] = s.split(" ");
		String Decode="";
		for (int i = 0; i < s1.length; i++) {
			String c = s1[i];
			if (c.equals("/")) {
				Decode+=" ";
				System.out.print(" ");
			} else {
				Decode+=morce.get(c);
			}
		}
		return Decode;
	}
}


///////////////////////another class
package morceCodeGenerater;

import java.util.Scanner;

public class EncryptProject extends MaceCodeEncodeAndDecode {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter shifter value in integer");
int n=sc.nextInt();
sc.nextLine();
System.out.println("enter text");
String s=sc.nextLine().toUpperCase();
String enc = shiftMyTextBy(n,s);
//System.out.println("enc valie "+enc+" ");
String enc2=encode(enc);
System.out.println("encyprected text is "+enc2);
String o=decrpytMyText(enc,n);
System.out.println("decypricted text is "+ o);
}

private static String decrpytMyText(String s, int n) {
String out="";
n=(n%26);
n=26-n;
for(int i=0;i<s.length();i++) {
if(s.charAt(i)>='A' && s.charAt(i)<='Z')
out+=((char)((((s.charAt(i)-65)+n)%26)+65));
else
out+=s.charAt(i);
}
return out;
}

private static String shiftMyTextBy(int n, String s) {
// System.out.println((char)((('A'-65+4)%26)+65));
n=(n%26);
String out="";
for(int i=0;i<s.length();i++) {
if(s.charAt(i)>='A' && s.charAt(i)<='Z')
out+=((char)((((s.charAt(i)-65)+n)%26)+65));
else
out+=s.charAt(i);
}
return out;
}

}