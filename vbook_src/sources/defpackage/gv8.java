package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gv8  reason: default package */
/* loaded from: classes.dex */
public final class gv8 implements rb7 {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final byte[] h;

    public gv8(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = bArr;
    }

    public static gv8 d(km8 km8Var) {
        int m = km8Var.m();
        String p = lc7.p(km8Var.x(km8Var.m(), StandardCharsets.US_ASCII));
        String x = km8Var.x(km8Var.m(), StandardCharsets.UTF_8);
        int m2 = km8Var.m();
        int m3 = km8Var.m();
        int m4 = km8Var.m();
        int m5 = km8Var.m();
        int m6 = km8Var.m();
        byte[] bArr = new byte[m6];
        km8Var.k(bArr, 0, m6);
        return new gv8(m, p, x, m2, m3, m4, m5, bArr);
    }

    @Override // defpackage.rb7
    public final void b(i57 i57Var) {
        i57Var.a(this.h, this.a);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && gv8.class == obj.getClass()) {
                gv8 gv8Var = (gv8) obj;
                if (this.a == gv8Var.a && this.b.equals(gv8Var.b) && this.c.equals(gv8Var.c) && this.d == gv8Var.d && this.e == gv8Var.e && this.f == gv8Var.f && this.g == gv8Var.g && Arrays.equals(this.h, gv8Var.h)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.h) + ((((((((eub.j(eub.j((527 + this.a) * 31, 31, this.b), 31, this.c) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.b + ", description=" + this.c;
    }
}
