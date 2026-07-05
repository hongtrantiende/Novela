package defpackage;

import android.content.Context;
import okhttp3.OkHttpClient;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rj2  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class rj2 implements vt4 {
    public final /* synthetic */ int a;

    public /* synthetic */ rj2(int i) {
        this.a = i;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new w3a("kotlinx.datetime.DateTimeUnit", cm9.a(qj2.class), new gi1[]{cm9.a(lj2.class), cm9.a(nj2.class), cm9.a(pj2.class)}, new s76[]{xj2.a, br7.a, h9c.a});
            case 1:
                o9a[] o9aVarArr = new o9a[0];
                if (!k4b.j0("kotlinx.datetime.DayBased")) {
                    hi1 hi1Var = new hi1("kotlinx.datetime.DayBased");
                    xy5 xy5Var = xy5.a;
                    hi1Var.a("days", xy5.b);
                    return new q9a("kotlinx.datetime.DayBased", a5b.f, hi1Var.c.size(), b00.D0(o9aVarArr), hi1Var);
                }
                vs.m("Blank serial names are prohibited");
                return null;
            case 2:
                sw2 sw2Var = ab3.a;
                b9b b = rse.b();
                sw2Var.getClass();
                return k27.a(nq2.C(sw2Var, b));
            case 3:
                return kue.a(if5.a, new bq2(6));
            case 4:
                return Float.valueOf(1.0f);
            case 5:
                return new Object();
            case 6:
                return new OkHttpClient(new OkHttpClient.Builder());
            case 7:
                return yae.z(Boolean.FALSE);
            case 8:
                return yae.z(Boolean.FALSE);
            case 9:
                return yae.z(Boolean.FALSE);
            case 10:
                return yae.z(Boolean.FALSE);
            case 11:
                return yae.z(Boolean.FALSE);
            case 12:
                return yae.z(new jub((String) null, 0L, 7));
            case 13:
                return yae.z(Boolean.FALSE);
            case 14:
                return yae.z(new jub((String) null, 0L, 7));
            case 15:
                return yae.z(Boolean.FALSE);
            case 16:
                Context context = twe.e;
                context.getClass();
                return new gk(context);
            case 17:
                return new oc8();
            case 18:
                Context context2 = twe.e;
                context2.getClass();
                return new ck(context2);
            case 19:
                return yae.z(Boolean.FALSE);
            case 20:
                return yae.z(Boolean.FALSE);
            case 21:
                return yae.z(Boolean.FALSE);
            case 22:
                return new qg6(0, 0);
            case 23:
                return yae.z(Boolean.FALSE);
            case 24:
                return yae.z(Boolean.FALSE);
            case 25:
                return new qg6(0, 0);
            case 26:
                jva jvaVar = fa3.a;
                return pvc.a;
            case 27:
                return yae.z(Boolean.FALSE);
            case 28:
                return yae.z(Boolean.FALSE);
            default:
                return yae.z(Boolean.FALSE);
        }
    }
}
