package defpackage;

import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ju0  reason: default package */
/* loaded from: classes.dex */
public final class ju0 implements s88, o4d {
    public long a;
    public long b;
    public Object c;
    public Object d;

    public ju0(long j, int i) {
        boolean z;
        if (((nc) this.c) == null) {
            z = true;
        } else {
            z = false;
        }
        wq9.D(z);
        this.a = j;
        this.b = j + i;
    }

    @Override // defpackage.o4d
    public boolean a() {
        return true;
    }

    @Override // defpackage.s88
    public long b(s94 s94Var) {
        long j = this.b;
        if (j < 0) {
            return -1L;
        }
        long j2 = -(j + 2);
        this.b = -1L;
        return j2;
    }

    public void c(Object obj, Object obj2, xj9 xj9Var) {
        xj9 xj9Var2 = (xj9) obj2;
        ((jt1) ((mz6) this.d).b).o((h97) obj, xj9Var2.a, xj9Var2.b, xj9Var2.c);
    }

    public long d() {
        if (this.b == -1) {
            long j = 0;
            for (Map.Entry entry : ((LinkedHashMap) this.c).entrySet()) {
                j += k(entry.getKey(), entry.getValue());
            }
            this.b = j;
        }
        return this.b;
    }

    @Override // defpackage.s88
    public m4a e() {
        boolean z;
        if (this.a != -1) {
            z = true;
        } else {
            z = false;
        }
        wq9.D(z);
        return new ge0((bi4) this.c, this.a, 1);
    }

    @Override // defpackage.s88
    public void f(long j) {
        long[] jArr = (long[]) ((s6f) this.d).a;
        this.b = jArr[a2d.f(jArr, j, true)];
    }

    @Override // defpackage.o4d
    public long h(js jsVar, js jsVar2, js jsVar3) {
        return Long.MAX_VALUE;
    }

    public long i(long j) {
        long j2 = this.b;
        if (j + j2 <= 0) {
            return 0L;
        }
        long j3 = j + j2;
        long j4 = this.a;
        long j5 = j3 / j4;
        if (((yo9) this.d) != yo9.a && j5 % 2 != 0) {
            return ((j5 + 1) * j4) - j3;
        }
        return j3 - (j5 * j4);
    }

    public js j(long j, js jsVar, js jsVar2, js jsVar3) {
        long j2 = this.b;
        long j3 = this.a;
        if (j + j2 > j3) {
            return ((q4d) this.c).l(j3 - j2, jsVar, jsVar3, jsVar2);
        }
        return jsVar2;
    }

    public long k(Object obj, Object obj2) {
        try {
            h97 h97Var = (h97) obj;
            long j = ((xj9) obj2).c;
            if (j >= 0) {
                return j;
            }
            throw new IllegalStateException(("sizeOf(" + obj + ", " + obj2 + ") returned a negative value: " + j).toString());
        } catch (Exception e) {
            this.b = -1L;
            throw e;
        }
    }

    @Override // defpackage.o4d
    public js l(long j, js jsVar, js jsVar2, js jsVar3) {
        return ((q4d) this.c).l(i(j), jsVar, jsVar2, j(j, jsVar, jsVar3, jsVar2));
    }

    public void m(long j) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
        while (d() > j) {
            if (linkedHashMap.isEmpty()) {
                if (d() != 0) {
                    vs.k("sizeOf() is returning inconsistent values");
                    return;
                }
                return;
            }
            Map.Entry entry = (Map.Entry) sl1.b0(linkedHashMap.entrySet());
            Object key = entry.getKey();
            Object value = entry.getValue();
            linkedHashMap.remove(key);
            this.b = d() - k(key, value);
            c(key, value, null);
        }
    }

    public boolean n(long j, boolean z, boolean z2) {
        f4f f4fVar = (f4f) this.d;
        f4fVar.W();
        f4fVar.Y();
        lte lteVar = (lte) f4fVar.a;
        boolean a = lteVar.a();
        ppe ppeVar = lteVar.f;
        if (a) {
            dre dreVar = lteVar.e;
            lte.k(dreVar);
            jya jyaVar = dreVar.L;
            lteVar.G.getClass();
            jyaVar.h(System.currentTimeMillis());
        }
        long j2 = j - this.a;
        if (!z && j2 < 1000) {
            lte.m(ppeVar);
            ppeVar.J.f(Long.valueOf(j2), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z2) {
            j2 = j - this.b;
            this.b = j;
        }
        lte.m(ppeVar);
        ppeVar.J.f(Long.valueOf(j2), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        b1f b1fVar = lteVar.H;
        lte.l(b1fVar);
        l6f.U0(b1fVar.b0(!lteVar.d.m0()), bundle, true);
        if (!z2) {
            yze yzeVar = lteVar.I;
            lte.l(yzeVar);
            yzeVar.e0("auto", "_e", bundle);
        }
        this.a = j;
        v3f v3fVar = (v3f) this.c;
        v3fVar.c();
        v3fVar.b(((Long) yme.p0.a(null)).longValue());
        return true;
    }

    @Override // defpackage.o4d
    public js u(long j, js jsVar, js jsVar2, js jsVar3) {
        return ((q4d) this.c).u(i(j), jsVar, jsVar2, j(j, jsVar, jsVar3, jsVar2));
    }

    public ju0(String str, byte[] bArr, long j, long j2) {
        this.c = str;
        this.d = bArr;
        this.a = j;
        this.b = j2;
    }
}
