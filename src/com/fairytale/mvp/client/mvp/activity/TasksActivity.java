package com.fairytale.mvp.client.mvp.activity;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.fairytale.mvp.client.AppConstants;
import com.fairytale.mvp.client.ClientFactory;
import com.fairytale.mvp.client.mvp.view.ITasksView;

public class TasksActivity extends AbstractMainActivity implements ITasksView.ITasksPresenter {
	private ClientFactory clientFactory;
	
	public TasksActivity(ClientFactory clientFactory) {
		this.clientFactory = clientFactory;
	}

	@Override
	public void start(AcceptsOneWidget container, EventBus eventBus) {
		applyCurrentLinkStyle(AppConstants.TASKS_LINK_ID);
		
		final ITasksView view = clientFactory.getTasksView();
		view.setPresenter(this);
		container.setWidget(view.asWidget());
	}
}
