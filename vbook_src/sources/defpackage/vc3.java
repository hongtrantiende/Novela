package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.vbook.android.R;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vc3  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class vc3 implements lu4 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ vc3(float f, String str, nq7 nq7Var, xt4 xt4Var, vt4 vt4Var, int i) {
        this.b = f;
        this.e = str;
        this.d = nq7Var;
        this.c = xt4Var;
        this.f = vt4Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj3 = this.f;
        Object obj4 = this.c;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                hu7.c((nq7) obj6, (dt8) obj5, this.b, (xt4) obj4, (nu4) obj3, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 1:
                ((Integer) obj2).getClass();
                xl7.b((String) obj6, this.b, (jk1) obj5, (String) obj3, (xt4) obj4, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 2:
                ((Integer) obj2).getClass();
                ctd.h(this.b, (String) obj5, (nq7) obj6, (xt4) obj4, (vt4) obj3, (rv4) obj, xoe.p(1));
                return pvcVar;
            default:
                Bitmap bitmap = (Bitmap) obj6;
                Context context = (Context) obj5;
                rq9 rq9Var = (rq9) obj4;
                rq9 rq9Var2 = (rq9) obj3;
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    vy4 vy4Var = vy4.a;
                    float f = this.b;
                    if (bitmap != null) {
                        rv4Var.e0(-879594011);
                        xwe.b(new rl0(bitmap), context.getString(R.string.widget_album_art), hc2.h(s9e.r(vy4Var), f), 0, null, rv4Var, 0, 16);
                        rv4Var.q(false);
                    } else {
                        rv4Var.e0(-879227591);
                        w92.b(aye.e(hc2.h(s9e.r(vy4Var), f), rq9Var), cc.d, jce.E(73829466, new f58(12, context, rq9Var2), rv4Var), rv4Var, 384, 0);
                        rv4Var.q(false);
                    }
                } else {
                    rv4Var.X();
                }
                return pvcVar;
        }
    }

    public /* synthetic */ vc3(nq7 nq7Var, dt8 dt8Var, float f, xt4 xt4Var, nu4 nu4Var, int i) {
        this.d = nq7Var;
        this.e = dt8Var;
        this.b = f;
        this.c = xt4Var;
        this.f = nu4Var;
    }

    public /* synthetic */ vc3(Bitmap bitmap, Context context, float f, rq9 rq9Var, rq9 rq9Var2) {
        this.d = bitmap;
        this.e = context;
        this.b = f;
        this.c = rq9Var;
        this.f = rq9Var2;
    }

    public /* synthetic */ vc3(String str, float f, jk1 jk1Var, String str2, xt4 xt4Var, int i) {
        this.d = str;
        this.b = f;
        this.e = jk1Var;
        this.f = str2;
        this.c = xt4Var;
    }
}
