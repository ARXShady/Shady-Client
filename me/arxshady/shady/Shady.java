package me.arxshady.shady;

import me.arxshady.shady.module.ModuleManager;

import org.lwjgl.opengl.Display;

public class Shady {
	
	public static String Client_Name = "Shady";
	public static double Client_Version = 1.0;
	
	public static ModuleManager moduleManager;
	
	public static final Shady theClient = new Shady();
	
	public static void StartClient(){
		moduleManager = new ModuleManager();
		Display.setTitle(Client_Name + " (rel-" + Client_Version + ")");
	}

	public static String getClient_Name() {
		return Client_Name;
	}

	public static void setClient_Name(String client_Name) {
		Client_Name = client_Name;
	}

	public static double getClient_Version() {
		return Client_Version;
	}

	public static void setClient_Version(double client_Version) {
		Client_Version = client_Version;
	}
	
	

}
