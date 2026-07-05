package defpackage;

import android.net.Uri;
import android.text.TextUtils;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k5f  reason: default package */
/* loaded from: classes.dex */
public final class k5f extends v4f {
    public static final boolean a0(String str) {
        String str2 = (String) yme.t.a(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(",")) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0094, code lost:
        if (java.lang.Math.abs(r7.hashCode() % 100) < r9.I().t()) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.h5f Y(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k5f.Y(java.lang.String):h5f");
    }

    public final String Z(String str) {
        lse lseVar = this.b.a;
        a6f.U(lseVar);
        String k0 = lseVar.k0(str);
        if (!TextUtils.isEmpty(k0)) {
            Uri parse = Uri.parse((String) yme.r.a(null));
            Uri.Builder buildUpon = parse.buildUpon();
            String authority = parse.getAuthority();
            StringBuilder sb = new StringBuilder(String.valueOf(k0).length() + 1 + String.valueOf(authority).length());
            sb.append(k0);
            sb.append(".");
            sb.append(authority);
            buildUpon.authority(sb.toString());
            return buildUpon.build().toString();
        }
        return (String) yme.r.a(null);
    }
}
