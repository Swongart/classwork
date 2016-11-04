package caveExplorer6;

public class Door {
	private boolean locked;
	private boolean open;
	private String description;
	private String details;
	
	public Door(){
		locked = false;
		open = true;
		description = "passage";
		details = "";
		
	}
	public void setLock(boolean b){
		this.locked = b;
	}
	public boolean isLocked(){
		return locked;
	}
	public boolean isOpen() {
		return open;
	}
	public void setOpen(boolean open) {
		this.open = open;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	
}

