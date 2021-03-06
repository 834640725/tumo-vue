package cn.tycoding.admin.dto;


import java.io.Serializable;
import java.util.List;

/**
 * @auther TyCoding
 * @date 2018/10/16
 */
public class PageBean implements Serializable {

    //当前页
    private long total;
    //当前页记录
    private Object rows;

    public PageBean(long total, List rows) {
        this.total = total;
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public Object getRows() {
        return rows;
    }

    public void setRows(Object rows) {
        this.rows = rows;
    }
}
