package mapper;

import net.sf.json.JSONObject;

public class JsonTest {

	public static void main(String[] args) {
		String json = "{\"name\":\"reiz\"}";
		JSONObject jsonObj = JSONObject.fromObject(json);
		  String name = jsonObj.getString("name");
		  System.out.println(name);
	}
}
