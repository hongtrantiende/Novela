package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: f64  reason: default package */
/* loaded from: classes3.dex */
public final class f64 implements lz7 {
    public static final e64 Companion = new Object();
    public final boolean a;

    public /* synthetic */ f64(int i, boolean z) {
        if ((i & 1) == 0) {
            this.a = false;
        } else {
            this.a = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof f64) && this.a == ((f64) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return "ExtensionRepoRoute(isShowAdd=" + this.a + ")";
    }

    public f64(boolean z) {
        this.a = z;
    }
}
