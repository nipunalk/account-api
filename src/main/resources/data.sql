
insert INTO Account(account_number, account_name, account_type,balance_date,currency,Opening_available_balance ) VALUES
('585309209','SGsaving123','Saving',parsedatetime('17/09/2018', 'dd/MM/yyyy'),'AUD',80800.0);
insert INTO Account(account_number, account_name, account_type,balance_date,currency,Opening_available_balance ) VALUES
('795309209','AUsaving123','Saving',parsedatetime('16/09/2018', 'dd/MM/yyyy'),'AUD',20800.0);
insert INTO Account(account_number, account_name, account_type,balance_date,currency,Opening_available_balance ) VALUES
('795309210','AUsaving423','Saving',parsedatetime('10/09/2018', 'dd/MM/yyyy'),'AUD',20800.0);
insert INTO Account(account_number, account_name, account_type,balance_date,currency,Opening_available_balance ) VALUES
('793309210','SGsaving423','Saving',parsedatetime('01/09/2018', 'dd/MM/yyyy'),'AUD',18800.0);
insert INTO Account(account_number, account_name, account_type,balance_date,currency,Opening_available_balance ) VALUES
('795309210','AUsaving423','Saving',parsedatetime('10/09/2018', 'dd/MM/yyyy'),'AUD',16800.0);

INSERT INTO Transaction  (account_number, account_name, value_date, currency, debit_amount, credit_amount, credit_debit, Transaction_narative, account_id)
 VALUES ('123-2223-211', 'Current Account', parsedatetime('10/09/2019', 'dd/MM/yyyy'), 'SGD', null, 9540.98, 'Credit', null, 1);
INSERT INTO Transaction  (account_number, account_name, value_date, currency, debit_amount, credit_amount, credit_debit, Transaction_narative, account_id)
 VALUES ('223-2223-211', 'Current Account', parsedatetime('09/09/2019', 'dd/MM/yyyy'), 'SGD', null, 540.98, 'Credit', null, 1);
INSERT INTO Transaction  (account_number, account_name, value_date,currency, debit_amount, credit_amount, credit_debit, Transaction_narative, account_id)
 VALUES ('233-2223-211', 'Current Account', parsedatetime('08/09/2019', 'dd/MM/yyyy'), 'AUD', null, 1540.98, 'Credit', null, 1);
INSERT INTO Transaction  (account_number, account_name, value_date, currency, debit_amount, credit_amount, credit_debit, Transaction_narative, account_id)
 VALUES ('233-2323-211', 'Current Account', parsedatetime('07/09/2019', 'dd/MM/yyyy'), 'AUD', null, 3540.98, 'Credit', null, 1);
INSERT INTO Transaction  (account_number, account_name, value_date, currency, debit_amount, credit_amount, credit_debit, Transaction_narative, account_id)
 VALUES ('433-2323-211', 'Current Account', parsedatetime('06/09/2019', 'dd/MM/yyyy'), 'AUD', null, 7540.98, 'Credit', null, 1);

INSERT INTO Transaction  (account_number, account_name, value_date, currency, debit_amount, credit_amount, credit_debit, Transaction_narative, account_id)
 VALUES ('5123-2223-211', 'Current Account', parsedatetime('10/09/2019', 'dd/MM/yyyy'), 'SGD', null, 9540.98, 'Credit', null, 2);
INSERT INTO Transaction  (account_number, account_name, value_date, currency, debit_amount, credit_amount, credit_debit, Transaction_narative, account_id)
 VALUES ('623-2223-211', 'Current Account', parsedatetime('09/09/2019', 'dd/MM/yyyy'), 'SGD', null, 540.98, 'Credit', null, 2);
INSERT INTO Transaction  (account_number, account_name, value_date, currency, debit_amount, credit_amount, credit_debit, Transaction_narative, account_id)
 VALUES ('733-2223-211', 'Current Account', parsedatetime('08/09/2019', 'dd/MM/yyyy'), 'AUD', null, 1540.98, 'Credit', null, 2);
INSERT INTO Transaction  (account_number, account_name, value_date, currency, debit_amount, credit_amount, credit_debit, Transaction_narative, account_id)
 VALUES ('833-2323-211', 'Current Account', parsedatetime('07/09/2019', 'dd/MM/yyyy'), 'AUD', null, 3540.98, 'Credit', null, 2);
INSERT INTO Transaction  (account_number, account_name, value_date, currency, debit_amount, credit_amount, credit_debit, Transaction_narative, account_id)
 VALUES ('933-2323-211', 'Current Account', parsedatetime('06/09/2019', 'dd/MM/yyyy'), 'AUD', null, 7540.98, 'Credit', null, 2);

INSERT INTO Transaction  (account_number, account_name, value_date, currency, debit_amount, credit_amount, credit_debit, Transaction_narative, account_id)
 VALUES ('143-2223-211', 'Current Account', parsedatetime('10/09/2019', 'dd/MM/yyyy'), 'SGD', null, 9540.98, 'Credit', null, 3);
INSERT INTO Transaction (account_number, account_name, value_date, currency, debit_amount, credit_amount, credit_debit, Transaction_narative, account_id)
 VALUES ('253-2223-211', 'Current Account', parsedatetime('09/09/2019', 'dd/MM/yyyy'), 'SGD', null, 540.98, 'Credit', null, 3);
INSERT INTO Transaction (account_number, account_name, value_date, currency, debit_amount, credit_amount, credit_debit, Transaction_narative, account_id)
 VALUES ('263-2223-211', 'Current Account', parsedatetime('08/09/2019', 'dd/MM/yyyy'), 'AUD', null, 1540.98, 'Credit', null, 3);
INSERT INTO Transaction (account_number, account_name, value_date, currency, debit_amount, credit_amount, credit_debit, Transaction_narative, account_id)
 VALUES ('273-2323-211', 'Current Account', parsedatetime('07/09/2019', 'dd/MM/yyyy'), 'AUD', null, 3540.98, 'Credit', null, 3);
INSERT INTO Transaction (account_number, account_name, value_date, currency, debit_amount, credit_amount, credit_debit, Transaction_narative, account_id)
 VALUES ('483-2323-211', 'Current Account', parsedatetime('06/09/2019', 'dd/MM/yyyy'), 'AUD', null, 7540.98, 'Credit', null, 3);

INSERT INTO Transaction (account_number, account_name, value_date, currency, debit_amount, credit_amount, credit_debit, Transaction_narative, account_id)
 VALUES ('123-2223-212', 'Current Account', parsedatetime('10/09/2019', 'dd/MM/yyyy'), 'SGD', null, 9540.98, 'Credit', null, 4);
INSERT INTO Transaction (account_number, account_name, value_date, currency, debit_amount, credit_amount, credit_debit, Transaction_narative, account_id)
 VALUES ('223-2223-213', 'Current Account', parsedatetime('09/09/2019', 'dd/MM/yyyy'), 'SGD', null, 540.98, 'Credit', null, 4);
INSERT INTO Transaction (account_number, account_name, value_date, currency, debit_amount, credit_amount, credit_debit, Transaction_narative, account_id)
 VALUES ('233-2223-214', 'Current Account', parsedatetime('08/09/2019', 'dd/MM/yyyy'), 'AUD', null, 1540.98, 'Credit', null, 4);
INSERT INTO Transaction (account_number, account_name, value_date, currency, debit_amount, credit_amount, credit_debit, Transaction_narative, account_id)
 VALUES ('233-2323-215', 'Current Account', parsedatetime('07/09/2019', 'dd/MM/yyyy'), 'AUD', null, 3540.98, 'Credit', null, 4);
INSERT INTO Transaction (account_number, account_name, value_date, currency, debit_amount, credit_amount, credit_debit, Transaction_narative, account_id)
 VALUES ('433-2323-216', 'Current Account', parsedatetime('06/09/2019', 'dd/MM/yyyy'), 'AUD', null, 7540.98, 'Credit', null, 4);

INSERT INTO Transaction (account_number, account_name, value_date, currency, debit_amount, credit_amount, credit_debit, Transaction_narative, account_id)
 VALUES ('123-2223-241', 'Current Account', parsedatetime('10/09/2019', 'dd/MM/yyyy'), 'SGD', null, 9540.98, 'Credit', null, 5);
INSERT INTO Transaction (account_number, account_name, value_date, currency, debit_amount, credit_amount, credit_debit, Transaction_narative, account_id)
 VALUES ('223-2223-251', 'Current Account', parsedatetime('09/09/2019', 'dd/MM/yyyy'), 'SGD', null, 540.98, 'Credit', null, 5);
INSERT INTO Transaction (account_number, account_name, value_date, currency, debit_amount, credit_amount, credit_debit, Transaction_narative, account_id)
 VALUES ('233-2223-261', 'Current Account', parsedatetime('08/09/2019', 'dd/MM/yyyy'), 'AUD', null, 1540.98, 'Credit', null, 5);
INSERT INTO Transaction (account_number, account_name, value_date, currency, debit_amount, credit_amount, credit_debit, Transaction_narative, account_id)
 VALUES ('233-2323-271', 'Current Account', parsedatetime('07/09/2019', 'dd/MM/yyyy'), 'AUD', null, 3540.98, 'Credit', null, 5);
INSERT INTO Transaction (account_number, account_name, value_date, currency, debit_amount, credit_amount, credit_debit, Transaction_narative, account_id)
 VALUES ('433-2323-281', 'Current Account', parsedatetime('06/09/2019', 'dd/MM/yyyy'), 'AUD', null, 7540.98, 'Credit', null, 5);