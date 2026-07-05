package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o25  reason: default package */
/* loaded from: classes.dex */
public final class o25 implements b37 {
    public final lu4 a;
    public final boolean b;
    public final j25 c;
    public final float d;
    public final j25 e;
    public final float f;

    public o25(lu4 lu4Var, boolean z, j25 j25Var, float f, j25 j25Var2, float f2) {
        lu4Var.getClass();
        this.a = lu4Var;
        this.b = z;
        this.c = j25Var;
        this.d = f;
        this.e = j25Var2;
        this.f = f2;
    }

    @Override // defpackage.b37
    public final c37 e(e37 e37Var, List list, long j) {
        int i;
        List list2;
        int i2;
        int i3;
        int i4;
        int i5;
        e37Var.getClass();
        list.getClass();
        List list3 = (List) this.a.invoke(e37Var, new x02(j));
        int size = list3.size();
        boolean z = this.b;
        j25 j25Var = this.c;
        float f = this.d;
        j25 j25Var2 = this.e;
        float f2 = this.f;
        ov2 ov2Var = new ov2(list, list3, z, size, j25Var, f, j25Var2, f2);
        q1d[] q1dVarArr = (q1d[]) ov2Var.g;
        int j2 = x02.j(j);
        int h = x02.h(j);
        int k = x02.k(j);
        int i6 = x02.i(j);
        ArrayList arrayList = new ArrayList();
        int X0 = e37Var.X0(f);
        int X02 = e37Var.X0(f2);
        int size2 = list.size();
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i7 < size2) {
            ArrayList arrayList2 = new ArrayList();
            q1d[] q1dVarArr2 = q1dVarArr;
            int i12 = i6;
            int i13 = k;
            int i14 = i7;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            while (i18 < size && i14 < size2) {
                q1d q1dVar = q1dVarArr2[i14];
                i4 = size2;
                if (1 > size) {
                    i14++;
                    size2 = i4;
                } else {
                    i3 = size;
                    if (1 > i3 - i18) {
                        list2 = list3;
                        i2 = i14;
                        break;
                    }
                    i18++;
                    w27 w27Var = (w27) list.get(i14);
                    int i20 = i15;
                    int intValue = ((Number) list3.get(i15)).intValue();
                    List list4 = list3;
                    int i21 = Integer.MAX_VALUE;
                    if (h != Integer.MAX_VALUE && (i21 = h - i11) < 0) {
                        i21 = 0;
                    }
                    int i22 = i14;
                    if (ov2Var.a) {
                        i5 = intValue;
                    } else {
                        i5 = 0;
                    }
                    mw8 M = w27Var.M(y02.a(i5, intValue, 0, i21));
                    q1d q1dVar2 = q1dVarArr2[i22];
                    arrayList2.add(new m25(M, intValue));
                    int min = Math.min(X02, ((i12 + X02) - i19) - intValue) + intValue + i19;
                    i17 = Math.max(i17, M.b);
                    i16 = Math.max(i16, min);
                    i14 = i22 + 1;
                    i19 = min;
                    i15 = i20 + 1;
                    size = i3;
                    size2 = i4;
                    list3 = list4;
                }
            }
            list2 = list3;
            i2 = i14;
            i3 = size;
            i4 = size2;
            i9 = Math.max(i9, i16 - X02);
            arrayList.add(arrayList2);
            int min2 = Math.min(X0, ((h + X0) - i11) - i17) + i17 + i11;
            i8 = Math.max(i8, min2);
            i10++;
            i6 = i12;
            i11 = min2;
            q1dVarArr = q1dVarArr2;
            k = i13;
            size = i3;
            size2 = i4;
            list3 = list2;
            i7 = i2;
        }
        List list5 = list3;
        int i23 = i10;
        int n = dce.n(i8 - X0, j2, h);
        int n2 = dce.n(i9, k, i6);
        int i24 = ov2Var.b;
        int[] iArr = new int[i23];
        for (int i25 = 0; i25 < i23; i25++) {
            iArr[i25] = 0;
        }
        int i26 = 0;
        int[] iArr2 = new int[i24];
        for (int i27 = 0; i27 < i24; i27++) {
            iArr2[i27] = 0;
        }
        int[] iArr3 = new int[i23];
        int i28 = 0;
        while (i28 < i23) {
            iArr3[i28] = i26;
            i28++;
            i26 = 0;
        }
        for (int i29 = 0; i29 < i23; i29++) {
            List list6 = (List) arrayList.get(i29);
            int size3 = list6.size();
            int[] iArr4 = new int[size3];
            for (int i30 = 0; i30 < size3; i30++) {
                iArr4[i30] = ((m25) list6.get(i30)).a.b;
            }
            if (size3 == 0) {
                i = 0;
            } else {
                i = iArr4[0];
                for (int i31 = 1; i31 < size3; i31++) {
                    i = Math.max(i, iArr4[i31]);
                }
            }
            iArr3[i29] = i;
        }
        int i32 = 0;
        ((j25) ov2Var.e).l(Integer.valueOf(n), iArr3, e37Var.getLayoutDirection(), e37Var, iArr);
        ((j25) ov2Var.f).l(Integer.valueOf(n2), sl1.B0(list5), e37Var.getLayoutDirection(), e37Var, iArr2);
        ArrayList arrayList3 = new ArrayList();
        int size4 = arrayList.size();
        int i33 = 0;
        while (i33 < size4) {
            List list7 = (List) arrayList.get(i33);
            ArrayList arrayList4 = new ArrayList();
            int i34 = iArr3[i33];
            int size5 = list7.size();
            int i35 = i32;
            int i36 = i35;
            while (i35 < size5) {
                int i37 = i33;
                arrayList4.add(new n25(iArr[i37], iArr2[i36], ((m25) list7.get(i35)).a));
                i36++;
                i35++;
                size4 = size4;
                list7 = list7;
                i33 = i37;
            }
            arrayList3.add(arrayList4);
            i33++;
            i32 = 0;
        }
        return e37Var.q0(n2, n, ls3.a, new fo4(ov2Var, new l25(arrayList3, n, n2)));
    }
}
