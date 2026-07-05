package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qw4  reason: default package */
/* loaded from: classes.dex */
public abstract class qw4 extends x2 {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, qw4> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected bwc unknownFields;

    public qw4() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = bwc.f;
    }

    public static qw4 e(Class cls) {
        qw4 qw4Var = defaultInstanceMap.get(cls);
        if (qw4Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                qw4Var = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (qw4Var == null) {
            qw4 qw4Var2 = (qw4) ((qw4) gxc.d(cls)).d(6);
            if (qw4Var2 != null) {
                defaultInstanceMap.put(cls, qw4Var2);
                return qw4Var2;
            }
            vm1.d();
            return null;
        }
        return qw4Var;
    }

    public static Object f(Method method, qw4 qw4Var, Object... objArr) {
        try {
            return method.invoke(qw4Var, objArr);
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

    public static final boolean g(qw4 qw4Var, boolean z) {
        byte byteValue = ((Byte) qw4Var.d(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        z89 z89Var = z89.c;
        z89Var.getClass();
        boolean c = z89Var.a(qw4Var.getClass()).c(qw4Var);
        if (z) {
            qw4Var.d(2);
        }
        return c;
    }

    public static void k(Class cls, qw4 qw4Var) {
        qw4Var.i();
        defaultInstanceMap.put(cls, qw4Var);
    }

    @Override // defpackage.x2
    public final int a(j0a j0aVar) {
        int h;
        int h2;
        if (h()) {
            if (j0aVar == null) {
                z89 z89Var = z89.c;
                z89Var.getClass();
                h2 = z89Var.a(getClass()).h(this);
            } else {
                h2 = j0aVar.h(this);
            }
            if (h2 >= 0) {
                return h2;
            }
            vs.k(a82.j(h2, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (j0aVar == null) {
            z89 z89Var2 = z89.c;
            z89Var2.getClass();
            h = z89Var2.a(getClass()).h(this);
        } else {
            h = j0aVar.h(this);
        }
        l(h);
        return h;
    }

    @Override // defpackage.x2
    public final void b(fl1 fl1Var) {
        z89 z89Var = z89.c;
        z89Var.getClass();
        j0a a = z89Var.a(getClass());
        n07 n07Var = fl1Var.a;
        if (n07Var == null) {
            n07Var = new n07(fl1Var);
        }
        a.i(this, n07Var);
    }

    public abstract Object d(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        z89 z89Var = z89.c;
        z89Var.getClass();
        return z89Var.a(getClass()).e(this, (qw4) obj);
    }

    public final boolean h() {
        if ((this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (h()) {
            z89 z89Var = z89.c;
            z89Var.getClass();
            return z89Var.a(getClass()).f(this);
        }
        if (this.memoizedHashCode == 0) {
            z89 z89Var2 = z89.c;
            z89Var2.getClass();
            this.memoizedHashCode = z89Var2.a(getClass()).f(this);
        }
        return this.memoizedHashCode;
    }

    public final void i() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final qw4 j() {
        return (qw4) d(4);
    }

    public final void l(int i) {
        if (i >= 0) {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
            return;
        }
        vs.k(a82.j(i, "serialized size must be non-negative, was "));
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = cb7.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        cb7.c(this, sb, 0);
        return sb.toString();
    }
}
