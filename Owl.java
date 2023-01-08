import java.util.Scanner;
public class Owl {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to owl!!");
        System.out.println("What health problem do you have?");
        System.out.println("Press A for Headache");
        System.out.println("Press B for stomache");
        System.out.println("Press C for fever and cold");
        
        
        String option = scan.nextLine();

        switch(option){
            case ("A"): System.out.println("Chemical activity in your brain, the nerves or blood vessels surrounding your skull, or the muscles of your head and neck (or some combination of these factors) can play a role in primary headaches. Some people may also carry genes that make them more likely to develop such headaches.");
                        System.out.println("\n If you are taking a lot of stress or are in continuous work load we would suggest you to take a break from work and have good sleep");
                        System.out.println("If you have not taken any STRESS and still are having headaches it could be a form of migraine ");
                        System.out.println("So the best solution for this would be Asprin or Paracetamol");
                        System.out.println("If your problem persists I suggest you visit a professional Doctor cause it could be a very serious condition in some case");break;

            case ("B"): System.out.println("Many things can cause stomach pain, including digestion issues, injuries, infections, or disease. But it’s important to understand that the discomfort you feel is not necessarily an indication of how serious the cause. Some temporary conditions can be intense, and some life-threatening ones may feel mild.");
                        System.out.println("\n In many cases stomach ache can be caused by LACTOSE INTOLARANCE, the best way to deal with it is to limit consumption of dairy products and avoid fast food ,and eat lactose free products");
                        System.out.println("It could also be caused by food posionning which happens due to regular intake of outside food");
                        System.out.println("To cure this you have simply eat only when you feel like it and can also take medicines such as loperamide link");
                        System.out.println("If your problem persists I suggest you visit a professional Doctor cause it could be a very serious condition in some case");break;

            case ("C"): System.out.println("\n Although many types of viruses can cause a common cold, rhinoviruses are the most common cause. A cold virus enters your body through your mouth, eyes or nose.");
                        System.out.println(" To heal fast best remedy is to stay in bed and rest and to take medicine such as Benadryl");
                        System.out.println("If your problem persists I suggest you visit a professional Doctor cause it could be a very serious condition in some case");break;
             
            default : System.out.println("Invalid option :(");              
                    }

     scan.close();
    }
}