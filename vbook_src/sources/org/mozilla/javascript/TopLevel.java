package org.mozilla.javascript;

import java.util.EnumMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public class TopLevel extends IdScriptableObject {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final long serialVersionUID = -4648046356662472260L;
    private EnumMap<Builtins, BaseFunction> ctors;
    private EnumMap<NativeErrors, BaseFunction> errors;

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public enum Builtins {
        Object,
        Array,
        Function,
        String,
        Number,
        Boolean,
        RegExp,
        Error,
        Symbol,
        GeneratorFunction,
        BigInt
    }

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public enum NativeErrors {
        AggregateError,
        Error,
        EvalError,
        RangeError,
        ReferenceError,
        SyntaxError,
        TypeError,
        URIError,
        InternalError,
        JavaException
    }

    public static Function getBuiltinCtor(Context context, Scriptable scriptable, Builtins builtins) {
        String name;
        BaseFunction builtinCtor;
        if ((scriptable instanceof TopLevel) && (builtinCtor = ((TopLevel) scriptable).getBuiltinCtor(builtins)) != null) {
            return builtinCtor;
        }
        if (builtins == Builtins.GeneratorFunction) {
            name = "__GeneratorFunction";
        } else {
            name = builtins.name();
        }
        return ScriptRuntime.getExistingCtor(context, scriptable, name);
    }

    public static Scriptable getBuiltinPrototype(Scriptable scriptable, Builtins builtins) {
        String name;
        Scriptable builtinPrototype;
        if ((scriptable instanceof TopLevel) && (builtinPrototype = ((TopLevel) scriptable).getBuiltinPrototype(builtins)) != null) {
            return builtinPrototype;
        }
        if (builtins == Builtins.GeneratorFunction) {
            name = "__GeneratorFunction";
        } else {
            name = builtins.name();
        }
        return ScriptableObject.getClassPrototype(scriptable, name);
    }

    public static Function getNativeErrorCtor(Context context, Scriptable scriptable, NativeErrors nativeErrors) {
        BaseFunction nativeErrorCtor;
        if ((scriptable instanceof TopLevel) && (nativeErrorCtor = ((TopLevel) scriptable).getNativeErrorCtor(nativeErrors)) != null) {
            return nativeErrorCtor;
        }
        return ScriptRuntime.getExistingCtor(context, scriptable, nativeErrors.name());
    }

    public void cacheBuiltins(Scriptable scriptable, boolean z) {
        Builtins[] values;
        NativeErrors[] values2;
        this.ctors = new EnumMap<>(Builtins.class);
        for (Builtins builtins : Builtins.values()) {
            Object property = ScriptableObject.getProperty(this, builtins.name());
            if (property instanceof BaseFunction) {
                this.ctors.put((EnumMap<Builtins, BaseFunction>) builtins, (Builtins) ((BaseFunction) property));
            } else if (builtins == Builtins.GeneratorFunction) {
                this.ctors.put((EnumMap<Builtins, BaseFunction>) builtins, (Builtins) ((BaseFunction) BaseFunction.initAsGeneratorFunction(scriptable, z)));
            }
        }
        this.errors = new EnumMap<>(NativeErrors.class);
        for (NativeErrors nativeErrors : NativeErrors.values()) {
            Object property2 = ScriptableObject.getProperty(this, nativeErrors.name());
            if (property2 instanceof BaseFunction) {
                this.errors.put((EnumMap<NativeErrors, BaseFunction>) nativeErrors, (NativeErrors) ((BaseFunction) property2));
            }
        }
    }

    public void clearCache() {
        this.ctors = null;
        this.errors = null;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return "global";
    }

    public BaseFunction getNativeErrorCtor(NativeErrors nativeErrors) {
        EnumMap<NativeErrors, BaseFunction> enumMap = this.errors;
        if (enumMap != null) {
            return enumMap.get(nativeErrors);
        }
        return null;
    }

    public BaseFunction getBuiltinCtor(Builtins builtins) {
        EnumMap<Builtins, BaseFunction> enumMap = this.ctors;
        if (enumMap != null) {
            return enumMap.get(builtins);
        }
        return null;
    }

    public Scriptable getBuiltinPrototype(Builtins builtins) {
        BaseFunction builtinCtor = getBuiltinCtor(builtins);
        Object prototypeProperty = builtinCtor != null ? builtinCtor.getPrototypeProperty() : null;
        if (prototypeProperty instanceof Scriptable) {
            return (Scriptable) prototypeProperty;
        }
        return null;
    }
}
