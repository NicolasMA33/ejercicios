package unidad4;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class Animal {

	private String nombre;
	private LocalDate fecha;

	public Animal(String nombre, LocalDate fecha) {
		this.nombre = nombre;
		this.fecha = fecha;
	}

	public Animal(String nombre) {
		this(nombre, LocalDate.now());
	}

//	source get hashcode()

	@Override
	public int hashCode() {
		return Objects.hash(fecha, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(fecha, other.fecha) && Objects.equals(nombre, other.nombre);
	}

//  source toString()

	@Override
	public String toString() {
		return "Nombre: " + nombre + " - Edad: " + ChronoUnit.YEARS;
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFecha() {
		return fecha;
	}

}
