package com.rajeshkawali.util;

import org.springframework.stereotype.Component;

import com.rajeshkawali.dto.UserDTO;
import com.rajeshkawali.entity.User;
/**
 * @author Rajesh_Kawali
 * 
 */
@Component
public class Util {

	public static UserDTO entityToDto(User user) {
		UserDTO userDto = new UserDTO();
		if (user != null) {
			userDto.setId(user.getId());
			userDto.setFirstName(user.getFirstName());
			userDto.setLastName(user.getLastName());
			userDto.setAge(user.getAge());
			userDto.setGender(user.getGender());
			userDto.setRole(user.getRole());
			return userDto;
		}
		return userDto;
	}

	public static User dtoToEntity(UserDTO userDTO) {
		User user = new User();
		if (userDTO != null) {
			user.setId(userDTO.getId());
			user.setFirstName(userDTO.getFirstName());
			user.setLastName(userDTO.getLastName());
			user.setAge(userDTO.getAge());
			user.setGender(userDTO.getGender());
			user.setRole(userDTO.getRole());
			return user;
		}
		return user;
	}
}
