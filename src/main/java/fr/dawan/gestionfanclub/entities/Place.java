package fr.dawan.gestionfanclub.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;


@ToString
@Entity
@DiscriminatorValue("Place")
public class Place extends Cadeaux{

	private static final long serialVersionUID = -6644936769161512492L;
	

	
}
