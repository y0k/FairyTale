package com.fairytale.mvp.client;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceController;
import com.fairytale.mvp.client.mvp.view.IContactsView;
import com.fairytale.mvp.client.mvp.view.IMailView;
import com.fairytale.mvp.client.mvp.view.ITasksView;

public interface ClientFactory {
	public EventBus getEventBus();
	public PlaceController getPlaceController();
	
	public IMailView getMailView();
	public IContactsView getContactsView();
	public ITasksView getTasksView();
}
