package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x42  reason: default package */
/* loaded from: classes3.dex */
public final class x42 implements th6 {
    public final List a;
    public final yya b;
    public final nu4 c;

    public x42(List list, yya yyaVar, nu4 nu4Var) {
        this.a = list;
        this.b = yyaVar;
        this.c = nu4Var;
    }

    @Override // defpackage.th6
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.th6
    public final Object b(int i) {
        int i2;
        xh8 xh8Var = (xh8) sl1.f0(i, this.a);
        if (xh8Var != null) {
            i2 = xh8Var.b;
        } else {
            i2 = -1;
        }
        return Integer.valueOf(i2);
    }

    @Override // defpackage.th6
    public final void d(int i, Object obj, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        boolean z;
        obj.getClass();
        rv4Var.g0(-596570700);
        if (rv4Var.d(i)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i3 | i2;
        if (rv4Var.f(this)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i6 = i5 | i4;
        if ((i6 & Token.DO) != 130) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i6 & 1, z)) {
            xh8 xh8Var = (xh8) sl1.f0(i, this.a);
            if (xh8Var != null) {
                rv4Var.e0(137052457);
                pye.a(ki8.f.a(this.b), jce.E(-248161863, new ah7(17, xh8Var, this), rv4Var), rv4Var, 56);
                rv4Var.q(false);
            } else {
                rv4Var.e0(137211022);
                rv4Var.q(false);
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new gk7(i, i2, 7, this, obj);
        }
    }
}
