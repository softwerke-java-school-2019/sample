package ru.softwerke.practice.app2019.service;

import ru.softwerke.practice.app2019.model.SomeEntity;

import java.util.List;

public interface SomeService {
    SomeEntity putEntity(SomeEntity entity);

    SomeEntity getEntity(long id);

    List<SomeEntity> getList();
}
