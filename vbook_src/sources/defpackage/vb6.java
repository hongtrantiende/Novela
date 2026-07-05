package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vb6  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class vb6 implements xt4 {
    public final /* synthetic */ int a;

    public /* synthetic */ vb6(int i, fj6 fj6Var) {
        this.a = 6;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        cq6 bq6Var;
        boolean z;
        int i = this.a;
        gp6 gp6Var = null;
        int i2 = 0;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                kb6 kb6Var = (kb6) obj;
                kb6Var.getClass();
                return kb6Var.b;
            case 1:
                qd6 qd6Var = (qd6) obj;
                qd6Var.getClass();
                qd6Var.a();
                return pvcVar;
            case 2:
                List list = (List) obj;
                return new qg6(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            case 3:
                ((Integer) obj).getClass();
                eg6 eg6Var = tg6.a;
                return ks3.a;
            case 4:
                ((Integer) obj).getClass();
                eg6 eg6Var2 = tg6.a;
                return -1;
            case 5:
                List list2 = (List) obj;
                return new kj6(((Number) list2.get(0)).intValue(), ((Number) list2.get(1)).intValue());
            case 6:
                z49 z49Var = (z49) obj;
                return pvcVar;
            case 7:
                ((Integer) obj).getClass();
                return null;
            case 8:
                List list3 = (List) obj;
                return new nk6((int[]) list3.get(0), (int[]) list3.get(1));
            case 9:
                jub jubVar = (jub) obj;
                return pvcVar;
            case 10:
                List list4 = (List) obj;
                return pvcVar;
            case 11:
                xr5 xr5Var = (xr5) obj;
                return pvcVar;
            case 12:
                b27 b27Var = (b27) obj;
                b27Var.getClass();
                String c = b27Var.c();
                if (!k4b.j0(c)) {
                    int i3 = b27Var.b().a;
                    int i4 = b27Var.b().b + 1;
                    String obj2 = k4b.N0(c).toString();
                    if (obj2.length() == 0) {
                        bq6Var = new aq6();
                    } else {
                        if (!k4b.V(obj2, "://", false)) {
                            obj2 = "https://".concat(obj2);
                        }
                        bq6Var = new bq6(obj2);
                    }
                    String a = bq6Var.a();
                    if (a != null) {
                        c = a;
                    }
                    gp6Var = new gp6(i3, i4, c);
                }
                return gp6Var;
            case 13:
                y78 y78Var = (y78) obj;
                return pvcVar;
            case 14:
                go0 go0Var = (go0) obj;
                go0Var.getClass();
                return go0Var.c;
            case 15:
                ((lg6) obj).getClass();
                return new i25(dpe.b(lg6.b));
            case 16:
                go0 go0Var2 = (go0) obj;
                go0Var2.getClass();
                return go0Var2.c;
            case 17:
                ((lg6) obj).getClass();
                return new i25(dpe.b(lg6.b));
            case 18:
                go0 go0Var3 = (go0) obj;
                go0Var3.getClass();
                return go0Var3.c;
            case 19:
                ((lg6) obj).getClass();
                return new i25(dpe.b(lg6.b));
            case 20:
                go0 go0Var4 = (go0) obj;
                go0Var4.getClass();
                return go0Var4.c;
            case 21:
                ((lg6) obj).getClass();
                return new i25(dpe.b(lg6.b));
            case 22:
                go0 go0Var5 = (go0) obj;
                go0Var5.getClass();
                return go0Var5.a;
            case 23:
                Context context = (Context) ((vx1) obj).N0(gh.b);
                while (true) {
                    if (context instanceof ContextWrapper) {
                        if (context instanceof Activity) {
                            gp6Var = context;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    }
                }
                return (Activity) gp6Var;
            case 24:
                yt6 yt6Var = (yt6) obj;
                yt6Var.getClass();
                fbe.w(yt6Var, 't');
                return pvcVar;
            case 25:
                yt6 yt6Var2 = (yt6) obj;
                yt6Var2.getClass();
                fbe.w(yt6Var2, 'T');
                return pvcVar;
            case 26:
                ((yi2) obj).getClass();
                return pvcVar;
            case 27:
                yi2 yi2Var = (yi2) obj;
                yi2Var.getClass();
                fbe.w(yi2Var, ':');
                ((w3) yi2Var).d(new ri0(new e4a(lh8.a)));
                fbe.F(yi2Var, "", new vb6(28));
                return pvcVar;
            case 28:
                yi2 yi2Var2 = (yi2) obj;
                yi2Var2.getClass();
                fbe.w(yi2Var2, '.');
                ((w3) yi2Var2).d(new ri0(new nr4()));
                return pvcVar;
            default:
                hj1 hj1Var = (hj1) obj;
                hj1Var.getClass();
                uw6 uw6Var = (uw6) hj1Var.b;
                nw6 nw6Var = uw6Var.c;
                if (nw6Var == null) {
                    int i5 = tw6.a;
                    nw6Var = new mu9(24, false);
                }
                nw6 nw6Var2 = nw6Var;
                ew6 ew6Var = uw6Var.e;
                ArrayList arrayList = uw6Var.a;
                ArrayList arrayList2 = uw6Var.b;
                if (uw6Var.d == vw6.b) {
                    z = true;
                } else {
                    z = false;
                }
                hq7 hq7Var = uw6Var.f;
                hj1Var.a(zj1.F, new yw6(z, nw6Var2, arrayList, arrayList2, ew6Var, hj1Var, hq7Var, null));
                hj1Var.a(tn3.G, new zw6(z, nw6Var2, arrayList2, ew6Var, hq7Var, null));
                hj1Var.a(j55.H, new ax6(z, ew6Var, arrayList2, null));
                hj1Var.a(ox9.G, new bx6(z, ew6Var, nw6Var2, null));
                if (!z && ew6Var.c) {
                    ij1 ij1Var = as9.a;
                    ij1Var.getClass();
                    Object invoke = ((vt4) ij1Var.b).invoke();
                    vr9 vr9Var = (vr9) invoke;
                    vr9Var.getClass();
                    vr9Var.b = new ww6(0);
                    vr9Var.a = new qq4(ew6Var, null, 18);
                    h40 h40Var = (h40) ij1Var.d;
                    h40Var.getClass();
                    invoke.getClass();
                    re5 re5Var = hj1Var.a;
                    re5Var.getClass();
                    hj1 hj1Var2 = new hj1(h40Var, re5Var, invoke);
                    ((xt4) ij1Var.c).invoke(hj1Var2);
                    ArrayList arrayList3 = hj1Var2.c;
                    int size = arrayList3.size();
                    while (i2 < size) {
                        Object obj3 = arrayList3.get(i2);
                        i2++;
                        k95 k95Var = (k95) obj3;
                        k95Var.getClass();
                        k95Var.a.q(re5Var, k95Var.b);
                    }
                }
                return pvcVar;
        }
    }

    public /* synthetic */ vb6(int i) {
        this.a = i;
    }
}
