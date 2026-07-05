package defpackage;

import java.security.MessageDigest;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: kw8  reason: default package */
/* loaded from: classes3.dex */
public final class kw8 {
    private static final jw8 Companion = new Object();
    public final String a;
    public final String b;

    public kw8(qk1 qk1Var) {
        String str;
        jw8 jw8Var = Companion;
        jw8Var.getClass();
        String i = sxd.i(v9e.L());
        qk1Var.getClass();
        jw8Var.getClass();
        if (qk1Var == qk1.S256) {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
            byte[] bytes = i.getBytes(ed1.b);
            bytes.getClass();
            byte[] digest = messageDigest.digest(bytes);
            digest.getClass();
            str = sxd.i(digest);
        } else {
            str = i;
        }
        this.a = i;
        this.b = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (defpackage.c16.i(r0, defpackage.sxd.i(defpackage.v9e.L())) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.kw8 r2, defpackage.jbe r3, defpackage.o9a r4) {
        /*
            boolean r0 = r3.V(r4)
            if (r0 == 0) goto L7
            goto L1c
        L7:
            java.lang.String r0 = r2.a
            jw8 r1 = defpackage.kw8.Companion
            r1.getClass()
            byte[] r1 = defpackage.v9e.L()
            java.lang.String r1 = defpackage.sxd.i(r1)
            boolean r0 = defpackage.c16.i(r0, r1)
            if (r0 != 0) goto L22
        L1c:
            java.lang.String r0 = r2.a
            r1 = 0
            r3.J(r4, r1, r0)
        L22:
            java.lang.String r2 = r2.b
            r0 = 1
            r3.J(r4, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kw8.a(kw8, jbe, o9a):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kw8)) {
            return false;
        }
        kw8 kw8Var = (kw8) obj;
        if (c16.i(this.a, kw8Var.a) && c16.i(this.b, kw8Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hl5.o("Pkce(codeVerifier=", this.a, ", codeChallenge=", this.b, ")");
    }

    public kw8(String str, String str2, int i) {
        if (2 != (i & 2)) {
            w92.x(i, 2, iw8.a.e());
            throw null;
        }
        if ((i & 1) == 0) {
            Companion.getClass();
            str = sxd.i(v9e.L());
        }
        this.a = str;
        this.b = str2;
    }
}
