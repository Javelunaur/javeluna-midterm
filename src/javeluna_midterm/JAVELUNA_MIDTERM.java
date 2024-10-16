package javeluna_midterm;
import java.util.*;

public class JAVELUNA_MIDTERM {

    public static void main(String[] args) {
     Scanner s = new Scanner (System.in);
        System.out.println("[1] ADD \n [2] VIEW \n [3] UPDATE \n [4] DELETE \n");
        System.out.print("Choose an action: ");
        int act=s.nextInt();
        
        JAVELUNA_MIDTERM go = new JAVELUNA_MIDTERM();
        config conf = new config();
        do{
            switch (act){
       
            case 1: go.addp();  //add
                    break;
            case 2 : go.viewp(); //view
                    break;
            case 3: go.upd();
                    break;
            case 4: go.del();
                    break;
            case 5: System.out.println("Program Closed.");
             
            }
        }while (act > 5);
        }
        
        private void addp(){
        Scanner sc = new Scanner(System.in);
        config conf = new config();
        System.out.print("Patient ID: ");
        int pid = sc.nextInt();
        System.out.print("Firt Name: ");
        String fn=sc.next();
        System.out.print("Last Name: ");
        String ln = sc.next();
        System.out.print("Date of Birth: ");
        String birth = sc.next();
        System.out.print("Phone Number: ");
        String num = sc.next();
         System.out.print("Address: ");
         String add=sc.next();

        String sql = "INSERT INTO patient (pid, fn, ln, birth, con, address) VALUES (?, ?, ?, ?, ?, ?)";


        conf.addRecord(sql, pid, fn, ln, birth, num, add);
        }
        
        private void viewp() {
        config conf = new config();
        String votersQuery = "SELECT * FROM patient";
        String[] votersHeaders = {"pid", "fn", "ln", "birth", "con", "address"};
        String[] votersColumns = {"id", "name", "last name", "birthdate", "email", "status"};

        conf.viewRecords(votersQuery, votersHeaders, votersColumns);
    }
        
        
}
        



    
    
