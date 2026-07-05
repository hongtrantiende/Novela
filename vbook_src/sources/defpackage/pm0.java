package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pm0  reason: default package */
/* loaded from: classes3.dex */
public final class pm0 {
    public final String a;

    public /* synthetic */ pm0(String str) {
        this.a = str;
    }

    public static String a(String str) {
        return hl5.n("BlockId(value=", str, ")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pm0) {
            if (!c16.i(this.a, ((pm0) obj).a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return a(this.a);
    }
}
