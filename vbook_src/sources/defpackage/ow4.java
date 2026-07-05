package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ow4  reason: default package */
/* loaded from: classes.dex */
public abstract class ow4 extends w2 {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, ow4> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected zvc unknownFields;

    public ow4() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = zvc.f;
    }

    public static ow4 c(Class cls) {
        ow4 ow4Var = defaultInstanceMap.get(cls);
        if (ow4Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                ow4Var = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (ow4Var == null) {
            ow4 ow4Var2 = (ow4) ((ow4) exc.d(cls)).b(6);
            if (ow4Var2 != null) {
                defaultInstanceMap.put(cls, ow4Var2);
                return ow4Var2;
            }
            vm1.d();
            return null;
        }
        return ow4Var;
    }

    public static Object d(Method method, ow4 ow4Var, Object... objArr) {
        try {
            return method.invoke(ow4Var, objArr);
        } catch (IllegalAccessException e) {
            cp8.p("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (!(cause instanceof Error)) {
                    cp8.p("Unexpected exception thrown by generated accessor method.", cause);
                    return null;
                }
                throw ((Error) cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static final boolean e(ow4 ow4Var, boolean z) {
        byte byteValue = ((Byte) ow4Var.b(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        w89 w89Var = w89.c;
        w89Var.getClass();
        boolean c = w89Var.a(ow4Var.getClass()).c(ow4Var);
        if (z) {
            ow4Var.b(2);
        }
        return c;
    }

    public static void i(Class cls, ow4 ow4Var) {
        ow4Var.g();
        defaultInstanceMap.put(cls, ow4Var);
    }

    @Override // defpackage.w2
    public final int a(h0a h0aVar) {
        int e;
        int e2;
        if (f()) {
            if (h0aVar == null) {
                w89 w89Var = w89.c;
                w89Var.getClass();
                e2 = w89Var.a(getClass()).e(this);
            } else {
                e2 = h0aVar.e(this);
            }
            if (e2 >= 0) {
                return e2;
            }
            vs.k(a82.j(e2, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (h0aVar == null) {
            w89 w89Var2 = w89.c;
            w89Var2.getClass();
            e = w89Var2.a(getClass()).e(this);
        } else {
            e = h0aVar.e(this);
        }
        j(e);
        return e;
    }

    public abstract Object b(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        w89 w89Var = w89.c;
        w89Var.getClass();
        return w89Var.a(getClass()).h(this, (ow4) obj);
    }

    public final boolean f() {
        if ((this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0) {
            return true;
        }
        return false;
    }

    public final void g() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final ow4 h() {
        return (ow4) b(4);
    }

    public final int hashCode() {
        if (f()) {
            w89 w89Var = w89.c;
            w89Var.getClass();
            return w89Var.a(getClass()).f(this);
        }
        if (this.memoizedHashCode == 0) {
            w89 w89Var2 = w89.c;
            w89Var2.getClass();
            this.memoizedHashCode = w89Var2.a(getClass()).f(this);
        }
        return this.memoizedHashCode;
    }

    public final void j(int i) {
        if (i >= 0) {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
            return;
        }
        vs.k(a82.j(i, "serialized size must be non-negative, was "));
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = ab7.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        ab7.c(this, sb, 0);
        return sb.toString();
    }
}
