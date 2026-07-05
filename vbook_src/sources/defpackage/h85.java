package defpackage;

import android.text.TextUtils;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h85  reason: default package */
/* loaded from: classes.dex */
public final class h85 {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public h85(String str, String str2, String str3, int i, int i2, String str4) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h85.class == obj.getClass()) {
            h85 h85Var = (h85) obj;
            if (this.a == h85Var.a && this.b == h85Var.b && TextUtils.equals(this.c, h85Var.c) && TextUtils.equals(this.d, h85Var.d) && TextUtils.equals(this.e, h85Var.e) && TextUtils.equals(this.f, h85Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = ((this.a * 31) + this.b) * 31;
        int i5 = 0;
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i6 = (i4 + i) * 31;
        String str2 = this.d;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        String str3 = this.e;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        String str4 = this.f;
        if (str4 != null) {
            i5 = str4.hashCode();
        }
        return i8 + i5;
    }
}
