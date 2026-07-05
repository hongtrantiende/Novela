package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k8a  reason: default package */
/* loaded from: classes.dex */
public final class k8a {
    public final String a;
    public final lu4 b;
    public final boolean c;

    public k8a(String str, lu4 lu4Var) {
        this.a = str;
        this.b = lu4Var;
    }

    public final String toString() {
        return s21.m("AccessibilityKey: ", this.a);
    }

    public /* synthetic */ k8a(String str) {
        this(str, f8a.P);
    }

    public k8a(String str, int i) {
        this(str);
        this.c = true;
    }

    public k8a(String str, boolean z, lu4 lu4Var) {
        this(str, lu4Var);
        this.c = z;
    }
}
