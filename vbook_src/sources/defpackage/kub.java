package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kub  reason: default package */
/* loaded from: classes3.dex */
public final class kub {
    public final String a;
    public final List b;

    public kub(String str, List list) {
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public static kub a(kub kubVar, String str, List list, int i) {
        if ((i & 1) != 0) {
            str = kubVar.a;
        }
        if ((i & 2) != 0) {
            list = kubVar.b;
        }
        kubVar.getClass();
        str.getClass();
        list.getClass();
        return new kub(str, list);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof kub) {
                kub kubVar = (kub) obj;
                if (!this.a.equals(kubVar.a) || !c16.i(this.b, kubVar.b)) {
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
        return "TextFontState(currentFont=" + this.a + ", fontList=" + this.b + ")";
    }
}
