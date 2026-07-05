package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j0e  reason: default package */
/* loaded from: classes.dex */
public final class j0e {
    public static final /* synthetic */ int c = 0;
    public final o2e a = new o2e();
    public boolean b;

    static {
        new j0e(0);
    }

    public j0e(int i) {
        a();
        a();
    }

    public static void b(g0e g0eVar, i3e i3eVar, int i, Object obj) {
        if (i3eVar != i3e.d) {
            g0eVar.d(i, i3eVar.b);
            j3e j3eVar = j3e.a;
            switch (i3eVar.ordinal()) {
                case 0:
                    g0eVar.u(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                    return;
                case 1:
                    g0eVar.s(Float.floatToRawIntBits(((Float) obj).floatValue()));
                    return;
                case 2:
                    g0eVar.t(((Long) obj).longValue());
                    return;
                case 3:
                    g0eVar.t(((Long) obj).longValue());
                    return;
                case 4:
                    g0eVar.q(((Integer) obj).intValue());
                    return;
                case 5:
                    g0eVar.u(((Long) obj).longValue());
                    return;
                case 6:
                    g0eVar.s(((Integer) obj).intValue());
                    return;
                case 7:
                    g0eVar.p(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                    return;
                case 8:
                    if (obj instanceof szd) {
                        g0eVar.m((szd) obj);
                        return;
                    } else {
                        g0eVar.v((String) obj);
                        return;
                    }
                case 9:
                    ((o0e) ((hzd) obj)).f(g0eVar);
                    return;
                case 10:
                    g0eVar.o((hzd) obj);
                    return;
                case 11:
                    if (obj instanceof szd) {
                        g0eVar.m((szd) obj);
                        return;
                    }
                    byte[] bArr = (byte[]) obj;
                    g0eVar.n(bArr, bArr.length);
                    return;
                case 12:
                    g0eVar.r(((Integer) obj).intValue());
                    return;
                case 13:
                    if (obj instanceof s0e) {
                        g0eVar.q(((s0e) obj).zza());
                        return;
                    } else {
                        g0eVar.q(((Integer) obj).intValue());
                        return;
                    }
                case 14:
                    g0eVar.s(((Integer) obj).intValue());
                    return;
                case 15:
                    g0eVar.u(((Long) obj).longValue());
                    return;
                case 16:
                    int intValue = ((Integer) obj).intValue();
                    g0eVar.r((intValue >> 31) ^ (intValue + intValue));
                    return;
                case 17:
                    long longValue = ((Long) obj).longValue();
                    g0eVar.t((longValue >> 63) ^ (longValue + longValue));
                    return;
                default:
                    return;
            }
        }
        g0eVar.d(i, 3);
        ((o0e) ((hzd) obj)).f(g0eVar);
        g0eVar.d(i, 4);
    }

    public final void a() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (this.b) {
            return;
        }
        o2e o2eVar = this.a;
        int i = o2eVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = o2eVar.a(i2).b;
            if (obj instanceof o0e) {
                o0e o0eVar = (o0e) obj;
                i2e.c.a(o0eVar.getClass()).c(o0eVar);
                o0eVar.h();
            }
        }
        for (Map.Entry entry : o2eVar.b()) {
            Object value = entry.getValue();
            if (value instanceof o0e) {
                o0e o0eVar2 = (o0e) value;
                i2e.c.a(o0eVar2.getClass()).c(o0eVar2);
                o0eVar2.h();
            }
        }
        if (!o2eVar.d) {
            if (o2eVar.b <= 0) {
                Iterator it = o2eVar.b().iterator();
                if (it.hasNext()) {
                    ((Map.Entry) it.next()).getKey().getClass();
                    vm1.h();
                    return;
                }
            } else {
                o2eVar.a(0).a.getClass();
                vm1.h();
                return;
            }
        }
        if (!o2eVar.d) {
            if (o2eVar.c.isEmpty()) {
                unmodifiableMap = Collections.EMPTY_MAP;
            } else {
                unmodifiableMap = Collections.unmodifiableMap(o2eVar.c);
            }
            o2eVar.c = unmodifiableMap;
            if (o2eVar.f.isEmpty()) {
                unmodifiableMap2 = Collections.EMPTY_MAP;
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(o2eVar.f);
            }
            o2eVar.f = unmodifiableMap2;
            o2eVar.d = true;
        }
        this.b = true;
    }

    public final Object clone() {
        j0e j0eVar = new j0e();
        o2e o2eVar = this.a;
        if (o2eVar.b <= 0) {
            Iterator it = o2eVar.b().iterator();
            if (!it.hasNext()) {
                return j0eVar;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getKey() != null) {
                vm1.h();
                return null;
            }
            entry.getValue();
            throw null;
        }
        o2eVar.a(0).a.getClass();
        vm1.h();
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0e)) {
            return false;
        }
        return this.a.equals(((j0e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public j0e() {
    }
}
