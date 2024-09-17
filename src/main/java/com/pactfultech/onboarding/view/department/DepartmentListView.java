package com.pactfultech.onboarding.view.department;

import com.pactfultech.onboarding.entity.Department;

import com.pactfultech.onboarding.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "departments", layout = MainView.class)
@ViewController("Department.list")
@ViewDescriptor("department-list-view.xml")
@LookupComponent("departmentsDataGrid")
@DialogMode(width = "64em")
public class DepartmentListView extends StandardListView<Department> {
}