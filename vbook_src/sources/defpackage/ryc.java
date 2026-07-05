package defpackage;

import android.net.Uri;
import android.provider.DocumentsContract;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ryc  reason: default package */
/* loaded from: classes3.dex */
public abstract class ryc {
    public static final String[] a = {"_display_name", "_size"};
    public static final String[] b = {"_display_name"};
    public static final gm9 c = new gm9("^\\d+(?:\\.[A-Za-z0-9]+)?$");

    public static Long a(Uri uri) {
        Object gs9Var;
        Object gs9Var2;
        Long T;
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment != null && (T = r4b.T(10, lastPathSegment)) != null) {
            return Long.valueOf(T.longValue());
        }
        try {
            gs9Var = DocumentsContract.getDocumentId(uri);
        } catch (Throwable th) {
            gs9Var = new gs9(th);
        }
        if (gs9Var instanceof gs9) {
            gs9Var = null;
        }
        String str = (String) gs9Var;
        if (str == null) {
            try {
                gs9Var2 = DocumentsContract.getTreeDocumentId(uri);
            } catch (Throwable th2) {
                gs9Var2 = new gs9(th2);
            }
            if (gs9Var2 instanceof gs9) {
                gs9Var2 = null;
            }
            str = (String) gs9Var2;
            if (str == null) {
                return null;
            }
        }
        return r4b.T(10, k4b.E0(':', str, str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
        if (r0 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
        if (defpackage.k4b.j0(r0) == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(android.net.Uri r5, java.lang.String r6) {
        /*
            boolean r0 = c(r5)
            java.lang.String r1 = ""
            if (r0 == 0) goto L84
            java.util.List r0 = r5.getPathSegments()
            java.lang.String r2 = "picker"
            int r2 = r0.indexOf(r2)
            r3 = -1
            r4 = 0
            if (r2 != r3) goto L18
            r0 = r4
            goto L20
        L18:
            int r2 = r2 + 2
            java.lang.Object r0 = defpackage.sl1.f0(r2, r0)
            java.lang.String r0 = (java.lang.String) r0
        L20:
            r2 = 46
            if (r0 == 0) goto L34
            java.lang.String r0 = defpackage.k4b.E0(r2, r0, r0)
            boolean r3 = defpackage.k4b.j0(r0)
            if (r3 != 0) goto L2f
            goto L30
        L2f:
            r0 = r4
        L30:
            if (r0 == 0) goto L34
        L32:
            r4 = r0
            goto L45
        L34:
            java.lang.String r0 = r5.getAuthority()
            if (r0 == 0) goto L45
            java.lang.String r0 = defpackage.k4b.E0(r2, r0, r0)
            boolean r2 = defpackage.k4b.j0(r0)
            if (r2 != 0) goto L45
            goto L32
        L45:
            java.lang.Long r0 = a(r5)
            if (r0 == 0) goto L55
            long r2 = r0.longValue()
            java.lang.String r0 = java.lang.String.valueOf(r2)
            if (r0 != 0) goto L59
        L55:
            java.lang.String r0 = r5.getLastPathSegment()
        L59:
            if (r4 == 0) goto L64
            if (r0 == 0) goto L64
            java.lang.String r5 = "-"
            java.lang.String r1 = defpackage.eub.o(r4, r5, r0)
            goto L6c
        L64:
            if (r4 != 0) goto L6b
            if (r0 != 0) goto L69
            goto L6c
        L69:
            r1 = r0
            goto L6c
        L6b:
            r1 = r4
        L6c:
            int r5 = r1.length()
            if (r5 != 0) goto L73
            goto L83
        L73:
            if (r6 == 0) goto L83
            boolean r5 = defpackage.k4b.j0(r6)
            if (r5 == 0) goto L7c
            goto L83
        L7c:
            java.lang.String r5 = "."
            java.lang.String r5 = defpackage.eub.o(r1, r5, r6)
            return r5
        L83:
            return r1
        L84:
            java.lang.String r5 = r5.getLastPathSegment()
            if (r5 != 0) goto L8b
            return r1
        L8b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ryc.b(android.net.Uri, java.lang.String):java.lang.String");
    }

    public static boolean c(Uri uri) {
        boolean z;
        if (r4b.J(uri.getScheme(), "content", true)) {
            List<String> pathSegments = uri.getPathSegments();
            if (!pathSegments.contains("picker") && !pathSegments.contains("photopicker")) {
                z = false;
            } else {
                z = true;
            }
            String authority = uri.getAuthority();
            if (authority != null) {
                int hashCode = authority.hashCode();
                if (hashCode != 103772132) {
                    if (hashCode == 1901613822 && authority.equals("com.android.providers.media.photopicker")) {
                        return true;
                    }
                } else if (authority.equals("media")) {
                    return z;
                }
            }
        }
        return false;
    }
}
