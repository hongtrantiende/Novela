package defpackage;

import java.util.LinkedHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dk1  reason: default package */
/* loaded from: classes3.dex */
public final class dk1 {
    public final short a;
    public final String b;

    public dk1(short s, String str) {
        str.getClass();
        this.a = s;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk1)) {
            return false;
        }
        dk1 dk1Var = (dk1) obj;
        if (this.a == dk1Var.a && c16.i(this.b, dk1Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Short.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CloseReason(reason=");
        ck1.b.getClass();
        LinkedHashMap linkedHashMap = ck1.c;
        short s = this.a;
        Object obj = (ck1) linkedHashMap.get(Short.valueOf(s));
        if (obj == null) {
            obj = Short.valueOf(s);
        }
        sb.append(obj);
        sb.append(", message=");
        return s21.p(sb, this.b, ')');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public dk1(ck1 ck1Var, String str) {
        this(ck1Var.a, str);
        str.getClass();
    }
}
