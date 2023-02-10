package fr.dawan.gestionfanclub.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;


@ToString
@Entity
@DiscriminatorValue("Equipement")
public class Equipement extends Cadeaux {

	private static final long serialVersionUID = 4280886391466309597L;
	


}
