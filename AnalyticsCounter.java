package HemeBiotech;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnalyticsCounter {
	
	 static File doc = new File ("C://Users/yohan\\Desktop/OPENCLASS/P4_amsellem_yohann/src/HemeBiotech/symptoms.txt");
	    static List<String> list = new ArrayList<String>();
	    static Map<String, Integer> map = new HashMap<String, Integer>();

		 public static void main(String[] args) throws IOException {
		        ReadFile.readFile(doc, list); // Reads and analyzes file.txt
		        Count.countSymptoms(list, map);  // Counts symptom occurrences	
		        PrintNewFile.writeFile(map);    // Sort in natural order and generates a file

	}

}
