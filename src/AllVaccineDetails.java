import java.util.ArrayList;
import java.util.Scanner;

public class AllVaccineDetails {
    Scanner keyBoardInput= new Scanner(System.in);

    ArrayList<Vaccine> vacineList= new ArrayList<>();
    void setVaccineDetails(){
        Vaccine vaccine=new Vaccine();
        System.out.println("Enter name of vaccine or press enter to moveout");
        vaccine.vacineName = keyBoardInput.nextLine();

        if(vaccine.vacineName.equals(""))
        {
            return;
        }
        System.out.println("Enter effective percentage of vaccine should be more than 97 to meet criteria");
        vaccine.effectivePercentage = Integer.parseInt(keyBoardInput.nextLine());
        System.out.println("Enter doses duration  of vaccine should be less than 91 to meet criteria");
        vaccine.doseDurationInDays = Integer.parseInt(keyBoardInput.nextLine());

        if(vaccine.effectivePercentage>=98 && vaccine.doseDurationInDays<=90)
        {
            vacineList.add(vaccine);
            System.out.println("vaccine is successfully registered meet all Criteria");
            setVaccineDetails();
        }else{
            System.out.println("vaccine is not successfully registered");
        }
    }//end setVaccineDetails
    void getVaccineDetails(){
        for (int i = 0; i < vacineList.size(); i++) {
            System.out.println((i+1)+". Vaccine details are below :-");
            System.out.println("Vaccine Name :- "+vacineList.get(i).vacineName + " " );
            System.out.println("Effective Percentage :- "+vacineList.get(i).effectivePercentage + " ");
            System.out.println("Dose Duration In Days :- "+vacineList.get(i).doseDurationInDays + " ");
        }
    }//end getVaccineDetails
}
