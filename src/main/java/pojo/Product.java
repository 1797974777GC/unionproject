package pojo;

public class Product {
    private Integer pId;

    private String pUrl;

    private String pName;

    private String pDetail;

    private Long pPrice;

    private Integer tId;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpUrl() {
        return pUrl;
    }

    public void setpUrl(String pUrl) {
        this.pUrl = pUrl == null ? null : pUrl.trim();
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }

    public String getpDetail() {
        return pDetail;
    }

    public void setpDetail(String pDetail) {
        this.pDetail = pDetail == null ? null : pDetail.trim();
    }

    public Long getpPrice() {
        return pPrice;
    }

    public void setpPrice(Long pPrice) {
        this.pPrice = pPrice;
    }

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }
}