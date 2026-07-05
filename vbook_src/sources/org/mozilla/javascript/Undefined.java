package org.mozilla.javascript;

import java.io.Serializable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public class Undefined implements Serializable {
    public static final Scriptable SCRIPTABLE_UNDEFINED;
    public static final Object instance;
    private static final int instanceHash;
    private static final long serialVersionUID = 9195680630202616767L;

    static {
        Undefined undefined = new Undefined();
        instance = undefined;
        instanceHash = System.identityHashCode(undefined);
        SCRIPTABLE_UNDEFINED = new Scriptable() { // from class: org.mozilla.javascript.Undefined.1
            public boolean equals(Object obj) {
                if (!Undefined.isUndefined(obj) && obj != this) {
                    return false;
                }
                return true;
            }

            @Override // org.mozilla.javascript.Scriptable
            public Object get(String str, Scriptable scriptable) {
                return Scriptable.NOT_FOUND;
            }

            @Override // org.mozilla.javascript.Scriptable
            public String getClassName() {
                return "undefined";
            }

            @Override // org.mozilla.javascript.Scriptable
            public Object getDefaultValue(Class<?> cls) {
                if (cls != null && cls != ScriptRuntime.StringClass) {
                    return null;
                }
                return toString();
            }

            @Override // org.mozilla.javascript.Scriptable
            public Object[] getIds() {
                return ScriptRuntime.emptyArgs;
            }

            @Override // org.mozilla.javascript.Scriptable
            public Scriptable getParentScope() {
                return null;
            }

            @Override // org.mozilla.javascript.Scriptable
            public Scriptable getPrototype() {
                return null;
            }

            @Override // org.mozilla.javascript.Scriptable
            public boolean has(int i, Scriptable scriptable) {
                return false;
            }

            @Override // org.mozilla.javascript.Scriptable
            public boolean hasInstance(Scriptable scriptable) {
                return false;
            }

            public int hashCode() {
                return Undefined.instanceHash;
            }

            public String toString() {
                return "undefined";
            }

            @Override // org.mozilla.javascript.Scriptable
            public void delete(String str) {
            }

            @Override // org.mozilla.javascript.Scriptable
            public void put(String str, Scriptable scriptable, Object obj) {
            }

            @Override // org.mozilla.javascript.Scriptable
            public boolean has(String str, Scriptable scriptable) {
                return false;
            }

            @Override // org.mozilla.javascript.Scriptable
            public Object get(int i, Scriptable scriptable) {
                return Scriptable.NOT_FOUND;
            }

            @Override // org.mozilla.javascript.Scriptable
            public void delete(int i) {
            }

            @Override // org.mozilla.javascript.Scriptable
            public void setParentScope(Scriptable scriptable) {
            }

            @Override // org.mozilla.javascript.Scriptable
            public void setPrototype(Scriptable scriptable) {
            }

            @Override // org.mozilla.javascript.Scriptable
            public void put(int i, Scriptable scriptable, Object obj) {
            }
        };
    }

    private Undefined() {
    }

    public static boolean isUndefined(Object obj) {
        if (instance != obj && SCRIPTABLE_UNDEFINED != obj) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (!isUndefined(obj) && obj != this) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return instanceHash;
    }

    public Object readResolve() {
        return instance;
    }
}
