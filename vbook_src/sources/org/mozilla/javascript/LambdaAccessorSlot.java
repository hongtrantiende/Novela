package org.mozilla.javascript;

import java.util.function.BiConsumer;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public class LambdaAccessorSlot extends Slot {
    private transient java.util.function.Function<Scriptable, Object> getter;
    private LambdaFunction getterFunction;
    private transient BiConsumer<Scriptable, Object> setter;
    private LambdaFunction setterFunction;

    public LambdaAccessorSlot(Object obj, int i) {
        super(obj, i, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$setSetter$1(BiConsumer biConsumer, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        biConsumer.accept(scriptable2, objArr[0]);
        return Undefined.instance;
    }

    public ScriptableObject buildPropertyDescriptor(Context context) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        NativeObject nativeObject = new NativeObject();
        int attributes = getAttributes();
        boolean z5 = true;
        if (context.getLanguageVersion() >= 200) {
            z = true;
        } else {
            z = false;
        }
        LambdaFunction lambdaFunction = this.getterFunction;
        if (z) {
            if (lambdaFunction == null && this.setterFunction == null) {
                if ((attributes & 1) == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                nativeObject.defineProperty("writable", Boolean.valueOf(z4), 0);
            }
        } else {
            if (lambdaFunction == null && this.setterFunction == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            nativeObject.setCommonDescriptorProperties(attributes, z2);
        }
        LambdaFunction lambdaFunction2 = this.getterFunction;
        if (lambdaFunction2 != null) {
            nativeObject.defineProperty("get", lambdaFunction2, 0);
        }
        LambdaFunction lambdaFunction3 = this.setterFunction;
        if (lambdaFunction3 != null) {
            nativeObject.defineProperty("set", lambdaFunction3, 0);
        } else if (z) {
            nativeObject.defineProperty("set", Undefined.instance, 0);
        }
        if (z) {
            if ((attributes & 2) == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            nativeObject.defineProperty("enumerable", Boolean.valueOf(z3), 0);
            if ((attributes & 4) != 0) {
                z5 = false;
            }
            nativeObject.defineProperty("configurable", Boolean.valueOf(z5), 0);
        }
        return nativeObject;
    }

    @Override // org.mozilla.javascript.Slot
    public LambdaAccessorSlot copySlot() {
        LambdaAccessorSlot lambdaAccessorSlot = new LambdaAccessorSlot(this);
        lambdaAccessorSlot.value = this.value;
        lambdaAccessorSlot.getter = this.getter;
        lambdaAccessorSlot.setter = this.setter;
        lambdaAccessorSlot.getterFunction = this.getterFunction;
        lambdaAccessorSlot.setterFunction = this.setterFunction;
        lambdaAccessorSlot.next = null;
        lambdaAccessorSlot.orderedNext = null;
        return lambdaAccessorSlot;
    }

    @Override // org.mozilla.javascript.Slot
    public ScriptableObject getPropertyDescriptor(Context context, Scriptable scriptable) {
        return buildPropertyDescriptor(context);
    }

    @Override // org.mozilla.javascript.Slot
    public Object getValue(Scriptable scriptable) {
        java.util.function.Function<Scriptable, Object> function = this.getter;
        if (function != null) {
            return function.apply(scriptable);
        }
        return super.getValue(scriptable);
    }

    @Override // org.mozilla.javascript.Slot
    public boolean isSetterSlot() {
        return true;
    }

    @Override // org.mozilla.javascript.Slot
    public boolean isValueSlot() {
        return false;
    }

    public void replaceWith(LambdaAccessorSlot lambdaAccessorSlot) {
        this.getterFunction = lambdaAccessorSlot.getterFunction;
        this.getter = lambdaAccessorSlot.getter;
        this.setterFunction = lambdaAccessorSlot.setterFunction;
        this.setter = lambdaAccessorSlot.setter;
        setAttributes(lambdaAccessorSlot.getAttributes());
    }

    public void setGetter(Scriptable scriptable, java.util.function.Function<Scriptable, Object> function) {
        this.getter = function;
        if (function != null) {
            this.getterFunction = new LambdaFunction(scriptable, "get ".concat(String.valueOf(this.name)), 0, new gb6(function, 0));
        }
    }

    public void setSetter(Scriptable scriptable, BiConsumer<Scriptable, Object> biConsumer) {
        this.setter = biConsumer;
        if (biConsumer != null) {
            this.setterFunction = new LambdaFunction(scriptable, "set ".concat(String.valueOf(this.name)), 1, new gb6(biConsumer, 1));
        }
    }

    @Override // org.mozilla.javascript.Slot
    public boolean setValue(Object obj, Scriptable scriptable, Scriptable scriptable2, boolean z) {
        BiConsumer<Scriptable, Object> biConsumer = this.setter;
        if (biConsumer == null) {
            if (this.getter != null) {
                throwNoSetterException(scriptable2, obj);
                return true;
            }
            return super.setValue(obj, scriptable2, scriptable2, z);
        }
        biConsumer.accept(scriptable2, obj);
        return true;
    }

    public LambdaAccessorSlot(Slot slot) {
        super(slot);
    }
}
