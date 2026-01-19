public class Main {
    public static void main(String[] args) {

        SoilData soil = new SoilData(40, 35, 30, 6.7, "Rice");

        FertilizerRecommendation fr = new FertilizerRecommendation();
        String result = fr.recommendFertilizer(soil);

        System.out.println("Recommended Fertilizer: " + result);
    }
}
