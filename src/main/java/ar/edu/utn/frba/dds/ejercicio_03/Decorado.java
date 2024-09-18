package ar.edu.utn.frba.dds.ejercicio_03;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "decorado")
public abstract class Decorado extends Producto{

  @Id
  @GeneratedValue
  private Long id;

  @OneToOne
  protected Producto producto;

  public Double precio() {
    return this.producto.precio();
  }


}
