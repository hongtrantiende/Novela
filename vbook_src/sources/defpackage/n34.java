package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n34  reason: default package */
/* loaded from: classes3.dex */
public final class n34 {
    public final String a;
    public final List b;

    public n34(String str, List list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n34)) {
            return false;
        }
        n34 n34Var = (n34) obj;
        if (c16.i(this.a, n34Var.a) && c16.i(this.b, n34Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ExtensionCodeState(currentCode=" + this.a + ", scriptCode=" + this.b + ")";
    }
}
