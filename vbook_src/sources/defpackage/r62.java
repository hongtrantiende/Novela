package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: r62  reason: default package */
/* loaded from: classes3.dex */
public final class r62 {
    public static final q62 Companion = new Object();
    public final vzc a;
    public final String b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, q62] */
    static {
        uzc uzcVar = vzc.Companion;
    }

    public /* synthetic */ r62(int i, vzc vzcVar, String str) {
        this.a = (i & 1) == 0 ? new vzc() : vzcVar;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r62)) {
            return false;
        }
        r62 r62Var = (r62) obj;
        if (c16.i(this.a, r62Var.a) && c16.i(this.b, r62Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ConversationMemberDto(user=" + this.a + ", role=" + this.b + ")";
    }
}
