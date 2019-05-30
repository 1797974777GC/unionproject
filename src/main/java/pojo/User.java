package pojo;

public class User {
    private Integer uId;

    private String uTele;

    private String uAccount;

    private String uRealname;

    private String uName;

    private String uPwd;

    private String uAddress;

    private Integer uFlag;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuTele() {
        return uTele;
    }

    public void setuTele(String uTele) {
        this.uTele = uTele == null ? null : uTele.trim();
    }

    public String getuAccount() {
        return uAccount;
    }

    public void setuAccount(String uAccount) {
        this.uAccount = uAccount == null ? null : uAccount.trim();
    }

    public String getuRealname() {
        return uRealname;
    }

    public void setuRealname(String uRealname) {
        this.uRealname = uRealname == null ? null : uRealname.trim();
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    public String getuPwd() {
        return uPwd;
    }

    public void setuPwd(String uPwd) {
        this.uPwd = uPwd == null ? null : uPwd.trim();
    }

    public String getuAddress() {
        return uAddress;
    }

    public void setuAddress(String uAddress) {
        this.uAddress = uAddress == null ? null : uAddress.trim();
    }

    public Integer getuFlag() {
        return uFlag;
    }

    public void setuFlag(Integer uFlag) {
        this.uFlag = uFlag;
    }
}