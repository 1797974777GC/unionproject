package pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Message {
    private Integer mId;

    private String mMessage;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date mDate;

    private Integer uId;

    private Integer mFlag;

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getmMessage() {
        return mMessage;
    }

    public void setmMessage(String mMessage) {
        this.mMessage = mMessage == null ? null : mMessage.trim();
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getmFlag() {
        return mFlag;
    }

    public void setmFlag(Integer mFlag) {
        this.mFlag = mFlag;
    }
}