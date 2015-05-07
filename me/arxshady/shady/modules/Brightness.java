package me.arxshady.shady.modules;

import me.arxshady.shady.Shady;
import me.arxshady.shady.module.Category;
import me.arxshady.shady.module.Module;
import me.arxshady.shady.utils.Wrapper;

import org.lwjgl.input.Keyboard;

public class Brightness extends Module{
	
	public Brightness(){
		super("Brightness", Keyboard.KEY_B, Category.WORLD);
	}
	
	public void onUpdate(){
		if(this.getState() || Shady.theClient.moduleManager.xrayModule.getState()){
			Wrapper.mc.gameSettings.gammaSetting = 10f;
		}else{
			Wrapper.mc.gameSettings.gammaSetting = 1f;
		}
	}

}
