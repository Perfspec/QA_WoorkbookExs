package com.qa.GoldilocksBearNecessities;

public class App {

	static int goldilocksWeight = 100;
	static int maximumPorridgeTemp = 80;
	static int minLighting = 70;
	
	

	public static void main(String[] args) {

		
		
		int[][] arrayOfEverything = {

				{ 100, 120, 0}, 
				{ 297, 90, 54 },
				{ 66, 110, 78 },
				{ 257, 113, 98 },
				{ 276, 191, 12 },
				{ 280, 129, 22 },
				{ 219, 163, 12 },
				{ 254, 193, 45 },
				{ 86, 153, 65 },
				{ 206, 107, 71 },
				{ 71, 137, 87 },
				{ 94, 40, 98 },
				{ 238, 127, 45 },
				{ 52, 146, 98 },
				{ 129, 197, 10 },
				{ 144, 59, 100 },
				{ 157, 124, 12 },
				{ 210, 59, 54 },
				{ 110, 54, 98 },
				{ 268, 119, 87 },
				{ 261, 121, 32 },
				{ 12, 189, 65 },
				{ 186, 108, 97 },
				{ 174, 21, 64 },
				{ 112, 18, 31 },
				{ 54, 90, 54 },
				{ 174, 52, 65 },
				{ 16, 129, 87 },
				{ 59, 181, 98 },				
				{ 290, 123, 65},
				{ 248, 132, 21 }
				};

	//	System.out.println(arrayOfEverything.length);

		for (int i = 0; i <= arrayOfEverything.length - 1; i++) {

			checkWeightandPorridgeTemp(arrayOfEverything[i][0], arrayOfEverything[i][1], arrayOfEverything[i][2],  i + 1);

		}
	}

	public static void checkWeightandPorridgeTemp(Integer chairCapacity, Integer porridgeTemp, Integer lighting , Integer counter) {
		if (goldilocksWeight <= chairCapacity && maximumPorridgeTemp >= porridgeTemp && lighting >= minLighting) {

			System.out.println(counter.toString() + " ");

		}

	}
}
