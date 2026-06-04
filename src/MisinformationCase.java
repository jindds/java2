/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 348337643
 */
public class MisinformationCase extends EthicsCase{
    private String mediaType;
    /**
     * 
     * @param caseTitle title of case
     * @param description description of case
     * @param mediaType media of case
     */
    public MisinformationCase(String caseTitle, String description, String mediaType){
        super(caseTitle, description, "Misinformation Case");
        this.mediaType = mediaType;
    }
    
    /**
     * 
     * @return string mediaType
     */
    public String getMediatype(){
        return mediaType;
    }
    
    /**
     * 
     * @return string sentence
     */
    @Override
    public String toString(){
        return super.toString() + " " + this.mediaType; 
    }
}
