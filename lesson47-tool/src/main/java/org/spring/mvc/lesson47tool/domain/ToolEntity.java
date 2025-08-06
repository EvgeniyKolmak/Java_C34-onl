package org.spring.mvc.lesson47tool.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Table(name = "tools")
@Entity
public class ToolEntity {

    @Id
    @UuidGenerator
    private UUID id;

    private String name;

    private Integer count;

}
