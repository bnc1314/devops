package ca.bnc.nbfg.devops.controller;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ca.bnc.nbfg.devops.exception.UnknownEventException;
import ca.bnc.nbfg.devops.model.Event;
import ca.bnc.nbfg.devops.service.EventService;

@RestController
public class EventController {
	@Autowired
	private EventService eventService;
	@PostMapping("/events")
	public Event createEvent(@RequestBody Event event) {
		return eventService.createEvent(event);

	}

	/**
	 * Invite guest to an event
	 * 
	 * @param id
	 * @param event
	 * @return
	 */
	@PostMapping("/events/{id}/guests")
	public ResponseEntity<String> inviteGuestToEvent(@PathVariable String id /*@RequestBody List<Guest> guests*/) throws UnknownEventException {
		//eventService.inviteGuestToEvent(id,guests);
		return new ResponseEntity<String>(HttpStatus.CREATED);

	}

	/**
	 * @return
	 */
	@GetMapping("/events")
	public List<Event> listEvents() {
		return eventService.getSortedEvents();

	}
}
