package defpackage;

import android.text.TextUtils;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l47  reason: default package */
/* loaded from: classes.dex */
public final class l47 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public l47(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == l47.class) {
            l47 l47Var = (l47) obj;
            if (TextUtils.equals(this.a, l47Var.a) && this.b == l47Var.b && this.c == l47Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int j = eub.j(31, 31, this.a);
        int i2 = 1237;
        if (this.b) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i3 = (j + i) * 31;
        if (this.c) {
            i2 = 1231;
        }
        return i3 + i2;
    }
}
