package edu.cmu.Weather;

public class Weather {
    private WeatherService weatherService;
    private LengthScale lengthScale;

    /**
     * Sets the length scale for rainfall.
     *
     * @param lengthScale the scale to use for rainfall, either INCHES or MILLIMETERS.
     */
    public void setLengthScale(LengthScale lengthScale) {
        this.lengthScale = lengthScale;
    }

    /**
     * Retrieves the rainfall measurement over the last 24 hours from the weather service in the preferred scale.
     * 
     * @return the rainfall amount. If the scale is inches, it converts to inches, otherwise returns in millimeters.
     */
    public double getRainfall() {
        double wsRainfall = weatherService.getRainfall();
        return convertRainfall(wsRainfall, lengthScale);
    }

    /**
     * Converts the rainfall value to the desired length scale.
     *
     * @param rainfall the original rainfall value in millimeters.
     * @param scale the length scale to convert to.
     * @return the rainfall value in the desired length scale.
     */
    private double convertRainfall(double rainfall, LengthScale scale) {
        if (scale == LengthScale.INCHES) {
            return rainfall / 25.4;  // Convert from millimeters to inches
        } else {
            return rainfall;  // Already in millimeters, no conversion needed
        }
    }
}