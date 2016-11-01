package com.wzd.greendaodemo.data;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Transient;
import org.greenrobot.greendao.annotation.Generated;

/**
 * <p>Description: </p>
 * Created by wzd on 2016/11/1.
 */
@Entity
public class User {
    @Id
    private long id;
    @Transient
    private String name;
    public long getId() {
        return this.id;
    }
    public void setId(long id) {
        this.id = id;
    }
    @Generated(hash = 936488051)
    public User(long id) {
        this.id = id;
    }
    @Generated(hash = 586692638)
    public User() {
    }
}
