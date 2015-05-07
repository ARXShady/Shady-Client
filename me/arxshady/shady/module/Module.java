package me.arxshady.shady.module;

public class Module {
	
	private String name;
	private int bind;
	private Category category;
	private boolean isEnabled;
	
	public Module(String name, int bind, Category category){
		this.name = name;
		this.bind = bind;
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public int getBind() {
		return bind;
	}

	public Category getCategory() {
		return category;
	}
	
	public boolean getState(){
		return isEnabled;
	}
	
	public void setState(boolean state){
		this.onToggle();
		if(state){
			this.onEnable();
			this.isEnabled = true;
		}else{
			this.onDisable();
			this.isEnabled = false;
		}
	}
	
	public void onToggle(){}
	public void onEnable(){}
	public void onDisable(){}
	public void onUpdate(){}
	public void onRender(){}

	public void toggleModule() {
		this.setState(!this.getState());
	}

}
