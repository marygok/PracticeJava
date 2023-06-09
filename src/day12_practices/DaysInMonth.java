package day12_practices;

public class DaysInMonth {

    public static void main(String[] args) {

        numberOfDays("June");


    }


    public static void numberOfDays(String month) {
        month = ("" + month.charAt(0)).toUpperCase() + month.substring(1);

        switch (month) {
            case "February":
                month += 28 + " days";
                break;

            case "April":
            case "June":
            case "September":
            case "November":
                month += 30 + " days";
                break;

            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                month += 31 + " days";
                break;

            default:
                month = "Invalid month";
        }

        System.out.println(month);

    }

}

