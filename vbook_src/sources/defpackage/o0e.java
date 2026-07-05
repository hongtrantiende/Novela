package defpackage;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o0e  reason: default package */
/* loaded from: classes.dex */
public abstract class o0e extends hzd {
    public static final /* synthetic */ int zzd = 0;
    private static final Map zze = new ConcurrentHashMap();
    private int zzb;
    protected x2e zzc;

    public o0e() {
        this.zza = 0;
        this.zzb = -1;
        this.zzc = x2e.f;
    }

    public static o0e e(o0e o0eVar, byte[] bArr, h0e h0eVar) {
        int length = bArr.length;
        if (length != 0) {
            o0e i = o0eVar.i();
            try {
                m2e a = i2e.c.a(i.getClass());
                a.e(i, bArr, 0, length, new lzd(h0eVar));
                a.c(i);
                o0eVar = i;
            } catch (i1e e) {
                if (e.a) {
                    throw new IOException(e.getMessage(), e);
                }
                throw e;
            } catch (IOException e2) {
                if (e2.getCause() instanceof i1e) {
                    throw ((i1e) e2.getCause());
                }
                throw new IOException(e2.getMessage(), e2);
            } catch (IndexOutOfBoundsException unused) {
                hfd.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return null;
            } catch (s2e e3) {
                throw e3.a();
            }
        }
        r(o0eVar);
        return o0eVar;
    }

    public static o0e n(Class cls) {
        Map map = zze;
        o0e o0eVar = (o0e) map.get(cls);
        if (o0eVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                o0eVar = (o0e) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (o0eVar == null) {
            o0e o0eVar2 = (o0e) ((o0e) e3e.d(cls)).s(6);
            if (o0eVar2 != null) {
                map.put(cls, o0eVar2);
                return o0eVar2;
            }
            vm1.d();
            return null;
        }
        return o0eVar;
    }

    public static void o(Class cls, o0e o0eVar) {
        o0eVar.h();
        zze.put(cls, o0eVar);
    }

    public static Object p(Method method, o0e o0eVar, Object... objArr) {
        try {
            return method.invoke(o0eVar, objArr);
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

    public static final boolean q(o0e o0eVar, boolean z) {
        byte byteValue = ((Byte) o0eVar.s(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzl = i2e.c.a(o0eVar.getClass()).zzl(o0eVar);
        if (z) {
            o0eVar.s(2);
        }
        return zzl;
    }

    public static void r(o0e o0eVar) {
        if (o0eVar != null && !q(o0eVar, true)) {
            throw new s2e().a();
        }
    }

    @Override // defpackage.hzd
    public final int c(m2e m2eVar) {
        if (g()) {
            int b = m2eVar.b(this);
            if (b >= 0) {
                return b;
            }
            hfd.e(String.valueOf(b).length() + 42, b);
            return 0;
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i == Integer.MAX_VALUE) {
            int b2 = m2eVar.b(this);
            if (b2 >= 0) {
                this.zzb = (this.zzb & Integer.MIN_VALUE) | b2;
                return b2;
            }
            hfd.e(String.valueOf(b2).length() + 42, b2);
            return 0;
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return i2e.c.a(getClass()).g(this, (o0e) obj);
    }

    public final void f(g0e g0eVar) {
        m2e a = i2e.c.a(getClass());
        bp9 bp9Var = g0eVar.a;
        if (bp9Var == null) {
            bp9Var = new bp9(g0eVar);
        }
        a.h(this, bp9Var);
    }

    public final boolean g() {
        if ((this.zzb & Integer.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    public final void h() {
        this.zzb &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (!g()) {
            int i = this.zza;
            if (i == 0) {
                int d = i2e.c.a(getClass()).d(this);
                this.zza = d;
                return d;
            }
            return i;
        }
        return i2e.c.a(getClass()).d(this);
    }

    public final o0e i() {
        return (o0e) s(4);
    }

    public final m0e j() {
        return (m0e) s(5);
    }

    public final m0e k() {
        m0e m0eVar = (m0e) s(5);
        m0eVar.e(this);
        return m0eVar;
    }

    public final void l() {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final int m() {
        if (g()) {
            int b = i2e.c.a(getClass()).b(this);
            if (b >= 0) {
                return b;
            }
            hfd.e(String.valueOf(b).length() + 42, b);
            return 0;
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int b2 = i2e.c.a(getClass()).b(this);
        if (b2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | b2;
            return b2;
        }
        hfd.e(String.valueOf(b2).length() + 42, b2);
        return 0;
    }

    public abstract Object s(int i);

    public final String toString() {
        String obj = super.toString();
        char[] cArr = b2e.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        b2e.b(this, sb, 0);
        return sb.toString();
    }
}
