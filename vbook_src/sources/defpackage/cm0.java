package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cm0  reason: default package */
/* loaded from: classes3.dex */
public final class cm0 implements dm0 {
    public final String a;
    public final List b;

    public cm0(String str, List list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public static cm0 a(cm0 cm0Var, List list) {
        String str = cm0Var.a;
        cm0Var.getClass();
        str.getClass();
        list.getClass();
        return new cm0(str, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cm0)) {
            return false;
        }
        cm0 cm0Var = (cm0) obj;
        if (c16.i(this.a, cm0Var.a) && c16.i(this.b, cm0Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Text(text=" + this.a + ", spans=" + this.b + ")";
    }

    public /* synthetic */ cm0() {
        this("", ks3.a);
    }
}
