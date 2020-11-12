package ru.mtuci.simapi.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.SafeHtml;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Book extends AbstractBaseEntity{
    @NotBlank
    @SafeHtml
    private String name;
    @NotBlank
    @SafeHtml
    private String brand;
    @NotNull
    private Integer price;
    @NotNull
    private Integer quantity;
}
