package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: pnc  reason: default package */
/* loaded from: classes3.dex */
public final class pnc {
    public static final onc Companion = new Object();
    public final String a;
    public final boolean b;

    public /* synthetic */ pnc(int i, String str, boolean z) {
        if (3 == (i & 3)) {
            this.a = str;
            this.b = z;
            return;
        }
        w92.x(i, 3, nnc.a.e());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pnc)) {
            return false;
        }
        pnc pncVar = (pnc) obj;
        if (c16.i(this.a, pncVar.a) && this.b == pncVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TrashWordDto(word=" + this.a + ", regex=" + this.b + ")";
    }

    public pnc(String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
    }
}
