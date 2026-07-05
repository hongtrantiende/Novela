package org.mozilla.javascript;

import java.util.EnumSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public class NativeScript extends BaseFunction {
    private static final int Id_compile = 3;
    private static final int Id_constructor = 1;
    private static final int Id_exec = 4;
    private static final int Id_toString = 2;
    private static final int MAX_PROTOTYPE_ID = 4;
    private static final Object SCRIPT_TAG = "Script";
    private static final long serialVersionUID = -6795101161980121700L;
    private Script script;

    private NativeScript(Script script) {
        this.script = script;
    }

    private static Script compile(Context context, String str) {
        int[] iArr = {0};
        String sourcePositionFromStack = Context.getSourcePositionFromStack(iArr);
        if (sourcePositionFromStack == null) {
            iArr[0] = 1;
            sourcePositionFromStack = "<Script object>";
        }
        return context.compileString(str, null, DefaultErrorReporter.forEval(context.getErrorReporter()), sourcePositionFromStack, iArr[0], null, null);
    }

    public static void init(Context context, Scriptable scriptable, boolean z) {
        new NativeScript(null).exportAsJSClass(4, scriptable, z);
    }

    private static NativeScript realThis(Scriptable scriptable, IdFunctionObject idFunctionObject) {
        return (NativeScript) IdScriptableObject.ensureType(scriptable, NativeScript.class, idFunctionObject);
    }

    @Override // org.mozilla.javascript.BaseFunction, org.mozilla.javascript.Function, org.mozilla.javascript.Callable
    public Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Script script = this.script;
        if (script != null) {
            return script.exec(context, scriptable);
        }
        return Undefined.instance;
    }

    @Override // org.mozilla.javascript.BaseFunction, org.mozilla.javascript.Function, org.mozilla.javascript.Constructable
    public Scriptable construct(Context context, Scriptable scriptable, Object[] objArr) {
        throw Context.reportRuntimeErrorById("msg.script.is.not.constructor", new Object[0]);
    }

    @Override // org.mozilla.javascript.BaseFunction
    public String decompile(int i, EnumSet<DecompilerFlag> enumSet) {
        Script script = this.script;
        if (script instanceof NativeFunction) {
            return ((NativeFunction) script).decompile(i, enumSet);
        }
        return super.decompile(i, enumSet);
    }

    @Override // org.mozilla.javascript.BaseFunction, org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.IdFunctionCall
    public Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        if (!idFunctionObject.hasTag(SCRIPT_TAG)) {
            return super.execIdCall(idFunctionObject, context, scriptable, scriptable2, objArr);
        }
        int methodId = idFunctionObject.methodId();
        String str = "";
        if (methodId != 1) {
            if (methodId != 2) {
                if (methodId != 3) {
                    if (methodId != 4) {
                        vs.m(String.valueOf(methodId));
                        return null;
                    }
                    throw Context.reportRuntimeErrorById("msg.cant.call.indirect", "exec");
                }
                NativeScript realThis = realThis(scriptable2, idFunctionObject);
                realThis.script = compile(context, ScriptRuntime.toString(objArr, 0));
                return realThis;
            }
            Script script = realThis(scriptable2, idFunctionObject).script;
            if (script == null) {
                return "";
            }
            return context.decompileScript(script, 0);
        }
        if (objArr.length != 0) {
            str = ScriptRuntime.toString(objArr[0]);
        }
        NativeScript nativeScript = new NativeScript(compile(context, str));
        ScriptRuntime.setObjectProtoAndParent(nativeScript, scriptable);
        return nativeScript;
    }

    @Override // org.mozilla.javascript.BaseFunction, org.mozilla.javascript.IdScriptableObject
    public int findPrototypeId(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1776922004:
                if (str.equals("toString")) {
                    c = 0;
                    break;
                }
                break;
            case -1588406278:
                if (str.equals("constructor")) {
                    c = 1;
                    break;
                }
                break;
            case 3127441:
                if (str.equals("exec")) {
                    c = 2;
                    break;
                }
                break;
            case 950491699:
                if (str.equals("compile")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 2;
            case 1:
                return 1;
            case 2:
                return 4;
            case 3:
                return 3;
            default:
                return 0;
        }
    }

    @Override // org.mozilla.javascript.BaseFunction
    public int getArity() {
        return 0;
    }

    @Override // org.mozilla.javascript.BaseFunction, org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return "Script";
    }

    @Override // org.mozilla.javascript.BaseFunction
    public int getLength() {
        return 0;
    }

    @Override // org.mozilla.javascript.BaseFunction, org.mozilla.javascript.IdScriptableObject
    public void initPrototypeId(int i) {
        String str;
        int i2;
        String str2;
        if (i != 1) {
            i2 = 0;
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        str2 = "exec";
                    } else {
                        vs.m(String.valueOf(i));
                        return;
                    }
                } else {
                    str = "compile";
                }
            } else {
                str2 = "toString";
            }
            initPrototypeMethod(SCRIPT_TAG, i, str2, i2);
        }
        str = "constructor";
        i2 = 1;
        str2 = str;
        initPrototypeMethod(SCRIPT_TAG, i, str2, i2);
    }

    @Deprecated
    public static void init(Scriptable scriptable, boolean z) {
        init(Context.getContext(), scriptable, z);
    }
}
