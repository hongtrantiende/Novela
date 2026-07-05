package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: up6  reason: default package */
/* loaded from: classes3.dex */
public final class up6 {
    public static final up6 e = new up6(15);
    public final String a;
    public final xp6 b;
    public final String c;
    public final boolean d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ up6(int r2) {
        /*
            r1 = this;
            r2 = r2 & 8
            if (r2 == 0) goto L6
            r2 = 0
            goto L7
        L6:
            r2 = 1
        L7:
            r0 = 0
            r1.<init>(r0, r0, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.up6.<init>(int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof up6)) {
            return false;
        }
        up6 up6Var = (up6) obj;
        if (c16.i(this.a, up6Var.a) && c16.i(this.b, up6Var.b) && c16.i(this.c, up6Var.c) && this.d == up6Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i = 0;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        xp6 xp6Var = this.b;
        if (xp6Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = xp6Var.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return Boolean.hashCode(this.d) + ((i3 + i) * 31);
    }

    public final String toString() {
        return "LinkResolution(existingUrl=" + this.a + ", existingLinkRange=" + this.b + ", existingLinkText=" + this.c + ", intersectsLink=" + this.d + ")";
    }

    public up6(String str, xp6 xp6Var, String str2, boolean z) {
        this.a = str;
        this.b = xp6Var;
        this.c = str2;
        this.d = z;
    }
}
