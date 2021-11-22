package kr.jackson.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
public class Product {

    private int id;
    private String name;
    private String nick;

    public void changeId(){
        this.id = id + 1;
    }

}
