package ar.edu.utn.frba.dds.ejercicio_03;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "producto_simple")
public class ProductoSimple extends Producto{

  @Column(nullable = false, name = "precio")
  private Double precio;

  @Column(nullable = false, name = "precio")
  private Integer stock;

  public Double precio() {
    return this.precio;
  }

  public Integer stock() {
    return this.stock;
  }

  public ProductoSimple() {

  }

}
