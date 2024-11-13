class MetricToEnglishConverter implements ScaleConverter {

    public double convertTemperature(double tempIn) {
        return tempIn * 9/5 + 32;
    }
    public double convertDistance(double distanceIn) {
        return distanceIn * 0.621371;
    }
    public double convertWeight (double weightIn) {
        return weightIn * 2.2;
    }
}
