/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 348337643
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        PrivacyCase privacyCase = new PrivacyCase("Data Leak Case", "Company exposed user emails publicly.", "Personal Data");
        privacyCase.verdict = new Verdict("Data Leak Case", "Unethical", "User data was shared without consent.");
        
        IntellectualPropertyCase IPCase = new IntellectualPropertyCase("Data Leak Case", "Company exposed user emails publicly.", "Personal Data");
        IPCase.verdict = new Verdict("Data Leak Case", "Unethical", "User data was shared without consent.");
        
        System.out.println(privacyCase);
        System.out.println(IPCase);
        
    }
}
