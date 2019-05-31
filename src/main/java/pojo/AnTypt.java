package pojo;

public class anTypt {
    private Integer anTId;

    private String anTName;

    public Integer getAnTId() {
        return anTId;
    }

    public void setAnTId(Integer anTId) {
        this.anTId = anTId;
    }

    public String getAnTName() {
        return anTName;
    }

    public void setAnTName(String anTName) {
        this.anTName = anTName == null ? null : anTName.trim();
    }
}