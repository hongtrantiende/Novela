package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dva  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dva implements xt4 {
    public final /* synthetic */ int a;

    public /* synthetic */ dva(int i) {
        this.a = i;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        String str;
        int i = this.a;
        int i2 = 0;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                eva evaVar = (eva) obj;
                evaVar.getClass();
                return Integer.valueOf(evaVar.a);
            case 1:
                eva evaVar2 = (eva) obj;
                evaVar2.getClass();
                return Integer.valueOf(evaVar2.b);
            case 2:
                zy5 zy5Var = (zy5) obj;
                return new py5(4294967196L);
            case 3:
                zy5 zy5Var2 = (zy5) obj;
                return new py5(4294967046L);
            case 4:
                return hl5.h(4, (Integer) obj);
            case 5:
                return hl5.h(4, (Integer) obj);
            case 6:
                vl6 vl6Var = (vl6) obj;
                vl6Var.getClass();
                return vl6Var.a;
            case 7:
                vl6 vl6Var2 = (vl6) obj;
                vl6Var2.getClass();
                return vl6Var2.a;
            case 8:
                hx9 hx9Var = (hx9) obj;
                hx9Var.getClass();
                ArrayList arrayList = hx9Var.b;
                long j = ((t7c) sl1.j0(arrayList)).a;
                int i3 = qy5.c;
                long e = uaf.e(((int) (j >> 32)) + 1, ((int) (j & 4294967295L)) + 1);
                return hx9Var.a + ':' + arrayList.size() + ':' + uaf.B(e);
            case 9:
                r76[] r76VarArr = j8a.a;
                k8a k8aVar = h8a.m;
                r76 r76Var = j8a.a[5];
                ((l8a) obj).a(k8aVar, Boolean.TRUE);
                return pvcVar;
            case 10:
                wr wrVar = (wr) obj;
                return pvcVar;
            case 11:
                l8a l8aVar = (l8a) obj;
                l8aVar.getClass();
                j8a.i(l8aVar, 2);
                return pvcVar;
            case 12:
                cw9 cw9Var = (cw9) obj;
                cw9Var.getClass();
                iw9 h1 = cw9Var.h1("SELECT DISTINCT work_spec_id FROM SystemIdInfo");
                try {
                    ArrayList arrayList2 = new ArrayList();
                    while (h1.Z0()) {
                        arrayList2.add(h1.s0(0));
                    }
                    return arrayList2;
                } finally {
                    h1.close();
                }
            case 13:
                String str2 = (String) obj;
                str2.getClass();
                return str2;
            case 14:
                ((xq) obj).getClass();
                return new z22(zt3.g(null, 3), zt3.i(null, 3));
            case 15:
                ((xq) obj).getClass();
                return new z22(zt3.g(null, 3), zt3.i(null, 3));
            case 16:
                ((String) obj).getClass();
                return "---";
            case 17:
                List<ka1> list = (List) obj;
                list.getClass();
                ArrayList arrayList3 = new ArrayList(tl1.s(list, 10));
                for (ka1 ka1Var : list) {
                    arrayList3.add(r4b.N(r4b.N(k4b.N0(ka1Var.a).toString(), false, "\n", " "), false, "|", "\\|"));
                }
                ArrayList arrayList4 = new ArrayList();
                int size = arrayList3.size();
                while (i2 < size) {
                    Object obj2 = arrayList3.get(i2);
                    i2++;
                    if (((String) obj2).length() > 0) {
                        arrayList4.add(obj2);
                    }
                }
                return sl1.i0(arrayList4, " / ", null, null, null, 62);
            case 18:
                String str3 = (String) obj;
                str3.getClass();
                return hl5.n("<li>", mjb.d(str3), "</li>");
            case 19:
                ((lg6) obj).getClass();
                return new i25(dpe.b(lg6.b));
            case 20:
                ((lg6) obj).getClass();
                return new i25(dpe.b(lg6.b));
            case 21:
                ((lg6) obj).getClass();
                return new i25(dpe.b(lg6.b));
            case 22:
                ((lg6) obj).getClass();
                return new i25(dpe.b(lg6.b));
            case 23:
                ((lg6) obj).getClass();
                return new i25(dpe.b(lg6.b));
            case 24:
                ((lg6) obj).getClass();
                return new i25(dpe.b(lg6.b));
            case 25:
                ((lg6) obj).getClass();
                return new i25(dpe.b(lg6.b));
            case 26:
                ((Float) obj).getClass();
                return pvcVar;
            case 27:
                b27 b27Var = (b27) obj;
                b27Var.getClass();
                return b27Var.c();
            case 28:
                b27 b27Var2 = (b27) obj;
                b27Var2.getClass();
                return b27Var2.c();
            default:
                b27 b27Var3 = (b27) obj;
                b27Var3.getClass();
                String c = b27Var3.c();
                String str4 = (String) ((z17) b27Var3.a()).get(1);
                if (k4b.B0(c, '=')) {
                    str = "= âm ";
                } else {
                    str = " âm ";
                }
                return nk2.u(str, str4);
        }
    }
}
