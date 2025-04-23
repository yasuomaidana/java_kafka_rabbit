package com.vulpuxmecatroncus.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "car")
public class Car {
    @Id
    private Long id;
    @NonNull
    private String model;
    @NonNull
    private String color;

}
