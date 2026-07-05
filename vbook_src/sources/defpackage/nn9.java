package defpackage;

import android.net.Uri;
import java.net.URL;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nn9  reason: default package */
/* loaded from: classes.dex */
public final class nn9 {
    public final ky a;
    public final d82 b;

    public nn9(ky kyVar, d82 d82Var) {
        kyVar.getClass();
        d82Var.getClass();
        this.a = kyVar;
        this.b = d82Var;
    }

    public static final URL a(nn9 nn9Var) {
        nn9Var.getClass();
        Uri.Builder appendPath = new Uri.Builder().scheme("https").authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        ky kyVar = nn9Var.a;
        Uri.Builder appendPath2 = appendPath.appendPath(kyVar.a).appendPath("settings");
        we weVar = kyVar.b;
        return new URL(appendPath2.appendQueryParameter("build_version", weVar.c).appendQueryParameter("display_version", weVar.b).build().toString());
    }
}
