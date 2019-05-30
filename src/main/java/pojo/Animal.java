package pojo;

public class Animal {
    private Integer anId;

    private String anName;

    private Integer anTId;

    private Integer uId;

    public Integer getAnId() {
        return anId;
    }

    public void setAnId(Integer anId) {
        this.anId = anId;
    }

    public String getAnName() {
        return anName;
    }

    public void setAnName(String anName) {
        this.anName = anName == null ? null : anName.trim();
    }

    public Integer getAnTId() {
        return anTId;
    }

    public void setAnTId(Integer anTId) {
        this.anTId = anTId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }
}