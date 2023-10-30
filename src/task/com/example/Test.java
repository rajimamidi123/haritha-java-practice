package task.com.example;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		Topic p = new Topic();
		p.setTopicId(101);
		p.setTopicName("Datatypes");
		Topic p1 = new Topic();
		p1.setTopicId(102);
		p1.setTopicName("springboot");
		Topic p2 = new Topic();
		p2.setTopicId(103);
		p2.setTopicName("styles");
		List<Topic> topic=new ArrayList<>();
		topic.add(p2);
		topic.add(p1);
		topic.add(p);
		Course c = new Course();
		c.setCourseId(11);
		c.setCourseName("java");
		c.setTopics(List.of(p,p1));
		Course c1 = new Course();
		c1.setCourseId(12);
		c1.setCourseName("adavanced java");
		c1.setTopics(List.of(p2,p1));
		Course c2 = new Course();
		c2.setCourseId(13);
		c2.setCourseName("angular");
		c2.setTopics(List.of(p,p2));
		Course c3 = new Course();
		c3.setCourseName("angular");
		c3.setTopics(List.of(p,p2));
		List<Course> course =new ArrayList<>();
		course.add(c2);
		course.add(c1);
		course.add(c);
		Trainee t = new Trainee();
		t.setTraineeId(1);
		t.setTraineeName("vamshi");
		t.setCourse(List.of(c1,c2));
		Trainee t1 = new Trainee();
		t1.setTraineeId(2);
		t1.setTraineeName("sowmya");
		t1.setCourse(List.of(c,c1));
		Trainee t2 = new Trainee();
		t2.setTraineeId(3);
		t2.setTraineeName("raji");
		t2.setCourse(List.of(c,c2));
		Trainee t3 = new Trainee();
//		t2.setTraineeId(1);
		t3.setTraineeName("raju");
		t3.setCourse(List.of(c,c1));
		List<Trainee> trainee=new ArrayList<>();
		trainee.add(t2);
		trainee.add(t1);
		trainee.add(t);
		Mentor m = new Mentor();
		m.setMentorId(1001);
		m.setMentorName("sri");
		Mentor m1 = new Mentor();
		m1.setMentorId(1002);
		m1.setMentorName("sai");
		Mentor m2 = new Mentor();
		m2.setMentorId(1002);
		m2.setMentorName("baba");
		List<Mentor> mentor=new ArrayList<>();
		mentor.add(m2);
		mentor.add(m1);
		mentor.add(m);
//		m1.addTrainee(t1);
		CompanyManager cm = new CompanyManager();
		//cm.viewtraineeById(2);
		cm.addTrainee(t);	
	    cm.addTrainee(t1);
	
	    cm.addTrainee(t2);
	
	System.out.println("========>"+cm.viewtraineeById(3));
	System.out.println("+>"+cm.viewAllTrainee());
	System.out.println("--"+cm.updateTrainee(1, t3));
	System.out.println(">>>"+cm.updatCourses(c3, 1,11 ));
	System.out.println(","+cm.addTrainee(t));
	}
}
