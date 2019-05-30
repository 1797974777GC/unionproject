package pojo;

public class Admin {
    private Integer aId;

    private String aAccount;

    private String aTele;

    private String aName;

    private String aPwd;

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getaAccount() {
        return aAccount;
    }

    public void setaAccount(String aAccount) {
        this.aAccount = aAccount == null ? null : aAccount.trim();
    }

    public String getaTele() {
        return aTele;
    }

    public void setaTele(String aTele) {
        this.aTele = aTele == null ? null : aTele.trim();
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName == null ? null : aName.trim();
    }

    public String getaPwd() {
        return aPwd;
    }

    public void setaPwd(String aPwd) {
        this.aPwd = aPwd == null ? null : aPwd.trim();
    }
}