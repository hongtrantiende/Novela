package defpackage;

import java.lang.annotation.Annotation;
import okhttp3.OkHttpClient;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rh7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class rh7 implements vt4 {
    public final /* synthetic */ int a;

    public /* synthetic */ rh7(int i) {
        this.a = i;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return yae.z(new jub((String) null, 0L, 7));
            case 1:
                return yae.z(Boolean.FALSE);
            case 2:
                return yae.z(new jub((String) null, 0L, 7));
            case 3:
                return yae.z(Boolean.TRUE);
            case 4:
                return yae.z(Boolean.TRUE);
            case 5:
                return yae.z(Boolean.TRUE);
            case 6:
                return yae.z(Boolean.TRUE);
            case 7:
                return yae.z(new jub((String) null, 0L, 7));
            case 8:
                return yae.z("2-5");
            case 9:
                return yae.z("2");
            case 10:
                return new p59();
            case 11:
                return yae.z(Boolean.FALSE);
            case 12:
                return yae.z(Boolean.FALSE);
            case 13:
                return yae.z(Boolean.FALSE);
            case 14:
                return yae.z(Boolean.FALSE);
            case 15:
                return new ywb("", false);
            case 16:
                return yae.z(Boolean.FALSE);
            case 17:
                return yae.z(new jub((String) null, 0L, 7));
            case 18:
                return yae.z(Boolean.FALSE);
            case 19:
                return yae.z(Boolean.FALSE);
            case 20:
                return yae.z(Boolean.FALSE);
            case 21:
                return yae.z(Boolean.FALSE);
            case 22:
                o9a[] o9aVarArr = new o9a[0];
                if (!k4b.j0("kotlinx.datetime.MonthBased")) {
                    hi1 hi1Var = new hi1("kotlinx.datetime.MonthBased");
                    xy5 xy5Var = xy5.a;
                    hi1Var.a("months", xy5.b);
                    return new q9a("kotlinx.datetime.MonthBased", a5b.f, hi1Var.c.size(), b00.D0(o9aVarArr), hi1Var);
                }
                vs.m("Blank serial names are prohibited");
                return null;
            case 23:
                float f = vz7.a;
                return sv2.a;
            case 24:
                float f2 = l08.a;
                return tv2.a;
            case 25:
                return c51.a;
            case 26:
                return evc.a;
            case 27:
                return new m78("com.reader.app.ui.screen.notification.NotificationRoute", e58.INSTANCE, new Annotation[0]);
            case 28:
                return new OkHttpClient(new OkHttpClient.Builder());
            default:
                qk1[] values = qk1.values();
                values.getClass();
                return new ru3("org.publicvalue.multiplatform.oidc.types.CodeChallengeMethod", values);
        }
    }
}
