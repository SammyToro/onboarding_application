package com.pactfultech.onboarding.view.step;

import com.pactfultech.onboarding.entity.Step;

import com.pactfultech.onboarding.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "steps/:id", layout = MainView.class)
@ViewController("Step.detail")
@ViewDescriptor("step-detail-view.xml")
@EditedEntityContainer("stepDc")
public class StepDetailView extends StandardDetailView<Step> {
}