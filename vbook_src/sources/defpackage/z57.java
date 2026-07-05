package defpackage;

import android.os.Build;
import android.text.TextUtils;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z57  reason: default package */
/* loaded from: classes.dex */
public final class z57 {
    public c67 a;

    public z57(String str, int i, int i2) {
        if (str != null) {
            if (!TextUtils.isEmpty(str)) {
                if (Build.VERSION.SDK_INT >= 28) {
                    c67 c67Var = new c67(str, i, i2);
                    a67.a(i, i2, str);
                    this.a = c67Var;
                    return;
                }
                this.a = new c67(str, i, i2);
                return;
            }
            vs.m("packageName should be nonempty");
            throw null;
        }
        xk5.k("package shouldn't be null");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z57)) {
            return false;
        }
        return this.a.equals(((z57) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
