-- Last updated: 9/14/2026, 1:21:56 PM
# Write your MySQL query statement below
select name
from employee
where id in(
    select managerID
     from employee
     group by managerID
     having count(*) >=5

    
);