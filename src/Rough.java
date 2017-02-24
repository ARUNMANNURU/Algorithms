import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Vector;

/**
 * 
 */

/**
 * @author ArunMannuru
 *
 *Print an NxM matrix with nw-se diagonals starting at bottom left corner. Ex:


1  2  3  4
5  6  7  8
9 10 11 12
 *
 */
public abstract class Rough {

	/**
	 * @param args
	 */
	static{
		System.out.println("Arun");
	}
	public static void main(String[] args){
	
		String str = "Aabcd";
		boolean[] char_set = new boolean[128];
		for(int i=0;i<str.length();i++){
			int val = str.charAt(i);
			if(char_set[val]){
				System.out.println("not");
			}
			char_set[val] = true;
			//System.out.println(val);
			}
		System.out.println("yes");
	} 
}