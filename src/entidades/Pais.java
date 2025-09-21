package entidades;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString (exclude = "provincias")
@Builder
public class Pais {
    private Long id;
    private String nombre;

    @Builder.Default
    private Set<Provincia> provincias = new HashSet<>();


}
