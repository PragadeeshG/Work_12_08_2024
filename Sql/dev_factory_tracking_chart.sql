create table if not exists dev_factory_tracking_chart(
chart_design_code Integer not null,
dev_fact_tracking_id Integer null,
dev_fact_tracking_budget_indicator varchar(255) null,
dev_fact_tracking_sheet varchar(255) null,
dev_fact_tracking_control_flag varchar(255) null,
dev_fact_tracking_desc varchar(255) null,
dev_fact_tracking_short_desc varchar(255) null,
dev_fact_tracking_type varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint dev_factory_tracking_chart_pk primary key(chart_design_code));