package com.dicoding.dicodingsubmission.Object;

public class President {
    private String name, remark, photo, desc, bornDate, diedDate, tall;

    public President(String name, String remark, String photo, String desc, String bornDate, String diedDate, String tall) {
        this.name = name;
        this.remark = remark;
        this.photo = photo;
        this.desc = desc;
        this.bornDate = bornDate;
        this.diedDate = diedDate;
        this.tall = tall;
    }

    public President() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getBornDate() {
        return bornDate;
    }

    public void setBornDate(String bornDate) {
        this.bornDate = bornDate;
    }

    public String getDiedDate() {
        return diedDate;
    }

    public void setDiedDate(String diedDate) {
        this.diedDate = diedDate;
    }

    public String getTall() {
        return tall;
    }

    public void setTall(String tall) {
        this.tall = tall;
    }
}
