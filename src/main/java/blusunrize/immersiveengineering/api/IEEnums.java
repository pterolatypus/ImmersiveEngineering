package blusunrize.immersiveengineering.api;

import net.minecraft.util.IStringSerializable;

public class IEEnums
{
	public static enum SideConfig implements IStringSerializable
	{
		NONE,
		INPUT,
		OUTPUT;

		@Override
		public String getName()
		{
			return this.toString();
		}
	}
}