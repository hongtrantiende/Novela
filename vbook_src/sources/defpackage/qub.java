package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qub  reason: default package */
/* loaded from: classes3.dex */
public final class qub {
    public final int a;
    public final String b;

    public qub(int i, String str) {
        str.getClass();
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qub)) {
            return false;
        }
        qub qubVar = (qub) obj;
        if (this.a == qubVar.a && c16.i(this.b, qubVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TextImageURL(chapterIndex=" + this.a + ", imageUrl=" + this.b + ")";
    }
}
