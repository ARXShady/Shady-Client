package me.arxshady.shady.modules;

import me.arxshady.shady.module.Category;
import me.arxshady.shady.module.Module;
import me.arxshady.shady.utils.Wrapper;

import org.lwjgl.input.Keyboard;

public class FastPlace extends Module{
	
	public FastPlace(){
		super("FastPlace", Keyboard.KEY_PERIOD, Category.PLAYER);
	}
	
	public void onUpdate(){
		if(this.getState()){
			Wrapper.mc.rightClickDelayTimer = 0;
		}
	}
	
	public void onDisable(){
		Wrapper.mc.rightClickDelayTimer = 6;
	}

}
