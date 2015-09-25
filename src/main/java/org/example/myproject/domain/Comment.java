package org.example.myproject.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by k on 9/15/15.
 */
@Entity
@Table(name = "whw_comment")
public class Comment extends BaseModel {

    /**
     * 留言的用户名,qq号或者第三方账号
     */
    private String username;

    /**
     * 留言的内容
     */
    private String content;

    /**
     * 1代表发布， -1代表删除
     */
    @Column(nullable = false, columnDefinition = "TINYINT(1)")
    private Integer state;

    /**
     * 所属栏目ID
     */
    private String parentmenu;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getParentmenu() {
        return parentmenu;
    }

    public void setParentmenu(String parentmenu) {
        this.parentmenu = parentmenu;
    }

}