package com.springboot.springboot.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	private TopicServices topicServics;

	@RequestMapping("/topic")
	public List<Topic> getAllTopic() {
		return topicServics.getAllTopic();

	}

	@RequestMapping("/topic/{id}")
	public Topic getTopic(@PathVariable String id) {

		return topicServics.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/topic")
	public void addTopic(@RequestBody Topic topic) {
		 topicServics.addTopic(topic);

	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/topic/{id}")
	public void updateTopic(@RequestBody Topic topic,@PathVariable String id) {
		 topicServics.updateTopic(id,topic);

	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/topic/{id}")
	public void deleteTopic(@RequestBody Topic topic,@PathVariable String id) {
		 topicServics.deleteTopic(id,topic);

	}

}
