package vo;

import java.io.Serializable;

/**
 *  描述：
 *      登录请求参数
 *  时间：2020/8/8
 *  kai
 */
public class LoginVo implements Serializable {

    /**
     *  登录方式
     *      P： 账号（邮箱账号或手机号码） + 密码
     *      E:  邮箱 + 邮箱验证马
     */
    private String type;
    /**
     *  邮箱
     */
    private String email;
    /**
     *  手机号码
     */
    private String phone;
    /**
     *  密码
     */
    private String password;
    /**
     *  邮箱验证码
     */
    private String emailCode;

    public LoginVo() {
    }

    public LoginVo(String type, String email, String phone, String password, String emailCode) {
        this.type = type;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.emailCode = emailCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailCode() {
        return emailCode;
    }

    public void setEmailCode(String emailCode) {
        this.emailCode = emailCode;
    }

    @Override
    public String toString() {
        return "LoginVo{" +
                "type='" + type + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", emailCode='" + emailCode + '\'' +
                '}';
    }
}