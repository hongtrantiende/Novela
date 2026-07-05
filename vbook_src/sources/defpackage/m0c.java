package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m0c  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class m0c implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m0c(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        String str;
        int i = this.a;
        boolean z = true;
        boolean z2 = false;
        pvc pvcVar = pvc.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                t2c t2cVar = (t2c) obj3;
                int intValue = ((Integer) obj).intValue();
                ((Float) obj2).getClass();
                t2cVar.getClass();
                hk1 a = jdd.a(t2cVar);
                sw2 sw2Var = ab3.a;
                t2cVar.f(a, ru2.c, new m2c(t2cVar, intValue, (m42) null));
                return pvcVar;
            case 1:
                c4c c4cVar = (c4c) obj3;
                String str2 = (String) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                str2.getClass();
                hk1 a2 = jdd.a(c4cVar);
                sw2 sw2Var2 = ab3.a;
                c4cVar.f(a2, ru2.c, new lq0(c4cVar, booleanValue, str2, (m42) null, 2));
                return pvcVar;
            case 2:
                w43 w43Var = (w43) obj3;
                rv4 rv4Var = (rv4) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                }
                if (rv4Var.U(intValue2 & 1, z2)) {
                    bzc bzcVar = w43Var.e;
                    rgc.a(bzcVar, w43Var.m, true, null, bzcVar.c, rv4Var, 392);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 3:
                String str3 = (String) obj;
                List list = (List) obj2;
                str3.getClass();
                list.getClass();
                ((xtc) obj3).i.d(str3, list);
                return pvcVar;
            case 4:
                c98 c98Var = (c98) obj3;
                String str4 = (String) obj;
                List<String> list2 = (List) obj2;
                str4.getClass();
                list2.getClass();
                if (!"Content-Length".equals(str4) && !"Content-Type".equals(str4)) {
                    if (m2d.a.contains(str4)) {
                        for (String str5 : list2) {
                            c98Var.invoke(str4, str5);
                        }
                    } else {
                        if ("Cookie".equals(str4)) {
                            str = "; ";
                        } else {
                            str = ",";
                        }
                        c98Var.invoke(str4, sl1.i0(list2, str, null, null, null, 62));
                    }
                }
                return pvcVar;
            case 5:
                ubd ubdVar = (ubd) obj3;
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                List list3 = (List) obj2;
                list3.getClass();
                hk1 a3 = jdd.a(ubdVar);
                sw2 sw2Var3 = ab3.a;
                ubdVar.f(a3, ru2.c, new pz2(ubdVar, list3, booleanValue2, (m42) null, 10));
                return pvcVar;
            case 6:
                vl9 vl9Var = (vl9) obj3;
                z09 z09Var = (z09) obj;
                y78 y78Var = (y78) obj2;
                float abs = Math.abs(Float.intBitsToFloat((int) (4294967295L & y78Var.a)));
                float abs2 = Math.abs(Float.intBitsToFloat((int) (y78Var.a >> 32)));
                if (abs <= 1.25f * abs2) {
                    z = false;
                }
                vl9Var.a = z;
                if (z || abs2 >= abs) {
                    z09Var.a();
                }
                return pvcVar;
            case 7:
                return new py5(((lk0) obj3).a(0, (int) (((zy5) obj).a >> 32), (tc6) obj2) << 32);
            case 8:
                tc6 tc6Var = (tc6) obj2;
                return new py5(((mk0) obj3).a(0, (int) (((zy5) obj).a & 4294967295L)) & 4294967295L);
            default:
                return new py5(((nk0) obj3).a(0L, ((zy5) obj).a, (tc6) obj2));
        }
    }
}
