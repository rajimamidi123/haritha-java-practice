package task.com.example;

import java.util.*;

public class CompanyManager {
	private int managerId;
	private String managerName;
	private List<Trainee> traineeList = new ArrayList<>();

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String addTrainee(Trainee tra) {
		this.traineeList.add(tra);
		return tra.toString();
	}

	public Trainee updateTrainee(int traineeId, Trainee trainee) {
		for (Trainee tra : traineeList) {
			if (tra.getTraineeId() == traineeId) {
				 tra.setTraineeName(trainee.getTraineeName());
				 tra.setCourse(trainee.getCourse());
				tra.setCourse(trainee.getCourse());
			
		}
		 return tra;
		 }
		return trainee;
		
		}
	

	public Trainee viewtraineeById(int traineeId) {
		for (Trainee tra : traineeList) {
			if (tra.getTraineeId() == traineeId) {
				return tra;
			}
		}
		return null;

	}

	public List<Trainee> viewAllTrainee() {
		return traineeList;

	}

	public Course updatCourses(Course c1, int traineeId, int courseId) {
		for (Trainee tra : traineeList) {
			if (tra.getTraineeId() == traineeId) {
				List<Course> course1 = tra.getCourse();
				for (Course c : course1) {
					if ((c.getCourseId() == courseId)) {
						c.setCourseName(c1.getCourseName());
						tra.setCourse(course1);
						System.out.println("updateCourses" + tra);
						return c;
					}
				}
				
			}
		}
		return c1;

	}

//	public	Course updateModuleOfCourseId(int courseId , Topic topic) {
//		for (Trainee tra : traineeList) {
//			if (tra.getTraineeId() == traineeId()) {
//				List<Course> course1 = tra.getCourse();
//				for(Course c1:course1) {
//					if(c1.getCourseId()==courseId) {
//						Course course;
//						c1.setCourseId((course.getCourseId());
//						c1.setCourseName(course.getCourseName());
//					c1.setpic(topic.getTopicId());
//						c1.setTopic(topic.getTopicName());
//						
//						}
//				}
//			return tra;
////			}
//		}
//		return null;
//	}
//}
}