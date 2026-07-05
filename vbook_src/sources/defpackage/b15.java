package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b15  reason: default package */
/* loaded from: classes.dex */
public final class b15 {
    public static b15 c;
    public final Context a;
    public volatile String b;

    public b15(Context context) {
        this.a = context.getApplicationContext();
    }

    public static b15 a(Context context) {
        am8.s(context);
        synchronized (b15.class) {
            if (c == null) {
                mge mgeVar = x3f.a;
                synchronized (x3f.class) {
                    if (x3f.e == null) {
                        x3f.e = context.getApplicationContext();
                    } else {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                c = new b15(context);
            }
        }
        return c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f4, code lost:
        r5 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean c(android.content.pm.PackageInfo r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b15.c(android.content.pm.PackageInfo, boolean):boolean");
    }

    public static eve d(PackageInfo packageInfo, eve... eveVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            lxe lxeVar = new lxe(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < eveVarArr.length; i++) {
                if (eveVarArr[i].equals(lxeVar)) {
                    return eveVarArr[i];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x01c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(int r18) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b15.b(int):boolean");
    }
}
