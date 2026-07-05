package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j27  reason: default package */
/* loaded from: classes.dex */
public abstract class j27 {
    public static final tza a;

    /* JADX WARN: Type inference failed for: r1v2, types: [f99, tza] */
    static {
        ipe.y(new qx6(7));
        a = new f99(new qx6(8));
    }

    public static final void a(pm1 pm1Var, tr7 tr7Var, lfa lfaVar, etc etcVar, tu1 tu1Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        rv4Var.g0(904511636);
        if ((i & 6) == 0) {
            if (rv4Var.f(pm1Var)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(tr7Var)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(lfaVar)) {
                i5 = 256;
            } else {
                i5 = Token.CASE;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.f(etcVar)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i2 |= i4;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.h(tu1Var)) {
                i3 = 16384;
            } else {
                i3 = 8192;
            }
            i2 |= i3;
        }
        if ((i2 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            rv4Var.Z();
            if ((i & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
            }
            rv4Var.r();
            h27 h27Var = new h27(pm1Var, etcVar, lfaVar, tr7Var);
            ut9 a2 = jt9.a(nae.e, 0L, null, 255);
            long j = pm1Var.a;
            boolean e = rv4Var.e(j);
            Object P = rv4Var.P();
            if (e || P == ax1.a) {
                P = new wxb(j, zl1.b(0.4f, j));
                rv4Var.o0(P);
            }
            pye.b(new i99[]{a.a(h27Var), fu5.a.a(a2), xxb.a.a((wxb) P)}, jce.E(-1750539308, new i27(etcVar, tu1Var, 0), rv4Var), rv4Var, 56);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ud1(pm1Var, tr7Var, lfaVar, etcVar, tu1Var, i, 8);
        }
    }

    public static final void b(pm1 pm1Var, lfa lfaVar, etc etcVar, tu1 tu1Var, rv4 rv4Var, int i, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        lfa lfaVar2;
        etc etcVar2;
        lfa lfaVar3;
        etc etcVar3;
        rv4Var.g0(-449719819);
        if (rv4Var.f(pm1Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i3 | i;
        if ((i2 & 2) == 0 && rv4Var.f(lfaVar)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if ((i2 & 4) == 0 && rv4Var.f(etcVar)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i8 = i7 | i5;
        if ((i8 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i8 & 1, z)) {
            rv4Var.Z();
            int i9 = i & 1;
            tza tzaVar = a;
            if (i9 != 0 && !rv4Var.B()) {
                rv4Var.X();
                if ((i2 & 2) != 0) {
                    i8 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i8 &= -897;
                }
                lfaVar3 = lfaVar;
            } else {
                if ((i2 & 2) != 0) {
                    lfaVar3 = ((h27) rv4Var.j(tzaVar)).c;
                    i8 &= -113;
                } else {
                    lfaVar3 = lfaVar;
                }
                if ((i2 & 4) != 0) {
                    etcVar3 = ((h27) rv4Var.j(tzaVar)).b;
                    i8 &= -897;
                    rv4Var.r();
                    int i10 = i8 & 14;
                    int i11 = i8 << 3;
                    a(pm1Var, ((h27) rv4Var.j(tzaVar)).d, lfaVar3, etcVar3, tu1Var, rv4Var, (i11 & 7168) | i10 | (i11 & 896) | 24576);
                    etcVar2 = etcVar3;
                    lfaVar2 = lfaVar3;
                }
            }
            etcVar3 = etcVar;
            rv4Var.r();
            int i102 = i8 & 14;
            int i112 = i8 << 3;
            a(pm1Var, ((h27) rv4Var.j(tzaVar)).d, lfaVar3, etcVar3, tu1Var, rv4Var, (i112 & 7168) | i102 | (i112 & 896) | 24576);
            etcVar2 = etcVar3;
            lfaVar2 = lfaVar3;
        } else {
            rv4Var.X();
            lfaVar2 = lfaVar;
            etcVar2 = etcVar;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new x90(pm1Var, lfaVar2, etcVar2, tu1Var, i, i2, 7);
        }
    }
}
