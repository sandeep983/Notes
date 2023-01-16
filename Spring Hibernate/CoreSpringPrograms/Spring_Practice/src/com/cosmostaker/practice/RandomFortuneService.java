package com.cosmostaker.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements IFortuneService {
	private static ArrayList<String> fortuneList = new ArrayList<>();

	// To retrieve the Fortunes from the File
    private static ArrayList<String> getFortuneFromFile() {
        try {
            File f1 = new File("src/fortune.txt");
            Scanner sc = new Scanner(f1);

            while(sc.hasNextLine()) {
                String fileData = sc.nextLine();
                fortuneList.add(fileData);
            }
            sc.close();
        }
        catch(FileNotFoundException e) {
            System.out.println("Error: FileNotFound");
            e.printStackTrace();
        }

		return fortuneList;
    }

	// To get the random fortune from the ArrayList of fortunes
	public static String getRandom(ArrayList<String> list) {
		int rnd = new Random().nextInt(list.size());
		return list.get(rnd);
	}

	@Override
	public String getDailyFortune() {
		return getRandom(getFortuneFromFile());
	}
}
