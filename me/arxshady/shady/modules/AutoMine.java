package me.arxshady.shady.modules;

import me.arxshady.shady.module.Category;
import me.arxshady.shady.module.Module;
import me.arxshady.shady.utils.Wrapper;

import org.lwjgl.input.Keyboard;

public class AutoMine extends Module{
	
	public AutoMine(){
		super("Auto Mine", Keyboard.KEY_SEMICOLON, Category.PLAYER);
	}
	
	public void onUpdate(){
		if(this.getState()){
			Wrapper.mc.gameSettings.keyBindAttack.pressed = true;
		}
	}
	
	public void onDisable(){
		Wrapper.mc.gameSettings.keyBindAttack.pressed = false;
	}

}
