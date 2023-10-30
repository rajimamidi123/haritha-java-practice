package task.com.example;
import java.util.*;
public class Course {
private int courseId;
private String courseName;
List<Topic> topics;

public int getCourseId() {
	return courseId;
}
public void setCourseId(int courseId) {
	this.courseId = courseId;
}
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
public List<Topic> getTopics() {
	return topics;
}
public void setTopics(List<Topic> topics) {
	this.topics = topics;
}
@Override
public String toString() {
	return "Course [courseId=" + courseId + ", courseName=" + courseName + ", topics=" + topics + "]";
}

}

