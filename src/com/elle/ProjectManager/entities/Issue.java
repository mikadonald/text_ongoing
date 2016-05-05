
package com.elle.ProjectManager.entities;

/**
 * Issue
 * @author Carlos Igreja
 * @since  Apr 5, 2016
 */
public class Issue {

    private int id;
    private String app;
    private String title;
    private byte[] description;
    private String programmer;
    private String dateOpened;
    private String rk; 
    private String version;
    private String dateClosed;
    private String issueType;
    private String submitter;
    private String locked;
    
    public Issue(){
        this(-1,"","",new byte[0],"","","","","","FEATURE","","");
    }

    public Issue(int id, String app, String title, byte[] description, String programmer, String dateOpened, String rk, String version, String dateClosed, String issue_type, String submitter, String locked) {
        this.id = id;
        this.app = app;
        this.title = title;
        this.description = description;
        this.programmer = programmer;
        this.dateOpened = dateOpened;
        this.rk = rk;
        this.version = version;
        this.dateClosed = dateClosed;
        this.issueType = issue_type;
        this.submitter = submitter;
        this.locked = locked;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public byte[] getDescription() {
        return description;
    }

    public void setDescription(byte[] description) {
        this.description = description;
    }

    public String getProgrammer() {
        return programmer;
    }

    public void setProgrammer(String programmer) {
        this.programmer = programmer;
    }

    public String getDateOpened() {
        return dateOpened;
    }

    public void setDateOpened(String dateOpened) {
        this.dateOpened = dateOpened;
    }

    public String getRk() {
        return rk;
    }

    public void setRk(String rk) {
        this.rk = rk;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDateClosed() {
        return dateClosed;
    }

    public void setDateClosed(String dateClosed) {
        this.dateClosed = dateClosed;
    }

    public String getIssueType() {
        return issueType;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }

    public String getSubmitter() {
        return submitter;
    }

    public void setSubmitter(String submitter) {
        this.submitter = submitter;
    }

    public String getLocked() {
        return locked;
    }

    public void setLocked(String locked) {
        this.locked = locked;
    }
}
