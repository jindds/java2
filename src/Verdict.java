/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 348337643
 */
public class Verdict {
    private String caseTitle;
    private String studentVerdict;
    private String reason;
    
    /**
     * 
     */
    public Verdict() {
        caseTitle = "";
        studentVerdict = "";
        reason = "";
    }
    
    /**
     * 
     * @param caseTitle
     * @param verdict
     * @param reason 
     */
    public Verdict(String caseTitle, String verdict, String reason) {
        this.caseTitle = caseTitle;
        studentVerdict = verdict;
        this.reason = reason;
    }
    
    /**
     * 
     * @param title 
     */
    public void setCaseTitle(String title) {
        caseTitle = title;
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
     * @param reason 
     */
    public void setReason(String reason) {
        this.reason = reason;
    }
    
    /**
     * 
     * @return 
     */
    public String getReason() {
        return reason;
    }
    
    /**
     * 
     * @param verdict 
     */
    public void setStudentVerdict(String verdict) {
        studentVerdict = verdict;
    }
    
    /**
     * 
     * @return 
     */
    public String getStudentVerdict() {
        return studentVerdict;
    }
    
    /**
     * 
     * @return 
     */
    public String toString() {
        return caseTitle + " " + studentVerdict + " " + reason;
    }
}
