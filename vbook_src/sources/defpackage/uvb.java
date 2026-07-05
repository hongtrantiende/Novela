package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uvb  reason: default package */
/* loaded from: classes.dex */
public final class uvb {
    public final do4 a;
    public final r13 b;
    public final tc6 c;
    public final yx9 d;

    public uvb(do4 do4Var, r13 r13Var, tc6 tc6Var, int i) {
        yx9 yx9Var;
        this.a = do4Var;
        this.b = r13Var;
        this.c = tc6Var;
        if (i > 0) {
            yx9Var = new yx9(i);
        } else {
            yx9Var = null;
        }
        this.d = yx9Var;
    }

    public static fvb a(uvb uvbVar, String str, oyb oybVar, long j, int i) {
        if ((i & 32) != 0) {
            j = y02.b(0, 0, 0, 0, 15);
        }
        tc6 tc6Var = uvbVar.c;
        r13 r13Var = uvbVar.b;
        do4 do4Var = uvbVar.a;
        uvbVar.getClass();
        return b(uvbVar, new ps(str), oybVar, true, Integer.MAX_VALUE, j, tc6Var, r13Var, do4Var, 32);
    }

    public static fvb b(uvb uvbVar, ps psVar, oyb oybVar, boolean z, int i, long j, tc6 tc6Var, r13 r13Var, do4 do4Var, int i2) {
        boolean z2;
        int i3;
        long j2;
        tc6 tc6Var2;
        r13 r13Var2;
        do4 do4Var2;
        it7 it7Var;
        it7 it7Var2;
        fvb fvbVar;
        if ((i2 & 8) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        int i4 = Integer.MAX_VALUE;
        if ((i2 & 16) != 0) {
            i3 = Integer.MAX_VALUE;
        } else {
            i3 = i;
        }
        if ((i2 & 64) != 0) {
            j2 = y02.b(0, 0, 0, 0, 15);
        } else {
            j2 = j;
        }
        if ((i2 & Token.CASE) != 0) {
            tc6Var2 = uvbVar.c;
        } else {
            tc6Var2 = tc6Var;
        }
        if ((i2 & 256) != 0) {
            r13Var2 = uvbVar.b;
        } else {
            r13Var2 = r13Var;
        }
        if ((i2 & 512) != 0) {
            do4Var2 = uvbVar.a;
        } else {
            do4Var2 = do4Var;
        }
        yx9 yx9Var = uvbVar.d;
        ks3 ks3Var = ks3.a;
        evb evbVar = new evb(psVar, oybVar, ks3Var, i3, z2, 1, r13Var2, tc6Var2, do4Var2, j2);
        fvb fvbVar2 = null;
        if (yx9Var != null) {
            d51 d51Var = new d51(evbVar);
            ypa ypaVar = (ypa) yx9Var.b;
            if (ypaVar != null) {
                fvbVar = (fvb) ypaVar.h(d51Var);
            } else if (c16.i((d51) yx9Var.c, d51Var)) {
                fvbVar = (fvb) yx9Var.d;
            }
            if (fvbVar != null && !fvbVar.b.a.b()) {
                fvbVar2 = fvbVar;
            }
        }
        if (fvbVar2 != null) {
            return new fvb(evbVar, fvbVar2.b, y02.d(j2, (((int) Math.ceil(it7Var2.e)) & 4294967295L) | (((int) Math.ceil(it7Var2.d)) << 32)));
        }
        bm1 bm1Var = new bm1(psVar, uaf.z(oybVar, tc6Var2), ks3Var, r13Var2, do4Var2);
        int k = x02.k(j2);
        if (z2 && x02.e(j2)) {
            i4 = x02.i(j2);
        }
        if (k != i4) {
            i4 = dce.n((int) Math.ceil(bm1Var.l()), k, i4);
        }
        fvb fvbVar3 = new fvb(evbVar, new it7(bm1Var, ak0.r(0, i4, 0, x02.h(j2)), i3, 1), y02.d(j2, (((int) Math.ceil(it7Var.d)) << 32) | (((int) Math.ceil(it7Var.e)) & 4294967295L)));
        if (yx9Var != null) {
            ypa ypaVar2 = (ypa) yx9Var.b;
            if (ypaVar2 != null) {
                ypaVar2.m(new d51(evbVar), fvbVar3);
                return fvbVar3;
            }
            yx9Var.c = new d51(evbVar);
            yx9Var.d = fvbVar3;
        }
        return fvbVar3;
    }
}
