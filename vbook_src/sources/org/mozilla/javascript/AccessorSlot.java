package org.mozilla.javascript;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public class AccessorSlot extends Slot {
    private static final long serialVersionUID = 1677840254177335827L;
    transient Getter getter;
    transient Setter setter;

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class FunctionGetter implements Getter {
        final Object target;

        public FunctionGetter(Object obj) {
            this.target = obj;
        }

        @Override // org.mozilla.javascript.AccessorSlot.Getter
        public Function asGetterFunction(String str, Scriptable scriptable) {
            Object obj = this.target;
            if (obj instanceof Function) {
                return (Function) obj;
            }
            return null;
        }

        @Override // org.mozilla.javascript.AccessorSlot.Getter
        public Object getValue(Scriptable scriptable) {
            Object obj = this.target;
            if (obj instanceof Function) {
                Function function = (Function) obj;
                return function.call(Context.getContext(), function.getParentScope(), scriptable, ScriptRuntime.emptyArgs);
            }
            return Undefined.instance;
        }

        @Override // org.mozilla.javascript.AccessorSlot.Getter
        public boolean isSameGetterFunction(Object obj) {
            Object obj2;
            Object obj3 = this.target;
            if (obj3 instanceof Function) {
                obj2 = (Function) obj3;
            } else {
                obj2 = Undefined.instance;
            }
            return ScriptRuntime.shallowEq(obj2, obj);
        }
    }

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class FunctionSetter implements Setter {
        final Object target;

        public FunctionSetter(Object obj) {
            this.target = obj;
        }

        @Override // org.mozilla.javascript.AccessorSlot.Setter
        public Function asSetterFunction(String str, Scriptable scriptable) {
            Object obj = this.target;
            if (obj instanceof Function) {
                return (Function) obj;
            }
            return null;
        }

        @Override // org.mozilla.javascript.AccessorSlot.Setter
        public boolean isSameSetterFunction(Object obj) {
            Object obj2;
            Object obj3 = this.target;
            if (obj3 instanceof Function) {
                obj2 = (Function) obj3;
            } else {
                obj2 = Undefined.instance;
            }
            return ScriptRuntime.shallowEq(obj2, obj);
        }

        @Override // org.mozilla.javascript.AccessorSlot.Setter
        public boolean setValue(Object obj, Scriptable scriptable, Scriptable scriptable2) {
            Object obj2 = this.target;
            if (obj2 instanceof Function) {
                Function function = (Function) obj2;
                function.call(Context.getContext(), function.getParentScope(), scriptable2, new Object[]{obj});
                return true;
            }
            return true;
        }
    }

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public interface Getter {
        Function asGetterFunction(String str, Scriptable scriptable);

        Object getValue(Scriptable scriptable);

        boolean isSameGetterFunction(Object obj);
    }

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class MemberBoxGetter implements Getter {
        final MemberBox member;

        public MemberBoxGetter(MemberBox memberBox) {
            this.member = memberBox;
        }

        @Override // org.mozilla.javascript.AccessorSlot.Getter
        public Function asGetterFunction(String str, Scriptable scriptable) {
            return this.member.asGetterFunction(str, scriptable);
        }

        @Override // org.mozilla.javascript.AccessorSlot.Getter
        public Object getValue(Scriptable scriptable) {
            MemberBox memberBox = this.member;
            Object obj = memberBox.delegateTo;
            if (obj == null) {
                return memberBox.invoke(scriptable, ScriptRuntime.emptyArgs);
            }
            return memberBox.invoke(obj, new Object[]{scriptable});
        }

        @Override // org.mozilla.javascript.AccessorSlot.Getter
        public boolean isSameGetterFunction(Object obj) {
            return this.member.isSameGetterFunction(obj);
        }
    }

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class MemberBoxSetter implements Setter {
        final MemberBox member;

        public MemberBoxSetter(MemberBox memberBox) {
            this.member = memberBox;
        }

        @Override // org.mozilla.javascript.AccessorSlot.Setter
        public Function asSetterFunction(String str, Scriptable scriptable) {
            return this.member.asSetterFunction(str, scriptable);
        }

        @Override // org.mozilla.javascript.AccessorSlot.Setter
        public boolean isSameSetterFunction(Object obj) {
            return this.member.isSameSetterFunction(obj);
        }

        @Override // org.mozilla.javascript.AccessorSlot.Setter
        public boolean setValue(Object obj, Scriptable scriptable, Scriptable scriptable2) {
            Context context = Context.getContext();
            Class<?>[] clsArr = this.member.argTypes;
            Object convertArg = FunctionObject.convertArg(context, scriptable2, obj, FunctionObject.getTypeTag(clsArr[clsArr.length - 1]));
            MemberBox memberBox = this.member;
            Object obj2 = memberBox.delegateTo;
            if (obj2 == null) {
                memberBox.invoke(scriptable2, new Object[]{convertArg});
            } else {
                memberBox.invoke(obj2, new Object[]{scriptable2, convertArg});
            }
            return true;
        }
    }

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public interface Setter {
        Function asSetterFunction(String str, Scriptable scriptable);

        boolean isSameSetterFunction(Object obj);

        boolean setValue(Object obj, Scriptable scriptable, Scriptable scriptable2);
    }

    public AccessorSlot(Object obj, int i) {
        super(obj, i, 0);
    }

    @Override // org.mozilla.javascript.Slot
    public AccessorSlot copySlot() {
        AccessorSlot accessorSlot = new AccessorSlot(this);
        accessorSlot.value = this.value;
        accessorSlot.getter = this.getter;
        accessorSlot.setter = this.setter;
        accessorSlot.next = null;
        accessorSlot.orderedNext = null;
        return accessorSlot;
    }

    @Override // org.mozilla.javascript.Slot
    public Function getGetterFunction(String str, Scriptable scriptable) {
        Getter getter = this.getter;
        if (getter == null) {
            return null;
        }
        return getter.asGetterFunction(str, scriptable);
    }

    @Override // org.mozilla.javascript.Slot
    public ScriptableObject getPropertyDescriptor(Context context, Scriptable scriptable) {
        boolean z;
        boolean z2;
        String obj;
        boolean z3;
        boolean z4;
        ScriptableObject scriptableObject = (ScriptableObject) context.newObject(scriptable);
        int attributes = getAttributes();
        boolean z5 = true;
        if (context.getLanguageVersion() >= 200) {
            z = true;
        } else {
            z = false;
        }
        Getter getter = this.getter;
        if (z) {
            if (getter == null && this.setter == null) {
                if ((attributes & 1) == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                scriptableObject.defineProperty("writable", Boolean.valueOf(z4), 0);
            }
        } else {
            if (getter == null && this.setter == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            scriptableObject.setCommonDescriptorProperties(attributes, z2);
        }
        Object obj2 = this.name;
        if (obj2 == null) {
            obj = "f";
        } else {
            obj = obj2.toString();
        }
        Getter getter2 = this.getter;
        if (getter2 != null) {
            Object asGetterFunction = getter2.asGetterFunction(obj, scriptable);
            if (asGetterFunction == null) {
                asGetterFunction = Undefined.instance;
            }
            scriptableObject.defineProperty("get", asGetterFunction, 0);
        }
        Setter setter = this.setter;
        if (setter != null) {
            Object asSetterFunction = setter.asSetterFunction(obj, scriptable);
            if (asSetterFunction == null) {
                asSetterFunction = Undefined.instance;
            }
            scriptableObject.defineProperty("set", asSetterFunction, 0);
        } else if (z) {
            scriptableObject.defineProperty("set", Undefined.instance, 0);
        }
        if (z) {
            if ((attributes & 2) == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            scriptableObject.defineProperty("enumerable", Boolean.valueOf(z3), 0);
            if ((attributes & 4) != 0) {
                z5 = false;
            }
            scriptableObject.defineProperty("configurable", Boolean.valueOf(z5), 0);
        }
        return scriptableObject;
    }

    @Override // org.mozilla.javascript.Slot
    public Function getSetterFunction(String str, Scriptable scriptable) {
        Setter setter = this.setter;
        if (setter == null) {
            return null;
        }
        return setter.asSetterFunction(str, scriptable);
    }

    @Override // org.mozilla.javascript.Slot
    public Object getValue(Scriptable scriptable) {
        Getter getter = this.getter;
        if (getter != null) {
            return getter.getValue(scriptable);
        }
        return super.getValue(scriptable);
    }

    @Override // org.mozilla.javascript.Slot
    public boolean isSameGetterFunction(Object obj) {
        if (obj == Scriptable.NOT_FOUND) {
            return true;
        }
        Getter getter = this.getter;
        if (getter == null) {
            return ScriptRuntime.shallowEq(Undefined.instance, obj);
        }
        return getter.isSameGetterFunction(obj);
    }

    @Override // org.mozilla.javascript.Slot
    public boolean isSameSetterFunction(Object obj) {
        if (obj == Scriptable.NOT_FOUND) {
            return true;
        }
        Setter setter = this.setter;
        if (setter == null) {
            return ScriptRuntime.shallowEq(Undefined.instance, obj);
        }
        return setter.isSameSetterFunction(obj);
    }

    @Override // org.mozilla.javascript.Slot
    public boolean isSetterSlot() {
        return true;
    }

    @Override // org.mozilla.javascript.Slot
    public boolean isValueSlot() {
        return false;
    }

    @Override // org.mozilla.javascript.Slot
    public boolean setValue(Object obj, Scriptable scriptable, Scriptable scriptable2, boolean z) {
        Setter setter = this.setter;
        if (setter == null) {
            if (this.getter != null) {
                throwNoSetterException(scriptable2, obj);
                return true;
            }
            return super.setValue(obj, scriptable, scriptable2, z);
        }
        return setter.setValue(obj, scriptable, scriptable2);
    }

    public AccessorSlot(Slot slot) {
        super(slot);
    }
}
