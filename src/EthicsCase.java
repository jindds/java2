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
    
    /**
     * 
     * @param caseTitle
     * @param description
     * @param category 
     */
    public EthicsCase(String caseTitle, String description, String category) {
        this.caseTitle = caseTitle;
        this.description = description;
        this.category = category;
        this.verdict = new Verdict();
    }
    
    /**
     * 
     * @return 
     */
    public String getCaseTitle() {
        return caseTitle;
    }
    
    /**
     * 
     * @return 
     */
    public String getCaseDescription() {
        return description;
    }
    
    /**
     * 
     * @return 
     */
    public String getCategory() {
        return category;
    }
    
    /**
     * 
     * @return 
     */
    public String toString() {
        return caseTitle + " " + description + " " + category + " " + verdict;
    }
}
