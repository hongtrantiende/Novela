package org.mozilla.javascript.optimizer;

import java.io.PrintStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import jdk.dynalink.StandardNamespace;
import jdk.dynalink.StandardOperation;
import jdk.dynalink.linker.GuardedInvocation;
import jdk.dynalink.linker.GuardingDynamicLinker;
import jdk.dynalink.linker.LinkRequest;
import jdk.dynalink.linker.LinkerServices;
import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
class DefaultLinker implements GuardingDynamicLinker {
    static final boolean DEBUG;

    static {
        String property = System.getProperty("RHINO_DEBUG_LINKER");
        if (property == null) {
            property = System.getenv("RHINO_DEBUG_LINKER");
        }
        DEBUG = Boolean.parseBoolean(property);
    }

    private static MethodHandle bindStringParameter(MethodHandles.Lookup lookup, MethodType methodType, Class<?> cls, String str, int i, String str2) {
        return MethodHandles.insertArguments(lookup.findStatic(cls, str, methodType.insertParameterTypes(i, String.class)), i, str2);
    }

    private GuardedInvocation getInvocation(MethodHandles.Lookup lookup, MethodType methodType, ParsedOperation parsedOperation) {
        if (parsedOperation.isNamespace(StandardNamespace.PROPERTY)) {
            return getPropertyInvocation(lookup, methodType, parsedOperation);
        }
        if (parsedOperation.isNamespace(RhinoNamespace.NAME)) {
            return getNameInvocation(lookup, methodType, parsedOperation);
        }
        if (parsedOperation.isNamespace(RhinoNamespace.MATH)) {
            return getMathInvocation(lookup, methodType, parsedOperation);
        }
        throw new UnsupportedOperationException(parsedOperation.toString());
    }

    private GuardedInvocation getMathInvocation(MethodHandles.Lookup lookup, MethodType methodType, ParsedOperation parsedOperation) {
        MethodHandle methodHandle;
        if (parsedOperation.isOperation(RhinoOperation.ADD)) {
            methodHandle = lookup.findStatic(ScriptRuntime.class, "add", methodType);
        } else if (parsedOperation.isOperation(RhinoOperation.TONUMBER)) {
            methodHandle = lookup.findStatic(ScriptRuntime.class, "toNumber", methodType);
        } else if (parsedOperation.isOperation(RhinoOperation.TONUMERIC)) {
            methodHandle = lookup.findStatic(ScriptRuntime.class, "toNumeric", methodType);
        } else if (parsedOperation.isOperation(RhinoOperation.TOBOOLEAN)) {
            methodHandle = lookup.findStatic(ScriptRuntime.class, "toBoolean", methodType);
        } else if (parsedOperation.isOperation(RhinoOperation.TOINT32)) {
            methodHandle = lookup.findStatic(ScriptRuntime.class, "toInt32", methodType);
        } else if (parsedOperation.isOperation(RhinoOperation.TOUINT32)) {
            methodHandle = lookup.findStatic(ScriptRuntime.class, "toUint32", methodType);
        } else if (parsedOperation.isOperation(RhinoOperation.EQ)) {
            methodHandle = lookup.findStatic(ScriptRuntime.class, "eq", methodType);
        } else if (parsedOperation.isOperation(RhinoOperation.SHALLOWEQ)) {
            methodHandle = lookup.findStatic(ScriptRuntime.class, "shallowEq", methodType);
        } else if (parsedOperation.isOperation(RhinoOperation.COMPARE_GT)) {
            methodHandle = makeCompare(lookup, 16);
        } else if (parsedOperation.isOperation(RhinoOperation.COMPARE_LT)) {
            methodHandle = makeCompare(lookup, 14);
        } else if (parsedOperation.isOperation(RhinoOperation.COMPARE_GE)) {
            methodHandle = makeCompare(lookup, 17);
        } else if (parsedOperation.isOperation(RhinoOperation.COMPARE_LE)) {
            methodHandle = makeCompare(lookup, 15);
        } else {
            methodHandle = null;
        }
        if (methodHandle != null) {
            return new GuardedInvocation(methodHandle);
        }
        throw new UnsupportedOperationException(parsedOperation.toString());
    }

    private GuardedInvocation getNameInvocation(MethodHandles.Lookup lookup, MethodType methodType, ParsedOperation parsedOperation) {
        MethodHandle methodHandle;
        String name = parsedOperation.getName();
        if (parsedOperation.isOperation(RhinoOperation.BIND)) {
            methodHandle = MethodHandles.permuteArguments(MethodHandles.insertArguments(lookup.findStatic(ScriptRuntime.class, "bind", MethodType.methodType(Scriptable.class, Context.class, Scriptable.class, String.class)), 2, name), methodType, 1, 0);
        } else if (parsedOperation.isOperation(StandardOperation.GET)) {
            methodHandle = MethodHandles.permuteArguments(MethodHandles.insertArguments(lookup.findStatic(ScriptRuntime.class, "name", MethodType.methodType(Object.class, Context.class, Scriptable.class, String.class)), 2, name), methodType, 1, 0);
        } else if (parsedOperation.isOperation(RhinoOperation.GETWITHTHIS)) {
            methodHandle = MethodHandles.permuteArguments(MethodHandles.insertArguments(lookup.findStatic(ScriptRuntime.class, "getNameFunctionAndThis", MethodType.methodType(Callable.class, String.class, Context.class, Scriptable.class)), 0, name), methodType, 1, 0);
        } else if (parsedOperation.isOperation(RhinoOperation.GETWITHTHISOPTIONAL)) {
            methodHandle = MethodHandles.permuteArguments(MethodHandles.insertArguments(lookup.findStatic(ScriptRuntime.class, "getNameFunctionAndThisOptional", MethodType.methodType(Callable.class, String.class, Context.class, Scriptable.class)), 0, name), methodType, 1, 0);
        } else if (parsedOperation.isOperation(StandardOperation.SET)) {
            methodHandle = bindStringParameter(lookup, methodType, ScriptRuntime.class, "setName", 4, name);
        } else if (parsedOperation.isOperation(RhinoOperation.SETSTRICT)) {
            methodHandle = bindStringParameter(lookup, methodType, ScriptRuntime.class, "strictSetName", 4, name);
        } else if (parsedOperation.isOperation(RhinoOperation.SETCONST)) {
            methodHandle = bindStringParameter(lookup, methodType, ScriptRuntime.class, "setConst", 3, name);
        } else {
            methodHandle = null;
        }
        if (methodHandle != null) {
            return new GuardedInvocation(methodHandle);
        }
        throw new UnsupportedOperationException(parsedOperation.toString());
    }

    private GuardedInvocation getPropertyInvocation(MethodHandles.Lookup lookup, MethodType methodType, ParsedOperation parsedOperation) {
        MethodHandle methodHandle;
        if (parsedOperation.isOperation(StandardOperation.GET)) {
            methodHandle = bindStringParameter(lookup, methodType, ScriptRuntime.class, "getObjectProp", 1, parsedOperation.getName());
        } else if (parsedOperation.isOperation(RhinoOperation.GETNOWARN)) {
            methodHandle = bindStringParameter(lookup, methodType, ScriptRuntime.class, "getObjectPropNoWarn", 1, parsedOperation.getName());
        } else if (parsedOperation.isOperation(RhinoOperation.GETSUPER)) {
            methodHandle = bindStringParameter(lookup, methodType, ScriptRuntime.class, "getSuperProp", 1, parsedOperation.getName());
        } else if (parsedOperation.isOperation(RhinoOperation.GETWITHTHIS)) {
            methodHandle = bindStringParameter(lookup, methodType, ScriptRuntime.class, "getPropFunctionAndThis", 1, parsedOperation.getName());
        } else if (parsedOperation.isOperation(RhinoOperation.GETWITHTHISOPTIONAL)) {
            methodHandle = bindStringParameter(lookup, methodType, ScriptRuntime.class, "getPropFunctionAndThisOptional", 1, parsedOperation.getName());
        } else if (parsedOperation.isOperation(StandardOperation.SET)) {
            methodHandle = bindStringParameter(lookup, methodType, ScriptRuntime.class, "setObjectProp", 1, parsedOperation.getName());
        } else if (parsedOperation.isOperation(RhinoOperation.SETSUPER)) {
            methodHandle = bindStringParameter(lookup, methodType, ScriptRuntime.class, "setSuperProp", 1, parsedOperation.getName());
        } else if (parsedOperation.isOperation(RhinoOperation.GETELEMENT)) {
            methodHandle = lookup.findStatic(ScriptRuntime.class, "getObjectElem", methodType);
        } else if (parsedOperation.isOperation(RhinoOperation.GETELEMENTSUPER)) {
            methodHandle = lookup.findStatic(ScriptRuntime.class, "getSuperElem", methodType);
        } else if (parsedOperation.isOperation(RhinoOperation.GETINDEX)) {
            methodHandle = lookup.findStatic(ScriptRuntime.class, "getObjectIndex", methodType);
        } else if (parsedOperation.isOperation(RhinoOperation.SETELEMENT)) {
            methodHandle = lookup.findStatic(ScriptRuntime.class, "setObjectElem", methodType);
        } else if (parsedOperation.isOperation(RhinoOperation.SETELEMENTSUPER)) {
            methodHandle = lookup.findStatic(ScriptRuntime.class, "setSuperElem", methodType);
        } else if (parsedOperation.isOperation(RhinoOperation.SETINDEX)) {
            methodHandle = lookup.findStatic(ScriptRuntime.class, "setObjectIndex", methodType);
        } else {
            methodHandle = null;
        }
        if (methodHandle != null) {
            return new GuardedInvocation(methodHandle);
        }
        throw new UnsupportedOperationException(parsedOperation.toString());
    }

    private MethodHandle makeCompare(MethodHandles.Lookup lookup, int i) {
        return MethodHandles.insertArguments(lookup.findStatic(ScriptRuntime.class, "compare", MethodType.methodType(Boolean.TYPE, Object.class, Object.class, Integer.TYPE)), 2, Integer.valueOf(i));
    }

    public GuardedInvocation getGuardedInvocation(LinkRequest linkRequest, LinkerServices linkerServices) {
        String simpleName;
        String str;
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        MethodType methodType = linkRequest.getCallSiteDescriptor().getMethodType();
        ParsedOperation parsedOperation = new ParsedOperation(linkRequest.getCallSiteDescriptor().getOperation());
        GuardedInvocation invocation = getInvocation(lookup, methodType, parsedOperation);
        if (DEBUG) {
            if (linkRequest.getReceiver() == null) {
                simpleName = "null";
            } else {
                simpleName = linkRequest.getReceiver().getClass().getSimpleName();
            }
            if (linkRequest.getArguments().length > 1 && linkRequest.getArguments()[1] != null) {
                str = linkRequest.getArguments()[1].getClass().getSimpleName();
            } else {
                str = "";
            }
            PrintStream printStream = System.out;
            String valueOf = String.valueOf(parsedOperation);
            printStream.println(valueOf + "(" + simpleName + ", " + str + "): default link");
        }
        return invocation;
    }
}
