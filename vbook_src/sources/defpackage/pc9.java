package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pc9  reason: default package */
/* loaded from: classes3.dex */
public final class pc9 {
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final Map e;

    public pc9(String str, int i, int i2, String str2, Map map) {
        str.getClass();
        map.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = map;
    }

    public static pc9 a(pc9 pc9Var, int i, String str, int i2) {
        String str2 = pc9Var.a;
        int i3 = pc9Var.b;
        if ((i2 & 4) != 0) {
            i = pc9Var.c;
        }
        int i4 = i;
        if ((i2 & 8) != 0) {
            str = pc9Var.d;
        }
        Map map = pc9Var.e;
        str2.getClass();
        map.getClass();
        return new pc9(str2, i3, i4, str, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pc9)) {
            return false;
        }
        pc9 pc9Var = (pc9) obj;
        if (c16.i(this.a, pc9Var.a) && c16.i(this.d, pc9Var.d) && this.b == pc9Var.b && this.c == pc9Var.c && this.e.size() == pc9Var.e.size()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        String str = this.d;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return this.e.size() + ((((((hashCode + i) * 31) + this.b) * 31) + this.c) * 31);
    }

    public final String toString() {
        StringBuilder s = s21.s("QtNERWord(word=", this.a, ", type=", this.b, ", count=");
        nk2.z(this.c, ", trans=", this.d, ", subTrans=", s);
        s.append(this.e);
        s.append(")");
        return s.toString();
    }
}
