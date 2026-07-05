package defpackage;

import android.os.Build;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ka0  reason: default package */
/* loaded from: classes.dex */
public final class ka0 implements e78 {
    public static final ka0 a = new Object();
    public static final ac4 b = ac4.a("packageName");
    public static final ac4 c = ac4.a("versionName");
    public static final ac4 d = ac4.a("appBuildVersion");
    public static final ac4 e = ac4.a("deviceManufacturer");
    public static final ac4 f = ac4.a("currentProcessDetails");
    public static final ac4 g = ac4.a("appProcessDetails");

    @Override // defpackage.ws3
    public final void a(Object obj, Object obj2) {
        we weVar = (we) obj;
        f78 f78Var = (f78) obj2;
        f78Var.a(b, weVar.a);
        f78Var.a(c, weVar.b);
        f78Var.a(d, weVar.c);
        f78Var.a(e, Build.MANUFACTURER);
        f78Var.a(f, weVar.d);
        f78Var.a(g, weVar.e);
    }
}
