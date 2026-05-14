/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 348337643
 */
public class PrivacyCase extends EthicsCase{
    private String dataType;
    
    /**
     * 
     * @param caseTitle
     * @param description
     * @param dataType 
     */
    public PrivacyCase(String caseTitle, String description, String dataType) {
        super(caseTitle, description, "Privacy Case");
        this.dataType = dataType;
        
    }
    
    /**
     * 
     * @return 
     */
    public String getDataType() {
        return dataType;
    }
    
    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return super.toString() + " " + dataType;
    }
}
