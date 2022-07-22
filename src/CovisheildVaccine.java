import java.util.Scanner;

public class CovisheildVaccine implements DosageDuration,EffectivePercentage{
    int dosagesDurationDays;
    int effectivePercentage;
    Scanner keyboardInput=new Scanner(System.in);

    @Override
    public void setDosageDuration() {
        System.out.println("Enter Covisheild dosages duration ");
        dosagesDurationDays= Integer.parseInt(keyboardInput.nextLine());
    }//end setDosageDuration

    @Override
    public void getDosageDuration() {
        System.out.println("Dosages Duration Days of Covisheild :- " +dosagesDurationDays);
    }//end getDosageDuration

    @Override
    public void setEffectivePercentage() {
        System.out.println("Enter Covisheild Effective Percentage ");
        effectivePercentage= Integer.parseInt(keyboardInput.nextLine());
    }//end setEffectivePercentage

    @Override
    public void getEffectivePercentage() {
        System.out.println("Effective Percentage of Covisheild :- " +effectivePercentage);
    }//end getEffectivePercentage
}
