import java.util.Scanner;

public class CovaxinVaccine implements DosageDuration,EffectivePercentage{
    int dosagesDurationDays;
    int effectivePercentage;
    Scanner keyboardInput=new Scanner(System.in);

    @Override
    public void setDosageDuration() {
        System.out.println("Enter Covaxin dosages duration ");
        dosagesDurationDays= Integer.parseInt(keyboardInput.nextLine());
    }//end setDosageDuration

    @Override
    public void getDosageDuration() {
        System.out.println("Dosages Duration Days of covaxin :- " +dosagesDurationDays);
    }//end getDosageDuration

    @Override
    public void setEffectivePercentage() {
        System.out.println("Enter Covaxin Effective Percentage ");
        effectivePercentage= Integer.parseInt(keyboardInput.nextLine());
    }//end setEffectivePercentage

    @Override
    public void getEffectivePercentage() {
        System.out.println("Effective Percentage of covaxin :- " +effectivePercentage);
    }//end getEffectivePercentage
}
