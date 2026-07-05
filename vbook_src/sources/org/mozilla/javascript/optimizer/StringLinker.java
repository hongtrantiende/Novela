package org.mozilla.javascript.optimizer;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Objects;
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
class StringLinker implements TypeBasedGuardingDynamicLinker {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    private static Object add(Object obj, Object obj2, Context context) {
        return new ConsString((String) obj, ((CharSequence) obj2).toString());
    }

    private static boolean eq(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    private static Object getLength(Object obj, Context context, Scriptable scriptable) {
        return Integer.valueOf(((String) obj).length());
    }

    private static boolean testAdd(Object obj, Object obj2, Context context) {
        if ((obj instanceof String) && (obj2 instanceof CharSequence)) {
            return true;
        }
        return false;
    }

    private static boolean testEq(Object obj, Object obj2) {
        if ((obj instanceof String) && (obj2 instanceof String)) {
            return true;
        }
        return false;
    }

    public boolean canLinkType(Class<?> cls) {
        return String.class.equals(cls);
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
                    findStatic = lookup.findStatic(StringLinker.class, "add", methodType);
                    instanceOfGuard = lookup.findStatic(StringLinker.class, "testAdd", changeReturnType);
                }
                findStatic = null;
                instanceOfGuard = null;
            } else {
                if (parsedOperation.isOperation(RhinoOperation.EQ, RhinoOperation.SHALLOWEQ) && (obj instanceof String)) {
                    findStatic = lookup.findStatic(StringLinker.class, "eq", methodType);
                    instanceOfGuard = lookup.findStatic(StringLinker.class, "testEq", methodType);
                }
                findStatic = null;
                instanceOfGuard = null;
            }
        } else {
            if (parsedOperation.isNamespace(StandardNamespace.PROPERTY) && parsedOperation.isOperation(StandardOperation.GET, RhinoOperation.GETNOWARN) && "length".equals(parsedOperation.getName())) {
                findStatic = lookup.findStatic(StringLinker.class, "getLength", methodType);
                instanceOfGuard = Guards.getInstanceOfGuard(String.class);
            }
            findStatic = null;
            instanceOfGuard = null;
        }
        if (findStatic == null) {
            return null;
        }
        if (DefaultLinker.DEBUG) {
            System.out.println(String.valueOf(parsedOperation).concat(" string operation"));
        }
        return new GuardedInvocation(findStatic, instanceOfGuard);
    }
}
