package com.ayoh.coreshop.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
public class Compositekey1 implements Serializable {

    @Column(name = "member_no")
    private Long id;

    @Column(nullable = false)
    private String email;
}
