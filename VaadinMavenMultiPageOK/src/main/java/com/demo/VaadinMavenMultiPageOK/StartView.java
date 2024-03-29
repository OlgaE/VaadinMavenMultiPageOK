package com.demo.VaadinMavenMultiPageOK;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Notification;
import com.vaadin.ui.VerticalLayout;

/** A start view for navigating to the main view */
@SuppressWarnings("serial")
public class StartView extends VerticalLayout implements View {
	
    public StartView(final Navigator navigator, final String MAINVIEW) {
        setSizeFull();

        Button button = new Button("Go to Main View",
                new Button.ClickListener() {
        	
            @Override
            public void buttonClick(ClickEvent event) {
                navigator.navigateTo(MAINVIEW);
            }
        });
        addComponent(button);
        setComponentAlignment(button, Alignment.MIDDLE_CENTER);
    }        
        
    @Override
    public void enter(ViewChangeEvent event) {
        // Notification.show("Welcome to the Animal Farm");
    }
}