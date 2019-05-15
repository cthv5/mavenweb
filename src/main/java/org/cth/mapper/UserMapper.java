package org.cth.mapper;

import org.cth.model.CrmUser;

import java.util.List;

public interface UserMapper {
    void insert(CrmUser user);

    List<CrmUser> findAll();
}
