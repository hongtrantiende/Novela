package defpackage;

import java.util.List;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d3a  reason: default package */
/* loaded from: classes3.dex */
public abstract class d3a {
    public static final arc a = tte.x(Context.VERSION_ECMASCRIPT, 0, on3.a, 2);

    public static final void a(rj8 rj8Var, List list, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        kq7 kq7Var;
        boolean h;
        int i3;
        int i4;
        rj8Var.getClass();
        list.getClass();
        rv4Var.g0(2080349538);
        if ((i & 6) == 0) {
            if (rv4Var.f(rj8Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if ((i & 64) == 0) {
                h = rv4Var.f(list);
            } else {
                h = rv4Var.h(list);
            }
            if (h) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i5 = i2 | 384;
        if ((i5 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i5 & 1, z)) {
            tu1 tu1Var = v9e.a;
            tu1 tu1Var2 = v9e.b;
            int i6 = (i5 & 14) | 27648 | (i5 & Token.ASSIGN_MOD) | (i5 & 896);
            kq7 kq7Var2 = kq7.a;
            b(rj8Var, list, kq7Var2, tu1Var, tu1Var2, rv4Var, i6, 0);
            kq7Var = kq7Var2;
        } else {
            rv4Var.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new a3a(rj8Var, list, kq7Var, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.rj8 r18, java.util.List r19, defpackage.nq7 r20, defpackage.tu1 r21, defpackage.tu1 r22, defpackage.rv4 r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d3a.b(rj8, java.util.List, nq7, tu1, tu1, rv4, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x00d7, code lost:
        if ((r28 & 8) != 0) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final int r16, final defpackage.nq7 r17, final long r18, long r20, final float r22, final defpackage.tu1 r23, final defpackage.lu4 r24, final defpackage.tu1 r25, defpackage.rv4 r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d3a.c(int, nq7, long, long, float, tu1, lu4, tu1, rv4, int, int):void");
    }
}
