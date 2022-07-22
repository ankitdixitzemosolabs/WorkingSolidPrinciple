import java.util.Scanner;

public class WorkingSolidPrinciple {
    public static void main(String[] args) {
        String registrationType;
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("If you want to enter user details , \n enter \'user\' otherwise enter \'company\' or \'knownVaccine\'");
        registrationType=keyboardInput.nextLine();
        switch (registrationType){
            case "user":
                UserDetailsWithAddress user =new UserDetailsWithAddress();
                user.setDetails();
                user.setUserAdress();
                user.getDetails();
                user.getUserAdress();
                ApplyForVaccine applyForVaccine= new ApplyForVaccine(user.getAge());
                applyForVaccine.applyForVaccination();
                break;
            case "company":
                AllVaccineDetails allVaccineDetails=new AllVaccineDetails();
                allVaccineDetails.setVaccineDetails();
                allVaccineDetails.getVaccineDetails();
                break;
            case "knownVaccine":
                CovaxinVaccine covaxinVaccine=new CovaxinVaccine();
                CovisheildVaccine covisheildVaccine=new CovisheildVaccine();
                covaxinVaccine.setDosageDuration();
                covaxinVaccine.setEffectivePercentage();
                covisheildVaccine.setDosageDuration();
                covisheildVaccine.setEffectivePercentage();
                covaxinVaccine.getDosageDuration();
                covaxinVaccine.getEffectivePercentage();
                covisheildVaccine.getDosageDuration();
                covisheildVaccine.getEffectivePercentage();
                break;
            default:
                System.out.println("wrong choice");
        }//end switch
    }//end main


}
