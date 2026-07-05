package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d59  reason: default package */
/* loaded from: classes.dex */
public final class d59 extends se8 {
    public final Object a;

    public d59(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.se8
    public final Object a() {
        return this.a;
    }

    @Override // defpackage.se8
    public final boolean b() {
        return true;
    }

    @Override // defpackage.se8
    public final Object c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d59) {
            return this.a.equals(((d59) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.a + ")";
    }
}
