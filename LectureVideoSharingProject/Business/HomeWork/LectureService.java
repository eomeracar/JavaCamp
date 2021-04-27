package HomeWork;

import java.util.ArrayList;

public class LectureService {
	private ArrayList<Lecture> lectures;
	public LectureService() {
		lectures=new ArrayList<Lecture>();
	}
	public ArrayList<Lecture> getLectures() {
		return lectures;
	}
	public void setLectures(ArrayList<Lecture> lectures) {
		this.lectures = lectures;
	}
	public void add(Lecture lecture) {
		this.lectures.add(lecture);
		System.out.println("Lecture is added");
	}
	public void delete(Lecture lecture) {
		this.lectures.remove(lecture);
		System.out.println("Lecture : "+lecture.getName() +" is deleted");
	}
	public void update(Lecture lecture) {
		int indexLecture=this.lectures.indexOf(lecture);
		this.lectures.set(indexLecture, lecture);
		System.out.println("Lecture is updated");
	}
	public Lecture getById(int id)
	{
		return lectures.stream().filter(l -> l.getId() == id).findFirst().get();
	}
	public ArrayList<Lecture> getAll(){
		return getLectures();
	}

}
