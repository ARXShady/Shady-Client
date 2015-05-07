package me.arxshady.shady.modules;

import org.lwjgl.input.Keyboard;

import me.arxshady.shady.module.Category;
import me.arxshady.shady.module.Module;
import me.arxshady.shady.utils.Wrapper;

public class Flight extends Module{
	
	public Flight(){
		super("Flight", Keyboard.KEY_R, Category.PLAYER);
	}
	
	public void onUpdate(){
		if(!this.getState()){
			return;
		}
		Wrapper.mc.thePlayer.capabilities.isFlying = true;
	}
	
	public void onDisable(){
		Wrapper.mc.thePlayer.capabilities.isFlying = false;
	}

}
