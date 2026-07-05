package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: po5  reason: default package */
/* loaded from: classes3.dex */
public final class po5 extends vh8 {
    public final int c;
    public final int d;
    public final int e;
    public final String f;
    public final List g;
    public final int h;
    public final int i;
    public final String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public po5(int i, int i2, int i3, String str, List list, int i4, int i5, String str2) {
        super("image_" + i + "_" + i2, i);
        str.getClass();
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = str;
        this.g = list;
        this.h = i4;
        this.i = i5;
        this.j = str2;
    }

    @Override // defpackage.vh8
    public final int a() {
        return (this.c * 100000) + this.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof po5)) {
            return false;
        }
        po5 po5Var = (po5) obj;
        if (this.c != po5Var.c || this.d != po5Var.d || this.e != po5Var.e || !c16.i(this.f, po5Var.f) || this.h != po5Var.h || this.i != po5Var.i) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f.hashCode() + (((((((((this.c * 31) + this.d) * 31) + this.e) * 31) + this.h) * 31) + this.i) * 31);
    }

    public final String toString() {
        StringBuilder r = hl5.r(this.c, this.d, "ImagePage(chapterIndex=", ", pageIndex=", ", pageCount=");
        nk2.z(this.e, ", path=", this.f, ", fallback=", r);
        r.append(this.g);
        r.append(", width=");
        r.append(this.h);
        r.append(", height=");
        r.append(this.i);
        r.append(", script=");
        r.append(this.j);
        r.append(")");
        return r.toString();
    }
}
