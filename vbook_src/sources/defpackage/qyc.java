package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qyc  reason: default package */
/* loaded from: classes3.dex */
public final class qyc {
    public static final qyc c = new qyc(null, null);
    public final String a;
    public final Long b;

    public qyc(String str, Long l) {
        this.a = str;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qyc)) {
            return false;
        }
        qyc qycVar = (qyc) obj;
        if (c16.i(this.a, qycVar.a) && c16.i(this.b, qycVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        Long l = this.b;
        if (l != null) {
            i = l.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "UriMetadata(displayName=" + this.a + ", size=" + this.b + ")";
    }
}
