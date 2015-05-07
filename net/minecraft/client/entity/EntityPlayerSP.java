//You can find these lines at around line 130
//Your code should look something like this
   
    /**
     * Called to update the entity's position/logic.
     */
    public void onUpdate()
    {
        if (this.worldObj.isBlockLoaded(new BlockPos(this.posX, 0.0D, this.posZ)))
        {
        	//TODO:Shady
        	for(Module m : Shady.theClient.moduleManager.activeModules){
        			m.onUpdate();
        	}
        	
            super.onUpdate();
