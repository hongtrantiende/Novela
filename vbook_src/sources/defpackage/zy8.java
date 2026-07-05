package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zy8  reason: default package */
/* loaded from: classes.dex */
public final class zy8 {
    public final ci4 a;

    public zy8(ci4 ci4Var) {
        this.a = ci4Var;
    }

    public final boolean a(int... iArr) {
        for (int i : iArr) {
            if (this.a.a.get(i)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy8)) {
            return false;
        }
        return this.a.equals(((zy8) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
