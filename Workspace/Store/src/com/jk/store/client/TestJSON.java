package com.jk.store.client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.jk.store.entity.Product;

public class TestJSON {

	private static ObjectMapper jsonMapper = new ObjectMapper();

	public static void main(String[] args) {

		Product prod = new Product();
		prod.setDescription("Description");
		prod.setId(20l);
		prod.setName("NAME!");
		prod.setPrice(100.01);
		prod.setQuantity(100);
		prod.setRating(5);

		List<Product> prods = new ArrayList<Product>();
		prods.add(prod);
		
		/*List<Long> idArray = new ArrayList<>();
		
		idArray.add(1l);
		
		idArray.add(2l);*/
		
		String jsonValue = getJSONFromJava(prod);

		System.out.println("jsonValue: " + jsonValue);
		
		
		/*List<Long> objFJson = getObjFromJSON(jsonValue, List.class);
		
		System.out.println("JSON TO OBJ: "+ objFJson);*/
		
		//-----------------------
/*		JSONObject json = new JSONObject();
		JSONArray array=new JSONArray();
		
		array.put(1l);
		
		array.put(2l);
		try {
			json.put("LongsArray", array);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(json.toString());*/

	}

	private static <T> String getJSONFromJava(T obj) {
		String jsonValue = null;
		try {
			jsonValue = jsonMapper.writeValueAsString(obj);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return jsonValue;
	}

	private static <T> T getObjFromJSON(String jsonStrg, Class<T> t) {
		T obj = null;
		try {
			obj = jsonMapper.readValue(jsonStrg, t);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}
}
