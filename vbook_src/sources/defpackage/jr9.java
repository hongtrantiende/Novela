package defpackage;

import android.content.res.Resources;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jr9  reason: default package */
/* loaded from: classes.dex */
public final class jr9 {
    public final Resources a;
    public final Resources.Theme b;

    public jr9(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jr9.class == obj.getClass()) {
            jr9 jr9Var = (jr9) obj;
            if (this.a.equals(jr9Var.a) && Objects.equals(this.b, jr9Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
