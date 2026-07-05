package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xt5  reason: default package */
/* loaded from: classes.dex */
public final class xt5 {
    public final String a;
    public final ArrayList b;
    public final HashMap c;

    public xt5(String str, ArrayList arrayList, HashMap hashMap) {
        this.a = str;
        this.b = arrayList;
        this.c = hashMap;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof xt5) {
                xt5 xt5Var = (xt5) obj;
                if (!this.a.equals(xt5Var.a) || !this.b.equals(xt5Var.b) || !this.c.equals(xt5Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "IndexEntry(label=" + this.a + ", tags=" + this.b + ", tagMap=" + this.c + ")";
    }
}
