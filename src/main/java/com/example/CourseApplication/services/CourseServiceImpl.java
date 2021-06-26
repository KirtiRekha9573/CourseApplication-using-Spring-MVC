package com.example.CourseApplication.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CourseApplication.dao.CourseDao;
import com.example.CourseApplication.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	private CourseDao courseDao;
	
	//List<Course> list;
	
	//Constructor//
	public CourseServiceImpl()
	{
		//Creating an array list//
		//list = new ArrayList<>();
		//list.add(new Course(123, "Java Core Course", "This core contains basics of Java"));
		//list.add(new Course(345, "Spring Boot Course", "Creating REST API using Spring Boot"));
	}

	@Override
	public List<Course> getCourses() {
		
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(long courseId) {
		
		//Course c = null;
		//For each loop for traversing through the list//
		//for(Course course: list)
		//{
			//if(course.getId() == courseId)
			//{
				//c = course;
				//break;
			//}
		//}
		return courseDao.getOne(courseId);
	}

	@Override
	public Course addCourse(Course course) {
		//list.add(course);
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		//list.forEach(e -> 
		//{
			//if(e.getId() == course.getId())
			//{
				//e.setTitle(course.getTitle());
				//e.setDescription(course.getDescription());
			//}
		//});
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long parseLong) {
		//list = this.list.stream().filter(e ->e.getId() != parseLong).collect(Collectors.toList());
		//We will first load the entity and then we will delete it//
		Course entity = courseDao.getOne(parseLong);
		courseDao.delete(entity);
	}
	
	

}
