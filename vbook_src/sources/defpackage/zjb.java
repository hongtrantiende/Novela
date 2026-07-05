package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zjb  reason: default package */
/* loaded from: classes.dex */
public final class zjb implements bkb {
    public final String a;
    public final List b;

    public zjb(String str, List list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zjb)) {
            return false;
        }
        zjb zjbVar = (zjb) obj;
        if (c16.i(this.a, zjbVar.a) && c16.i(this.b, zjbVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AsText(text=" + this.a + ", spans=" + this.b + ")";
    }
}
