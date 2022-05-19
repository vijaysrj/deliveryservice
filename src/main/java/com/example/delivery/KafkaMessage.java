package com.example.delivery;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class KafkaMessage {
	
	
	private PayLoad payload;

	public PayLoad getPayload() {
		return payload;
	}

	public void setPayload(PayLoad payload) {
		this.payload = payload;
	}

	@Override
	public String toString() {
		return "KafkaMessage [payload=" + payload + "]";
	}
	
	
	

}

@JsonIgnoreProperties(ignoreUnknown = true)
 class PayLoad{
	
	
	int id;
	
	String event;
	
	@JsonProperty("event_id")
	int eventId;
	
	
	String payload;
	
	@JsonProperty("created_at")
	String createdAt;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public String getPayload() {
		return payload;
	}

	public void setPayload(String payload) {
		this.payload = payload;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "PayLoad [id=" + id + ", event=" + event + ", eventId=" + eventId + ", payload=" + payload
				+ ", createdAt=" + createdAt + "]";
	}
	
	
	
}

 