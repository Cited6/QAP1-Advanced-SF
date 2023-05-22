public class TestDate {
    public static void main(String[] args) {
        Date date = new Date(21,5,2023);

        //Display first date

        System.out.println("First Date:" + date.toString());


        //Update Date

    date.setDay(22);
    date.setMonth(5);
    date.setYear(2023);

    //Display new date
    System.out.println("Updated Date: " +date.toString());
    

    }
    
}
