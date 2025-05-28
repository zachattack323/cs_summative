
public class dateConverter {
    public static String convert(double date) {
        String dateString = String.valueOf((int) date);
        String year = dateString.substring(0, 4);
        int month = Integer.parseInt(dateString.substring(4, 6));
        String monthString = "";
        String day = dateString.substring(6, 8);
        if (month == 1) {
            monthString = "January";
        } if (month == 2) {
            monthString = "February";
        } if (month == 3) {
            monthString = "March";
        } if (month == 4) {
            monthString = "April";
        } if (month == 5) {
            monthString = "May";
        } if (month == 6) {
            monthString = "June";
        } if (month == 7) {
            monthString = "July";
        } if (month == 8) {
            monthString = "August";
        } if (month == 9) {
            monthString = "September";
        } if (month == 10) {
            monthString = "October";
        } if (month == 11) {
            monthString = "November";
        } if (month == 12) {
            monthString = "December";
        }
         return monthString + " " + day + ", " + year;

    }
}