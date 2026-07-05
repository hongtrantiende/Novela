package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dt7  reason: default package */
/* loaded from: classes.dex */
public final class dt7 implements b37 {
    public final ol4 a;

    public dt7(ol4 ol4Var) {
        this.a = ol4Var;
    }

    @Override // defpackage.b37
    public final int a(u06 u06Var, List list, int i) {
        w27 w27Var;
        ArrayList g = zj0.g(u06Var);
        ol4 ol4Var = this.a;
        ml4 ml4Var = ol4Var.f;
        List list2 = (List) sl1.f0(1, g);
        w27 w27Var2 = null;
        if (list2 != null) {
            w27Var = (w27) sl1.e0(list2);
        } else {
            w27Var = null;
        }
        List list3 = (List) sl1.f0(2, g);
        if (list3 != null) {
            w27Var2 = (w27) sl1.e0(list3);
        }
        ml4Var.a(w27Var, w27Var2, y02.b(0, 0, 0, i, 7));
        List list4 = (List) sl1.e0(g);
        if (list4 == null) {
            list4 = ks3.a;
        }
        int X0 = u06Var.X0(ol4Var.c);
        int size = list4.size();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 < size) {
            int J = ((w27) list4.get(i2)).J(i) + X0;
            int i6 = i2 + 1;
            if (i6 - i4 != Integer.MAX_VALUE && i6 != list4.size()) {
                i5 += J;
            } else {
                i3 = Math.max(i3, (i5 + J) - X0);
                i4 = i2;
                i5 = 0;
            }
            i2 = i6;
        }
        return i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03bb A[LOOP:1: B:135:0x03b9->B:136:0x03bb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0285  */
    @Override // defpackage.b37
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.c37 e(defpackage.e37 r60, java.util.List r61, long r62) {
        /*
            Method dump skipped, instructions count: 1189
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dt7.e(e37, java.util.List, long):c37");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof dt7) && c16.i(this.a, ((dt7) obj).a)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x022c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0218 A[SYNTHETIC] */
    @Override // defpackage.b37
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(defpackage.u06 r36, java.util.List r37, int r38) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dt7.f(u06, java.util.List, int):int");
    }

    @Override // defpackage.b37
    public final int g(u06 u06Var, List list, int i) {
        w27 w27Var;
        ArrayList g = zj0.g(u06Var);
        ol4 ol4Var = this.a;
        ml4 ml4Var = ol4Var.f;
        List list2 = (List) sl1.f0(1, g);
        w27 w27Var2 = null;
        if (list2 != null) {
            w27Var = (w27) sl1.e0(list2);
        } else {
            w27Var = null;
        }
        List list3 = (List) sl1.f0(2, g);
        if (list3 != null) {
            w27Var2 = (w27) sl1.e0(list3);
        }
        ml4Var.a(w27Var, w27Var2, y02.b(0, i, 0, 0, 13));
        List list4 = (List) sl1.e0(g);
        if (list4 == null) {
            list4 = ks3.a;
        }
        return ol4.a(list4, i, u06Var.X0(ol4Var.c), u06Var.X0(ol4Var.e), ol4Var.f);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.b37
    public final int i(u06 u06Var, List list, int i) {
        w27 w27Var;
        ArrayList g = zj0.g(u06Var);
        ol4 ol4Var = this.a;
        ml4 ml4Var = ol4Var.f;
        List list2 = (List) sl1.f0(1, g);
        w27 w27Var2 = null;
        if (list2 != null) {
            w27Var = (w27) sl1.e0(list2);
        } else {
            w27Var = null;
        }
        List list3 = (List) sl1.f0(2, g);
        if (list3 != null) {
            w27Var2 = (w27) sl1.e0(list3);
        }
        ml4Var.a(w27Var, w27Var2, y02.b(0, i, 0, 0, 13));
        List list4 = (List) sl1.e0(g);
        if (list4 == null) {
            list4 = ks3.a;
        }
        return ol4.a(list4, i, u06Var.X0(ol4Var.c), u06Var.X0(ol4Var.e), ol4Var.f);
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.a + ")";
    }
}
