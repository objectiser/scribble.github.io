package org.scribble.model.endpoint.actions;

import org.scribble.model.MAction;
import org.scribble.model.global.actions.SAction;
import org.scribble.sesstype.Payload;
import org.scribble.sesstype.kind.Local;
import org.scribble.sesstype.name.MessageId;
import org.scribble.sesstype.name.Role;

public abstract class EAction extends MAction<Local>
{
	public final Role peer;
	/*public final MessageId<?> mid;
	public final Payload payload;  // Empty for MessageSigNames*/
	
	protected EAction(Role peer, MessageId<?> mid, Payload payload)
	{
		/*this.mid = mid;
		this.payload = payload;*/
		super(peer, mid, payload);
		this.peer = peer;
	}
	
	public abstract EAction toDual(Role self);

	//public abstract GModelAction toGlobal(Role self);
	public abstract SAction toGlobal(Role self);

	public boolean isSend()
	{
		return false;
	}
	
	public boolean isReceive()
	{
		return false;
	}

	public boolean isConnect()
	{
		return false;
	}

	public boolean isDisconnect()
	{
		return false;
	}

	public boolean isAccept()
	{
		return false;
	}

	public boolean isWrapClient()
	{
		return false;
	}

	public boolean isWrapServer()
	{
		return false;
	}
	
	/*@Override
	public String toString()
	{
		return this.peer + getCommSymbol() + this.mid + this.payload;
	}
	
	protected abstract String getCommSymbol();*/
	
	/*@Override
	public int hashCode()
	{
		int hash = 919;
		hash = 31 * hash + super.hashCode();
		hash = 31 * hash + this.peer.hashCode();  // No: peer is this.obj
		return hash;
	}*/

	/*@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof IOAction))
		{
			return false;
		}
		IOAction a = (IOAction) o;
		return a.canEqual(this) && 
				this.peer.equals(a.peer) && this.mid.equals(a.mid) && this.payload.equals(a.payload);
	}
	
	public abstract boolean canEqual(Object o);*/
}
