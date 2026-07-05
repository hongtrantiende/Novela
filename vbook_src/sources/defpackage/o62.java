package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o62  reason: default package */
/* loaded from: classes3.dex */
public final class o62 {
    public final bzc a;
    public final String b;

    public o62(bzc bzcVar, String str) {
        str.getClass();
        this.a = bzcVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof o62) {
                o62 o62Var = (o62) obj;
                if (!this.a.equals(o62Var.a) || !c16.i(this.b, o62Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ConversationMember(user=" + this.a + ", role=" + this.b + ")";
    }
}
