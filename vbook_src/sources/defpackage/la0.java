package defpackage;

import android.os.Build;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: la0  reason: default package */
/* loaded from: classes.dex */
public final class la0 implements e78 {
    public static final la0 a = new Object();
    public static final ac4 b = ac4.a("appId");
    public static final ac4 c = ac4.a("deviceModel");
    public static final ac4 d = ac4.a("sessionSdkVersion");
    public static final ac4 e = ac4.a("osVersion");
    public static final ac4 f = ac4.a("logEnvironment");
    public static final ac4 g = ac4.a("androidAppInfo");

    @Override // defpackage.ws3
    public final void a(Object obj, Object obj2) {
        ky kyVar = (ky) obj;
        f78 f78Var = (f78) obj2;
        f78Var.a(b, kyVar.a);
        f78Var.a(c, Build.MODEL);
        f78Var.a(d, "3.0.6");
        f78Var.a(e, Build.VERSION.RELEASE);
        f78Var.a(f, aw6.LOG_ENVIRONMENT_PROD);
        f78Var.a(g, kyVar.b);
    }
}
