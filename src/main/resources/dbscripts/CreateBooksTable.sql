CREATE TABLE books (
                       id SERIAL PRIMARY KEY,
                       title VARCHAR(255) NOT NULL,
                       author VARCHAR(255) NOT NULL,
                       genre VARCHAR(255),
                       release_date DATE,
                       stock INTEGER,
                       price DECIMAL(10, 2) NOT NULL
);

INSERT INTO books (title, author, genre, release_date, stock, price)
VALUES
    ('Harry Potter and the Philosopher''s Stone', 'J.K. Rowling', 'Fantasy', '1997-06-26', 5, 450),
    ('Harry Potter and the Chamber of Secrets', 'J.K. Rowling', 'Fantasy', '1998-07-02', 6, 480),
    ('Harry Potter and the Prisoner of Azkaban', 'J.K. Rowling', 'Fantasy', '1999-07-08', 2, 500),
    ('Harry Potter and the Goblet of Fire', 'J.K. Rowling', 'Fantasy', '2000-07-08', 8, 520),
    ('Harry Potter and the Order of the Phoenix', 'J.K. Rowling', 'Fantasy', '2003-06-21', 12, 550),
    ('Harry Potter and the Half-Blood Prince', 'J.K. Rowling', 'Fantasy', '2005-07-16', 15, 580),
    ('Harry Potter and the Deathly Hallows', 'J.K. Rowling', 'Fantasy', '2007-07-21', 1, 600),
    ('The Last Wish', 'Andrzej Sapkowski', 'Fantasy', '1993-12-01', 8, 450),
    ('Sword of Destiny', 'Andrzej Sapkowski', 'Fantasy', '1992-05-01', 30, 480),
    ('Blood of Elves', 'Andrzej Sapkowski', 'Fantasy', '1994-05-01', 5, 500),
    ('Time of Contempt', 'Andrzej Sapkowski', 'Fantasy', '1995-11-01', 6, 520),
    ('Baptism of Fire', 'Andrzej Sapkowski', 'Fantasy', '1996-05-01', 7, 550),
    ('The Tower of Swallows', 'Andrzej Sapkowski', 'Fantasy', '1997-05-01', 2, 580),
    ('The Lady of the Lake', 'Andrzej Sapkowski', 'Fantasy', '1999-05-01', 3, 600);

