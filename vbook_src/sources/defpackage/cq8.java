package defpackage;

import java.util.LinkedHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cq8  reason: default package */
/* loaded from: classes.dex */
public final class cq8 implements jq8 {
    public final LinkedHashMap a;

    public cq8(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof cq8) || !this.a.equals(((cq8) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Dictionary(map=" + this.a + ")";
    }
}
