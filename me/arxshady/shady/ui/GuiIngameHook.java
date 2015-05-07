package me.arxshady.shady.ui;

import me.arxshady.shady.Shady;
import me.arxshady.shady.module.Module;
import me.arxshady.shady.utils.Wrapper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.gui.ScaledResolution;

public class GuiIngameHook extends GuiIngame{

	public GuiIngameHook(Minecraft mcIn) {
		super(mcIn);
	}
	
	public void func_175180_a(float p_175180_1_){
		super.func_175180_a(p_175180_1_);
		ScaledResolution sr = new ScaledResolution(Minecraft.getMinecraft(), Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight);
		
		Wrapper.fr.drawString(Shady.Client_Name + " (rel-" + Shady.Client_Version + ")", 1, 1, 0xffffffff);
		int i = 0;
		for(Module m: Shady.theClient.moduleManager.activeModules){
			m.onRender();
			
			if(m.getState()){
				int width = sr.getScaledWidth() - Wrapper.fr.getStringWidth(m.getName()) - 2;
				int height = (10 * i);
				Wrapper.fr.drawString(m.getName(), width, height, 0xff0000);
				i++;
			}
		}
	}

}
