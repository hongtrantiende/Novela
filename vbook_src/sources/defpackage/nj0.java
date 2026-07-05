package defpackage;

import android.content.Context;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nj0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class nj0 implements xt4 {
    public final /* synthetic */ int a;

    public /* synthetic */ nj0(int i) {
        this.a = i;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                Long l = (Long) obj;
                l.longValue();
                return l;
            case 1:
                gi1 gi1Var = (gi1) obj;
                gi1Var.getClass();
                return v66.a(gi1Var);
            case 2:
                hj1 hj1Var = (hj1) obj;
                hj1Var.getClass();
                hj1Var.a(j55.b, new ao0(3, null));
                hj1Var.a(tn3.b, new bo0(2, 0, null));
                return pvcVar;
            case 3:
                b27 b27Var = (b27) obj;
                b27Var.getClass();
                return (String) ((z17) b27Var.a()).get(1);
            case 4:
                String str = (String) obj;
                str.getClass();
                return "<img src=\"" + str + "\" /><br/>";
            case 5:
                String str2 = (String) obj;
                str2.getClass();
                return "<img src=\"" + str2 + "\" /><br/>";
            case 6:
                String str3 = (String) obj;
                str3.getClass();
                return "<p>" + str3 + "</p>";
            case 7:
                b27 b27Var2 = (b27) obj;
                b27Var2.getClass();
                return (String) ((z17) b27Var2.a()).get(1);
            case 8:
                h34 h34Var = (h34) obj;
                h34Var.getClass();
                return h34Var.e.a;
            case 9:
                ri6 ri6Var = (ri6) obj;
                ri6Var.getClass();
                ri6.A(ri6Var, 10, null, fpe.b, 6);
                return pvcVar;
            case 10:
                wj6 wj6Var = (wj6) obj;
                wj6Var.getClass();
                wj6.y(wj6Var, 8, null, ipe.a, 14);
                return pvcVar;
            case 11:
                tq0 tq0Var = (tq0) obj;
                tq0Var.getClass();
                return Integer.valueOf(tq0Var.a);
            case 12:
                ((qd6) obj).a();
                return pvcVar;
            case 13:
                tj3 tj3Var = (tj3) obj;
                tj3Var.getClass();
                fm1.a(tj3Var);
                uaf.w(tj3Var, tj3Var.a * 20.0f);
                float f = tj3Var.a;
                rse.g(tj3Var, f * 6.0f, f * 6.0f, false, 12);
                return pvcVar;
            case 14:
                ((l8a) obj).getClass();
                return pvcVar;
            case 15:
                tj3 tj3Var2 = (tj3) obj;
                tj3Var2.getClass();
                fm1.a(tj3Var2);
                uaf.w(tj3Var2, tj3Var2.a * 20.0f);
                return pvcVar;
            case 16:
                if (!((Context) ((vx1) obj).N0(gh.b)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    hv0.a.getClass();
                    return gv0.c;
                }
                return jv0.b;
            case 17:
                l54 l54Var = (l54) obj;
                l54Var.getClass();
                return l54Var.a;
            case 18:
                ((lg6) obj).getClass();
                return new i25(dpe.b(lg6.b));
            case 19:
                ((lg6) obj).getClass();
                return new i25(dpe.b(lg6.b));
            case 20:
                ((ak3) obj).getClass();
                return pvcVar;
            case 21:
                ((ak3) obj).getClass();
                return pvcVar;
            case 22:
                return Integer.valueOf((-((Integer) obj).intValue()) / 6);
            case 23:
                return Integer.valueOf((-((Integer) obj).intValue()) / 6);
            case 24:
                y36 y36Var = (y36) obj;
                y36Var.getClass();
                y36Var.c = true;
                return pvcVar;
            case 25:
                j8a.i((l8a) obj, 0);
                return pvcVar;
            case 26:
                tj3 tj3Var3 = (tj3) obj;
                tj3Var3.getClass();
                fm1.a(tj3Var3);
                uaf.w(tj3Var3, tj3Var3.a * 2.0f);
                float f2 = tj3Var3.a;
                rse.g(tj3Var3, 12.0f * f2, f2 * 24.0f, false, 12);
                return pvcVar;
            case 27:
                j8a.i((l8a) obj, 8);
                return pvcVar;
            case 28:
                List list = (List) obj;
                Object obj2 = list.get(0);
                obj2.getClass();
                int intValue = ((Integer) obj2).intValue();
                Object obj3 = list.get(1);
                obj3.getClass();
                return new l71(intValue, ((Float) obj3).floatValue(), new k71(0, list));
            default:
                List list2 = (List) obj;
                Object obj4 = list2.get(0);
                obj4.getClass();
                int intValue2 = ((Integer) obj4).intValue();
                Object obj5 = list2.get(1);
                obj5.getClass();
                return new m71(intValue2, ((Float) obj5).floatValue(), new k71(1, list2));
        }
    }
}
