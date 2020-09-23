DROP TABLE IF EXISTS tasks;

CREATE TABLE tasks (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(250) NOT NULL,
    deadline DATETIME NOT NULL,
    done BOOLEAN DEFAULT FALSE
);

INSERT INTO tasks (title, deadline, done) VALUES
('Do laundry', '2021-01-01T01:30:00', false),
('Feed the dog', '2021-01-01T01:30:00', true),
('Paint my room', '2021-01-01T01:30:00', false);


ALTER TABLE TASKS ADD COLUMN owner VARCHAR(150) DEFAULT NULL;