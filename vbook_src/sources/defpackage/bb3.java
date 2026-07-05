package defpackage;

import android.os.Build;
import android.view.DisplayCutout;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bb3  reason: default package */
/* loaded from: classes.dex */
public final class bb3 {
    public final DisplayCutout a;

    public bb3(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final cx5 a() {
        if (Build.VERSION.SDK_INT >= 30) {
            return cx5.c(qka.k(this.a));
        }
        return cx5.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bb3.class == obj.getClass()) {
            return this.a.equals(((bb3) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
