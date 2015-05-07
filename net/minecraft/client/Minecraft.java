//You can find this part at line 559
//Edit right underneath "this.checkGLError("Post startup");

this.checkGLError("Post startup");
        //TODO:Cryton
        this.ingameGUI = new GuiIngameHook(this);
        
//You can find this at line 585
//Edit right underneath the closing brace at "this.gameSettings.saveOptions();

        catch (OpenGLException var2)
        {
            this.gameSettings.enableVsync = false;
            this.gameSettings.saveOptions();
        }
        
        //TODO:Shady
        Shady.StartClient();
        
//You can find the following code at line 1920
//Add in the TODO
//The code should stop at the last brace in the provided code

                if (Keyboard.getEventKeyState())
                {
                    if (var1 == 62 && this.entityRenderer != null)
                    {
                        this.entityRenderer.func_175071_c();
                    }

                    if (this.currentScreen != null)
                    {
                        this.currentScreen.handleKeyboardInput();
                    }
                    else
                    {
                    	//TODO:Cryton
                    	for(Module m : Cryton.theClient.moduleManager.activeModules){
                    		if(var1 == m.getBind()){
                    			m.toggleModule();
                    		}
                    	}
