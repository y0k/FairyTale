package com.fairytale.mvp.client.mvp.activity;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.fairytale.mvp.client.AppConstants;
import com.fairytale.mvp.client.ClientFactory;
import com.fairytale.mvp.client.mvp.activity.AbstractMainActivity;
import com.fairytale.mvp.client.mvp.view.IContactsView;

public class ContactsActivity extends AbstractMainActivity implements IContactsView.IContactsPresenter {
	private ClientFactory clientFactory;
	
	public ContactsActivity(ClientFactory clientFactory) {
		this.clientFactory = clientFactory;
	}
	
	@Override
	public void start(AcceptsOneWidget container, EventBus eventBus) {
		applyCurrentLinkStyle(AppConstants.CONTACTS_LINK_ID);
		
		final IContactsView view = clientFactory.getContactsView();
		view.setPresenter(this);
		container.setWidget(view.asWidget());
	}
}
