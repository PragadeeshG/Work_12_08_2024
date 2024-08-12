create table if not exists dev_factory_tracking_advisor(
advisor_code Integer not null,
dev_fact_tracking_id Integer null,
validity_in_days Integer null,
department varchar(255) null,
base_reporting_indicator Integer null,
dev_fact_tracking_mapped_to_report char null,
is_active char null,
authority_name varchar(255) null,
authority_type varchar(255) null,
creation_cr varchar(255) null,
modified_cr varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint dev_factory_tracking_advisor_pk primary key(advisor_code));