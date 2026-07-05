package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ff1  reason: default package */
/* loaded from: classes3.dex */
public final class ff1 {
    public final fa7 a;
    public final boolean b;
    public final boolean c;
    public db7 d = db7.d;

    public ff1(fa7 fa7Var, boolean z, boolean z2) {
        this.a = fa7Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ff1) {
                ff1 ff1Var = (ff1) obj;
                if (!this.a.equals(ff1Var.a) || this.b != ff1Var.b || this.c != ff1Var.c || this.d != ff1Var.d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode() + eub.k(eub.k(eub.k(this.a.hashCode() * 31, 31, this.b), 31, this.c), 961, false);
    }

    public final String toString() {
        db7 db7Var = this.d;
        return "ChatMessage(message=" + this.a + ", isMe=" + this.b + ", isSending=" + this.c + ", isError=false, localId=null, position=" + db7Var + ")";
    }
}
