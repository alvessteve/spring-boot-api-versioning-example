DROP TABLE IF EXISTS tasks;

CREATE TABLE tasks (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(250) NOT NULL,
    deadline TIMESTAMP NOT NULL,
    done BOOLEAN DEFAULT FALSE
);

INSERT INTO tasks (title, deadline, done) VALUES
('Do laundry', '2021-01-01 00:00:01', false),
('Feed the dog', '20020-01-01 00:00:01', true),
('Paint my room', '2021-01-01 00:00:01', false);