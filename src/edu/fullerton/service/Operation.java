package edu.fullerton.service;

import org.json.JSONObject;

public class Operation {
	
	public JSONObject add(double first, double second)
	{
		JSONObject addJson = new JSONObject();
		addJson.put("operation", "add");
		addJson.put("firstNumber", first);
		addJson.put("secondNumber", second);
		addJson.put("result", (first+second));
		return addJson;
	}
	public JSONObject sub(double first, double second)
	{
		JSONObject subJson = new JSONObject();
		subJson.put("operation", "subtract");
		subJson.put("firstNumber", first);
		subJson.put("secondNumber", second);
		subJson.put("result", (first-second));
		return subJson;
	}
	public JSONObject mul(double first, double second)
	{
		JSONObject mulJson = new JSONObject();
		mulJson.put("operation", "multiply");
		mulJson.put("firstNumber", first);
		mulJson.put("secondNumber",second);
		mulJson.put("result", (first*second));
		return mulJson;
	}
	public JSONObject div(double first, double second)
	{
		JSONObject divJson = new JSONObject();
		divJson.put("operation", "divide");
		divJson.put("firstNumber", first);
		divJson.put("secondNumber", second);
		divJson.put("result", (first/second));
		return divJson;
	}
}
