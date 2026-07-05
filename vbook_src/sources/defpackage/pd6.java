package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pd6  reason: default package */
/* loaded from: classes.dex */
public final class pd6 {
    public final kc a;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public kc h;
    public final /* synthetic */ int j;
    public boolean b = true;
    public final HashMap i = new HashMap();

    public pd6(kc kcVar, int i) {
        this.j = i;
        this.a = kcVar;
    }

    public static final void a(pd6 pd6Var, ec ecVar, int i, i38 i38Var) {
        float intBitsToFloat;
        float f;
        HashMap hashMap = pd6Var.i;
        float f2 = i;
        long floatToRawIntBits = Float.floatToRawIntBits(f2) << 32;
        long floatToRawIntBits2 = Float.floatToRawIntBits(f2) & 4294967295L;
        while (true) {
            long j = floatToRawIntBits | floatToRawIntBits2;
            do {
                switch (pd6Var.j) {
                    case 0:
                        vg8 vg8Var = i38Var.n0;
                        if (vg8Var != null) {
                            s15 s15Var = (s15) vg8Var;
                            float[] b = s15Var.b();
                            if (!s15Var.O) {
                                j = l27.c(j, b);
                            }
                        }
                        j = hif.u(j, i38Var.b0);
                        break;
                    default:
                        ty6 C1 = i38Var.C1();
                        C1.getClass();
                        long j2 = C1.P;
                        j = y78.j((Float.floatToRawIntBits((int) (j2 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32), j);
                        break;
                }
                i38Var = i38Var.S;
                i38Var.getClass();
                if (i38Var.equals(pd6Var.a.n())) {
                    if (ecVar instanceof n95) {
                        intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
                    } else {
                        intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                    }
                    int round = Math.round(intBitsToFloat);
                    if (hashMap.containsKey(ecVar)) {
                        int intValue = ((Number) o17.p(ecVar, hashMap)).intValue();
                        n95 n95Var = hc.a;
                        round = ((Number) ecVar.a.invoke(Integer.valueOf(intValue), Integer.valueOf(round))).intValue();
                    }
                    hashMap.put(ecVar, Integer.valueOf(round));
                    return;
                }
            } while (!pd6Var.b(i38Var).containsKey(ecVar));
            long floatToRawIntBits3 = Float.floatToRawIntBits(pd6Var.c(i38Var, ecVar));
            floatToRawIntBits = Float.floatToRawIntBits(f) << 32;
            floatToRawIntBits2 = floatToRawIntBits3 & 4294967295L;
        }
    }

    public final Map b(i38 i38Var) {
        switch (this.j) {
            case 0:
                return i38Var.V0().g();
            default:
                ty6 C1 = i38Var.C1();
                C1.getClass();
                return C1.V0().g();
        }
    }

    public final int c(i38 i38Var, ec ecVar) {
        switch (this.j) {
            case 0:
                return i38Var.o0(ecVar);
            default:
                ty6 C1 = i38Var.C1();
                C1.getClass();
                return C1.o0(ecVar);
        }
    }

    public final boolean d() {
        if (!this.c && !this.e && !this.f && !this.g) {
            return false;
        }
        return true;
    }

    public final boolean e() {
        h();
        if (this.h != null) {
            return true;
        }
        return false;
    }

    public final void f() {
        this.b = true;
        kc kcVar = this.a;
        kc p = kcVar.p();
        if (p == null) {
            return;
        }
        if (this.c) {
            p.m0();
        } else if (this.e || this.d) {
            p.requestLayout();
        }
        if (this.f) {
            kcVar.m0();
        }
        if (this.g) {
            kcVar.requestLayout();
        }
        p.g().f();
    }

    public final void g() {
        HashMap hashMap = this.i;
        hashMap.clear();
        jc jcVar = new jc(this, 0);
        kc kcVar = this.a;
        kcVar.a0(jcVar);
        hashMap.putAll(b(kcVar.n()));
        this.b = false;
    }

    public final void h() {
        pd6 g;
        pd6 g2;
        boolean d = d();
        kc kcVar = this.a;
        if (!d) {
            kc p = kcVar.p();
            if (p != null) {
                kcVar = p.g().h;
                if (kcVar == null || !kcVar.g().d()) {
                    kc kcVar2 = this.h;
                    if (kcVar2 != null && !kcVar2.g().d()) {
                        kc p2 = kcVar2.p();
                        if (p2 != null && (g2 = p2.g()) != null) {
                            g2.h();
                        }
                        kc p3 = kcVar2.p();
                        if (p3 != null && (g = p3.g()) != null) {
                            kcVar = g.h;
                        } else {
                            kcVar = null;
                        }
                    } else {
                        return;
                    }
                }
            } else {
                return;
            }
        }
        this.h = kcVar;
    }
}
