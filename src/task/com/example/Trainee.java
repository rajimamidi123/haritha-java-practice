package task.com.example;

import java.util.List;

public class Trainee {
	private int traineeId;
	private String traineeName;

	List<Course> course;

	public int getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}

	public String getTraineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

public List<Course> viewAssignedCourses(int traineedId) {
	
	
		return  null;
}

@Override
public String toString() {
	return "Trainee [traineeId=" + traineeId + ", traineeName=" + traineeName + ", course=" + course + "]";
}
	
}
