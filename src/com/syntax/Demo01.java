package com.syntax;

/**
 * 标识符的命名规则和命名规范
 *
 * @author hanxu 1622883894@qq.com
 * @version 2022/5/8 22:05
 * @since JDK11
 */
public class Demo01 {

}

/**
 * 类的命名规范
 */

class UserInfo {

    /**
     *变量名的命名规范
     */
    private Long id;

    /**
     *变量名的命名规范
     */

    private String username;

    public UserInfo() {
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
