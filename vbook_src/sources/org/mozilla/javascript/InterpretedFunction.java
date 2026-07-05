package org.mozilla.javascript;

import org.mozilla.javascript.debug.DebuggableScript;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class InterpretedFunction extends NativeFunction implements Script {
    private static final long serialVersionUID = 541475680333911468L;
    InterpreterData idata;
    SecurityController securityController;
    Object securityDomain;

    private InterpretedFunction(InterpreterData interpreterData, Object obj) {
        Object obj2;
        this.idata = interpreterData;
        SecurityController securityController = Context.getContext().getSecurityController();
        if (securityController != null) {
            obj2 = securityController.getDynamicSecurityDomain(obj);
        } else if (obj == null) {
            obj2 = null;
        } else {
            p1a.g();
            throw null;
        }
        this.securityController = securityController;
        this.securityDomain = obj2;
    }

    public static InterpretedFunction createFunction(Context context, Scriptable scriptable, InterpreterData interpreterData, Object obj) {
        InterpretedFunction interpretedFunction = new InterpretedFunction(interpreterData, obj);
        interpretedFunction.initScriptFunction(context, scriptable, interpretedFunction.idata.isES6Generator);
        return interpretedFunction;
    }

    public static InterpretedFunction createScript(InterpreterData interpreterData, Object obj) {
        return new InterpretedFunction(interpreterData, obj);
    }

    @Override // org.mozilla.javascript.BaseFunction, org.mozilla.javascript.Function, org.mozilla.javascript.Callable
    public Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        if (!ScriptRuntime.hasTopCall(context)) {
            return ScriptRuntime.doTopCall(this, context, scriptable, scriptable2, objArr, this.idata.isStrict);
        }
        return Interpreter.interpret(this, context, scriptable, scriptable2, objArr);
    }

    @Override // org.mozilla.javascript.Script
    public Object exec(Context context, Scriptable scriptable) {
        Context context2;
        Object interpret;
        if (isScript()) {
            if (!ScriptRuntime.hasTopCall(context)) {
                context2 = context;
                interpret = ScriptRuntime.doTopCall(this, context2, scriptable, scriptable, ScriptRuntime.emptyArgs, this.idata.isStrict);
            } else {
                context2 = context;
                interpret = Interpreter.interpret(this, context2, scriptable, scriptable, ScriptRuntime.emptyArgs);
            }
            context2.processMicrotasks();
            return interpret;
        }
        vm1.d();
        return null;
    }

    @Override // org.mozilla.javascript.NativeFunction
    public DebuggableScript getDebuggableView() {
        return this.idata;
    }

    @Override // org.mozilla.javascript.BaseFunction
    public String getFunctionName() {
        String str = this.idata.itsName;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // org.mozilla.javascript.NativeFunction
    public int getLanguageVersion() {
        return this.idata.languageVersion;
    }

    @Override // org.mozilla.javascript.NativeFunction
    public int getParamAndVarCount() {
        return this.idata.argNames.length;
    }

    @Override // org.mozilla.javascript.NativeFunction
    public int getParamCount() {
        InterpreterData interpreterData = this.idata;
        if (interpreterData.argsHasRest) {
            return interpreterData.argCount - 1;
        }
        return interpreterData.argCount;
    }

    @Override // org.mozilla.javascript.NativeFunction
    public boolean getParamOrVarConst(int i) {
        return this.idata.argIsConst[i];
    }

    @Override // org.mozilla.javascript.NativeFunction
    public String getParamOrVarName(int i) {
        return this.idata.argNames[i];
    }

    @Override // org.mozilla.javascript.NativeFunction
    public String getRawSource() {
        return Interpreter.getRawSource(this.idata);
    }

    @Override // org.mozilla.javascript.BaseFunction
    public boolean hasDefaultParameters() {
        return this.idata.argsHasDefaults;
    }

    public boolean hasFunctionNamed(String str) {
        for (int i = 0; i < this.idata.getFunctionCount(); i++) {
            InterpreterData interpreterData = (InterpreterData) this.idata.getFunction(i);
            if (!interpreterData.declaredAsFunctionExpression && str.equals(interpreterData.getFunctionName())) {
                return false;
            }
        }
        return true;
    }

    public boolean isScript() {
        if (this.idata.itsFunctionType == 0) {
            return true;
        }
        return false;
    }

    @Override // org.mozilla.javascript.NativeFunction
    public Object resumeGenerator(Context context, Scriptable scriptable, int i, Object obj, Object obj2) {
        return Interpreter.resumeGenerator(context, scriptable, i, obj, obj2);
    }

    public static InterpretedFunction createFunction(Context context, Scriptable scriptable, InterpretedFunction interpretedFunction, int i) {
        InterpretedFunction interpretedFunction2 = new InterpretedFunction(interpretedFunction, i);
        interpretedFunction2.initScriptFunction(context, scriptable, interpretedFunction2.idata.isES6Generator);
        return interpretedFunction2;
    }

    private InterpretedFunction(InterpretedFunction interpretedFunction, int i) {
        this.idata = interpretedFunction.idata.itsNestedFunctions[i];
        this.securityController = interpretedFunction.securityController;
        this.securityDomain = interpretedFunction.securityDomain;
    }
}
