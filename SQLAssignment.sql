SELECT * FROM ssql.emp;
#Question 1
#Write a mysql statement to find the employee salary is greater than 300000

SELECT emp_name
FROM ssql.emp
WHERE salary>=300000;


#Question 2
#Write mysql statement to show distinct departments

SELECT DISTINCT department FROM ssql.emp;


#Question 3
# Write mysql statement to get records of employees working in IT,Testing department

SELECT * FROM ssql.emp
WHERE department='IT' OR department='Testing';


#Question 4
#Write mysql statements to get all department descending order

SELECT * FROM ssql.emp
ORDER BY department DESC;


#Question 5
#Write a mysql statement to create a table employee which already exist

CREATE TABLE ssql.Employee AS
   SELECT emp_name, designation,salary,address,department
   FROM ssql.emp;


#question 6
#Write a mysql statement to find the Highest and lowest pais salary employee full record

SELECT MAX(salary), MIN(salary)
FROM   ssql.emp;


#Question 7
#Write a mysql statement to find all the employees that have worked in at least 2 departments

SELECT department,
       count(*)
FROM ssql.emp
GROUP BY department
HAVING count(*) >= 2;


#Question 8
# Write a mysql statement to create new database,use newly created database,create table and check the list of tables and drop the table

show tables from ssql;


#Question 9
#Write a mysql statementto fetch employee records whose designation is manager and salary is between 200000 to 300000

SELECT *
FROM ssql.emp
WHERE designation='manager' and  salary BETWEEN 200000 AND 300000;


#Question 10
#Write a mysql statement to update the salary by 20000 in Accounts department
SET SQL_SAFE_UPDATES = 0;
UPDATE ssql.emp
SET salary=(salary+20000)
WHERE department='Accounts';
SET SQL_SAFE_UPDATES = 1;
#UPDATE ssql.yash SET salary=salary+20000 WHERE department='Accounts';

#Question 11
#Write a mysql statement to alter table by adding new column as doj(date of joining) into the employee table

ALTER TABLE ssql.emp
ADD doj DATE;


#Question 12
#Write a mysql statement to rename the employee table.
ALTER TABLE ssql.emp RENAME TO ssql.Empoyee;


#Question 13
#Write a mysql statement to get names which are NOT NULL.

SELECT *
FROM ssql.Empoyee
WHERE emp_name IS NOT NULL;


#Question 14
#Write a mysql statement to get null doj values

SELECT *
FROM ssql.Empoyee
WHERE doj IS NULL;


#Question 15
#Write a mysql statement to get salary between 100000 to 20000 in Accounts and IT departments

SELECT *
FROM ssql.Empoyee
WHERE department='IT' OR department='Accounts' and  salary BETWEEN 200000 AND 100000;


#Question 16
#Any query

SELECT emp_name
FROM ssql.Empoyee
WHERE department = ANY (SELECT emp_name FROM ssql.employee WHERE salary =230000);


SELECT emp_name FROM ssql.Emp WHERE salary <>ANY (SELECT designation FROM ssql.employee);