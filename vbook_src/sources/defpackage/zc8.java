package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zc8  reason: default package */
/* loaded from: classes3.dex */
public final class zc8 extends ed8 {
    public final String c;

    public zc8(String str) {
        super(str, null);
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof zc8) && c16.i(this.c, ((zc8) obj).c)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ed8, java.lang.Throwable
    public final String getMessage() {
        return this.c;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return hl5.n("InvalidConfiguration(message=", this.c, ")");
    }
}
