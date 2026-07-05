package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w8b  reason: default package */
/* loaded from: classes3.dex */
public final class w8b {
    public final ArrayList a;
    public final String b;

    public w8b(String str, ArrayList arrayList) {
        this.a = arrayList;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof w8b) {
                w8b w8bVar = (w8b) obj;
                if (!this.a.equals(w8bVar.a) || !this.b.equals(w8bVar.b)) {
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
        return "SuggestPage(suggests=" + this.a + ", data2=" + this.b + ")";
    }
}
