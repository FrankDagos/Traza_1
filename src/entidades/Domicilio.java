package entidades;

import lombok.*;
import lombok.experimental.SuperBuilder;




@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString(exclude = {"sucursal","localidad"})  // Excluir localidad para evitar recursión infinita
@Builder
public class Domicilio {
    private Long id;
    private String calle;
    private Integer numero;
    private Integer cp;
    private Integer piso;
    private Integer nroDpto;

    private Localidad localidad;

    private Sucursal sucursal;

}