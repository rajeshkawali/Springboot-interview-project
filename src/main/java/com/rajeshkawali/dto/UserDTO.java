package com.rajeshkawali.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Rajesh_Kawali
 *
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDTO {

	private Long id;

	private String firstName;

	private String lastName;

	private Integer age;

	private String gender;

	private String role;
}
