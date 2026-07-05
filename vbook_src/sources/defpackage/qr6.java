package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qr6  reason: default package */
/* loaded from: classes.dex */
public final class qr6 {
    public final Object a;
    public ih1 b = new ih1(3);
    public boolean c;
    public boolean d;

    public qr6(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qr6.class == obj.getClass()) {
            return this.a.equals(((qr6) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
