package defpackage;

import android.text.TextUtils;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: er2  reason: default package */
/* loaded from: classes.dex */
public final class er2 {
    public final String a;
    public final vq4 b;
    public final vq4 c;
    public final int d;
    public final int e;

    public er2(String str, vq4 vq4Var, vq4 vq4Var2, int i, int i2) {
        boolean z;
        if (i != 0 && i2 != 0) {
            z = false;
        } else {
            z = true;
        }
        wq9.s(z);
        wq9.s(true ^ TextUtils.isEmpty(str));
        this.a = str;
        vq4Var.getClass();
        this.b = vq4Var;
        vq4Var2.getClass();
        this.c = vq4Var2;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && er2.class == obj.getClass()) {
            er2 er2Var = (er2) obj;
            if (this.d == er2Var.d && this.e == er2Var.e && this.a.equals(er2Var.a) && this.b.equals(er2Var.b) && this.c.equals(er2Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int j = eub.j((((527 + this.d) * 31) + this.e) * 31, 31, this.a);
        return this.c.hashCode() + ((this.b.hashCode() + j) * 31);
    }
}
