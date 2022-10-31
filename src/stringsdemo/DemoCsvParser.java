package stringsdemo;

public class DemoCsvParser {

	public static void main(String[] args) {

		String demo = "Spalte1;Spalte2;Spalte3;Spalte4;Spalte5;Spalte6;Spalte7;";
		String demo2 = "Max;Susi;Georg;John;";
		
		CsvParser parser = new CsvParser(demo);
		System.out.println("Count: " + parser.countComma());
		
		String[] result = parser.parse();
		for (String column : result) {
			System.out.println(column);
		}
	}

}
