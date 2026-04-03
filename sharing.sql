CREATE TABLE Contacts (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    username TEXT UNIQUE,
    email TEXT,
    isBorrower BOOLEAN
);

CREATE TABLE Items (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    name TEXT,
    status TEXT,
    borrower_id INTEGER,
    FOREIGN KEY (borrower_id) REFERENCES Contacts(id)
);

CREATE TABLE Dimensions (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    item_id INTEGER,
    width TEXT,
    height TEXT,
    length TEXT,
    FOREIGN KEY (item_id) REFERENCES Items(id)
);
