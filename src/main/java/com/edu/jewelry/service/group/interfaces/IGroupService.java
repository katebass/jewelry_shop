package com.edu.jewelry.service.group.interfaces;

import com.edu.jewelry.model.Group;

import java.util.List;

public interface IGroupService {
    Group create(Group group);
    Group get(String id);
    Group update(Group group);
    Group delete(String id);
    List<Group> getAll();
}
