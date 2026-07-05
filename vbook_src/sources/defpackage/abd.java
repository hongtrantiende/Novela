package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: abd  reason: default package */
/* loaded from: classes3.dex */
public final class abd {
    public final String a;
    public final String b;

    public abd(String str, String str2) {
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abd)) {
            return false;
        }
        abd abdVar = (abd) obj;
        if (c16.i(this.a, abdVar.a) && c16.i(this.b, abdVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hl5.o("VideoSourceTrack(title=", this.a, ", data=", this.b, ")");
    }

    public /* synthetic */ abd(String str) {
        this("", str);
    }
}
