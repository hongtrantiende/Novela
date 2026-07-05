package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p94  reason: default package */
/* loaded from: classes.dex */
public final class p94 {
    public final String a;
    public final byte[] b;
    public final String c;

    public p94(String str, String str2, byte[] bArr) {
        this.a = str;
        this.b = bArr;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof p94) {
                p94 p94Var = (p94) obj;
                if (this.a.equals(p94Var.a) && Arrays.equals(this.b, p94Var.b) && this.c.equals(p94Var.c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.b);
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return s21.q(nk2.y("ExtractedImage(filename=", this.a, ", data=", Arrays.toString(this.b), ", mimeType="), this.c, ")");
    }
}
