package model;

public class UserProperties {
		int id;
		String travelDestination;
		String goingPurpose;
		int beginTravel;
		int endTravel;
		int cost;
		String projectcode;
		int IdUser;
		
		
		
		
		
		public UserProperties() {
			super();
		}
		public UserProperties(int id, String travelDestination, String goingPurpose, int beginTravel, int endTravel,
				int cost, String projectcode, int idUser) {
			super();
			this.id = id;
			this.travelDestination = travelDestination;
			this.goingPurpose = goingPurpose;
			this.beginTravel = beginTravel;
			this.endTravel = endTravel;
			this.cost = cost;
			this.projectcode = projectcode;
			IdUser = idUser;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getTravelDestination() {
			return travelDestination;
		}
		public void setTravelDestination(String travelDestination) {
			this.travelDestination = travelDestination;
		}
		public String getGoingPurpose() {
			return goingPurpose;
		}
		public void setGoingPurpose(String goingPurpose) {
			this.goingPurpose = goingPurpose;
		}
		public int getBeginTravel() {
			return beginTravel;
		}
		public void setBeginTravel(int beginTravel) {
			this.beginTravel = beginTravel;
		}
		public int getEndTravel() {
			return endTravel;
		}
		public void setEndTravel(int endTravel) {
			this.endTravel = endTravel;
		}
		public int getCost() {
			return cost;
		}
		public void setCost(int cost) {
			this.cost = cost;
		}
		public String getProjectcode() {
			return projectcode;
		}
		public void setProjectcode(String projectcode) {
			this.projectcode = projectcode;
		}
		public int getIdUser() {
			return IdUser;
		}
		public void setIdUser(int idUser) {
			IdUser = idUser;
		}
		
		
		
		
		
		
		
}
