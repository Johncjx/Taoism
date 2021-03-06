package com.Jackiecrazi.taoism.networking;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

import com.Jackiecrazi.taoism.Taoism;
import com.Jackiecrazi.taoism.client.gui.TaoisticGuiHandler;

public class PacketOpenTPInv implements IMessage {
	private int id;
	private boolean act;
	public PacketOpenTPInv() {}

	public PacketOpenTPInv(EntityPlayer p,boolean ac){
		id=p.getEntityId();
		act=ac;
	}
	@Override
	public void fromBytes(ByteBuf buf) {
		id=buf.readInt();
		act=buf.readBoolean();
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeInt(id);
		buf.writeBoolean(act);
	}
	public static class InvPacketHandler implements IMessageHandler<PacketOpenTPInv,IMessage>{

		@Override
		public IMessage onMessage(PacketOpenTPInv message,
				MessageContext ctx) {
			final EntityPlayer thePlayer = (EntityPlayer) Taoism.proxy
					.getPlayerEntityFromContext(ctx);

			EntityPlayer theEntity = (EntityPlayer) thePlayer.world.getEntityByID(message.id);
			if(message.act)
				theEntity.openGui(Taoism.inst, TaoisticGuiHandler.INV, thePlayer.world, (int)thePlayer.posX, (int)thePlayer.posY, (int)thePlayer.posZ);
			else
				theEntity.closeScreen();
			return null;
		}

	}
}
