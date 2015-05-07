package me.arxshady.shady.modules;

import java.util.ArrayList;

import me.arxshady.shady.module.Category;
import me.arxshady.shady.module.Module;
import me.arxshady.shady.utils.Wrapper;
import me.arxshady.shady.utils.XRayUtils;
import net.minecraft.block.Block;

import org.lwjgl.input.Keyboard;

public class XRay extends Module{
	
	public ArrayList<Block> xrayBlocks = new ArrayList<Block>();
	
	public XRay(){
		super("X-Ray", Keyboard.KEY_X, Category.RENDER);
	}
	
	public void onEnable(){
		XRayUtils.isXRay = true;
		Wrapper.mc.renderGlobal.loadRenderers();
	}
	
	public void onDisable(){
		XRayUtils.isXRay = false;
		Wrapper.mc.renderGlobal.loadRenderers();
	}
	
	public boolean isXrayBlock(Block blockToCheck){
		if(this.xrayBlocks.contains(blockToCheck)){
			return true;
		}
		return false;
	}

}
