import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.sql.*;
public class VaccineMain {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to COVID vaccine Database system");
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            System.out.println("-------------***-------------");
            System.out.println("Press 1 to enter new covid cases");
            System.out.println("Press 2 to delete Vaccination Information");
            System.out.println("Press 3 to check your vaccine status");
            System.out.println("Press 4 to get vaccination information ");
            System.out.println("Press 5 to exit");
            int btn = sc.nextInt();
            if(btn == 1){
                System.out.println("Please enter NID");
                int nid = sc.nextInt();
                System.out.println("Please Enter Your Name mentioned as NID");
                String name = br.readLine();
                System.out.println("Please enter your Gender(Male/Female/Other)");
                String gender = br.readLine();
                System.out.println("Please enter your Age as NID");
                int age = sc.nextInt();
                VaccineData vc = new VaccineData(nid,name,gender,age);
                boolean ans = VaccineDAO.insertData(vc);
                if(ans){
                    System.out.println("Your information is stored");
                }else{
                    System.out.println("Please try again later");
                }

            }
            else if (btn == 2){
                System.out.println("Enter NID to delete");
                int i = sc.nextInt();
                boolean t = VaccineDAO.rmvData(i);
                if(t){
                    System.out.println("Information Removed");
                }else {
                    System.out.println("Something wrong try again");
                }

            }
            else if (btn == 3){
                System.out.println("Please enter Your NID Number According to your NID card to see Your Information");
                int i = sc.nextInt();
                VaccineDAO.getInfo(i);


            }
            else if (btn == 4){
                System.out.println("Showing Information");
                VaccineDAO.checkInfo();
                System.out.println("**************************************************************");

            }
            else if(btn==5){
                System.out.println("Thank you for visiting our website");
                break;
            }
            else {
                System.out.println("Wrong value inserted Please try again");
            }
        }
    }
}
