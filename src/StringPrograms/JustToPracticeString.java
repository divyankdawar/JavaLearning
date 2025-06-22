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

	public static void main(String args[])  {
		
            int a[] = {5,6,7,8,9,71,1,3};
            int temp;
            for(int i=0;i<a.length;i++) {
            	for(int j=i+1;j<a.length;j++) {
            		if(a[i]<a[j]) {
            			temp = a[i];
            			a[i] = a[j];
            			a[j] = temp;
                 
            		}
            	}
            }
            
           System.out.println("Second largest element is " + a[1]);             
	}
}












