public class ConverterTest {
    public static void main(String[] args) {
        ScaleConverter englishToMetric = new EnglishToMetricConverter();
        ScaleConverter metricToEnglish = new MetricToEnglishConverter();

        System.out.println("English to Metric:");
        System.out.println("104F to C: " + englishToMetric.convertTemperature(104));
        System.out.println("10mi to M: " + englishToMetric.convertDistance(10));
        System.out.println("25lbs to Kg : " + englishToMetric.convertWeight(25));

        System.out.println("Metric to English");
        System.out.println("32C to F: " + metricToEnglish.convertTemperature(32));
        System.out.println("45M to Mi: " + metricToEnglish.convertDistance(45));
        System.out.println("10Kg to lbs : " + metricToEnglish.convertWeight(10));
    }
}
