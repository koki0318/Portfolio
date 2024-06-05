package com.example.domain;

public class User {

    /** id */
    private Integer id;
    /** 名字 */
    private String firstName;
    /** 名前 */
    private String lastName;
    /** 郵便番号 */
    private String postalCode;
    /** 住所(市区町村) */
    private String city;
    /** 住所(町名,番地) */
    private String block;
    /** 住所(建物) */
    private String building;
    /** 本人画像 */
    private String profileImg;
    /** 管理者フラグ */
    private Integer admminFlg;
    /** メールアドレス */
    private String email;
    
    @Override
    public String toString() {
        return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", postalCode=" + postalCode
                + ", city=" + city + ", block=" + block + ", building=" + building + ", profileImg=" + profileImg
                + ", admminFlg=" + admminFlg + ", email=" + email + "]";
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getPostalCode() {
        return postalCode;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getBlock() {
        return block;
    }
    public void setBlock(String block) {
        this.block = block;
    }
    public String getBuilding() {
        return building;
    }
    public void setBuilding(String building) {
        this.building = building;
    }
    public String getProfileImg() {
        return profileImg;
    }
    public void setProfileImg(String profileImg) {
        this.profileImg = profileImg;
    }
    public Integer getAdmminFlg() {
        return admminFlg;
    }
    public void setAdmminFlg(Integer admminFlg) {
        this.admminFlg = admminFlg;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
