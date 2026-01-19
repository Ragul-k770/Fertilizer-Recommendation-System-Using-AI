public class FertilizerRecommendation {

    public String recommendFertilizer(SoilData soil) {

        if (soil.nitrogen < 50) {
            return "Urea";
        } else if (soil.phosphorus < 40) {
            return "DAP";
        } else if (soil.potassium < 40) {
            return "MOP";
        } else {
            return "NPK Fertilizer";
        }
    }
}
