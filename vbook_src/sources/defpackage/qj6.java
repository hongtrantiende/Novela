package defpackage;

import java.util.Map;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qj6  reason: default package */
/* loaded from: classes.dex */
public final class qj6 implements xx9, sx9 {
    public final zx9 a;
    public final sx9 b;
    public final uv7 c;

    public qj6(xx9 xx9Var, Map map, sx9 sx9Var) {
        fo4 fo4Var = new fo4(xx9Var, 20);
        tza tzaVar = ay9.a;
        this.a = new zx9(map, fo4Var);
        this.b = sx9Var;
        uv7 uv7Var = uz9.a;
        this.c = new uv7();
    }

    @Override // defpackage.xx9
    public final wx9 a(String str, vt4 vt4Var) {
        return this.a.a(str, vt4Var);
    }

    @Override // defpackage.sx9
    public final void b(Object obj, tu1 tu1Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        rv4Var.g0(-858296452);
        if ((i & 6) == 0) {
            if (rv4Var.h(obj)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.h(tu1Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (rv4Var.h(this)) {
                i3 = 256;
            } else {
                i3 = Token.CASE;
            }
            i2 |= i3;
        }
        if ((i2 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            this.b.b(obj, tu1Var, rv4Var, i2 & Token.ELSE);
            boolean h = rv4Var.h(this) | rv4Var.h(obj);
            Object P = rv4Var.P();
            if (h || P == ax1.a) {
                P = new j34(17, this, obj);
                rv4Var.o0(P);
            }
            yte.b(obj, (xt4) P, rv4Var);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new va(this, obj, tu1Var, i, 16);
        }
    }

    @Override // defpackage.xx9
    public final boolean c(Object obj) {
        return this.a.c(obj);
    }

    @Override // defpackage.xx9
    public final Map d() {
        uv7 uv7Var = this.c;
        Object[] objArr = uv7Var.b;
        long[] jArr = uv7Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            this.b.f(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return this.a.d();
    }

    @Override // defpackage.xx9
    public final Object e(String str) {
        return this.a.e(str);
    }

    @Override // defpackage.sx9
    public final void f(Object obj) {
        this.b.f(obj);
    }
}
