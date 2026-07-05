package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xx4  reason: default package */
/* loaded from: classes3.dex */
public final class xx4 {
    public final String a;
    public final Map b;

    public xx4(Map map, String str) {
        str.getClass();
        map.getClass();
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xx4)) {
            return false;
        }
        xx4 xx4Var = (xx4) obj;
        if (c16.i(this.a, xx4Var.a) && c16.i(this.b, xx4Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "GetReadExtensionTranslateData(id=" + this.a + ", translateData=" + this.b + ")";
    }
}
