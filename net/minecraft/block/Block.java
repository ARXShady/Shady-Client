/*Search for "ShouldSideBeRendered" and edit right underneath
this line public boolean shouldSideBeRendered(IBlockAccess worldIn, BlockPos pos, EnumFacing side)
    {*/
//Make sure to edit underneath the opening brace
//Your code should look like this at around line 454:

public boolean shouldSideBeRendered(IBlockAccess worldIn, BlockPos pos, EnumFacing side)
    {
    //TODO:Shady
    if(this == Block.getBlockById(15)) //Iron Ore
    return true;
    if(this == Block.getBlockById(16)) //Coal Ore
    return true;
    if(this == Block.getBlockById(56)) //Diamond Ore
    return true;
    if(Shady.theClient.moduleManager.xrayModule.getState())
    return false;
        return side == EnumFacing.DOWN && this.minY > 0.0D ? true : (side == EnumFacing.UP && this.maxY < 1.0D ? true : (side == EnumFacing.NORTH && this.minZ > 0.0D ? true : (side == EnumFacing.SOUTH && this.maxZ < 1.0D ? true : (side == EnumFacing.WEST && this.minX > 0.0D ? true : (side == EnumFacing.EAST && this.maxX < 1.0D ? true : !worldIn.getBlockState(pos).getBlock().isOpaqueCube())))));
    }
