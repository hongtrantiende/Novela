package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ytc  reason: default package */
/* loaded from: classes3.dex */
public abstract class ytc {
    public static final List a = tl1.A("");

    public static final int a(int i, int i2, String str) {
        boolean z = false;
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != ':') {
                if (charAt != '[') {
                    if (charAt == ']') {
                        z = false;
                    }
                } else {
                    z = true;
                }
            } else if (!z) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final void b(xtc xtcVar, String str) {
        xtcVar.getClass();
        str.getClass();
        if (k4b.j0(str)) {
            return;
        }
        try {
            c(xtcVar, str);
        } catch (Throwable th) {
            throw new bj1(7, "Fail to parse url: ".concat(str), th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.xtc r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 745
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ytc.c(xtc, java.lang.String):void");
    }
}
