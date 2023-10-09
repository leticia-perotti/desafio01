alter table transfer_limit drop constraint ck_check_day_limit;

alter table transfer_limit add constraint CHECK (day_week >= 0 AND day_week <=6)