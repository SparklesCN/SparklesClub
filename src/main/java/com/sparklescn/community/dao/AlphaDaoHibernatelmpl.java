package com.sparklescn.community.dao;

import org.springframework.stereotype.Repository;

@Repository
public class AlphaDaoHibernatelmpl implements AlphaDao {

    @Override
    public String select() {
        return "Hibernate";
    }
}
