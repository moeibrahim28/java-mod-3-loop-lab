public class Main {
    public static void main(String[] args) {
        // simulate the passing of time
        int startingYear = 2000;
        int targetYear = 2011;

        whileMethod(startingYear,targetYear);
        forMethod(startingYear,targetYear);
    }

        static void whileMethod(int start, int target){
            int currentYear = start+1;

        while (currentYear < target) {
            int difference=currentYear-start;
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

        static void forMethod(int start, int target){
            for(int currentYear=target-1;currentYear>start;currentYear--){
                int difference=target-currentYear;
                if(difference==1){
                    System.out.println(difference+" year has passed");
                }
                else{
                    System.out.println(difference+" years have passed");
            }
        }
            
        }
        }
    

