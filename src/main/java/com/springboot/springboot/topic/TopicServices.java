package com.springboot.springboot.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicServices {

	private List<Topic> topic = new ArrayList<>( Arrays.asList(new Topic("Spring", "Spring Fremwork", "Spring Freamwork Descriptio"),
			new Topic("Java", "Java Fremwork", "java Freamwork Descriptio"),
			new Topic("JavaScript", "Javasript Fremwork", "javascript Freamwork Descriptio")
			));

	public List<Topic> getAllTopic() {
		return topic;
	}

	public Topic getTopic(String id) {
		Iterator<Topic> it = topic.iterator();
		int k = 0;
		int l = 0;
		while (it.hasNext()) {

			System.out.println("123" + topic.get(k).getId());
			if (id.equals(topic.get(k).getId())) {
				l = k;
			}
			k++;
			it.next();

		}
		return topic.get(l);

	}

	public void addTopic(Topic topic2) {
		//Topic addTopic=new ArrayList<>(topic);
		topic.add(topic2);
		
	}

	public void updateTopic(String id, Topic topic2) {
		for(int i=0;i<topic.size();i++){
			Topic t =topic.get(i);
			if(t.getId().equals(id)){
				topic.set(i, topic2);
				return;
			}
			
		}
		
	}

	public void deleteTopic(String id, Topic topic2) {
		for(int i=0;i<topic.size();i++){
			Topic t =topic.get(i);
			if(t.getId().equals(id)){
				topic.remove(i);
				return;
			}
			
		}
		
	}

}
