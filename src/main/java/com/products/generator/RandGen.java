package com.products.generator;

import java.util.Random;

public class RandGen {
	
	public static int generate() {
		Random r = new Random();
		int low = 10;
		int high = 100;
		int result = r.nextInt(high-low) + low;
		return result;
	}

}
