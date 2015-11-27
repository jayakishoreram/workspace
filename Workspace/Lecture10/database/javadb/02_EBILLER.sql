-------------------------------------------------------------------------------------------
-- EBILLER
-------------------------------------------------------------------------------------------
CREATE TABLE EBILLER
(
  EBILLER_ID		        BIGINT		    NOT NULL GENERATED BY DEFAULT AS IDENTITY,
  NAME			            VARCHAR(50)	    NOT NULL,
  BILLING_ADDRESS	        VARCHAR(200)    NOT NULL,
  PHONE			            VARCHAR(20)	    NOT NULL
);


-------------
--PRIMARY KEY
-------------

ALTER TABLE EBILLER ADD CONSTRAINT EBILLER_PK PRIMARY KEY
    (EBILLER_ID);
