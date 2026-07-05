package defpackage;

import java.util.List;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vo4  reason: default package */
/* loaded from: classes.dex */
public final class vo4 {
    public String a;
    public String b;
    public List c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vo4)) {
            return false;
        }
        vo4 vo4Var = (vo4) obj;
        if (Objects.equals(this.a, vo4Var.a) && Objects.equals(this.b, vo4Var.b) && Objects.equals(this.c, vo4Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
