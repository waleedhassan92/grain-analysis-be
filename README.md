# Database Setup

Run the following commands in MySQL to create the database and tables.

```sql
CREATE DATABASE grain_analysis;

USE grain_analysis;

CREATE TABLE GrainData (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    type VARCHAR(50) NOT NULL,
    quantity INT NOT NULL,
    percentage_nami FLOAT NOT NULL,
    status ENUM('Accepted', 'Rejected') NOT NULL
);
```

Add seed data to the database.

```sql

INSERT INTO GrainData (type, quantity, percentage_nami, status) VALUES
    ('Paddy', 500, 12.5, 'Accepted'),
    ('Paddy', 450, 10.2, 'Rejected'),
    ('Paddy', 600, 15.8, 'Accepted'),
    ('Rice', 300, 8.3, 'Accepted'),
    ('Rice', 420, 9.7, 'Rejected'),
    ('Rice', 550, 11.1, 'Accepted'),
    ('Grains', 200, 5.0, 'Rejected'),
    ('Grains', 230, 6.5, 'Accepted'),
    ('Grains', 400, 7.9, 'Accepted'),
    ('Wheat', 480, 10.4, 'Rejected'),
    ('Wheat', 530, 12.2, 'Accepted'),
    ('Wheat', 620, 13.5, 'Accepted');
```