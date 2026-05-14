/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 348337643
 */
public class IntellectualPropertyCase extends EthicsCase{
    private String ipType;
    public IntellectualPropertyCase(String caseTitle, String description, String ipType){
        super(caseTitle,description, "Intellectual Property Case")
        this.ipType = ipType;
}
public String getIptype(){
    return this.ipType;
}
     @Override
    public String toString(){
    return super.toString() + " " + this.ipType; 
}
}
