CREATE TABLE Account
(
  account_id                INT AUTO_INCREMENT PRIMARY KEY,
  account_number            VARCHAR(250) NOT NULL,
  account_name              VARCHAR(250) NOT NULL,
  account_type              VARCHAR(250) NOT NULL,
  balance_date              date,
  currency                  VARCHAR(250) NOT NULL,
  Opening_available_balance float
);

CREATE TABLE Transaction
(
  transaction_id       INT AUTO_INCREMENT PRIMARY KEY,
  account_number       VARCHAR(250) NOT NULL,
  account_name         VARCHAR(250) NOT NULL,
  value_date           date,
  currency             VARCHAR(250) NOT NULL,
  debit_amount         float,
  credit_amount        float,
  credit_debit         VARCHAR(250) NOT NULL,
  transaction_narative VARCHAR(250),
  account_id           INT,
  foreign key (account_id) references Account (account_id)
);

