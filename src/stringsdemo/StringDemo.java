package stringsdemo;

public class StringDemo {

	public static void main(String[] args) {

		String text = "Java ist cool und Übungsblatt bald zu Ende!";
		String result = "";
		
		for (int i = 0; i < text.length(); i++)
		{
			char c = text.charAt(i);
			// ihre if-abfrage
			if (i == 0 || text.charAt(i - 1) == ' ')
			{
				c = Character.toUpperCase(c);
			}
			
			result = result + c;
			System.out.println(result); // gerne auch auskommentieren
		}
		
		System.out.println("Ausgangstext: " + text);
		System.out.println("Ergebnis: " + result);
	}

}
