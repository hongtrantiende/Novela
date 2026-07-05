package defpackage;

import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: msb  reason: default package */
/* loaded from: classes.dex */
public final class msb implements yya, iza {
    public uvb c;
    public final hm8 a = new hm8(null, lsb.f);
    public final hm8 b = new hm8(null, ksb.g);
    public jsb d = new jsb();

    @Override // defpackage.iza
    public final kza a() {
        return this.d;
    }

    @Override // defpackage.iza
    public final void e(kza kzaVar) {
        kzaVar.getClass();
        this.d = (jsb) kzaVar;
    }

    public final fvb f(lsb lsbVar, ksb ksbVar) {
        ArrayList arrayList;
        List list;
        nv6 a;
        byte directionality;
        int i;
        CharSequence charSequence;
        boolean z;
        oyb oybVar;
        Object f;
        grb f2 = lsbVar.a.f();
        List list2 = f2.a;
        hub hubVar = f2.c;
        if (hubVar != null) {
            pyb pybVar = hubVar.a;
            arrayList = new ArrayList();
            ky5 ky5Var = pybVar.c;
            if (ky5Var.d != ky5Var.e) {
                int i2 = 4;
                while (true) {
                    bv7 bv7Var = ky5Var.b;
                    if (i2 >= bv7Var.b) {
                        break;
                    }
                    if (!zr1.E(bv7Var.c(i2)) && (f = ky5Var.a.f(i2 / 4)) != null) {
                        long o = ky5Var.o(i2);
                        int F = zr1.F(o);
                        if (F > pybVar.d) {
                            F -= pybVar.c();
                        }
                        int i3 = (int) (o & 2147483647L);
                        if (i3 > pybVar.d) {
                            i3 -= pybVar.c();
                        }
                        arrayList.add(new os(f, F, i3));
                    }
                    i2 += 4;
                }
            }
        } else {
            arrayList = null;
        }
        if ((list2 != null && !list2.isEmpty()) || (arrayList != null && !arrayList.isEmpty())) {
            if (list2 != null && !list2.isEmpty()) {
                if (arrayList != null && !arrayList.isEmpty()) {
                    jq6 t = tl1.t();
                    t.addAll(list2);
                    t.addAll(arrayList);
                    list2 = tl1.r(t);
                }
            } else {
                list2 = arrayList;
            }
        } else {
            list2 = null;
        }
        jsb jsbVar = (jsb) dra.h(this.d);
        fvb fvbVar = jsbVar.n;
        int i4 = 1;
        if (fvbVar != null && (charSequence = jsbVar.c) != null && r4b.E(charSequence, f2) && c16.i(jsbVar.d, list2) && c16.i(jsbVar.e, f2.f) && jsbVar.g == lsbVar.c && jsbVar.h == lsbVar.d && jsbVar.k == ksbVar.b && jsbVar.i == ksbVar.a.f() && jsbVar.j == ksbVar.a.G0() && x02.c(jsbVar.m, ksbVar.d) && c16.i(jsbVar.l, ksbVar.c) && !fvbVar.b.a.b()) {
            oyb oybVar2 = jsbVar.f;
            boolean z2 = false;
            if (oybVar2 != null) {
                z = oybVar2.d(lsbVar.b);
            } else {
                z = false;
            }
            oyb oybVar3 = jsbVar.f;
            if (oybVar3 != null && (oybVar3 == (oybVar = lsbVar.b) || oybVar3.a.c(oybVar.a))) {
                z2 = true;
            }
            if (z && z2) {
                return fvbVar;
            }
            if (z) {
                evb evbVar = fvbVar.a;
                return new fvb(new evb(evbVar.a, lsbVar.b, evbVar.c, evbVar.d, evbVar.e, evbVar.f, evbVar.g, evbVar.h, evbVar.i, evbVar.j), fvbVar.b, fvbVar.c);
            }
        }
        uvb uvbVar = this.c;
        if (uvbVar == null) {
            uvbVar = new uvb(ksbVar.c, ksbVar.a, ksbVar.b, 1);
            this.c = uvbVar;
        }
        uvb uvbVar2 = uvbVar;
        boolean z3 = lsbVar.e;
        oyb oybVar4 = lsbVar.b;
        if (z3) {
            ov6 ov6Var = oybVar4.a.k;
            if (ov6Var == null || (a = ov6Var.a()) == null) {
                a = gx8.a.z().a();
            }
            if (Build.VERSION.SDK_INT >= 28) {
                directionality = ru.E(a);
            } else {
                directionality = Character.getDirectionality(DecimalFormatSymbols.getInstance(a.a).getZeroDigit());
            }
            if (directionality != 1 && directionality != 2) {
                i = 1;
            } else {
                i = 2;
            }
            oybVar4 = oybVar4.e(new oyb(0L, 0L, null, null, null, 0L, 0L, 0, i, 0L, null, null, 16711679));
        }
        oyb oybVar5 = oybVar4;
        String obj = f2.d.toString();
        if (list2 == null) {
            list = ks3.a;
        } else {
            list = list2;
        }
        ps psVar = new ps(obj, list);
        boolean z4 = lsbVar.d;
        if (!lsbVar.c) {
            i4 = Integer.MAX_VALUE;
        }
        fvb b = uvb.b(uvbVar2, psVar, oybVar5, z4, i4, ksbVar.d, ksbVar.b, ksbVar.a, ksbVar.c, 1060);
        if (!b.equals(fvbVar)) {
            zqa j = dra.j();
            if (!j.f()) {
                jsb jsbVar2 = this.d;
                synchronized (dra.c) {
                    jsb jsbVar3 = (jsb) dra.w(jsbVar2, this, j);
                    jsbVar3.c = f2;
                    jsbVar3.d = list2;
                    jsbVar3.e = f2.f;
                    jsbVar3.g = lsbVar.c;
                    jsbVar3.h = lsbVar.d;
                    jsbVar3.f = lsbVar.b;
                    jsbVar3.k = ksbVar.b;
                    jsbVar3.i = ksbVar.e;
                    jsbVar3.j = ksbVar.f;
                    jsbVar3.m = ksbVar.d;
                    jsbVar3.l = ksbVar.c;
                    jsbVar3.n = b;
                }
                dra.n(j, this);
                return b;
            }
        }
        return b;
    }

    @Override // defpackage.yya
    public final Object getValue() {
        ksb ksbVar;
        lsb lsbVar = (lsb) this.a.getValue();
        if (lsbVar == null || (ksbVar = (ksb) this.b.getValue()) == null) {
            return null;
        }
        return f(lsbVar, ksbVar);
    }

    @Override // defpackage.iza
    public final kza b(kza kzaVar, kza kzaVar2, kza kzaVar3) {
        return kzaVar3;
    }
}
