package com;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author 
 *
 */
public class Snippet {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> hm = new HashMap<String, Integer>();
		while (sc.hasNext()) {
			String input = sc.nextLine();
			String inputArr[] = input.split(",");
			for (int i = 0; i < inputArr.length; i++) {
	            if (!hm.containsKey(inputArr[i])) {
	                hm.put(inputArr[i], 1);
	            } else {
	                hm.put(inputArr[i], (Integer) hm.get(inputArr[i]) + 1);
	            }
	        }
			for (String keyValue : hm.keySet()) {
				System.out.println(keyValue + "-" + hm.get(keyValue));
			}
			break;
		}
	}
}

