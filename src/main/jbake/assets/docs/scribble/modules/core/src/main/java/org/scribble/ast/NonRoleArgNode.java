package org.scribble.ast;

import org.scribble.sesstype.Arg;
import org.scribble.sesstype.kind.NonRoleArgKind;

// sig or payloadtype kinds that can be used as do arg vals, cf. RoleNode
// "Value nodes" (sigs or names) that can be used as non-role subprotocol arguments (doesn't include role instantation arguments)
// N.B. not the actual argument node itself (that is NonRoleArg, element of NonRoleArgList, which wraps these nodes)
public interface NonRoleArgNode extends DoArgNode
{
	// Not kinded: point of this interface is don't know which kind the node is -- so use the "is" methods -- cf. AmbigNameNode inherits both sig and data kind
	// And not all values are names, e.g. message sigs
	default boolean isMessageSigNode()
	{
		return false;
	}

	default boolean isMessageSigNameNode()
	{
		return false;
	}

	default boolean isDataTypeNameNode()
	{
		return false;
	}

	default boolean isParamNode()
	{
		return false;
	}
	
	Arg<? extends NonRoleArgKind> toArg();
}
