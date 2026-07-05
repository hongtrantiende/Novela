package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wt5  reason: default package */
/* loaded from: classes.dex */
public final class wt5 {
    public final ArrayList a;
    public final HashMap b;

    public wt5(ArrayList arrayList, HashMap hashMap) {
        this.a = arrayList;
        this.b = hashMap;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof wt5) {
                wt5 wt5Var = (wt5) obj;
                if (!this.a.equals(wt5Var.a) || !this.b.equals(wt5Var.b)) {
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
        return "IndexData(table=" + this.a + ", cncx=" + this.b + ")";
    }
}
