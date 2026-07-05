package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jwb  reason: default package */
/* loaded from: classes3.dex */
public final class jwb {
    public final int a;
    public final int b;
    public final float c;
    public final List d;
    public final int e;

    public jwb(int i, int i2, float f, List list, int i3) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = list;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jwb)) {
            return false;
        }
        jwb jwbVar = (jwb) obj;
        if (jwbVar.e != this.e || jwbVar.a != this.a || jwbVar.b != this.b || jwbVar.c != this.c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + (((((this.e * 31) + this.a) * 31) + this.b) * 31);
    }

    public final String toString() {
        StringBuilder r = hl5.r(this.a, this.b, "PageColumn(start=", ", end=", ", height=");
        r.append(this.c);
        r.append(", paragraphs=");
        r.append(this.d);
        r.append(", hash=");
        return rs8.g(this.e, ")", r);
    }
}
