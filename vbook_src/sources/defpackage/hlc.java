package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: hlc  reason: default package */
/* loaded from: classes3.dex */
public final class hlc {
    public static final glc Companion = new Object();
    public final String a;
    public final String b;

    public /* synthetic */ hlc(String str, String str2, int i) {
        if (3 == (i & 3)) {
            this.a = str;
            this.b = str2;
            return;
        }
        w92.x(i, 3, flc.a.e());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hlc)) {
            return false;
        }
        hlc hlcVar = (hlc) obj;
        if (c16.i(this.a, hlcVar.a) && c16.i(this.b, hlcVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hl5.o("TranslateChunkItem(id=", this.a, ", text=", this.b, ")");
    }

    public hlc(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }
}
