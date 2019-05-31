package com.fairytale.mvp.client.mvp.activity;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.fairytale.mvp.client.AppConstants;
import com.fairytale.mvp.client.ClientFactory;
import com.fairytale.mvp.client.mvp.view.IMailView;

public class MailActivity extends AbstractMainActivity implements IMailView.IMailPresenter {
	private ClientFactory clientFactory;
	
	public MailActivity(ClientFactory clientFactory) {
		this.clientFactory = clientFactory;
	}
	
	@Override
	public void start(AcceptsOneWidget container, EventBus eventBus) {
		applyCurrentLinkStyle(AppConstants.MAIL_LINK_ID);
		
		final IMailView view = clientFactory.getMailView();
		view.setPresenter(this);
		container.setWidget(view.asWidget());
	}
}
