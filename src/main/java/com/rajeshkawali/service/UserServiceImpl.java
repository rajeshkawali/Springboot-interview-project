package com.rajeshkawali.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rajeshkawali.dto.UserDTO;
import com.rajeshkawali.entity.User;
import com.rajeshkawali.repository.UserRepository;
import com.rajeshkawali.util.Util;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Rajesh_Kawali
 *
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {

	public static final String CLASS_NAME = UserServiceImpl.class.getName();

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<UserDTO> getAllUsers() {
		String _function = ".getAllUsers";
		log.info(CLASS_NAME + _function + "::ENTER");
		List<UserDTO> userList = new ArrayList<>();
		try {
			userRepository.findAll().forEach(user -> userList.add(Util.entityToDto(user)));
		} catch (Exception e) {
			log.error(CLASS_NAME + _function + "::Exception occurred:" + e.getMessage());
		}
		return userList;
	}

	@Override
	public UserDTO addUser(UserDTO user) {
		String _function = ".addUser";
		log.info(CLASS_NAME + _function + "::ENTER");
		User addedUser = null;
		//UserDTO userDTO = null;
		try {
			addedUser = userRepository.save(Util.dtoToEntity(user));
			//BeanUtils.copyProperties(addedUser, userDTO);
		} catch (Exception e) {
			log.error(CLASS_NAME + _function + "::Exception occurred:" + e.getMessage());
		}
		return Util.entityToDto(addedUser);
	}

}
