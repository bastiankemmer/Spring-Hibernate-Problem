THIS IS ONLY A SHOWCASE PROJECT

# Spring-Hibernate-Problem
while load testing, i get a org.apache.tomcat.jdbc.pool.PoolExhaustedException

This is, because I have to process all DB-Items and it gets slower the more requests I get.

Like that:

01 Request(s)  |  04 seconds
05 Request(s)  |  06 seconds
10 Request(s)  |  12 seconds
20 Request(s)  |  24 seconds
40 Request(s)  |  48 seconds

It seems like the connection doesn't get closed until the Thread gets closed. 

So if I just simulate heavy processing with Thread.sleep(20000); it will reproduce my Problem.
