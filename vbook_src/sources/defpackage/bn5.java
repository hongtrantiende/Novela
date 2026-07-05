package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bn5  reason: default package */
/* loaded from: classes.dex */
public final class bn5 {
    public final byte[] a;
    public final String b;
    public final String c;

    public bn5(String str, String str2, byte[] bArr) {
        this.a = bArr;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof bn5) {
                bn5 bn5Var = (bn5) obj;
                if (Arrays.equals(this.a, bn5Var.a) && this.b.equals(bn5Var.b) && c16.i(this.c, bn5Var.c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int j = eub.j(Arrays.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return j + i;
    }

    public final String toString() {
        return s21.q(nk2.y("ImageData(data=", Arrays.toString(this.a), ", mimeType=", this.b, ", filename="), this.c, ")");
    }
}
