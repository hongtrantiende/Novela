package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cn0  reason: default package */
/* loaded from: classes3.dex */
public final class cn0 implements hn0 {
    public final int a;
    public final String b;
    public final boolean c;

    public cn0(int i) {
        this.a = i;
        if (1 <= i && i < 7) {
            this.b = a82.j(i, "heading_");
            this.c = true;
            return;
        }
        p1a.k(a82.j(i, "Heading level must be between 1 and 6, got "));
        throw null;
    }

    @Override // defpackage.hn0
    public final String c() {
        return this.b;
    }

    @Override // defpackage.hn0
    public final boolean d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof cn0) && this.a == ((cn0) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return hl5.l("Heading(level=", ")", this.a);
    }
}
