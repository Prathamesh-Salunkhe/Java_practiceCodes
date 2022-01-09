package company;

    public class CEo() {
	  public String login;
	  public String password;
   	  public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}

public class employee extends CEo() {
	public int Id;
	public String login;
	public String password;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}

public class Report extends CEo() {
	public int time;
	public date date;
	public String track;
	public String Project;
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public date getDate() {
		return date;
	}
	public void setDate(date date) {
		this.date = date;
	}
	public String getTrack() {
		return track;
	}
	public void setTrack(String track) {
		this.track = track;
	}
	public String getProject() {
		return Project;
	}
	public void setProject(String project) {
		Project = project;
	} 
}
public class Project extends CEo() {
	public int ID;
	public int TaskId;
	public int Access;
	public String Name;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getTaskId() {
		return TaskId;
	}
	public void setTaskId(int taskId) {
		TaskId = taskId;
	}
	public int getAccess() {
		return Access;
	}
	public void setAccess(int access) {
		Access = access;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
}
public class Sample {

}
