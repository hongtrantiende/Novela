package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: x83  reason: default package */
/* loaded from: classes3.dex */
public final class x83 implements lz7 {
    public static final w83 Companion = new Object();
    public final String a;
    public final String b;

    public /* synthetic */ x83(String str, String str2, int i) {
        if (3 == (i & 3)) {
            this.a = str;
            this.b = str2;
            return;
        }
        w92.x(i, 3, v83.a.e());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x83)) {
            return false;
        }
        x83 x83Var = (x83) obj;
        if (c16.i(this.a, x83Var.a) && c16.i(this.b, x83Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hl5.o("DiscoverySearchRoute(extensionId=", this.a, ", searchKey=", this.b, ")");
    }

    public x83(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }
}
