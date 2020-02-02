package org.augustus.bean;

import java.io.Serializable;

/**
 * @author LinYongJin
 * @date 2020/2/2 16:09
 */
public class ReceiveAddress implements Serializable {

    private Long id;

    private String name;

    private String receiveAddress;

    public ReceiveAddress(Long id, String name, String receiveAddress) {
        this.id = id;
        this.name = name;
        this.receiveAddress = receiveAddress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReceiveAddress() {
        return receiveAddress;
    }

    public void setReceiveAddress(String receiveAddress) {
        this.receiveAddress = receiveAddress;
    }

    @Override
    public String toString() {
        return "ReceiveAddress{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", receiveAddress='" + receiveAddress + '\'' +
                '}';
    }
}
