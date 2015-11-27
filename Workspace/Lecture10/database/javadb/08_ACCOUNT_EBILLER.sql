-------------------------------------------------------------------------------------------
-- ACCOUNT_EBILLER
-------------------------------------------------------------------------------------------
CREATE TABLE ACCOUNT_EBILLER
(
  ACCOUNT_EBILLER_ID		BIGINT	        NOT NULL GENERATED BY DEFAULT AS IDENTITY,
  ACCOUNT_ID          		BIGINT          NOT NULL,
  EBILLER_ID                BIGINT          NOT NULL,
  ACCOUNT_OWNER_ID          BIGINT          NOT NULL,
  ACCOUNT_NUMBER			VARCHAR(50)	    NOT NULL,
  DATE_ADDED				TIMESTAMP       NOT NULL
);


-------------
--PRIMARY KEY
-------------

ALTER TABLE ACCOUNT_EBILLER ADD CONSTRAINT ACCTEBILLER_PK PRIMARY KEY
    (ACCOUNT_EBILLER_ID);


--------------
--FOREIGN KEYS
--------------

ALTER TABLE ACCOUNT_EBILLER ADD CONSTRAINT ACCTEBILLER_ACCT_FK FOREIGN KEY
    (ACCOUNT_ID)
    REFERENCES ACCOUNT (ACCOUNT_ID);


ALTER TABLE ACCOUNT_EBILLER ADD CONSTRAINT ACCTEBILLER_EBILLER_FK FOREIGN KEY
    (EBILLER_ID)
    REFERENCES EBILLER (EBILLER_ID);

ALTER TABLE ACCOUNT_EBILLER ADD CONSTRAINT ACCTEBILLER_ACCTOWNR_FK FOREIGN KEY
    (ACCOUNT_OWNER_ID)
    REFERENCES ACCOUNT_OWNER (ACCOUNT_OWNER_ID);
