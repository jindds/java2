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
    
    public Verdict(String caseTitle, String verdict, String reason) {
        this.caseTitle = caseTitle;
        studentVerdict = verdict;
        this.reason = reason;
    }
    
    public void setCaseTitle(String title) {
        caseTitle = title;
    }
    
    public String getCaseTitle() {
        return caseTitle;
    }
    
    public void setReason(String reason) {
        this.reason = reason;
    }
    
    public String getReason() {
        return reason;
    }
    
    public void setStudentVerdict(String verdict) {
        studentVerdict = verdict;
    }
    
    public String getStudentVerdict() {
        return studentVerdict;
    }
    
    public String toString() {
        return caseTitle + " " + studentVerdict + " " + reason;
    }
}
