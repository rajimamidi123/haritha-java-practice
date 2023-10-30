package task.com.example;

import java.util.List;

public class Mentor {
private int mentorId;
private String mentorName;
public int getMentorId() {
	return mentorId;
}
public void setMentorId(int mentorId) {
	this.mentorId = mentorId;
}
public String getMentorName() {
	return mentorName;
}
public void setMentorName(String mentorName) {
	this.mentorName = mentorName;
}
public  Object viewtraineeById(int traineeid) {
	return null;
}
public List<Trainee> viewAllTrainees() {
	return null;
}
public Trainee addTrainee() {
	return null;
}
public Trainee updateTrainee( int traineeId, Trainee trainee) {
	return null;
}
public Trainee assignCoursestoTrainee(int traineedId,int courseId) {
	return null;
}
public Course updateCourses(int traineedId,int CourseId) {
	return null;
}
public Course updateModuleofCourseId(int courseId,Topic topics) {
	return null;
}
@Override
public String toString() {
	return "Mentor [mentorId=" + mentorId + ", mentorName=" + mentorName + "]";
}

}

