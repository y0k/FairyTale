package com.fairytale.mvp.client;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.place.shared.PlaceController;
import com.fairytale.mvp.client.mvp.view.IContactsView;
import com.fairytale.mvp.client.mvp.view.IMailView;
import com.fairytale.mvp.client.mvp.view.ITasksView;
import com.fairytale.mvp.client.mvp.view.contacts.ContactsView;
import com.fairytale.mvp.client.mvp.view.mail.MailView;
import com.fairytale.mvp.client.mvp.view.tasks.TasksView;

public class ClientFactoryImpl implements ClientFactory {
	private final EventBus eventBus = new SimpleEventBus();
	@SuppressWarnings("deprecation")
	private final PlaceController placeController = new PlaceController(eventBus);
	
	private final IMailView mailView = new MailView();
	private final IContactsView contactsView = new ContactsView();
	private final ITasksView tasksView = new TasksView();
	
	@Override public EventBus getEventBus() { return eventBus; }
	@Override public PlaceController getPlaceController() { return placeController; }
	@Override public IMailView getMailView() { return mailView; }
	@Override public IContactsView getContactsView() { return contactsView; }
	@Override public ITasksView getTasksView() { return tasksView;}
}
