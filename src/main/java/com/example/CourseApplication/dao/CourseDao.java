package com.example.CourseApplication.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CourseApplication.entities.Course;

//We are using course as entity and its primary key we are using is ID. ID consists of type Long//
public interface CourseDao extends JpaRepository<Course, Long>
{
	
}
