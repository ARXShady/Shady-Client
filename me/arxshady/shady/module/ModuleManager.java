package me.arxshady.shady.module;

import java.util.ArrayList;

import me.arxshady.shady.modules.*;

public class ModuleManager {
	
	public static ArrayList<Module> activeModules = new ArrayList<Module>();
	
	public XRay xrayModule;
	
	public ModuleManager(){
		this.activeModules.add(new NoFall());
		this.activeModules.add(new Brightness());
		this.activeModules.add(new Flight());
		this.activeModules.add(this.xrayModule = new XRay());
		this.activeModules.add(new Sprint());
		this.activeModules.add(new FastPlace());
		this.activeModules.add(new AutoMine());
		this.activeModules.add(new AutoWalk());
	}

}
