package defpackage;

import android.content.Context;
import android.net.Uri;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tze  reason: default package */
/* loaded from: classes.dex */
public abstract class tze {
    public static final yz a = new jla(0);

    public static synchronized Uri a() {
        synchronized (tze.class) {
            yz yzVar = a;
            Uri uri = (Uri) yzVar.get("com.google.android.gms.measurement");
            if (uri == null) {
                Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
                yzVar.put("com.google.android.gms.measurement", parse);
                return parse;
            }
            return uri;
        }
    }

    public static String b(Context context, String str) {
        if (!str.contains("#")) {
            String packageName = context.getPackageName();
            return nk2.v(new StringBuilder(str.length() + 1 + String.valueOf(packageName).length()), str, "#", packageName);
        }
        vs.m("The passed in package cannot already have a subpackage: ".concat(str));
        return null;
    }
}
