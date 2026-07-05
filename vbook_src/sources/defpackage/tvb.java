package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tvb  reason: default package */
/* loaded from: classes3.dex */
public final class tvb {
    public final String a;
    public final List b;

    public tvb(String str, List list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tvb)) {
            return false;
        }
        tvb tvbVar = (tvb) obj;
        if (c16.i(this.a, tvbVar.a) && c16.i(this.b, tvbVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TextLookupState(text=" + this.a + ", lookupList=" + this.b + ")";
    }

    public /* synthetic */ tvb() {
        this("", ks3.a);
    }
}
