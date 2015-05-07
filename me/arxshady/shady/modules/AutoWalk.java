package me.arxshady.shady.modules;

import me.arxshady.shady.module.Category;
import me.arxshady.shady.module.Module;
import me.arxshady.shady.utils.Wrapper;

import org.lwjgl.input.Keyboard;

public class AutoWalk extends Module{
	
	public AutoWalk(){
		super("Auto Walk", Keyboard.KEY_APOSTROPHE, Category.PLAYER);
	}
	
	public void onUpdate(){
		if(getState()){
			Wrapper.mc.gameSettings.keyBindForward.pressed = true;
		}
	}
	
	public void onDisable(){
		Wrapper.mc.gameSettings.keyBindForward.pressed = false;
	}

}
