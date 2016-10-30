package br.com.prolife.service;

import java.io.IOException;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.xml.bind.JAXBException;

import org.apache.deltaspike.jpa.api.transaction.Transactional;
import org.codehaus.jettison.json.JSONException;

import br.com.prolife.exception.ValidationException;
import br.com.prolife.model.User;
import br.com.prolife.repository.UserRepository;

@RequestScoped
@Transactional
public class ChatService {
	
	@Inject
	private UserRepository userRepository;

	public String sendMessage(Long senderId, Long receiverId, String message) throws IOException, JSONException, JAXBException, ValidationException{
		User sender = userRepository.findBy(senderId);
		User receiver = userRepository.findBy(receiverId);
		
		return PushNotificationService.sendPushNotification(sender, receiver, message);
	}
}
