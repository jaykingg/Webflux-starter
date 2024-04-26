CREATE TABLE IF NOT EXISTS Guide
(
    ID        BIGINT AUTO_INCREMENT,
    TITLE     VARCHAR(30)          NOT NULL,
    AUTHOR    VARCHAR(30)          NOT NULL,
    TYPE      VARCHAR(100)         NOT NULL,
    ENABLE    BOOLEAN DEFAULT TRUE NOT NULL,
    CREATE_AT DATETIME,
    UPDATE_AT DATETIME,
    CONSTRAINT GUILD_PK PRIMARY KEY (ID)
);