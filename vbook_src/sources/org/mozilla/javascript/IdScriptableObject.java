package org.mozilla.javascript;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public abstract class IdScriptableObject extends ScriptableObject implements IdFunctionCall {
    private static final long serialVersionUID = -3744239272168621609L;
    private transient PrototypeValues prototypeValues;

    public IdScriptableObject() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T ensureType(Object obj, Class<T> cls, String str) {
        if (cls.isInstance(obj)) {
            return obj;
        }
        if (obj == 0) {
            throw ScriptRuntime.typeErrorById("msg.incompat.call.details", str, "null", cls.getName());
        }
        throw ScriptRuntime.typeErrorById("msg.incompat.call.details", str, obj.getClass().getName(), cls.getName());
    }

    private ScriptableObject getBuiltInDataDescriptor(String str) {
        Scriptable parentScope = getParentScope();
        if (parentScope == null) {
            parentScope = this;
        }
        Slot builtInSlot = getBuiltInSlot(str);
        if (builtInSlot == null) {
            return null;
        }
        return ScriptableObject.buildDataDescriptor(parentScope, builtInSlot.value, builtInSlot.getAttributes());
    }

    private Slot getBuiltInSlot(String str) {
        int findId;
        int findInstanceIdInfo = findInstanceIdInfo(str);
        if (findInstanceIdInfo != 0) {
            Object instanceIdValue = getInstanceIdValue(65535 & findInstanceIdInfo);
            Slot slot = new Slot(str, 0, findInstanceIdInfo >>> 16);
            slot.value = instanceIdValue;
            return slot;
        }
        PrototypeValues prototypeValues = this.prototypeValues;
        if (prototypeValues != null && (findId = prototypeValues.findId(str)) != 0) {
            Object obj = this.prototypeValues.get(findId);
            Slot slot2 = new Slot(str, 0, this.prototypeValues.getAttributes(findId));
            slot2.value = obj;
            return slot2;
        }
        return null;
    }

    public static int instanceIdInfo(int i, int i2) {
        return (i << 16) | i2;
    }

    private IdFunctionObject newIdFunction(Object obj, int i, String str, int i2, Scriptable scriptable) {
        IdFunctionObject idFunctionObjectES6;
        if (Context.getContext().getLanguageVersion() < 200) {
            idFunctionObjectES6 = new IdFunctionObject(this, obj, i, str, i2, scriptable);
        } else {
            idFunctionObjectES6 = new IdFunctionObjectES6(this, obj, i, str, i2, scriptable);
        }
        if (isSealed()) {
            idFunctionObjectES6.sealObject();
        }
        return idFunctionObjectES6;
    }

    private Slot queryOrFakeSlot(Context context, Object obj) {
        Slot querySlot = querySlot(context, obj);
        if (querySlot == null) {
            if (obj instanceof String) {
                return getBuiltInSlot((String) obj);
            }
            if (ScriptRuntime.isSymbol(obj)) {
                if (obj instanceof SymbolKey) {
                    return getBuiltInSlot((SymbolKey) obj);
                }
                return getBuiltInSlot(((NativeSymbol) obj).getKey());
            }
        }
        return querySlot;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt != 0) {
            activatePrototypeMap(readInt);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        int i;
        objectOutputStream.defaultWriteObject();
        PrototypeValues prototypeValues = this.prototypeValues;
        if (prototypeValues != null) {
            i = prototypeValues.getMaxId();
        } else {
            i = 0;
        }
        objectOutputStream.writeInt(i);
    }

    public final void activatePrototypeMap(int i) {
        PrototypeValues prototypeValues = new PrototypeValues(this, i);
        synchronized (this) {
            try {
                if (this.prototypeValues == null) {
                    this.prototypeValues = prototypeValues;
                } else {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void addIdFunctionProperty(Scriptable scriptable, Object obj, int i, String str, int i2) {
        newIdFunction(obj, i, str, i2, ScriptableObject.getTopLevelScope(scriptable)).addAsProperty(scriptable);
    }

    public final Object defaultGet(String str) {
        return super.get(str, this);
    }

    public final boolean defaultHas(String str) {
        return super.has(str, this);
    }

    public final void defaultPut(String str, Object obj) {
        super.put(str, this, obj);
    }

    @Override // org.mozilla.javascript.ScriptableObject
    public boolean defineOwnProperty(Context context, Object obj, ScriptableObject scriptableObject, boolean z) {
        int findId;
        if (obj instanceof CharSequence) {
            String obj2 = obj.toString();
            int findInstanceIdInfo = findInstanceIdInfo(obj2);
            if (findInstanceIdInfo != 0) {
                int i = 65535 & findInstanceIdInfo;
                if (ScriptableObject.isAccessorDescriptor(scriptableObject)) {
                    delete(i);
                } else {
                    checkPropertyDefinition(scriptableObject);
                    checkPropertyChangeForSlot(obj2, queryOrFakeSlot(context, obj), scriptableObject);
                    int i2 = findInstanceIdInfo >>> 16;
                    Object property = ScriptableObject.getProperty(scriptableObject, ES6Iterator.VALUE_PROPERTY);
                    if (property != Scriptable.NOT_FOUND && (((i2 & 1) == 0 || (i2 & 4) == 0) && !sameValue(property, getInstanceIdValue(i)))) {
                        setInstanceIdValue(i, property);
                    }
                    setAttributes(obj2, applyDescriptorToAttributeBitset(i2, ScriptableObject.getProperty(scriptableObject, "enumerable"), ScriptableObject.getProperty(scriptableObject, "writable"), ScriptableObject.getProperty(scriptableObject, "configurable")));
                    return true;
                }
            }
            PrototypeValues prototypeValues = this.prototypeValues;
            if (prototypeValues != null && (findId = prototypeValues.findId(obj2)) != 0) {
                if (ScriptableObject.isAccessorDescriptor(scriptableObject)) {
                    this.prototypeValues.delete(findId);
                } else {
                    checkPropertyDefinition(scriptableObject);
                    checkPropertyChangeForSlot(obj2, queryOrFakeSlot(context, obj), scriptableObject);
                    int attributes = this.prototypeValues.getAttributes(findId);
                    Object property2 = ScriptableObject.getProperty(scriptableObject, ES6Iterator.VALUE_PROPERTY);
                    if (property2 != Scriptable.NOT_FOUND && (attributes & 1) == 0 && !sameValue(property2, this.prototypeValues.get(findId))) {
                        this.prototypeValues.set(findId, this, property2);
                    }
                    this.prototypeValues.setAttributes(findId, applyDescriptorToAttributeBitset(attributes, ScriptableObject.getProperty(scriptableObject, "enumerable"), ScriptableObject.getProperty(scriptableObject, "writable"), ScriptableObject.getProperty(scriptableObject, "configurable")));
                    if (super.has(obj2, this)) {
                        super.delete(obj2);
                    }
                    return true;
                }
            }
        }
        return super.defineOwnProperty(context, obj, scriptableObject, z);
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public void delete(String str) {
        int findId;
        int findInstanceIdInfo = findInstanceIdInfo(str);
        if (findInstanceIdInfo != 0 && !isSealed()) {
            if (((findInstanceIdInfo >>> 16) & 4) != 0) {
                if (Context.getContext().isStrictMode()) {
                    throw ScriptRuntime.typeErrorById("msg.delete.property.with.configurable.false", str);
                }
                return;
            }
            setInstanceIdValue(65535 & findInstanceIdInfo, Scriptable.NOT_FOUND);
            return;
        }
        PrototypeValues prototypeValues = this.prototypeValues;
        if (prototypeValues != null && (findId = prototypeValues.findId(str)) != 0) {
            if (!isSealed()) {
                this.prototypeValues.delete(findId);
                return;
            }
            return;
        }
        super.delete(str);
    }

    public Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        throw idFunctionObject.unknown();
    }

    public final IdFunctionObject exportAsJSClass(int i, Scriptable scriptable, boolean z) {
        if (scriptable != this && scriptable != null) {
            setParentScope(scriptable);
            setPrototype(ScriptableObject.getObjectPrototype(scriptable));
        }
        activatePrototypeMap(i);
        IdFunctionObject createPrecachedConstructor = this.prototypeValues.createPrecachedConstructor();
        if (z) {
            sealObject();
        }
        fillConstructorProperties(createPrecachedConstructor);
        if (z) {
            createPrecachedConstructor.sealObject();
        }
        createPrecachedConstructor.exportAsScopeProperty();
        return createPrecachedConstructor;
    }

    public int findInstanceIdInfo(String str) {
        return 0;
    }

    public int findPrototypeId(String str) {
        throw new IllegalStateException(str);
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public Object get(String str, Scriptable scriptable) {
        int findId;
        Object obj;
        Object instanceIdValue;
        Object obj2 = super.get(str, scriptable);
        Object obj3 = Scriptable.NOT_FOUND;
        if (obj2 != obj3) {
            return obj2;
        }
        int findInstanceIdInfo = findInstanceIdInfo(str);
        if (findInstanceIdInfo != 0 && (instanceIdValue = getInstanceIdValue(findInstanceIdInfo & 65535)) != obj3) {
            return instanceIdValue;
        }
        PrototypeValues prototypeValues = this.prototypeValues;
        if (prototypeValues != null && (findId = prototypeValues.findId(str)) != 0 && (obj = this.prototypeValues.get(findId)) != obj3) {
            return obj;
        }
        return obj3;
    }

    @Override // org.mozilla.javascript.ScriptableObject
    public int getAttributes(String str) {
        int findId;
        int findInstanceIdInfo = findInstanceIdInfo(str);
        if (findInstanceIdInfo != 0) {
            return findInstanceIdInfo >>> 16;
        }
        PrototypeValues prototypeValues = this.prototypeValues;
        if (prototypeValues != null && (findId = prototypeValues.findId(str)) != 0) {
            return this.prototypeValues.getAttributes(findId);
        }
        return super.getAttributes(str);
    }

    @Override // org.mozilla.javascript.ScriptableObject
    public Object[] getIds(boolean z, boolean z2) {
        Object[] ids = super.getIds(z, z2);
        PrototypeValues prototypeValues = this.prototypeValues;
        if (prototypeValues != null) {
            ids = prototypeValues.getNames(z, z2, ids);
        }
        int maxInstanceId = getMaxInstanceId();
        if (maxInstanceId != 0) {
            Object[] objArr = null;
            int i = 0;
            while (maxInstanceId != 0) {
                String instanceIdName = getInstanceIdName(maxInstanceId);
                int findInstanceIdInfo = findInstanceIdInfo(instanceIdName);
                if (findInstanceIdInfo != 0) {
                    int i2 = findInstanceIdInfo >>> 16;
                    if (((i2 & 4) != 0 || Scriptable.NOT_FOUND != getInstanceIdValue(maxInstanceId)) && (z || (i2 & 2) == 0)) {
                        if (i == 0) {
                            objArr = new Object[maxInstanceId];
                        }
                        objArr[i] = instanceIdName;
                        i++;
                    }
                }
                maxInstanceId--;
            }
            if (i != 0) {
                if (ids.length == 0 && objArr.length == i) {
                    return objArr;
                }
                Object[] objArr2 = new Object[ids.length + i];
                System.arraycopy(ids, 0, objArr2, 0, ids.length);
                System.arraycopy(objArr, 0, objArr2, ids.length, i);
                return objArr2;
            }
        }
        return ids;
    }

    public String getInstanceIdName(int i) {
        throw new IllegalArgumentException(String.valueOf(i));
    }

    public Object getInstanceIdValue(int i) {
        throw new IllegalStateException(String.valueOf(i));
    }

    public int getMaxInstanceId() {
        return 0;
    }

    @Override // org.mozilla.javascript.ScriptableObject
    public ScriptableObject getOwnPropertyDescriptor(Context context, Object obj) {
        ScriptableObject ownPropertyDescriptor = super.getOwnPropertyDescriptor(context, obj);
        if (ownPropertyDescriptor == null) {
            if (obj instanceof String) {
                return getBuiltInDataDescriptor((String) obj);
            }
            if (ScriptRuntime.isSymbol(obj)) {
                if (obj instanceof SymbolKey) {
                    return getBuiltInDataDescriptor((SymbolKey) obj);
                }
                return getBuiltInDataDescriptor(((NativeSymbol) obj).getKey());
            }
        }
        return ownPropertyDescriptor;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public boolean has(String str, Scriptable scriptable) {
        int findId;
        int findInstanceIdInfo = findInstanceIdInfo(str);
        if (findInstanceIdInfo != 0) {
            if (((findInstanceIdInfo >>> 16) & 4) != 0) {
                return true;
            }
            if (Scriptable.NOT_FOUND != getInstanceIdValue(65535 & findInstanceIdInfo)) {
                return true;
            }
            return false;
        }
        PrototypeValues prototypeValues = this.prototypeValues;
        if (prototypeValues != null && (findId = prototypeValues.findId(str)) != 0) {
            return this.prototypeValues.has(findId);
        }
        return super.has(str, scriptable);
    }

    public final boolean hasPrototypeMap() {
        if (this.prototypeValues != null) {
            return true;
        }
        return false;
    }

    public final void initPrototypeConstructor(IdFunctionObject idFunctionObject) {
        int i = this.prototypeValues.constructorId;
        if (i != 0) {
            if (idFunctionObject.methodId() == i) {
                if (isSealed()) {
                    idFunctionObject.sealObject();
                }
                this.prototypeValues.initValue(i, "constructor", idFunctionObject, 2);
                return;
            }
            p1a.g();
            return;
        }
        vm1.d();
    }

    public void initPrototypeId(int i) {
        throw new IllegalStateException(String.valueOf(i));
    }

    public final IdFunctionObject initPrototypeMethod(Object obj, int i, String str, String str2, int i2) {
        String str3;
        Scriptable topLevelScope = ScriptableObject.getTopLevelScope(this);
        if (str2 != null) {
            str3 = str2;
        } else {
            str3 = str;
        }
        IdFunctionObject newIdFunction = newIdFunction(obj, i, str3, i2, topLevelScope);
        this.prototypeValues.initValue(i, str, newIdFunction, 2);
        return newIdFunction;
    }

    public final void initPrototypeValue(int i, String str, Object obj, int i2) {
        this.prototypeValues.initValue(i, str, obj, i2);
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.SymbolScriptable
    public void put(Symbol symbol, Scriptable scriptable, Object obj) {
        int findId;
        int findInstanceIdInfo = findInstanceIdInfo(symbol);
        if (findInstanceIdInfo != 0) {
            if (scriptable == this && isSealed()) {
                throw Context.reportRuntimeErrorById("msg.modify.sealed", new Object[0]);
            }
            if (((findInstanceIdInfo >>> 16) & 1) == 0) {
                if (scriptable == this) {
                    setInstanceIdValue(65535 & findInstanceIdInfo, obj);
                    return;
                } else {
                    ScriptableObject.ensureSymbolScriptable(scriptable).put(symbol, scriptable, obj);
                    return;
                }
            }
            return;
        }
        PrototypeValues prototypeValues = this.prototypeValues;
        if (prototypeValues != null && (findId = prototypeValues.findId(symbol)) != 0) {
            if (scriptable == this && isSealed()) {
                throw Context.reportRuntimeErrorById("msg.modify.sealed", new Object[0]);
            }
            this.prototypeValues.set(findId, scriptable, obj);
            return;
        }
        super.put(symbol, scriptable, obj);
    }

    @Override // org.mozilla.javascript.ScriptableObject
    public void setAttributes(String str, int i) {
        int findId;
        ScriptableObject.checkValidAttributes(i);
        int findInstanceIdInfo = findInstanceIdInfo(str);
        if (findInstanceIdInfo != 0) {
            int i2 = 65535 & findInstanceIdInfo;
            if (i != (findInstanceIdInfo >>> 16)) {
                setInstanceIdAttributes(i2, i);
                return;
            }
            return;
        }
        PrototypeValues prototypeValues = this.prototypeValues;
        if (prototypeValues != null && (findId = prototypeValues.findId(str)) != 0) {
            this.prototypeValues.setAttributes(findId, i);
        } else {
            super.setAttributes(str, i);
        }
    }

    public void setInstanceIdAttributes(int i, int i2) {
        throw ScriptRuntime.constructError("InternalError", hl5.o("Changing attributes not supported for ", getClassName(), " ", getInstanceIdName(i), " property"));
    }

    public void setInstanceIdValue(int i, Object obj) {
        throw new IllegalStateException(String.valueOf(i));
    }

    public int findInstanceIdInfo(Symbol symbol) {
        return 0;
    }

    public IdScriptableObject(Scriptable scriptable, Scriptable scriptable2) {
        super(scriptable, scriptable2);
    }

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class PrototypeValues implements Serializable {
        private static final int NAME_SLOT = 1;
        private static final int SLOT_SPAN = 2;
        private static final long serialVersionUID = 3038645279153854371L;
        private short[] attributeArray;
        private IdFunctionObject constructor;
        private short constructorAttrs;
        int constructorId;
        private int maxId;
        private IdScriptableObject obj;
        private Object[] valueArray;

        public PrototypeValues(IdScriptableObject idScriptableObject, int i) {
            if (idScriptableObject != null) {
                if (i >= 1) {
                    this.obj = idScriptableObject;
                    this.maxId = i;
                    return;
                }
                p1a.g();
                throw null;
            }
            p1a.g();
            throw null;
        }

        private Object ensureId(int i) {
            Object[] objArr = this.valueArray;
            synchronized (this) {
                if (objArr == null) {
                    try {
                        objArr = this.valueArray;
                        if (objArr == null) {
                            int i2 = this.maxId;
                            Object[] objArr2 = new Object[i2 * 2];
                            this.valueArray = objArr2;
                            this.attributeArray = new short[i2];
                            objArr = objArr2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            int i3 = (i - 1) * 2;
            Object obj = objArr[i3];
            if (obj == null) {
                int i4 = this.constructorId;
                if (i == i4) {
                    initSlot(i4, "constructor", this.constructor, this.constructorAttrs);
                    this.constructor = null;
                } else {
                    this.obj.initPrototypeId(i);
                }
                Object obj2 = objArr[i3];
                if (obj2 != null) {
                    return obj2;
                }
                vs.k(a82.m(this.obj.getClass().getName(), ".initPrototypeId(int id) did not initialize id=", i));
                return null;
            }
            return obj;
        }

        private void initSlot(int i, Object obj, Object obj2, int i2) {
            Object[] objArr = this.valueArray;
            if (objArr != null) {
                if (obj2 == null) {
                    obj2 = UniqueTag.NULL_VALUE;
                }
                int i3 = i - 1;
                int i4 = i3 * 2;
                synchronized (this) {
                    try {
                        if (objArr[i4] == null) {
                            objArr[i4] = obj2;
                            objArr[i4 + 1] = obj;
                            this.attributeArray[i3] = (short) i2;
                        } else if (!obj.equals(objArr[i4 + 1])) {
                            throw new IllegalStateException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            }
            vm1.d();
        }

        public final IdFunctionObject createPrecachedConstructor() {
            if (this.constructorId == 0) {
                int findPrototypeId = this.obj.findPrototypeId("constructor");
                this.constructorId = findPrototypeId;
                if (findPrototypeId != 0) {
                    this.obj.initPrototypeId(findPrototypeId);
                    IdFunctionObject idFunctionObject = this.constructor;
                    IdScriptableObject idScriptableObject = this.obj;
                    if (idFunctionObject != null) {
                        idFunctionObject.initFunction(idScriptableObject.getClassName(), ScriptableObject.getTopLevelScope(this.obj));
                        this.constructor.markAsConstructor(this.obj);
                        return this.constructor;
                    }
                    vs.k(a82.m(idScriptableObject.getClass().getName(), ".initPrototypeId() did not initialize id=", this.constructorId));
                    return null;
                }
                vs.k("No id for constructor property");
                return null;
            }
            vm1.d();
            return null;
        }

        public final void delete(int i) {
            ensureId(i);
            int i2 = i - 1;
            if ((this.attributeArray[i2] & 4) != 0) {
                if (!Context.getContext().isStrictMode()) {
                    return;
                }
                throw ScriptRuntime.typeErrorById("msg.delete.property.with.configurable.false", (String) this.valueArray[(i2 * 2) + 1]);
            }
            int i3 = i2 * 2;
            synchronized (this) {
                this.valueArray[i3] = Scriptable.NOT_FOUND;
                this.attributeArray[i2] = 0;
            }
        }

        public final int findId(String str) {
            return this.obj.findPrototypeId(str);
        }

        public final Object get(int i) {
            Object ensureId = ensureId(i);
            if (ensureId == UniqueTag.NULL_VALUE) {
                return null;
            }
            return ensureId;
        }

        public final int getAttributes(int i) {
            ensureId(i);
            return this.attributeArray[i - 1];
        }

        public final int getMaxId() {
            return this.maxId;
        }

        public final Object[] getNames(boolean z, boolean z2, Object[] objArr) {
            int i;
            Object[] objArr2 = null;
            int i2 = 0;
            for (int i3 = 1; i3 <= this.maxId; i3++) {
                Object ensureId = ensureId(i3);
                if ((z || (this.attributeArray[i3 - 1] & 2) == 0) && ensureId != Scriptable.NOT_FOUND) {
                    Object obj = this.valueArray[((i3 - 1) * 2) + 1];
                    if (obj instanceof String) {
                        if (objArr2 == null) {
                            objArr2 = new Object[this.maxId];
                        }
                        i = i2 + 1;
                        objArr2[i2] = obj;
                    } else if (z2 && (obj instanceof Symbol)) {
                        if (objArr2 == null) {
                            objArr2 = new Object[this.maxId];
                        }
                        i = i2 + 1;
                        objArr2[i2] = obj.toString();
                    }
                    i2 = i;
                }
            }
            if (i2 == 0) {
                return objArr;
            }
            if (objArr != null && objArr.length != 0) {
                int length = objArr.length;
                Object[] objArr3 = new Object[length + i2];
                System.arraycopy(objArr, 0, objArr3, 0, length);
                System.arraycopy(objArr2, 0, objArr3, length, i2);
                return objArr3;
            } else if (i2 != objArr2.length) {
                Object[] objArr4 = new Object[i2];
                System.arraycopy(objArr2, 0, objArr4, 0, i2);
                return objArr4;
            } else {
                return objArr2;
            }
        }

        public final boolean has(int i) {
            Object obj;
            Object[] objArr = this.valueArray;
            if (objArr == null || (obj = objArr[(i - 1) * 2]) == null || obj != Scriptable.NOT_FOUND) {
                return true;
            }
            return false;
        }

        public final void initValue(int i, String str, Object obj, int i2) {
            if (1 <= i && i <= this.maxId) {
                if (str != null) {
                    if (obj != Scriptable.NOT_FOUND) {
                        ScriptableObject.checkValidAttributes(i2);
                        if (this.obj.findPrototypeId(str) == i) {
                            if (i == this.constructorId) {
                                if (obj instanceof IdFunctionObject) {
                                    this.constructor = (IdFunctionObject) obj;
                                    this.constructorAttrs = (short) i2;
                                    return;
                                }
                                vs.m("constructor should be initialized with IdFunctionObject");
                                return;
                            }
                            initSlot(i, str, obj, i2);
                            return;
                        }
                        vs.m(str);
                        return;
                    }
                    p1a.g();
                    return;
                }
                p1a.g();
                return;
            }
            p1a.g();
        }

        public final void set(int i, Scriptable scriptable, Object obj) {
            if (obj != Scriptable.NOT_FOUND) {
                ensureId(i);
                int i2 = i - 1;
                if ((this.attributeArray[i2] & 1) == 0) {
                    if (scriptable == this.obj) {
                        if (obj == null) {
                            obj = UniqueTag.NULL_VALUE;
                        }
                        int i3 = i2 * 2;
                        synchronized (this) {
                            this.valueArray[i3] = obj;
                        }
                        return;
                    }
                    Object obj2 = this.valueArray[(i2 * 2) + 1];
                    if (obj2 instanceof Symbol) {
                        if (scriptable instanceof SymbolScriptable) {
                            ((SymbolScriptable) scriptable).put((Symbol) obj2, scriptable, obj);
                            return;
                        }
                        return;
                    }
                    scriptable.put((String) obj2, scriptable, obj);
                    return;
                }
                return;
            }
            p1a.g();
        }

        public final void setAttributes(int i, int i2) {
            ScriptableObject.checkValidAttributes(i2);
            ensureId(i);
            synchronized (this) {
                this.attributeArray[i - 1] = (short) i2;
            }
        }

        public final int findId(Symbol symbol) {
            return this.obj.findPrototypeId(symbol);
        }

        public final void initValue(int i, Symbol symbol, Object obj, int i2) {
            if (1 > i || i > this.maxId) {
                p1a.g();
            } else if (symbol != null) {
                if (obj != Scriptable.NOT_FOUND) {
                    ScriptableObject.checkValidAttributes(i2);
                    if (this.obj.findPrototypeId(symbol) == i) {
                        if (i == this.constructorId) {
                            if (obj instanceof IdFunctionObject) {
                                this.constructor = (IdFunctionObject) obj;
                                this.constructorAttrs = (short) i2;
                                return;
                            }
                            vs.m("constructor should be initialized with IdFunctionObject");
                            return;
                        }
                        initSlot(i, symbol, obj, i2);
                        return;
                    }
                    p1a.k(symbol);
                    return;
                }
                p1a.g();
            } else {
                p1a.g();
            }
        }
    }

    public int findPrototypeId(Symbol symbol) {
        return 0;
    }

    public final void initPrototypeValue(int i, Symbol symbol, Object obj, int i2) {
        this.prototypeValues.initValue(i, symbol, obj, i2);
    }

    public final IdFunctionObject initPrototypeMethod(Object obj, int i, String str, int i2) {
        return initPrototypeMethod(obj, i, str, str, i2);
    }

    private ScriptableObject getBuiltInDataDescriptor(Symbol symbol) {
        Scriptable parentScope = getParentScope();
        if (parentScope == null) {
            parentScope = this;
        }
        Slot builtInSlot = getBuiltInSlot(symbol);
        if (builtInSlot == null) {
            return null;
        }
        return ScriptableObject.buildDataDescriptor(parentScope, builtInSlot.value, builtInSlot.getAttributes());
    }

    public final IdFunctionObject initPrototypeMethod(Object obj, int i, Symbol symbol, String str, int i2) {
        IdFunctionObject newIdFunction = newIdFunction(obj, i, str, i2, ScriptableObject.getTopLevelScope(this));
        this.prototypeValues.initValue(i, symbol, newIdFunction, 2);
        return newIdFunction;
    }

    @Override // org.mozilla.javascript.ScriptableObject
    public int getAttributes(Symbol symbol) {
        int findId;
        int findInstanceIdInfo = findInstanceIdInfo(symbol);
        if (findInstanceIdInfo != 0) {
            return findInstanceIdInfo >>> 16;
        }
        PrototypeValues prototypeValues = this.prototypeValues;
        if (prototypeValues != null && (findId = prototypeValues.findId(symbol)) != 0) {
            return this.prototypeValues.getAttributes(findId);
        }
        return super.getAttributes(symbol);
    }

    public void fillConstructorProperties(IdFunctionObject idFunctionObject) {
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.SymbolScriptable
    public Object get(Symbol symbol, Scriptable scriptable) {
        int findId;
        Object obj;
        Object instanceIdValue;
        Object obj2 = super.get(symbol, scriptable);
        Object obj3 = Scriptable.NOT_FOUND;
        if (obj2 != obj3) {
            return obj2;
        }
        int findInstanceIdInfo = findInstanceIdInfo(symbol);
        if (findInstanceIdInfo == 0 || (instanceIdValue = getInstanceIdValue(findInstanceIdInfo & 65535)) == obj3) {
            PrototypeValues prototypeValues = this.prototypeValues;
            return (prototypeValues == null || (findId = prototypeValues.findId(symbol)) == 0 || (obj = this.prototypeValues.get(findId)) == obj3) ? obj3 : obj;
        }
        return instanceIdValue;
    }

    public static <T> T ensureType(Object obj, Class<T> cls, IdFunctionObject idFunctionObject) {
        return (T) ensureType(obj, cls, idFunctionObject.getFunctionName());
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.SymbolScriptable
    public boolean has(Symbol symbol, Scriptable scriptable) {
        int findId;
        int findInstanceIdInfo = findInstanceIdInfo(symbol);
        if (findInstanceIdInfo != 0) {
            if (((findInstanceIdInfo >>> 16) & 4) != 0) {
                return true;
            }
            return Scriptable.NOT_FOUND != getInstanceIdValue(65535 & findInstanceIdInfo);
        }
        PrototypeValues prototypeValues = this.prototypeValues;
        if (prototypeValues != null && (findId = prototypeValues.findId(symbol)) != 0) {
            return this.prototypeValues.has(findId);
        }
        return super.has(symbol, scriptable);
    }

    private Slot getBuiltInSlot(Symbol symbol) {
        int findId;
        PrototypeValues prototypeValues = this.prototypeValues;
        if (prototypeValues == null || (findId = prototypeValues.findId(symbol)) == 0) {
            return null;
        }
        Object obj = this.prototypeValues.get(findId);
        Slot slot = new Slot(symbol, 0, this.prototypeValues.getAttributes(findId));
        slot.value = obj;
        return slot;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.SymbolScriptable
    public void delete(Symbol symbol) {
        int findId;
        int findInstanceIdInfo = findInstanceIdInfo(symbol);
        if (findInstanceIdInfo != 0 && !isSealed()) {
            if (((findInstanceIdInfo >>> 16) & 4) != 0) {
                if (Context.getContext().isStrictMode()) {
                    throw ScriptRuntime.typeErrorById("msg.delete.property.with.configurable.false", new Object[0]);
                }
                return;
            }
            setInstanceIdValue(65535 & findInstanceIdInfo, Scriptable.NOT_FOUND);
            return;
        }
        PrototypeValues prototypeValues = this.prototypeValues;
        if (prototypeValues != null && (findId = prototypeValues.findId(symbol)) != 0) {
            if (isSealed()) {
                return;
            }
            this.prototypeValues.delete(findId);
            return;
        }
        super.delete(symbol);
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public void put(String str, Scriptable scriptable, Object obj) {
        int findId;
        int findInstanceIdInfo = findInstanceIdInfo(str);
        if (findInstanceIdInfo != 0) {
            if (scriptable == this && isSealed()) {
                throw Context.reportRuntimeErrorById("msg.modify.sealed", str);
            }
            if (((findInstanceIdInfo >>> 16) & 1) == 0) {
                if (scriptable == this) {
                    setInstanceIdValue(65535 & findInstanceIdInfo, obj);
                    return;
                } else {
                    scriptable.put(str, scriptable, obj);
                    return;
                }
            }
            return;
        }
        PrototypeValues prototypeValues = this.prototypeValues;
        if (prototypeValues != null && (findId = prototypeValues.findId(str)) != 0) {
            if (scriptable == this && isSealed()) {
                throw Context.reportRuntimeErrorById("msg.modify.sealed", str);
            }
            this.prototypeValues.set(findId, scriptable, obj);
            return;
        }
        super.put(str, scriptable, obj);
    }
}
