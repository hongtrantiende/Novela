package defpackage;

import android.content.Context;
import android.view.View;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kg  reason: default package */
/* loaded from: classes.dex */
public final class kg extends fb6 implements xt4 {
    public final /* synthetic */ int a;
    public static final kg b = new kg(1, 0);
    public static final kg c = new kg(1, 1);
    public static final kg d = new kg(1, 2);
    public static final kg e = new kg(1, 3);
    public static final kg f = new kg(1, 4);
    public static final kg C = new kg(1, 5);
    public static final kg D = new kg(1, 6);
    public static final kg E = new kg(1, 7);
    public static final kg F = new kg(1, 8);
    public static final kg G = new kg(1, 9);
    public static final kg H = new kg(1, 10);
    public static final kg I = new kg(1, 11);
    public static final kg J = new kg(1, 12);
    public static final kg K = new kg(1, 13);
    public static final kg L = new kg(1, 14);
    public static final kg M = new kg(1, 15);
    public static final kg N = new kg(1, 16);
    public static final kg O = new kg(1, 17);
    public static final kg P = new kg(1, 18);
    public static final kg Q = new kg(1, 19);
    public static final kg R = new kg(1, 20);
    public static final kg S = new kg(1, 21);
    public static final kg T = new kg(1, 22);
    public static final kg U = new kg(1, 23);
    public static final kg V = new kg(1, 24);
    public static final kg W = new kg(1, 25);
    public static final kg X = new kg(1, 26);
    public static final kg Y = new kg(1, 27);
    public static final kg Z = new kg(1, 28);
    public static final kg a0 = new kg(1, 29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kg(int i, int i2) {
        super(i);
        this.a = i2;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        od6 od6Var = null;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                hn4 hn4Var = (hn4) obj;
                return Boolean.TRUE;
            case 1:
                u7a k = ((b8a) obj).k();
                return Boolean.valueOf(k.a.c(h8a.B));
            case 2:
                vx1 vx1Var = (vx1) obj;
                vx1Var.N0(gh.a);
                return ((Context) vx1Var.N0(gh.b)).getResources();
            case 3:
                u7a k2 = ((b8a) obj).k();
                return Boolean.valueOf(k2.a.c(h8a.B));
            case 4:
                r76[] r76VarArr = j8a.a;
                ((l8a) obj).a(h8a.y, pvcVar);
                return pvcVar;
            case 5:
                ((Number) obj).longValue();
                return pvcVar;
            case 6:
                lw8 lw8Var = (lw8) obj;
                return pvcVar;
            case 7:
                r76[] r76VarArr2 = j8a.a;
                ((l8a) obj).a(h8a.x, pvcVar);
                return pvcVar;
            case 8:
                lw8 lw8Var2 = (lw8) obj;
                return pvcVar;
            case 9:
                kp kpVar = (kp) obj;
                kpVar.getHandler().post(new bg(4, kpVar.N));
                return pvcVar;
            case 10:
                lw8 lw8Var3 = (lw8) obj;
                return pvcVar;
            case 11:
                l8a l8aVar = (l8a) obj;
                return pvcVar;
            case 12:
                View view = (View) obj;
                return pvcVar;
            case 13:
                return obj;
            case 14:
                xq xqVar = (xq) obj;
                return null;
            case 15:
                return Integer.valueOf(((Number) obj).intValue());
            case 16:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 17:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return bool2;
            case 18:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return bool3;
            case 19:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                return bool4;
            case 20:
                return (r5) obj;
            case 21:
                return (r5) obj;
            case 22:
                long a = zl1.a(((zl1) obj).a, wm1.x);
                return new is(zl1.d(a), zl1.h(a), zl1.g(a), zl1.e(a));
            case 23:
                ((Number) obj).longValue();
                return pvcVar;
            case 24:
                rw1 rw1Var = (rw1) obj;
                if (rw1Var instanceof od6) {
                    od6Var = (od6) rw1Var;
                }
                if (od6Var != null && od6Var.n0) {
                    lv5.c("Apply is called on deactivated node " + rw1Var);
                }
                return pvcVar;
            case 25:
                return Boolean.valueOf(!(((lq7) obj) instanceof zw1));
            case 26:
                return obj;
            case 27:
                float[] fArr = ((l27) obj).a;
                return pvcVar;
            case 28:
                float[] fArr2 = ((l27) obj).a;
                return pvcVar;
            default:
                return Boolean.valueOf(hre.h(obj));
        }
    }
}
