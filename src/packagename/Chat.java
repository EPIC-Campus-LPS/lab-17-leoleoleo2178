package packagename;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
public class Chat {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> list = new ArrayList<>();
		
		
		String in = "";
		
		while(!(in.equals("STOP"))) {
			System.out.println("Item: ");
			in = scanner.nextLine();
			if(!(in.equals("STOP"))) {
				String[] words = in.split(" ");
				
				for(int i = 0; i < words.length; i++) {
					list.add(words[i]);
				}
			}
		}
		
		Set<String> unique = new HashSet<>(list);
		
		int total = list.size();
        int unq = unique.size();
        
        int the = 0;
        int lng = 0;
        String lngpos = "";
        boolean up = false;
        
        for(int i = 0; i < list.size(); i++) {
        	if(list.get(i).equals("the")) {
        		the++;
        	}
        	if(list.get(i).length() > lng) {
        		lng = list.get(i).length();
        		
        		lngpos = list.get(i);
        	}
        	
        	for(char c: list.get(i).toCharArray()) {
        		if(Character.isUpperCase(c)) {
        			up = true;
        		}
        	}
        	
        }
        
        System.out.println("The chat is " + total + " words long." + "\nit has unique " + unq + " words" + "\nthe word the appears " + the + " times" + "\nThe longest word is " + lngpos + "\nit has upper case " + up);

	}

}
