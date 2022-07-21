package Mytest.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
//import org.json.JSONArray;
//import org.json.JSONException;
//import org.json.JSONObject;
//import org.json.JSONString;

import org.apache.commons.lang.StringUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class provision {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		
		
		JSONObject data = new JSONObject();
		
		data.put("A", 1);
		data.put("QA", "Tester");
		
		data.put("Location", "Bangalore");
		
		JSONArray arr = new JSONArray();
		arr.add("email:test@qa.com");
		arr.add("firstname: abc");
		arr.add("lastname: def");
		
		data.put("Values", arr);
		
		
		
		ObjectMapper mp = new ObjectMapper();
		
		String request = mp.writerWithDefaultPrettyPrinter().writeValueAsString(data);
		mp.readValue("", provision.class);
		
		
		System.out.println(request);
		
		/*
		 * String str = "AaaBbcCcAaDdef"; // a3b2c3a2d2e1f1 String test
		 * ="loopjavaseleniumjavascriptwebwebdriver";// 2 int count = 0; String sub =
		 * test.substring(26,32);
		 * 
		 * if(sub.contains("web")) { count++; System.out.println("count is "+count); }
		 * 
		 * 
		 */
		/*
		 * String a ="loopjavaseleniumjavascriptwebwebdriver";
		 * 
		 * String b = "web";
		 * 
		 * System.out.println(StringUtils.countMatches(a, b));
		 * 
		 * for (int i = 1; i <= 20; i++) {
		 * 
		 * if (i % 2 == 0 && i % 3 == 0) {
		 * 
		 * System.out.println("webdriver"); }
		 * 
		 * if (i % 2 == 0) { System.out.println("java"); } else if (i % 3 == 0) {
		 * System.out.println("selenium");
		 * 
		 * }else if (i % 2 != 0 && i % 3 != 0) { System.out.println("number " + i); }
		 * 
		 * }
		 */
		// String sub = test.substring(26,32);
		// System.out.println(sub);

		/*
		 * String newstr = str.toLowerCase();
		 * 
		 * char[] ch = newstr.toCharArray();
		 * 
		 * for(int i=0 ; i<ch.length;i++) { for(int j=i+1; j<ch.length; j++) { int count
		 * =0;
		 * 
		 * if(ch[i]==ch[j]) { count++;
		 * 
		 * } } }
		 * 
		 * Map<Character, Integer> mp = new HashMap<Character, Integer>();
		 * 
		 * for (char c : ch) { if (mp.containsKey(c)) { mp.put(c, mp.get(c) + 1); } else
		 * { mp.put(c, 1); } }
		 * 
		 * for (Map.Entry<Character, Integer> m : mp.entrySet()) { if (m.getValue() > 1)
		 * { m.getKey(); m.getValue();
		 * 
		 * System.out.println("values are "+m.getKey()+ m.getValue());
		 * 
		 * } }
		 * 
		 * }
		 */

	}
}
