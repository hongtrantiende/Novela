package org.mozilla.javascript;

import java.util.Objects;
import org.mozilla.javascript.NativeGenerator;
import org.mozilla.javascript.NativeIterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class ES6Generator extends IdScriptableObject {
    private static final Object GENERATOR_TAG = "Generator";
    private static final int Id_next = 1;
    private static final int Id_return = 2;
    private static final int Id_throw = 3;
    private static final int MAX_PROTOTYPE_ID = 4;
    private static final int SymbolId_iterator = 4;
    private static final long serialVersionUID = 1645892441041347273L;
    private Object delegee;
    private NativeFunction function;
    private int lineNumber;
    private String lineSource;
    private Object savedState;
    private State state = State.SUSPENDED_START;

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public enum State {
        SUSPENDED_START,
        SUSPENDED_YIELD,
        EXECUTING,
        COMPLETED
    }

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class YieldStarResult {
        private Object result;

        public YieldStarResult(Object obj) {
            this.result = obj;
        }

        public Object getResult() {
            return this.result;
        }
    }

    public ES6Generator(Scriptable scriptable, NativeFunction nativeFunction, Object obj) {
        this.function = nativeFunction;
        this.savedState = obj;
        Scriptable topLevelScope = ScriptableObject.getTopLevelScope(scriptable);
        setParentScope(topLevelScope);
        setPrototype((ES6Generator) ScriptableObject.getTopScopeValue(topLevelScope, GENERATOR_TAG));
    }

    private Object callReturnOptionally(Context context, Scriptable scriptable, Object obj) {
        Object[] objArr;
        Object obj2 = Undefined.instance;
        if (obj2.equals(obj)) {
            objArr = ScriptRuntime.emptyArgs;
        } else {
            objArr = new Object[]{obj};
        }
        Object objectPropNoWarn = ScriptRuntime.getObjectPropNoWarn(this.delegee, "return", context, scriptable);
        if (!obj2.equals(objectPropNoWarn)) {
            if (objectPropNoWarn instanceof Callable) {
                return ((Callable) objectPropNoWarn).call(context, scriptable, ScriptableObject.ensureScriptable(this.delegee), objArr);
            }
            throw ScriptRuntime.typeErrorById("msg.isnt.function", "return", ScriptRuntime.typeof(objectPropNoWarn));
        }
        return null;
    }

    public static ES6Generator init(ScriptableObject scriptableObject, boolean z) {
        ES6Generator eS6Generator = new ES6Generator();
        if (scriptableObject != null) {
            eS6Generator.setParentScope(scriptableObject);
            eS6Generator.setPrototype(ScriptableObject.getObjectPrototype(scriptableObject));
        }
        eS6Generator.activatePrototypeMap(4);
        if (z) {
            eS6Generator.sealObject();
        }
        if (scriptableObject != null) {
            scriptableObject.associateValue(GENERATOR_TAG, eS6Generator);
        }
        return eS6Generator;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ac, code lost:
        if (r11.state == r13) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private org.mozilla.javascript.Scriptable resumeAbruptLocal(org.mozilla.javascript.Context r12, org.mozilla.javascript.Scriptable r13, int r14, java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.ES6Generator.resumeAbruptLocal(org.mozilla.javascript.Context, org.mozilla.javascript.Scriptable, int, java.lang.Object):org.mozilla.javascript.Scriptable");
    }

    private Scriptable resumeDelegee(Context context, Scriptable scriptable, Object obj) {
        Object[] objArr;
        try {
            if (Undefined.instance.equals(obj)) {
                objArr = ScriptRuntime.emptyArgs;
            } else {
                objArr = new Object[]{obj};
            }
            Scriptable ensureScriptable = ScriptableObject.ensureScriptable(ScriptRuntime.getPropFunctionAndThis(this.delegee, ES6Iterator.NEXT_METHOD, context, scriptable).call(context, scriptable, ScriptRuntime.lastStoredScriptable(context), objArr));
            if (ScriptRuntime.isIteratorDone(context, ensureScriptable)) {
                this.delegee = null;
                return resumeLocal(context, scriptable, ScriptableObject.getProperty(ensureScriptable, ES6Iterator.VALUE_PROPERTY));
            }
            return ensureScriptable;
        } catch (RhinoException e) {
            this.delegee = null;
            return this.resumeAbruptLocal(context, scriptable, 1, e);
        }
    }

    private Scriptable resumeDelegeeReturn(Context context, Scriptable scriptable, Object obj) {
        try {
            Object callReturnOptionally = callReturnOptionally(context, scriptable, obj);
            if (callReturnOptionally != null) {
                if (ScriptRuntime.isIteratorDone(context, callReturnOptionally)) {
                    this.delegee = null;
                    return resumeAbruptLocal(context, scriptable, 2, ScriptRuntime.getObjectPropNoWarn(callReturnOptionally, ES6Iterator.VALUE_PROPERTY, context, scriptable));
                }
                return ScriptableObject.ensureScriptable(callReturnOptionally);
            }
            this.delegee = null;
            return resumeAbruptLocal(context, scriptable, 2, obj);
        } catch (RhinoException e) {
            this.delegee = null;
            return resumeAbruptLocal(context, scriptable, 1, e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [org.mozilla.javascript.Scriptable] */
    private Scriptable resumeDelegeeThrow(Context context, Scriptable scriptable, Object obj) {
        boolean z = false;
        try {
            Object call = ScriptRuntime.getPropFunctionAndThis(this.delegee, "throw", context, scriptable).call(context, scriptable, ScriptRuntime.lastStoredScriptable(context), new Object[]{obj});
            if (ScriptRuntime.isIteratorDone(context, call)) {
                try {
                    callReturnOptionally(context, scriptable, Undefined.instance);
                    this.delegee = null;
                    this = resumeLocal(context, scriptable, ScriptRuntime.getObjectProp(call, ES6Iterator.VALUE_PROPERTY, context, scriptable));
                    return this;
                } catch (RhinoException e) {
                    e = e;
                    z = true;
                    if (!z) {
                        try {
                            try {
                                this.callReturnOptionally(context, scriptable, Undefined.instance);
                            } catch (RhinoException e2) {
                                Scriptable resumeAbruptLocal = this.resumeAbruptLocal(context, scriptable, 1, e2);
                                this.delegee = null;
                                return resumeAbruptLocal;
                            }
                        } catch (Throwable th) {
                            this.delegee = null;
                            throw th;
                        }
                    }
                    this.delegee = null;
                    return this.resumeAbruptLocal(context, scriptable, 1, e);
                }
            }
            return ScriptableObject.ensureScriptable(call);
        } catch (RhinoException e3) {
            e = e3;
        }
    }

    private Scriptable resumeLocal(Context context, Scriptable scriptable, Object obj) {
        State state = this.state;
        State state2 = State.COMPLETED;
        if (state == state2) {
            return ES6Iterator.makeIteratorResult(context, scriptable, Boolean.TRUE);
        }
        State state3 = State.EXECUTING;
        if (state != state3) {
            Scriptable makeIteratorResult = ES6Iterator.makeIteratorResult(context, scriptable, Boolean.FALSE);
            this.state = state3;
            try {
                try {
                    try {
                        Object resumeGenerator = this.function.resumeGenerator(context, scriptable, 0, this.savedState, obj);
                        if (resumeGenerator instanceof YieldStarResult) {
                            State state4 = State.SUSPENDED_YIELD;
                            this.state = state4;
                            try {
                                this.delegee = ScriptRuntime.callIterator(((YieldStarResult) resumeGenerator).getResult(), context, scriptable);
                                try {
                                    Scriptable resumeDelegee = resumeDelegee(context, scriptable, Undefined.instance);
                                    this.state = state3;
                                    if (ScriptRuntime.isIteratorDone(context, resumeDelegee)) {
                                        this.state = state2;
                                    }
                                    if (this.state == state2) {
                                        ScriptableObject.putProperty(makeIteratorResult, ES6Iterator.DONE_PROPERTY, Boolean.TRUE);
                                        return resumeDelegee;
                                    }
                                    this.state = state4;
                                    return resumeDelegee;
                                } catch (Throwable th) {
                                    this.state = State.EXECUTING;
                                    throw th;
                                }
                            } catch (RhinoException e) {
                                Scriptable resumeAbruptLocal = resumeAbruptLocal(context, scriptable, 1, e);
                                if (this.state == State.COMPLETED) {
                                    ScriptableObject.putProperty(makeIteratorResult, ES6Iterator.DONE_PROPERTY, Boolean.TRUE);
                                } else {
                                    this.state = State.SUSPENDED_YIELD;
                                }
                                return resumeAbruptLocal;
                            }
                        }
                        ScriptableObject.putProperty(makeIteratorResult, ES6Iterator.VALUE_PROPERTY, resumeGenerator);
                        if (this.state == state2) {
                            ScriptableObject.putProperty(makeIteratorResult, ES6Iterator.DONE_PROPERTY, Boolean.TRUE);
                            return makeIteratorResult;
                        }
                        this.state = State.SUSPENDED_YIELD;
                        return makeIteratorResult;
                    } catch (NativeGenerator.GeneratorClosedException unused) {
                        this.state = State.COMPLETED;
                        ScriptableObject.putProperty(makeIteratorResult, ES6Iterator.DONE_PROPERTY, Boolean.TRUE);
                        return makeIteratorResult;
                    }
                } catch (JavaScriptException e2) {
                    State state5 = State.COMPLETED;
                    this.state = state5;
                    if (e2.getValue() instanceof NativeIterator.StopIteration) {
                        ScriptableObject.putProperty(makeIteratorResult, ES6Iterator.VALUE_PROPERTY, ((NativeIterator.StopIteration) e2.getValue()).getValue());
                        if (this.state != state5) {
                            this.state = State.SUSPENDED_YIELD;
                            return makeIteratorResult;
                        }
                        ScriptableObject.putProperty(makeIteratorResult, ES6Iterator.DONE_PROPERTY, Boolean.TRUE);
                        return makeIteratorResult;
                    }
                    this.lineNumber = e2.lineNumber();
                    this.lineSource = e2.lineSource();
                    if (e2.getValue() instanceof RhinoException) {
                        throw ((RhinoException) e2.getValue());
                    }
                    throw e2;
                } catch (RhinoException e3) {
                    this.lineNumber = e3.lineNumber();
                    this.lineSource = e3.lineSource();
                    throw e3;
                }
            } catch (Throwable th2) {
                if (this.state == State.COMPLETED) {
                    ScriptableObject.putProperty(makeIteratorResult, ES6Iterator.DONE_PROPERTY, Boolean.TRUE);
                } else {
                    this.state = State.SUSPENDED_YIELD;
                }
                throw th2;
            }
        }
        throw ScriptRuntime.typeErrorById("msg.generator.executing", new Object[0]);
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.IdFunctionCall
    public Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Object obj;
        if (!idFunctionObject.hasTag(GENERATOR_TAG)) {
            return super.execIdCall(idFunctionObject, context, scriptable, scriptable2, objArr);
        }
        int methodId = idFunctionObject.methodId();
        ES6Generator eS6Generator = (ES6Generator) IdScriptableObject.ensureType(scriptable2, ES6Generator.class, idFunctionObject);
        if (objArr.length >= 1) {
            obj = objArr[0];
        } else {
            obj = Undefined.instance;
        }
        if (methodId != 1) {
            if (methodId != 2) {
                if (methodId != 3) {
                    if (methodId == 4) {
                        return scriptable2;
                    }
                    vs.m(String.valueOf(methodId));
                    return null;
                } else if (eS6Generator.delegee == null) {
                    return eS6Generator.resumeAbruptLocal(context, scriptable, 1, obj);
                } else {
                    return eS6Generator.resumeDelegeeThrow(context, scriptable, obj);
                }
            } else if (eS6Generator.delegee == null) {
                return eS6Generator.resumeAbruptLocal(context, scriptable, 2, obj);
            } else {
                return eS6Generator.resumeDelegeeReturn(context, scriptable, obj);
            }
        } else if (eS6Generator.delegee == null) {
            return eS6Generator.resumeLocal(context, scriptable, obj);
        } else {
            return eS6Generator.resumeDelegee(context, scriptable, obj);
        }
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int findPrototypeId(String str) {
        String str2;
        int i;
        int length = str.length();
        if (length == 4) {
            str2 = ES6Iterator.NEXT_METHOD;
            i = 1;
        } else if (length == 5) {
            str2 = "throw";
            i = 3;
        } else if (length == 6) {
            str2 = "return";
            i = 2;
        } else {
            str2 = null;
            i = 0;
        }
        if (!Objects.equals(str2, str)) {
            return 0;
        }
        return i;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return "Generator";
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void initPrototypeId(int i) {
        String str;
        if (i == 4) {
            initPrototypeMethod(GENERATOR_TAG, i, SymbolKey.ITERATOR, "[Symbol.iterator]", 0);
            return;
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    str = "throw";
                } else {
                    vs.m(String.valueOf(i));
                    return;
                }
            } else {
                str = "return";
            }
        } else {
            str = ES6Iterator.NEXT_METHOD;
        }
        initPrototypeMethod(GENERATOR_TAG, i, str, 1);
    }

    private ES6Generator() {
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int findPrototypeId(Symbol symbol) {
        return SymbolKey.ITERATOR.equals(symbol) ? 4 : 0;
    }
}
