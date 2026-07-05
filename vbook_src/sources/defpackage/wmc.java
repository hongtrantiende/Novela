package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wmc  reason: default package */
/* loaded from: classes3.dex */
public final class wmc {
    public final String a;
    public final List b;

    public wmc(String str, List list) {
        str.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wmc)) {
            return false;
        }
        wmc wmcVar = (wmc) obj;
        if (c16.i(this.a, wmcVar.a) && c16.i(this.b, wmcVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        List list = this.b;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Result(translateText=" + this.a + ", segments=" + this.b + ")";
    }
}
