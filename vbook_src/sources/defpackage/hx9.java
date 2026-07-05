package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hx9  reason: default package */
/* loaded from: classes.dex */
public final class hx9 {
    public final int a;
    public final ArrayList b;

    public hx9(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof hx9) {
                hx9 hx9Var = (hx9) obj;
                if (this.a != hx9Var.a || !this.b.equals(hx9Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "SamplingTiles(sampleSize=" + this.a + ", tiles=" + this.b + ')';
    }
}
