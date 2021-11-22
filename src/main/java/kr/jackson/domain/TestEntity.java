package kr.jackson.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@NoArgsConstructor
public class TestEntity {

    @NotBlank
    private String name;
    @NotNull
    private int age;
    private long id;

}
