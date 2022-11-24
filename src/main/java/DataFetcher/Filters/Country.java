package DataFetcher.Filters;

public class Country extends Filter{

    private String countryCode;

    public Country () {
        countryCode = "can";
    }

    public String getCountry() {
        return countryCode;
    }
    public void setCountry(String country) {
        countryCode = country;
    }

    public String toString() {
        return "CountryCode: " + countryCode;
    }

}
