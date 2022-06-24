package com.anil.automation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class WriteJson {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * try { FileWriter file = new
		 * FileWriter("C:\\\\JavaProject\\\\Automation\\\\data\\\\SampleWrite.json");
		 * file.write(jsonWrite().toJSONString()); file.flush(); file.close();
		 * 
		 * } catch (IOException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */

		JSONParser parser = new JSONParser();

		try {
			FileReader fir = new FileReader("C:\\JavaProject\\Automation\\data\\SampleWrite.json");

			Object obj = parser.parse(fir);

			JSONArray jsonarr = (JSONArray) obj;

			System.out.println(jsonarr);

			jsonarr.forEach(emp -> parseJson((JSONObject) emp));

		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@SuppressWarnings("unchecked")
	public static JSONArray jsonWrite() {
		JSONObject employeedetails = new JSONObject();
		employeedetails.put("Name", "Anil");
		employeedetails.put("EmpID", 1234);

		JSONObject employee = new JSONObject();
		employee.put("employee", employeedetails);

		JSONObject employeedetails2 = new JSONObject();
		employeedetails2.put("Name", "Sunil");
		employeedetails2.put("EmpID", 5678);

		JSONObject employee2 = new JSONObject();
		employee2.put("employee", employeedetails2);

		JSONArray jsonarr = new JSONArray();
		jsonarr.add(employee);
		jsonarr.add(employee2);

		return jsonarr;
	}

	public static void parseJson(JSONObject Obj) {

		JSONObject emp = (JSONObject) Obj.get("employee");

		String name = (String) emp.get("Name");
		System.out.print(name + "\t\t\t");

		long empId = (long) emp.get("EmpID");
		System.out.println(empId);

	}

}
