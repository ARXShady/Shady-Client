package me.arxshady.shady.modules;

import me.arxshady.shady.module.Category;
import me.arxshady.shady.module.Module;
import me.arxshady.shady.utils.Wrapper;

import org.lwjgl.input.Keyboard;

public class Sprint extends Module{
	
	public Sprint(){
		super("Sprint", Keyboard.KEY_G, Category.PLAYER);
	}
	
	public void onUpdate(){
		if(!this.getState()){
			return;
		}
		if(!(Wrapper.mc.thePlayer.isCollidedHorizontally) && Wrapper.mc.thePlayer.moveForward > 0.0f) {
			Wrapper.mc.thePlayer.setSprinting(true);
		}else{
			Wrapper.mc.thePlayer.setSprinting(false);
		}
	}

}
