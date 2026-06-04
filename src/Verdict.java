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

    public Verdict() {
        caseTitle = "";
        studentVerdict = "";
        reason = "";
    }
    
    /**
     * 
     * @param caseTitle title of case
     * @param verdict verdict of case
     * @param reason reason of verdict
     */
    public Verdict(String caseTitle, String verdict, String reason) {
        this.caseTitle = caseTitle;
        studentVerdict = verdict;
        this.reason = reason;
    }
    
    /**
     * 
     * @param title of case
     */
    public void setCaseTitle(String title) {
        caseTitle = title;
    }
    
    /**
     * 
     * @return string case of title
     */
    public String getCaseTitle() {
        return caseTitle;
    }
    
    /**
     * 
     * @param reason of verdict
     */
    public void setReason(String reason) {
        this.reason = reason;
    }
    
    /**
     * 
     * @return string reason of verdict
     */
    public String getReason() {
        return reason;
    }
    
    /**
     * 
     * @param verdict of case
     */
    public void setStudentVerdict(String verdict) {
        studentVerdict = verdict;
    }
    
    /**
     * 
     * @return string student verdict
     */
    public String getStudentVerdict() {
        return studentVerdict;
    }
    
    /**
     * 
     * @return string sentence
     */
    public String toString() {
        return caseTitle + " " + studentVerdict + " " + reason;
    }
}
