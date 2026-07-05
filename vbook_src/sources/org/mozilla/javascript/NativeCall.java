package org.mozilla.javascript;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class NativeCall extends IdScriptableObject {
    private static final Object CALL_TAG = "Call";
    private static final int Id_constructor = 1;
    private static final int MAX_PROTOTYPE_ID = 1;
    private static final long serialVersionUID = -7471457301304454454L;
    private Arguments arguments;
    NativeFunction function;
    private Scriptable homeObject;
    boolean isArrow;
    boolean isStrict;
    Object[] originalArgs;
    transient NativeCall parentActivationCall;

    public NativeCall(NativeFunction nativeFunction, Context context, Scriptable scriptable, Object[] objArr, boolean z, boolean z2, boolean z3, Scriptable scriptable2) {
        Object[] objArr2;
        Object obj;
        Object[] objArr3;
        Object obj2;
        this.function = nativeFunction;
        this.homeObject = scriptable2;
        this.isArrow = z;
        setParentScope(scriptable);
        if (objArr == null) {
            objArr2 = ScriptRuntime.emptyArgs;
        } else {
            objArr2 = objArr;
        }
        this.originalArgs = objArr2;
        this.isStrict = z2;
        int paramAndVarCount = nativeFunction.getParamAndVarCount();
        int paramCount = nativeFunction.getParamCount();
        if (paramAndVarCount != 0) {
            int i = 0;
            if (z3) {
                if (objArr.length >= paramCount) {
                    objArr3 = new Object[objArr.length - paramCount];
                    System.arraycopy(objArr, paramCount, objArr3, 0, objArr.length - paramCount);
                } else {
                    objArr3 = ScriptRuntime.emptyArgs;
                }
                while (i < paramCount) {
                    String paramOrVarName = nativeFunction.getParamOrVarName(i);
                    if (i < objArr.length) {
                        obj2 = objArr[i];
                    } else {
                        obj2 = Undefined.instance;
                    }
                    defineProperty(paramOrVarName, obj2, 4);
                    i++;
                }
                defineProperty(nativeFunction.getParamOrVarName(paramCount), context.newArray(scriptable, objArr3), 4);
            } else {
                while (i < paramCount) {
                    String paramOrVarName2 = nativeFunction.getParamOrVarName(i);
                    if (i < objArr.length) {
                        obj = objArr[i];
                    } else {
                        obj = Undefined.instance;
                    }
                    defineProperty(paramOrVarName2, obj, 4);
                    i++;
                }
            }
        }
        if (!super.has("arguments", this) && !z) {
            Arguments arguments = new Arguments(this);
            this.arguments = arguments;
            defineProperty("arguments", arguments, 4);
        }
        if (paramAndVarCount != 0) {
            while (paramCount < paramAndVarCount) {
                String paramOrVarName3 = nativeFunction.getParamOrVarName(paramCount);
                if (!super.has(paramOrVarName3, this)) {
                    if (nativeFunction.getParamOrVarConst(paramCount)) {
                        defineProperty(paramOrVarName3, Undefined.instance, 13);
                    } else if (!(nativeFunction instanceof InterpretedFunction) || ((InterpretedFunction) nativeFunction).hasFunctionNamed(paramOrVarName3)) {
                        defineProperty(paramOrVarName3, Undefined.instance, 4);
                    }
                }
                paramCount++;
            }
        }
    }

    public static void init(Scriptable scriptable, boolean z) {
        new NativeCall().exportAsJSClass(1, scriptable, z);
    }

    public void defineAttributesForArguments() {
        Arguments arguments = this.arguments;
        if (arguments != null) {
            arguments.defineAttributesForStrictMode();
        }
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.IdFunctionCall
    public Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        if (!idFunctionObject.hasTag(CALL_TAG)) {
            return super.execIdCall(idFunctionObject, context, scriptable, scriptable2, objArr);
        }
        int methodId = idFunctionObject.methodId();
        if (methodId == 1) {
            if (scriptable2 == null) {
                ScriptRuntime.checkDeprecated(context, "Call");
                NativeCall nativeCall = new NativeCall();
                nativeCall.setPrototype(ScriptableObject.getObjectPrototype(scriptable));
                return nativeCall;
            }
            throw Context.reportRuntimeErrorById("msg.only.from.new", "Call");
        }
        vs.m(String.valueOf(methodId));
        return null;
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int findPrototypeId(String str) {
        return str.equals("constructor") ? 1 : 0;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return "Call";
    }

    public Scriptable getHomeObject() {
        return this.homeObject;
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void initPrototypeId(int i) {
        if (i == 1) {
            initPrototypeMethod(CALL_TAG, i, "constructor", 1);
        } else {
            vs.m(String.valueOf(i));
        }
    }

    public NativeCall() {
    }
}
