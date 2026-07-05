package defpackage;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m7e  reason: default package */
/* loaded from: classes.dex */
public abstract class m7e extends i6e {
    private static final Map<Class<?>, m7e> zzc = new ConcurrentHashMap();
    protected x8e zzb;
    private int zzd;

    public m7e() {
        this.zza = 0;
        this.zzd = -1;
        this.zzb = x8e.f;
    }

    public static Object e(Method method, m7e m7eVar, Object... objArr) {
        try {
            return method.invoke(m7eVar, objArr);
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

    public static m7e f(Class cls) {
        Map<Class<?>, m7e> map = zzc;
        m7e m7eVar = map.get(cls);
        if (m7eVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                m7eVar = map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (m7eVar == null) {
            m7e m7eVar2 = (m7e) ((m7e) b9e.a(cls)).d(6);
            if (m7eVar2 != null) {
                map.put(cls, m7eVar2);
                return m7eVar2;
            }
            vm1.d();
            return null;
        }
        return m7eVar;
    }

    public static m7e g(m7e m7eVar, xb1 xb1Var, g7e g7eVar) {
        m7e p = m7eVar.p();
        try {
            m8e m8eVar = m8e.c;
            m8eVar.getClass();
            o8e a = m8eVar.a(p.getClass());
            vh1 vh1Var = (vh1) xb1Var.c;
            if (vh1Var == null) {
                vh1Var = new vh1(xb1Var, (char) 0);
            }
            a.i(p, vh1Var, g7eVar);
            a.d(p);
            return p;
        } catch (w7e e) {
            if (e.a) {
                throw new IOException(e.getMessage(), e);
            }
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof w7e) {
                throw ((w7e) e2.getCause());
            }
            throw new IOException(e2.getMessage(), e2);
        } catch (w8e e3) {
            throw new IOException(e3.getMessage());
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof w7e) {
                throw ((w7e) e4.getCause());
            }
            throw e4;
        }
    }

    public static m7e h(m7e m7eVar, s6e s6eVar, g7e g7eVar) {
        x6e l = s6eVar.l();
        m7e g = g(m7eVar, l, g7eVar);
        l.T(0);
        l(g);
        return g;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [lzd, java.lang.Object] */
    public static m7e i(m7e m7eVar, byte[] bArr, g7e g7eVar) {
        int length = bArr.length;
        if (length != 0) {
            m7e p = m7eVar.p();
            try {
                m8e m8eVar = m8e.c;
                m8eVar.getClass();
                o8e a = m8eVar.a(p.getClass());
                ?? obj = new Object();
                g7eVar.getClass();
                a.g(p, bArr, 0, length, obj);
                a.d(p);
                m7eVar = p;
            } catch (IndexOutOfBoundsException unused) {
                throw w7e.g();
            } catch (w7e e) {
                if (e.a) {
                    throw new IOException(e.getMessage(), e);
                }
                throw e;
            } catch (IOException e2) {
                if (e2.getCause() instanceof w7e) {
                    throw ((w7e) e2.getCause());
                }
                throw new IOException(e2.getMessage(), e2);
            } catch (w8e e3) {
                throw new IOException(e3.getMessage());
            }
        }
        l(m7eVar);
        return m7eVar;
    }

    public static void j(Class cls, m7e m7eVar) {
        m7eVar.r();
        zzc.put(cls, m7eVar);
    }

    public static void l(m7e m7eVar) {
        if (m7eVar != null && !n(m7eVar, true)) {
            throw new IOException(new w8e().getMessage());
        }
    }

    public static final boolean n(m7e m7eVar, boolean z) {
        byte byteValue = ((Byte) m7eVar.d(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        m8e m8eVar = m8e.c;
        m8eVar.getClass();
        boolean b = m8eVar.a(m7eVar.getClass()).b(m7eVar);
        if (z) {
            m7eVar.d(2);
        }
        return b;
    }

    @Override // defpackage.i6e
    public final int a(o8e o8eVar) {
        int f;
        int f2;
        if (s()) {
            if (o8eVar == null) {
                m8e m8eVar = m8e.c;
                m8eVar.getClass();
                f2 = m8eVar.a(getClass()).f(this);
            } else {
                f2 = o8eVar.f(this);
            }
            if (f2 >= 0) {
                return f2;
            }
            vs.k(a82.j(f2, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (o8eVar == null) {
            m8e m8eVar2 = m8e.c;
            m8eVar2.getClass();
            f = m8eVar2.a(getClass()).f(this);
        } else {
            f = o8eVar.f(this);
        }
        m(f);
        return f;
    }

    public abstract Object d(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        m8e m8eVar = m8e.c;
        m8eVar.getClass();
        return m8eVar.a(getClass()).a(this, (m7e) obj);
    }

    public final int hashCode() {
        if (s()) {
            m8e m8eVar = m8e.c;
            m8eVar.getClass();
            return m8eVar.a(getClass()).c(this);
        }
        if (this.zza == 0) {
            m8e m8eVar2 = m8e.c;
            m8eVar2.getClass();
            this.zza = m8eVar2.a(getClass()).c(this);
        }
        return this.zza;
    }

    public final void k(e7e e7eVar) {
        m8e m8eVar = m8e.c;
        m8eVar.getClass();
        o8e a = m8eVar.a(getClass());
        k57 k57Var = e7eVar.a;
        if (k57Var == null) {
            k57Var = new k57(e7eVar);
        }
        a.e(this, k57Var);
    }

    public final void m(int i) {
        if (i >= 0) {
            this.zzd = (i & Integer.MAX_VALUE) | (this.zzd & Integer.MIN_VALUE);
            return;
        }
        vs.k(a82.j(i, "serialized size must be non-negative, was "));
    }

    public final l7e o() {
        return (l7e) d(5);
    }

    public final m7e p() {
        return (m7e) d(4);
    }

    public final void q() {
        m8e m8eVar = m8e.c;
        m8eVar.getClass();
        m8eVar.a(getClass()).d(this);
        r();
    }

    public final void r() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final boolean s() {
        if ((this.zzd & Integer.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = i8e.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        i8e.c(this, sb, 0);
        return sb.toString();
    }
}
