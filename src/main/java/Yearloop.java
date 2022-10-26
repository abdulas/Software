public class Yearloop {

    public static Boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0){
            System.out.println(year + " true");
            return true;
        }
        else if (year % 400 == 0) {
            System.out.println(year + " true");
            return true;
        }
        else {
            System.out.println(year + " false");
            return false;
        }
    }
}