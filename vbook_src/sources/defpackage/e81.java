package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e81  reason: default package */
/* loaded from: classes3.dex */
public final class e81 {
    public final p71 a;
    public final f81 b;
    public final r71 c;

    public e81(p71 p71Var, f81 f81Var, r71 r71Var) {
        this.a = p71Var;
        this.b = f81Var;
        this.c = r71Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e81) {
                e81 e81Var = (e81) obj;
                if (!this.a.equals(e81Var.a) || !this.b.equals(e81Var.b) || !this.c.equals(e81Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CascadeEditorTheme(colors=" + this.a + ", typography=" + this.b + ", dimensions=" + this.c + ")";
    }
}
