package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s45  reason: default package */
/* loaded from: classes3.dex */
public final class s45 {
    public final ArrayList a;
    public final bt1 b;

    public s45(ArrayList arrayList, bt1 bt1Var) {
        this.a = arrayList;
        this.b = bt1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s45) {
            s45 s45Var = (s45) obj;
            if (this.a.equals(s45Var.a) && this.b == s45Var.b) {
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
        return "WaitForUrlState(patterns=" + this.a + ", deferred=" + this.b + ")";
    }
}
