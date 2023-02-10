package fr.dawan.gestionfanclub.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import lombok.ToString;


@ToString
@Entity
@DiscriminatorValue("Code_promo")
public class CodePromo extends Cadeaux {

	private static final long serialVersionUID = -7320961509325886576L;
	


}
