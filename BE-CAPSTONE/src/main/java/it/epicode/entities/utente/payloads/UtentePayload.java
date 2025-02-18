package it.epicode.entities.utente.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UtentePayload {
	@NotBlank(message = "Il nome è obbligatorio")
	@NotNull(message = "Il nome è obbligatorio")
	private String nome;
	@NotBlank(message = "Il cognome è obbligatorio")
	@NotNull(message = "Il cognome è obbligatorio")
	private String cognome;
	@NotBlank(message = "Non hai inserito un indirizzo email valido")
	@NotNull(message = "Non hai inserito un indirizzo email valido")
	@Email(message = "Non hai inserito un indirizzo email valido")
	private String email;
	@NotBlank(message = "La password è obbligatoria")
	@NotNull(message = "La password è obbligatoria")
	private String password;
}
