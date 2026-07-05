package org.mozilla.javascript;

import java.util.EnumSet;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public class BaseFunction extends IdScriptableObject implements Function {
    private static final String FUNCTION_CLASS = "Function";
    private static final Object FUNCTION_TAG = FUNCTION_CLASS;
    static final String GENERATOR_FUNCTION_CLASS = "__GeneratorFunction";
    private static final int Id_apply = 4;
    protected static final int Id_arguments = 5;
    protected static final int Id_arity = 2;
    private static final int Id_bind = 6;
    private static final int Id_call = 5;
    private static final int Id_constructor = 1;
    protected static final int Id_length = 1;
    protected static final int Id_name = 3;
    protected static final int Id_prototype = 4;
    private static final int Id_toSource = 3;
    private static final int Id_toString = 2;
    protected static final int MAX_INSTANCE_ID = 5;
    private static final int MAX_PROTOTYPE_ID = 6;
    private static final long serialVersionUID = 5311394446546053859L;
    private int argumentsAttributes;
    private Object argumentsObj;
    private int arityPropertyAttributes;
    private Scriptable homeObject;
    private boolean isGeneratorFunction;
    private int lengthPropertyAttributes;
    private int namePropertyAttributes;
    private String nameValue;
    private Object prototypeProperty;
    private int prototypePropertyAttributes;

    public BaseFunction() {
        this.argumentsObj = Scriptable.NOT_FOUND;
        this.nameValue = null;
        this.isGeneratorFunction = false;
        this.homeObject = null;
        this.prototypePropertyAttributes = 6;
        this.argumentsAttributes = 6;
        this.arityPropertyAttributes = 7;
        this.namePropertyAttributes = 3;
        this.lengthPropertyAttributes = 7;
    }

    private Object getArguments() {
        Object obj;
        if (defaultHas("arguments")) {
            obj = defaultGet("arguments");
        } else {
            obj = this.argumentsObj;
        }
        if (obj != Scriptable.NOT_FOUND) {
            return obj;
        }
        Scriptable findFunctionActivation = ScriptRuntime.findFunctionActivation(Context.getContext(), this);
        if (findFunctionActivation == null) {
            return null;
        }
        return findFunctionActivation.get("arguments", findFunctionActivation);
    }

    public static void init(Context context, Scriptable scriptable, boolean z) {
        BaseFunction baseFunction = new BaseFunction();
        baseFunction.prototypePropertyAttributes = 7;
        if (context.getLanguageVersion() >= 200) {
            baseFunction.setStandardPropertyAttributes(3);
        }
        baseFunction.exportAsJSClass(6, scriptable, z);
    }

    public static Object initAsGeneratorFunction(Scriptable scriptable, boolean z) {
        BaseFunction baseFunction = new BaseFunction(true);
        baseFunction.prototypePropertyAttributes = 5;
        baseFunction.exportAsJSClass(6, scriptable, z);
        return ScriptableObject.getProperty(scriptable, GENERATOR_FUNCTION_CLASS);
    }

    public static boolean isApply(IdFunctionObject idFunctionObject) {
        if (idFunctionObject.hasTag(FUNCTION_TAG) && idFunctionObject.methodId() == 4) {
            return true;
        }
        return false;
    }

    public static boolean isApplyOrCall(IdFunctionObject idFunctionObject) {
        if (idFunctionObject.hasTag(FUNCTION_TAG)) {
            int methodId = idFunctionObject.methodId();
            if (methodId == 4 || methodId == 5) {
                return true;
            }
            return false;
        }
        return false;
    }

    private Object jsConstructor(Context context, Scriptable scriptable, Object[] objArr) {
        int i;
        int length = objArr.length;
        StringBuilder sb = new StringBuilder("function ");
        if (isGeneratorFunction()) {
            sb.append("* ");
        }
        if (context.getLanguageVersion() != 120) {
            sb.append("anonymous");
        }
        sb.append('(');
        int i2 = 0;
        while (true) {
            i = length - 1;
            if (i2 >= i) {
                break;
            }
            if (i2 > 0) {
                sb.append(',');
            }
            sb.append(ScriptRuntime.toString(objArr[i2]));
            i2++;
        }
        sb.append(") {");
        if (length != 0) {
            sb.append(ScriptRuntime.toString(objArr[i]));
        }
        sb.append("\n}");
        String sb2 = sb.toString();
        int[] iArr = new int[1];
        String sourcePositionFromStack = Context.getSourcePositionFromStack(iArr);
        if (sourcePositionFromStack == null) {
            iArr[0] = 1;
            sourcePositionFromStack = "<eval'ed string>";
        }
        String makeUrlForGeneratedScript = ScriptRuntime.makeUrlForGeneratedScript(false, sourcePositionFromStack, iArr[0]);
        Scriptable topLevelScope = ScriptableObject.getTopLevelScope(scriptable);
        ErrorReporter forEval = DefaultErrorReporter.forEval(context.getErrorReporter());
        Evaluator createInterpreter = Context.createInterpreter();
        if (createInterpreter != null) {
            return context.compileFunction(topLevelScope, sb2, createInterpreter, forEval, makeUrlForGeneratedScript, 1, null);
        }
        throw new JavaScriptException("Interpreter not present", sourcePositionFromStack, iArr[0]);
    }

    private static BaseFunction realFunction(Scriptable scriptable, IdFunctionObject idFunctionObject) {
        if (scriptable != null) {
            Object defaultValue = scriptable.getDefaultValue(ScriptRuntime.FunctionClass);
            if (defaultValue instanceof Delegator) {
                defaultValue = ((Delegator) defaultValue).getDelegee();
            }
            return (BaseFunction) IdScriptableObject.ensureType(defaultValue, BaseFunction.class, idFunctionObject);
        }
        throw ScriptRuntime.notFunctionError(null);
    }

    public Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return Undefined.instance;
    }

    public Scriptable construct(Context context, Scriptable scriptable, Object[] objArr) {
        Scriptable parentScope;
        Scriptable classPrototype;
        Scriptable createObject = createObject(context, scriptable);
        if (createObject != null) {
            Object call = call(context, scriptable, createObject, objArr);
            if (call instanceof Scriptable) {
                return (Scriptable) call;
            }
            return createObject;
        }
        Object call2 = call(context, scriptable, null, objArr);
        if (call2 instanceof Scriptable) {
            Scriptable scriptable2 = (Scriptable) call2;
            if (scriptable2.getPrototype() == null && scriptable2 != (classPrototype = getClassPrototype())) {
                scriptable2.setPrototype(classPrototype);
            }
            if (scriptable2.getParentScope() == null && scriptable2 != (parentScope = getParentScope())) {
                scriptable2.setParentScope(parentScope);
            }
            return scriptable2;
        }
        vs.k(eub.p("Bad implementation of call as constructor, name=", getFunctionName(), " in ", getClass().getName()));
        return null;
    }

    public Scriptable createObject(Context context, Scriptable scriptable) {
        NativeObject nativeObject = new NativeObject();
        nativeObject.setPrototype(getClassPrototype());
        nativeObject.setParentScope(getParentScope());
        return nativeObject;
    }

    public String decompile(int i, EnumSet<DecompilerFlag> enumSet) {
        StringBuilder sb = new StringBuilder();
        boolean contains = enumSet.contains(DecompilerFlag.ONLY_BODY);
        if (!contains) {
            sb.append("function ");
            sb.append(getFunctionName());
            sb.append("() {\n\t");
        }
        sb.append("[native code, arity=");
        sb.append(getArity());
        sb.append("]\n");
        if (!contains) {
            sb.append("}\n");
        }
        return sb.toString();
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.IdFunctionCall
    public Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        int int32;
        Object[] objArr2;
        if (!idFunctionObject.hasTag(FUNCTION_TAG)) {
            return super.execIdCall(idFunctionObject, context, scriptable, scriptable2, objArr);
        }
        int methodId = idFunctionObject.methodId();
        Scriptable scriptable3 = null;
        boolean z = true;
        int i = 0;
        switch (methodId) {
            case 1:
                return jsConstructor(context, scriptable, objArr);
            case 2:
                return realFunction(scriptable2, idFunctionObject).decompile(ScriptRuntime.toInt32(objArr, 0), EnumSet.noneOf(DecompilerFlag.class));
            case 3:
                BaseFunction realFunction = realFunction(scriptable2, idFunctionObject);
                EnumSet<DecompilerFlag> of = EnumSet.of(DecompilerFlag.TO_SOURCE);
                if (objArr.length != 0 && (int32 = ScriptRuntime.toInt32(objArr[0])) >= 0) {
                    of = EnumSet.noneOf(DecompilerFlag.class);
                    i = int32;
                }
                return realFunction.decompile(i, of);
            case 4:
            case 5:
                if (methodId != 4) {
                    z = false;
                }
                return ScriptRuntime.applyOrCall(z, context, scriptable, scriptable2, objArr);
            case 6:
                if (scriptable2 instanceof Callable) {
                    Callable callable = (Callable) scriptable2;
                    int length = objArr.length;
                    if (length > 0) {
                        scriptable3 = ScriptRuntime.toObjectOrNull(context, objArr[0], scriptable);
                        int i2 = length - 1;
                        objArr2 = new Object[i2];
                        System.arraycopy(objArr, 1, objArr2, 0, i2);
                    } else {
                        objArr2 = ScriptRuntime.emptyArgs;
                    }
                    return new BoundFunction(context, scriptable, callable, scriptable3, objArr2);
                }
                throw ScriptRuntime.notFunctionError(scriptable2);
            default:
                vs.m(String.valueOf(methodId));
                return null;
        }
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void fillConstructorProperties(IdFunctionObject idFunctionObject) {
        idFunctionObject.setPrototype(this);
        super.fillConstructorProperties(idFunctionObject);
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int findInstanceIdInfo(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -2035517098:
                if (str.equals("arguments")) {
                    c = 0;
                    break;
                }
                break;
            case -1106363674:
                if (str.equals("length")) {
                    c = 1;
                    break;
                }
                break;
            case -598792926:
                if (str.equals("prototype")) {
                    c = 2;
                    break;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    c = 3;
                    break;
                }
                break;
            case 93082333:
                if (str.equals("arity")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return IdScriptableObject.instanceIdInfo(this.argumentsAttributes, 5);
            case 1:
                int i = this.lengthPropertyAttributes;
                if (i >= 0) {
                    return IdScriptableObject.instanceIdInfo(i, 1);
                }
                break;
            case 2:
                if (hasPrototypeProperty()) {
                    return IdScriptableObject.instanceIdInfo(this.prototypePropertyAttributes, 4);
                }
                break;
            case 3:
                int i2 = this.namePropertyAttributes;
                if (i2 >= 0) {
                    return IdScriptableObject.instanceIdInfo(i2, 3);
                }
                break;
            case 4:
                int i3 = this.arityPropertyAttributes;
                if (i3 >= 0) {
                    return IdScriptableObject.instanceIdInfo(i3, 2);
                }
                break;
        }
        return super.findInstanceIdInfo(str);
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int findPrototypeId(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1781441930:
                if (str.equals("toSource")) {
                    c = 0;
                    break;
                }
                break;
            case -1776922004:
                if (str.equals("toString")) {
                    c = 1;
                    break;
                }
                break;
            case -1588406278:
                if (str.equals("constructor")) {
                    c = 2;
                    break;
                }
                break;
            case 3023933:
                if (str.equals("bind")) {
                    c = 3;
                    break;
                }
                break;
            case 3045982:
                if (str.equals("call")) {
                    c = 4;
                    break;
                }
                break;
            case 93029230:
                if (str.equals("apply")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 3;
            case 1:
                return 2;
            case 2:
                return 1;
            case 3:
                return 6;
            case 4:
                return 5;
            case 5:
                return 4;
            default:
                return 0;
        }
    }

    public int getArity() {
        return 0;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        if (isGeneratorFunction()) {
            return GENERATOR_FUNCTION_CLASS;
        }
        return FUNCTION_CLASS;
    }

    public Scriptable getClassPrototype() {
        Object prototypeProperty = getPrototypeProperty();
        if (prototypeProperty instanceof Scriptable) {
            return (Scriptable) prototypeProperty;
        }
        return ScriptableObject.getObjectPrototype(this);
    }

    public String getFunctionName() {
        return "";
    }

    public Scriptable getHomeObject() {
        return this.homeObject;
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public String getInstanceIdName(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return super.getInstanceIdName(i);
                        }
                        return "arguments";
                    }
                    return "prototype";
                }
                return "name";
            }
            return "arity";
        }
        return "length";
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public Object getInstanceIdValue(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return super.getInstanceIdValue(i);
                        }
                        return getArguments();
                    }
                    return getPrototypeProperty();
                } else if (this.namePropertyAttributes >= 0) {
                    String str = this.nameValue;
                    if (str != null) {
                        return str;
                    }
                    return getFunctionName();
                } else {
                    return Scriptable.NOT_FOUND;
                }
            } else if (this.arityPropertyAttributes >= 0) {
                return Integer.valueOf(getArity());
            } else {
                return Scriptable.NOT_FOUND;
            }
        } else if (this.lengthPropertyAttributes >= 0) {
            return Integer.valueOf(getLength());
        } else {
            return Scriptable.NOT_FOUND;
        }
    }

    public int getLength() {
        return 0;
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int getMaxInstanceId() {
        return 5;
    }

    public Object getPrototypeProperty() {
        Object obj = this.prototypeProperty;
        if (obj == null) {
            if (this instanceof NativeFunction) {
                return setupDefaultPrototype();
            }
            return Undefined.instance;
        } else if (obj == UniqueTag.NULL_VALUE) {
            return null;
        } else {
            return obj;
        }
    }

    @Override // org.mozilla.javascript.ScriptableObject
    public String getTypeOf() {
        if (avoidObjectDetection()) {
            return "undefined";
        }
        return "function";
    }

    public boolean hasDefaultParameters() {
        return false;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public boolean hasInstance(Scriptable scriptable) {
        Object property = ScriptableObject.getProperty(this, "prototype");
        if (property instanceof Scriptable) {
            return ScriptRuntime.jsDelegatesTo(scriptable, (Scriptable) property);
        }
        throw ScriptRuntime.typeErrorById("msg.instanceof.bad.prototype", getFunctionName());
    }

    public boolean hasPrototypeProperty() {
        if (this.prototypeProperty == null && !(this instanceof NativeFunction)) {
            return false;
        }
        return true;
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void initPrototypeId(int i) {
        String str;
        int i2 = 1;
        switch (i) {
            case 1:
                str = "constructor";
                break;
            case 2:
                i2 = 0;
                str = "toString";
                break;
            case 3:
                str = "toSource";
                break;
            case 4:
                i2 = 2;
                str = "apply";
                break;
            case 5:
                str = "call";
                break;
            case 6:
                str = "bind";
                break;
            default:
                vs.m(String.valueOf(i));
                return;
        }
        initPrototypeMethod(FUNCTION_TAG, i, str, i2);
    }

    public boolean isGeneratorFunction() {
        return this.isGeneratorFunction;
    }

    public void setHomeObject(Scriptable scriptable) {
        this.homeObject = scriptable;
    }

    public void setImmunePrototypeProperty(Object obj) {
        if ((this.prototypePropertyAttributes & 1) == 0) {
            if (obj == null) {
                obj = UniqueTag.NULL_VALUE;
            }
            this.prototypeProperty = obj;
            this.prototypePropertyAttributes = 7;
            return;
        }
        vm1.d();
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void setInstanceIdAttributes(int i, int i2) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            super.setInstanceIdAttributes(i, i2);
                            return;
                        } else {
                            this.argumentsAttributes = i2;
                            return;
                        }
                    }
                    this.prototypePropertyAttributes = i2;
                    return;
                }
                this.namePropertyAttributes = i2;
                return;
            }
            this.arityPropertyAttributes = i2;
            return;
        }
        this.lengthPropertyAttributes = i2;
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void setInstanceIdValue(int i, Object obj) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            super.setInstanceIdValue(i, obj);
                            return;
                        }
                        if (obj == Scriptable.NOT_FOUND) {
                            Kit.codeBug();
                        }
                        if (defaultHas("arguments")) {
                            defaultPut("arguments", obj);
                        } else if ((this.argumentsAttributes & 1) == 0) {
                            this.argumentsObj = obj;
                        }
                    } else if ((this.prototypePropertyAttributes & 1) == 0) {
                        if (obj == null) {
                            obj = UniqueTag.NULL_VALUE;
                        }
                        this.prototypeProperty = obj;
                    }
                } else if (obj == Scriptable.NOT_FOUND) {
                    this.namePropertyAttributes = -1;
                    this.nameValue = null;
                } else if (obj instanceof CharSequence) {
                    this.nameValue = ScriptRuntime.toString(obj);
                } else {
                    this.nameValue = "";
                }
            } else if (obj == Scriptable.NOT_FOUND) {
                this.arityPropertyAttributes = -1;
            }
        } else if (obj == Scriptable.NOT_FOUND) {
            this.lengthPropertyAttributes = -1;
        }
    }

    public void setPrototypeProperty(Object obj) {
        this.prototypeProperty = obj;
    }

    public void setPrototypePropertyAttributes(int i) {
        this.prototypePropertyAttributes = i;
    }

    public void setStandardPropertyAttributes(int i) {
        this.namePropertyAttributes = i;
        this.lengthPropertyAttributes = i;
        this.arityPropertyAttributes = i;
    }

    public synchronized Object setupDefaultPrototype() {
        try {
            Object obj = this.prototypeProperty;
            if (obj != null) {
                return obj;
            }
            NativeObject nativeObject = new NativeObject();
            nativeObject.setParentScope(getParentScope());
            this.prototypeProperty = nativeObject;
            Scriptable objectPrototype = ScriptableObject.getObjectPrototype(this);
            if (objectPrototype != nativeObject) {
                nativeObject.setPrototype(objectPrototype);
            }
            nativeObject.defineProperty("constructor", this, 2);
            return nativeObject;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Deprecated
    public static void init(Scriptable scriptable, boolean z) {
        init(Context.getContext(), scriptable, z);
    }

    public BaseFunction(boolean z) {
        this.argumentsObj = Scriptable.NOT_FOUND;
        this.nameValue = null;
        this.homeObject = null;
        this.prototypePropertyAttributes = 6;
        this.argumentsAttributes = 6;
        this.arityPropertyAttributes = 7;
        this.namePropertyAttributes = 3;
        this.lengthPropertyAttributes = 7;
        this.isGeneratorFunction = z;
    }

    public BaseFunction(Scriptable scriptable, Scriptable scriptable2) {
        super(scriptable, scriptable2);
        this.argumentsObj = Scriptable.NOT_FOUND;
        this.nameValue = null;
        this.isGeneratorFunction = false;
        this.homeObject = null;
        this.prototypePropertyAttributes = 6;
        this.argumentsAttributes = 6;
        this.arityPropertyAttributes = 7;
        this.namePropertyAttributes = 3;
        this.lengthPropertyAttributes = 7;
    }
}
