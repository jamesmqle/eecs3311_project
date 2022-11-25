package DataFetcher.Filters;

import java.time.Year;

public class DateRange extends Filter {

    private Year startYear;
    private Year endYear;

    public DateRange () {
        startYear = Year.now().minusYears(1);
        endYear = Year.now();
    }

    public String getStart() {
        return startYear.toString();
    }
    public void setStart(String year) {
        startYear = Year.parse(year);
    }

    public String getEnd() {
        return endYear.toString();
    }
    public void setEnd(String year) {
        endYear = Year.parse(year);
    }

    public void setRange(String yearStart, String yearEnd) {
        setStart(yearStart);
        setEnd(yearEnd);
    }

    public String toString() {
        return "StartYear: " + startYear + " EndYear: " + endYear;
    }

}
