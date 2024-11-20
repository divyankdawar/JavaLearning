package StringPrograms;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;


class JustToPracticeString {
	public static void main(String args[]) {
		String input = "My Name is Divyank";
		String words[] = input.split(" ");
		
		StringBuilder reversedString = new StringBuilder();
		for(String word : words) {
			reversedString.append(new StringBuilder(word).reverse()).append(" ");
			
		}
		
		String result = reversedString.toString().trim();
		System.out.println(result);
	}
}















