package com.api.parkingcontrol.dtos;

import javax.validation.constraints.NotBlank;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TokenDTO {
	
	@NotBlank
	private String type;
	
	@NotBlank
	private String token;

}
