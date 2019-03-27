package ru.softwerke.practice.app2019.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Some Entity, immutable
 */
public class SomeEntity {
    public static final String ID_FIELD = "id";
    public static final String VALUE_FIELD = "value";

    @JsonProperty(ID_FIELD)
    private final long id;

    @JsonProperty(VALUE_FIELD)
    private final String value;

    @JsonCreator
    public SomeEntity(
            @JsonProperty(ID_FIELD) long id,
            @NotNull @JsonProperty(VALUE_FIELD) String value) {
        this.id = id;
        this.value = value;
    }

    public long getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SomeEntity that = (SomeEntity) o;
        return id == that.id &&
                Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, value);
    }

    @Override
    public String toString() {
        return "SomeEntity{" +
                "id=" + id +
                ", value='" + value + '\'' +
                '}';
    }
}
