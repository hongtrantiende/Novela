package defpackage;

import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vs6  reason: default package */
/* loaded from: classes.dex */
public final class vs6 {
    public final long a;
    public final float b;
    public final long c;

    public vs6(us6 us6Var) {
        this.a = us6Var.a;
        this.b = us6Var.b;
        this.c = us6Var.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vs6)) {
            return false;
        }
        vs6 vs6Var = (vs6) obj;
        if (this.a == vs6Var.a && this.b == vs6Var.b && this.c == vs6Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Float.valueOf(this.b), Long.valueOf(this.c));
    }
}
