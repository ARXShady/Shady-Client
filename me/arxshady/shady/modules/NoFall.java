package me.arxshady.shady.modules;

import me.arxshady.shady.module.Category;
import me.arxshady.shady.module.Module;
import me.arxshady.shady.utils.Wrapper;
import net.minecraft.network.play.client.C03PacketPlayer;

import org.lwjgl.input.Keyboard;

public class NoFall extends Module{
	
	public NoFall(){
		super("NoFall", Keyboard.KEY_N, Category.PLAYER);
	}
	
	public void onUpdate(){
		if(getState()){
			if(Wrapper.mc.thePlayer.fallDistance > 2F){
				Wrapper.mc.thePlayer.sendQueue.addToSendQueue(new C03PacketPlayer(true));
			}
		}
	}

}
