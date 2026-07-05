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
import org.mozilla.javascript.ConsString;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
class ConsStringLinker implements TypeBasedGuardingDynamicLinker {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    private static Object add(Object obj, Object obj2, Context context) {
        return new ConsString((ConsString) obj, ((CharSequence) obj2).toString());
    }

    private static Object getLength(Object obj, Context context, Scriptable scriptable) {
        return Integer.valueOf(((ConsString) obj).length());
    }

    private static boolean testAdd(Object obj, Object obj2, Context context) {
        if ((obj instanceof ConsString) && (obj2 instanceof CharSequence)) {
            return true;
        }
        return false;
    }

    public boolean canLinkType(Class<?> cls) {
        return ConsString.class.equals(cls);
    }

    public GuardedInvocation getGuardedInvocation(LinkRequest linkRequest, LinkerServices linkerServices) {
        Object obj;
        MethodHandle findStatic;
        MethodHandle instanceOfGuard;
        if (linkRequest.isCallSiteUnstable()) {
            return null;
        }
        if (linkRequest.getArguments().length > 1) {
            obj = linkRequest.getArguments()[1];
        } else {
            obj = null;
        }
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        ParsedOperation parsedOperation = new ParsedOperation(linkRequest.getCallSiteDescriptor().getOperation());
        MethodType methodType = linkRequest.getCallSiteDescriptor().getMethodType();
        if (parsedOperation.isNamespace(RhinoNamespace.MATH)) {
            if (parsedOperation.isOperation(RhinoOperation.ADD)) {
                MethodType changeReturnType = methodType.changeReturnType(Boolean.TYPE);
                if (obj instanceof CharSequence) {
                    findStatic = lookup.findStatic(ConsStringLinker.class, "add", methodType);
                    instanceOfGuard = lookup.findStatic(ConsStringLinker.class, "testAdd", changeReturnType);
                }
            }
            findStatic = null;
            instanceOfGuard = null;
        } else {
            if (parsedOperation.isNamespace(StandardNamespace.PROPERTY) && parsedOperation.isOperation(StandardOperation.GET, RhinoOperation.GETNOWARN) && "length".equals(parsedOperation.getName())) {
                findStatic = lookup.findStatic(ConsStringLinker.class, "getLength", methodType);
                instanceOfGuard = Guards.getInstanceOfGuard(ConsString.class);
            }
            findStatic = null;
            instanceOfGuard = null;
        }
        if (findStatic == null) {
            return null;
        }
        if (DefaultLinker.DEBUG) {
            System.out.println(String.valueOf(parsedOperation).concat(" ConsString operation"));
        }
        return new GuardedInvocation(findStatic, instanceOfGuard);
    }
}
