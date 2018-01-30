package com.example.demo.user;

import lombok.Data;
import javax.persistence.Embeddable;

@Data
@Embeddable
public class ContactHours {
    private String start;
    private String end;
}
