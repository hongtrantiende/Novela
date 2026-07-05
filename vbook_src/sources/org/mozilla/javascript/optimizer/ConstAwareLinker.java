package org.mozilla.javascript.optimizer;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import jdk.dynalink.StandardNamespace;
import jdk.dynalink.StandardOperation;
import jdk.dynalink.linker.GuardedInvocation;
import jdk.dynalink.linker.LinkRequest;
import jdk.dynalink.linker.LinkerServices;
import jdk.dynalink.linker.TypeBasedGuardingDynamicLinker;
import jdk.dynalink.linker.support.Guards;
import org.mozilla.javascript.NativeWith;
import org.mozilla.javascript.RhinoException;
import org.mozilla.javascript.ScriptableObject;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
class ConstAwareLinker implements TypeBasedGuardingDynamicLinker {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    private Object getConstValue(Object obj, String str) {
        if (obj instanceof NativeWith) {
            return getConstValue(((NativeWith) obj).getPrototype(), str);
        }
        try {
            ScriptableObject scriptableObject = (ScriptableObject) obj;
            if (scriptableObject.has(str, scriptableObject)) {
                int attributes = scriptableObject.getAttributes(str);
                if ((attributes & 1) != 0 && (attributes & 4) != 0 && (attributes & 8) == 0) {
                    return scriptableObject.get(str, scriptableObject);
                }
                return null;
            }
            return null;
        } catch (RhinoException unused) {
            return null;
        }
    }

    public boolean canLinkType(Class<?> cls) {
        if (!ScriptableObject.class.isAssignableFrom(cls) && !NativeWith.class.isAssignableFrom(cls)) {
            return false;
        }
        return true;
    }

    public GuardedInvocation getGuardedInvocation(LinkRequest linkRequest, LinkerServices linkerServices) {
        Object constValue;
        if (linkRequest.isCallSiteUnstable()) {
            return null;
        }
        ParsedOperation parsedOperation = new ParsedOperation(linkRequest.getCallSiteDescriptor().getOperation());
        Object receiver = linkRequest.getReceiver();
        if (((!parsedOperation.isNamespace(RhinoNamespace.NAME) || !parsedOperation.isOperation(StandardOperation.GET)) && (!parsedOperation.isNamespace(StandardNamespace.PROPERTY) || !parsedOperation.isOperation(StandardOperation.GET, RhinoOperation.GETNOWARN))) || (constValue = getConstValue(receiver, parsedOperation.getName())) == null) {
            return null;
        }
        MethodType methodType = linkRequest.getCallSiteDescriptor().getMethodType();
        MethodHandle asType = Guards.asType(Guards.getIdentityGuard(receiver), methodType);
        MethodHandle dropArguments = MethodHandles.dropArguments(MethodHandles.constant(Object.class, constValue), 0, methodType.parameterList());
        if (DefaultLinker.DEBUG) {
            System.out.println(String.valueOf(parsedOperation).concat(": constant"));
        }
        return new GuardedInvocation(dropArguments, asType);
    }
}
