/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamproject;

/**
 *
 * @author Brendan
 */
import java.sql.Timestamp;

public class Punch {
    private int id;
    private int terminalId;
    private Badge badge;
    private Timestamp originalTimestamp;
    private Timestamp adjustedTimeStamp;
    private int punchTypeId;
    
    public Punch(Badge badge, int terminalId, int punchTypeId ){
        this.badge = badge;
        this.terminalId = terminalId;
        this.punchTypeId = punchTypeId;
        
        this.id = 0;
        this.originalTimestamp = null;
        this.adjustedTimeStamp = null;
    }
    
    public String printOriginalTimestamp(){
        String output = "";
        
        return output;
    }

    public int getId() {
        return id;
    }

    public int getTerminalId() {
        return terminalId;
    }

    public Badge getBadge() {
        return badge;
    }

    public Timestamp getOriginalTimestamp() {
        return originalTimestamp;
    }

    public Timestamp getAdjustedTimeStamp() {
        return adjustedTimeStamp;
    }

    public int getPunchTypeId() {
        return punchTypeId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTerminalId(int terminalId) {
        this.terminalId = terminalId;
    }

    public void setBadge(Badge badge) {
        this.badge = badge;
    }

    public void setOriginalTimestamp(Timestamp originalTimestamp) {
        this.originalTimestamp = originalTimestamp;
    }

    public void setAdjustedTimeStamp(Timestamp adjustedTimeStamp) {
        this.adjustedTimeStamp = adjustedTimeStamp;
    }

    public void setPunchTypeId(int punchTypeId) {
        this.punchTypeId = punchTypeId;
    }
    
    
}
