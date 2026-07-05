package org.mozilla.javascript.optimizer;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import jdk.dynalink.StandardNamespace;
import jdk.dynalink.StandardOperation;
import jdk.dynalink.linker.GuardedInvocation;
import jdk.dynalink.linker.LinkRequest;
import jdk.dynalink.linker.LinkerServices;
import jdk.dynalink.linker.TypeBasedGuardingDynamicLinker;
import jdk.dynalink.linker.support.Guards;
import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
class BaseFunctionLinker implements TypeBasedGuardingDynamicLinker {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    private static Object getPrototype(Object obj, Context context, Scriptable scriptable) {
        return ((BaseFunction) obj).getPrototypeProperty();
    }

    public boolean canLinkType(Class<?> cls) {
        return BaseFunction.class.isAssignableFrom(cls);
    }

    public GuardedInvocation getGuardedInvocation(LinkRequest linkRequest, LinkerServices linkerServices) {
        MethodHandle methodHandle;
        MethodHandle methodHandle2;
        if (linkRequest.isCallSiteUnstable()) {
            return null;
        }
        ParsedOperation parsedOperation = new ParsedOperation(linkRequest.getCallSiteDescriptor().getOperation());
        if (parsedOperation.isNamespace(StandardNamespace.PROPERTY) && parsedOperation.isOperation(StandardOperation.GET, RhinoOperation.GETNOWARN) && "prototype".equals(parsedOperation.getName())) {
            methodHandle = MethodHandles.lookup().findStatic(BaseFunctionLinker.class, "getPrototype", linkRequest.getCallSiteDescriptor().getMethodType());
            methodHandle2 = Guards.getInstanceOfGuard(BaseFunction.class);
        } else {
            methodHandle = null;
            methodHandle2 = null;
        }
        if (methodHandle == null) {
            return null;
        }
        if (DefaultLinker.DEBUG) {
            System.out.println(String.valueOf(parsedOperation).concat(" base function operation"));
        }
        return new GuardedInvocation(methodHandle, methodHandle2);
    }
}
