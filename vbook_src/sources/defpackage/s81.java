package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s81  reason: default package */
/* loaded from: classes3.dex */
public final class s81 {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final int d;

    public s81(String str, String str2, ArrayList arrayList, int i) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof s81) {
                s81 s81Var = (s81) obj;
                if (!c16.i(this.a, s81Var.a) || !c16.i(this.b, s81Var.b) || !this.c.equals(s81Var.c) || this.d != s81Var.d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int j = eub.j(this.a.hashCode() * 31, 31, this.b);
        return Integer.hashCode(this.d) + ((this.c.hashCode() + j) * 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("Category(id=", this.a, ", name=", this.b, ", books=");
        y.append(this.c);
        y.append(", bookCount=");
        y.append(this.d);
        y.append(")");
        return y.toString();
    }
}
