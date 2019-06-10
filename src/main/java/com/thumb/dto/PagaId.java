package com.thumb.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class PagaId extends Page {
    private int id;

    public PagaId() {
    }

    public PagaId(int pageNow, int pageSize) {
        super(pageNow, pageSize);
    }

    public PagaId(int id) {
        this.id = id;
    }

    public PagaId(int pageNow, int pageSize, int id) {
        super(pageNow, pageSize);
        this.id = id;
    }

    @Override
    public String toString() {
        return "PagaId{" +
                "id=" + id +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
