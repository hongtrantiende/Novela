package defpackage;

import java.util.Locale;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nv6  reason: default package */
/* loaded from: classes3.dex */
public final class nv6 {
    public final Locale a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public nv6(java.lang.String r5) {
        /*
            r4 = this;
            java.util.Locale r0 = java.util.Locale.forLanguageTag(r5)
            java.lang.String r1 = r0.toLanguageTag()
            java.lang.String r2 = "und"
            boolean r1 = defpackage.c16.i(r1, r2)
            if (r1 == 0) goto L28
            java.io.PrintStream r1 = java.lang.System.err
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "The language tag "
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r5 = " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'."
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.println(r5)
        L28:
            r4.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nv6.<init>(java.lang.String):void");
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof nv6)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return c16.i(this.a.toLanguageTag(), ((nv6) obj).a.toLanguageTag());
    }

    public final int hashCode() {
        return this.a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.a.toLanguageTag();
    }

    public nv6(Locale locale) {
        this.a = locale;
    }
}
