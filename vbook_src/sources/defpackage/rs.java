package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rs  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class rs implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ rs(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int[] iArr;
        int i;
        int i2 = this.a;
        pvc pvcVar = pvc.a;
        int i3 = 0;
        ArrayList arrayList = this.b;
        switch (i2) {
            case 0:
                lw8 lw8Var = (lw8) obj;
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    lw8.z(lw8Var, (mw8) arrayList.get(i4), 0, 0);
                }
                return pvcVar;
            case 1:
                oh5 oh5Var = (oh5) obj;
                oh5Var.getClass();
                s11 b = oh5Var.b();
                int size2 = arrayList.size();
                int i5 = 0;
                while (i5 < size2) {
                    Object obj2 = arrayList.get(i5);
                    i5++;
                    z12 z12Var = (z12) obj2;
                    pw6 pw6Var = e22.a;
                    if (gwe.k(pw6Var)) {
                        pw6Var.i("Decoding response with " + z12Var + " for " + oh5Var.y0().c().getUrl());
                    }
                    b = z12Var.o(b, oh5Var.q());
                }
                return b;
            case 2:
                lw8 lw8Var2 = (lw8) obj;
                lw8Var2.getClass();
                int size3 = arrayList.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    lw8.z(lw8Var2, (mw8) arrayList.get(i6), 0, 0);
                }
                return pvcVar;
            case 3:
                lw8 lw8Var3 = (lw8) obj;
                int size4 = arrayList.size();
                int i7 = 0;
                while (i7 < size4) {
                    f37 f37Var = (f37) arrayList.get(i7);
                    List list = f37Var.b;
                    boolean z = f37Var.h;
                    if (f37Var.l == Integer.MIN_VALUE) {
                        ov5.a("position() should be called first");
                    }
                    int size5 = list.size();
                    int i8 = i3;
                    while (i8 < size5) {
                        mw8 mw8Var = (mw8) list.get(i8);
                        int i9 = i7;
                        long d = py5.d((iArr[i + 1] & 4294967295L) | (f37Var.j[i8 * 2] << 32), f37Var.c);
                        if (z) {
                            lw8.M(lw8Var3, mw8Var, d, null, 6);
                        } else {
                            lw8.F(lw8Var3, mw8Var, d);
                        }
                        i8++;
                        i7 = i9;
                    }
                    i7++;
                    i3 = 0;
                }
                return pvcVar;
            case 4:
                lw8 lw8Var4 = (lw8) obj;
                int size6 = arrayList.size();
                for (int i10 = 0; i10 < size6; i10++) {
                    lw8Var4.o((mw8) arrayList.get(i10), 0, 0, nae.e);
                }
                return pvcVar;
            case 5:
                b27 b27Var = (b27) obj;
                b27Var.getClass();
                arrayList.add(b27Var.c());
                return r4b.N("ENTOKEN{}", false, "{}", String.valueOf(arrayList.size() - 1));
            case 6:
                b27 b27Var2 = (b27) obj;
                b27Var2.getClass();
                String lowerCase = b27Var2.c().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                return kte.e(lowerCase, arrayList);
            case 7:
                b27 b27Var3 = (b27) obj;
                b27Var3.getClass();
                return kte.e(b27Var3.c(), arrayList);
            case 8:
                b27 b27Var4 = (b27) obj;
                b27Var4.getClass();
                gm9 gm9Var = dlb.a;
                return kte.e(dlb.e.h(b27Var4.c(), new clb(4)), arrayList);
            default:
                b27 b27Var5 = (b27) obj;
                b27Var5.getClass();
                String c = b27Var5.c();
                if (((gm9) sc7.w.getValue()).a(c)) {
                    String str = (String) ((Map) hr9.o.getValue()).get(c);
                    if (str != null) {
                        c = str;
                    }
                } else {
                    c = dlb.d.h(c, new clb(3));
                }
                return kte.e(c, arrayList);
        }
    }
}
