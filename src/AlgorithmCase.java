/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 348337643
 */
public class AlgorithmCase extends EthicsCase {
    private String biasType;
    /**
     * 
     * @param caseTitle title of case
     * @param description description of case
     * @param biasType bias type of case
     */
    public AlgorithmCase(String caseTitle, String description, String biasType){
        super(caseTitle, description, "Algorithm Case");
        this.biasType = biasType;
    }
    
    /**
     * 
     * @return biasType string
     */
    public String getBiastype(){
        return biasType;
    }
    
    /**
     * 
     * @return string sentence
     */
     @Override
    public String toString(){
        return super.toString() + " " + this.biasType; 
    }
}
