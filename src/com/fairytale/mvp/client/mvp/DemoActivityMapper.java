package com.fairytale.mvp.client.mvp;

import com.fairytale.mvp.client.mvp.activity.ContactsActivity;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.fairytale.mvp.client.ClientFactory;
import com.fairytale.mvp.client.mvp.activity.MailActivity;
import com.fairytale.mvp.client.mvp.activity.TasksActivity;
import com.fairytale.mvp.client.mvp.place.ContactsPlace;
import com.fairytale.mvp.client.mvp.place.MailPlace;
import com.fairytale.mvp.client.mvp.place.TasksPlace;

public class DemoActivityMapper implements ActivityMapper {
	private ClientFactory clientFactory;
	
	public DemoActivityMapper(ClientFactory clientFactory) {
		super();
		this.clientFactory = clientFactory;
	}
	
	@Override
	public Activity getActivity(Place place) {
		if (place instanceof MailPlace) {
			return new MailActivity(clientFactory);
		} else if (place instanceof ContactsPlace) {
			return new ContactsActivity(clientFactory);
		} else if (place instanceof TasksPlace) {
			return new TasksActivity(clientFactory);
		}
		return null;
	}
}
