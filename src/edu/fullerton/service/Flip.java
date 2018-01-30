package edu.fullerton.service;

import java.util.Scanner;

import org.json.JSONObject;

public class Flip {

	public static void main(String args[])
	{
		int count =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value");
		count =  sc.nextInt();
	}
	
	public JSONObject flipCoin(int flips)
	{
		StringBuffer outputBuff = new StringBuffer();
		JSONObject outputJson = new JSONObject();
		for(int i=0;i<flips;i++)
		{
			double val = Math.random();
			if(val<0.5)
				outputBuff.append("H");
			else
				outputBuff.append("T");
		}
		outputJson.put("flips",flips);
		outputJson.put("coins", outputBuff.toString());
		return outputJson;
	}
}
