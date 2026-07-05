package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a52  reason: default package */
/* loaded from: classes.dex */
public final class a52 {
    public long a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public final Object g;

    public a52(pq2 pq2Var, cza czaVar) {
        this.b = pq2Var;
        this.c = czaVar;
        this.f = tte.v(nae.e, 300.0f, 5, null);
        this.g = new c5d();
        this.a = 0L;
    }

    public static void f(a52 a52Var, tc6 tc6Var, r13 r13Var, oyb oybVar, int i) {
        if ((i & 1) != 0) {
            tc6Var = (tc6) a52Var.b;
        }
        if ((i & 2) != 0) {
            r13Var = (r13) a52Var.c;
        }
        do4 do4Var = (do4) a52Var.d;
        if ((i & 8) != 0) {
            oybVar = (oyb) a52Var.e;
        }
        Object obj = a52Var.f;
        tc6 tc6Var2 = (tc6) a52Var.b;
        hm8 hm8Var = (hm8) a52Var.g;
        if (tc6Var == tc6Var2 && c16.i(r13Var, (r13) a52Var.c) && c16.i(do4Var, (do4) a52Var.d) && c16.i(oybVar, (oyb) a52Var.e)) {
            if (!c16.i(obj, a52Var.f)) {
                a52Var.f = obj;
                hm8Var.setValue(Boolean.TRUE);
                return;
            }
            return;
        }
        a52Var.b = tc6Var;
        a52Var.c = r13Var;
        a52Var.d = do4Var;
        a52Var.e = oybVar;
        hm8Var.setValue(Boolean.TRUE);
    }

    public void a() {
        ((zc6) ((cza) this.c).getValue()).d();
    }

    public boolean b(long j, long j2) {
        zc6 zc6Var = (zc6) ((cza) this.c).getValue();
        long c = y78.c(zc6Var.h, j);
        float t = yz1.t(Float.intBitsToFloat((int) (c >> 32)) + zc6Var.f(), zc6Var.e());
        float t2 = yz1.t(Float.intBitsToFloat((int) (c & 4294967295L)) + zc6Var.g(), zc6Var.h());
        if (zc6Var.g() == t2 && zc6Var.f() == t) {
            return false;
        }
        long j3 = y78.j(this.a, j);
        this.a = j3;
        ((c5d) this.g).a(j2, j3);
        e(d(Float.valueOf(t), Float.valueOf(t2)));
        return true;
    }

    public boolean c(int i, boolean z) {
        Object obj;
        Object value;
        zc6 zc6Var;
        long b;
        long j;
        float f;
        cza czaVar = (cza) this.c;
        List list = ((zc6) czaVar.getValue()).f;
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                obj = list.get(i2);
                if (((mi8) obj).a == i) {
                    break;
                }
                i2++;
            } else {
                obj = null;
                break;
            }
        }
        mi8 mi8Var = (mi8) obj;
        if (mi8Var == null) {
            return false;
        }
        float f2 = mi8Var.b;
        do {
            value = czaVar.getValue();
            zc6Var = (zc6) value;
            boolean j2 = zc6Var.j();
            long j3 = zc6Var.g;
            if (j2) {
                b = y78.b(j3, nae.e, -f2, 1);
            } else {
                b = y78.b(j3, -f2, nae.e, 2);
            }
            j = b;
            if (z) {
                f = zc6Var.h;
            } else {
                f = 1.0f;
            }
        } while (!czaVar.l(value, zc6.c(zc6Var, 0L, nae.e, null, 0L, null, null, j, f, null, null, 7999).b()));
        return true;
    }

    public zc6 d(Float f, Float f2) {
        Object value;
        zc6 zc6Var;
        cza czaVar = (cza) this.c;
        do {
            value = czaVar.getValue();
            zc6Var = (zc6) value;
            float floatValue = f.floatValue();
            float floatValue2 = f2.floatValue();
            if (floatValue != zc6Var.f() || floatValue2 != zc6Var.g()) {
                zc6Var = zc6.c(zc6Var, 0L, nae.e, null, 0L, null, null, (Float.floatToRawIntBits(floatValue) << 32) | (Float.floatToRawIntBits(floatValue2) & 4294967295L), nae.e, null, null, 8127);
            }
        } while (!czaVar.l(value, zc6Var));
        return zc6Var;
    }

    public void e(zc6 zc6Var) {
        long a = yq7.a();
        u9c u9cVar = (u9c) this.d;
        if (u9cVar != null && wl3.e(u9c.b(a, u9cVar.a)) < 48) {
            return;
        }
        this.d = new u9c(a);
        zc6Var.d();
    }

    public a52(vt4 vt4Var) {
        vt4Var.getClass();
        this.b = vt4Var;
        this.a = 9205357640488583168L;
        this.g = new jfa(this, 0);
    }

    public a52(tc6 tc6Var, r13 r13Var, do4 do4Var, oyb oybVar, Object obj) {
        this.b = tc6Var;
        this.c = r13Var;
        this.d = do4Var;
        this.e = oybVar;
        this.f = obj;
        this.g = yae.z(Boolean.TRUE);
        this.a = 0L;
    }
}
