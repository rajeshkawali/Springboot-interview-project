package com.rajeshkawali.service;

import java.util.List;

import com.rajeshkawali.dto.UserDTO;

/**
 * @author Rajesh_Kawali
 *
 */
public interface UserService {

	public List<UserDTO> getAllUsers();

	public UserDTO addUser(UserDTO user);

}
