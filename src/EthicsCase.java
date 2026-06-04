/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 348337643
 */
public class EthicsCase {
    private String caseTitle;
    private String description;
    private String category;
    public Verdict verdict;
    private static int count = 0;
    public static final int MAX_CASES = 8;
    
    /**
     * 
     * @param caseTitle title of case
     * @param description description of case
     * @param category category of case
     */
    public EthicsCase(String caseTitle, String description, String category) {
        this.caseTitle = caseTitle;
        this.description = description;
        this.category = category;
        this.verdict = new Verdict();
        count++;
    }
    
    /**
     * 
     * @return string title of case
     */
    public String getCaseTitle() {
        return caseTitle;
    }
    
    /**
     * 
     * @return string description of case
     */
    public String getCaseDescription() {
        return description;
    }
    
    /**
     * 
     * @return string category of case
     */
    public String getCategory() {
        return category;
    }
    
    /**
     * 
     * @return static int count
     */
    public static int getCountCases() {
        return count;
    }
    
    /**
     * 
     * @return string sentence
     */
    public String toString() {
        return caseTitle + " " + description + " " + category + " " + verdict;
    }
}
