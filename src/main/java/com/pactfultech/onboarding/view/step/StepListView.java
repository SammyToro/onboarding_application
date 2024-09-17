package com.pactfultech.onboarding.view.step;

import com.pactfultech.onboarding.entity.Step;

import com.pactfultech.onboarding.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "steps", layout = MainView.class)
@ViewController("Step.list")
@ViewDescriptor("step-list-view.xml")
@LookupComponent("stepsDataGrid")
@DialogMode(width = "64em")
public class StepListView extends StandardListView<Step> {
}