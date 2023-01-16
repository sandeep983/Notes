package com.cosmostaker.sdi;

import java.util.Random;

public class RandomFortuneService implements IFortuneService {
	private String[] array = {"A fresh start will put you on your way", "A good time to finish up old tasks", "A smooth long journey! Great expectations"};
	
	public static String getRandom(String[] array) {
	    int rnd = new Random().nextInt(array.length);
	    return array[rnd];
	}
	
	@Override
	public String getFortune() {
		return getRandom(array);
	}
}
