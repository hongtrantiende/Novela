package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xd8  reason: default package */
/* loaded from: classes.dex */
public final class xd8 extends pe8 {
    public static final xd8 c = new pe8(1, 0, 2);

    @Override // defpackage.pe8
    public final void a(vh1 vh1Var, ny nyVar, eqa eqaVar, zm9 zm9Var, qe8 qe8Var) {
        int[] iArr;
        lv4 lv4Var;
        int c2;
        int i;
        int c3 = vh1Var.c(0);
        if (eqaVar.n != 0) {
            ex1.a("Cannot move a group while inserting");
        }
        if (c3 < 0) {
            ex1.a("Parameter offset is out of bounds");
        }
        if (c3 != 0) {
            int i2 = eqaVar.t;
            int i3 = eqaVar.v;
            int i4 = eqaVar.u;
            int i5 = i2;
            while (true) {
                iArr = eqaVar.b;
                if (c3 <= 0) {
                    break;
                }
                i5 += iArr[(eqaVar.r(i5) * 5) + 3];
                if (i5 > i4) {
                    ex1.a("Parameter offset is out of bounds");
                }
                c3--;
            }
            int i6 = iArr[(eqaVar.r(i5) * 5) + 3];
            int g = eqaVar.g(eqaVar.r(eqaVar.t), eqaVar.b);
            int g2 = eqaVar.g(eqaVar.r(i5), eqaVar.b);
            int i7 = i5 + i6;
            int g3 = eqaVar.g(eqaVar.r(i7), eqaVar.b);
            int i8 = g3 - g2;
            eqaVar.x(i8, Math.max(eqaVar.t - 1, 0));
            eqaVar.w(i6);
            int[] iArr2 = eqaVar.b;
            int r = eqaVar.r(i7) * 5;
            b00.V(eqaVar.r(i2) * 5, r, (i6 * 5) + r, iArr2, iArr2);
            if (i8 > 0) {
                Object[] objArr = eqaVar.c;
                int h = eqaVar.h(g2 + i8);
                System.arraycopy(objArr, h, objArr, g, eqaVar.h(g3 + i8) - h);
            }
            int i9 = g2 + i8;
            int i10 = i9 - g;
            int i11 = eqaVar.k;
            int i12 = eqaVar.l;
            int length = eqaVar.c.length;
            int i13 = eqaVar.m;
            int i14 = i2 + i6;
            int i15 = i2;
            while (i15 < i14) {
                int r2 = eqaVar.r(i15);
                int i16 = i10;
                int g4 = eqaVar.g(r2, iArr2) - i16;
                if (i13 < r2) {
                    i = 0;
                } else {
                    i = i11;
                }
                int[] iArr3 = iArr2;
                iArr3[(r2 * 5) + 4] = eqa.i(eqa.i(g4, i, i12, length), eqaVar.k, eqaVar.l, eqaVar.c.length);
                i15++;
                i10 = i16;
                iArr2 = iArr3;
                i11 = i11;
            }
            int i17 = i7 + i6;
            int p = eqaVar.p();
            int a = dqa.a(eqaVar.d, i7, p);
            ArrayList arrayList = new ArrayList();
            if (a >= 0) {
                while (a < eqaVar.d.size() && (c2 = eqaVar.c((lv4Var = (lv4) eqaVar.d.get(a)))) >= i7 && c2 < i17) {
                    arrayList.add(lv4Var);
                    lv4 lv4Var2 = (lv4) eqaVar.d.remove(a);
                }
            }
            int i18 = i2 - i7;
            int size = arrayList.size();
            for (int i19 = 0; i19 < size; i19++) {
                lv4 lv4Var3 = (lv4) arrayList.get(i19);
                int c4 = eqaVar.c(lv4Var3) + i18;
                if (c4 >= eqaVar.g) {
                    lv4Var3.a = -(p - c4);
                } else {
                    lv4Var3.a = c4;
                }
                eqaVar.d.add(dqa.a(eqaVar.d, c4, p), lv4Var3);
            }
            if (eqaVar.K(i7, i6)) {
                ex1.a("Unexpectedly removed anchors");
            }
            eqaVar.m(i3, eqaVar.u, i2);
            if (i8 > 0) {
                eqaVar.L(i9, i8, i7 - 1);
            }
        }
    }
}
