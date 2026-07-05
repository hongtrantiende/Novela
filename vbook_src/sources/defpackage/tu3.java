package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tu3  reason: default package */
/* loaded from: classes3.dex */
public final class tu3 {
    public final byte[] a;
    public final String b;
    public final String c;

    public tu3(String str, String str2, byte[] bArr) {
        str.getClass();
        str2.getClass();
        this.a = bArr;
        this.b = str;
        this.c = str2;
    }

    public final byte[] a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof tu3) {
                tu3 tu3Var = (tu3) obj;
                if (!this.a.equals(tu3Var.a) || !c16.i(this.b, tu3Var.b) || !c16.i(this.c, tu3Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + eub.j(Arrays.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return s21.q(nk2.y("CoverInfo(bytes=", Arrays.toString(this.a), ", extension=", this.b, ", mediaType="), this.c, ")");
    }
}
