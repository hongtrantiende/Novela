package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: q32  reason: default package */
/* loaded from: classes3.dex */
public final class q32 {
    public static final p32 Companion = new Object();
    public final String a;
    public final boolean b;

    public /* synthetic */ q32(int i, String str, boolean z) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = true;
        } else {
            this.b = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q32)) {
            return false;
        }
        q32 q32Var = (q32) obj;
        if (c16.i(this.a, q32Var.a) && this.b == q32Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ContextMenuDto(id=" + this.a + ", enabled=" + this.b + ")";
    }

    public q32(String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
    }
}
