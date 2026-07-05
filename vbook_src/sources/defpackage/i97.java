package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i97  reason: default package */
/* loaded from: classes.dex */
public final class i97 {
    public final ml5 a;
    public final Map b;

    public i97(ml5 ml5Var, Map map) {
        this.a = ml5Var;
        this.b = que.x(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i97) {
            i97 i97Var = (i97) obj;
            if (c16.i(this.a, i97Var.a) && c16.i(this.b, i97Var.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Value(image=" + this.a + ", extras=" + this.b + ")";
    }
}
