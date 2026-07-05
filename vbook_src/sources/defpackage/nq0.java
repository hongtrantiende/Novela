package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nq0  reason: default package */
/* loaded from: classes3.dex */
public final class nq0 {
    public final ArrayList a;
    public final String b;

    public nq0(String str, ArrayList arrayList) {
        this.a = arrayList;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof nq0) {
                nq0 nq0Var = (nq0) obj;
                if (!this.a.equals(nq0Var.a) || !this.b.equals(nq0Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BookPage(books=" + this.a + ", data2=" + this.b + ")";
    }
}
