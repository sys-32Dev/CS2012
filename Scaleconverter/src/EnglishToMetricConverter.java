class EnglishToMetricConverter implements ScaleConverter {

    public double convertTemperature(double tempIn) {
        return (tempIn - 32) * 5/9;
    }
    public double convertDistance(double distanceIn) {
        return distanceIn * 1.609;
    }
    public double convertWeight (double weightIn) {
        return weightIn / 2.2;
    }
}
