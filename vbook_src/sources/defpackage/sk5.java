package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sk5  reason: default package */
/* loaded from: classes.dex */
public final class sk5 implements rb7 {
    public final byte[] a;
    public final String b;
    public final String c;

    public sk5(String str, String str2, byte[] bArr) {
        this.a = bArr;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.rb7
    public final void b(i57 i57Var) {
        String str = this.b;
        if (str != null) {
            i57Var.a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && sk5.class == obj.getClass()) {
            return Arrays.equals(this.a, ((sk5) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return rs8.g(this.a.length, "\"", nk2.y("ICY: title=\"", this.b, "\", url=\"", this.c, "\", rawMetadata.length=\""));
    }
}
