public class Main {
    public static void main(String[] args) {
        // simulate the passing of time
        int startingYear = 2000;
        int targetYear = 2011;
        int currentYear = startingYear+1;

        while (currentYear < targetYear) {
            int difference=currentYear-startingYear;
            if(difference==1){
                System.out.println(difference + " year has passed");
            }
            else{
                System.out.println(difference+ " years have passed");
            }
            // conditional logic based on the current year
            currentYear++;
        }
    }
}
