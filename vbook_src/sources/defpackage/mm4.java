package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mm4  reason: default package */
/* loaded from: classes.dex */
public final class mm4 {
    public final rm4 a;
    public final rg b;
    public final uv7 c;
    public final uv7 d;
    public boolean e;

    public mm4(rm4 rm4Var, rg rgVar) {
        this.a = rm4Var;
        this.b = rgVar;
        uv7 uv7Var = uz9.a;
        this.c = new uv7();
        this.d = new uv7();
    }

    public final void a() {
        if (!this.e) {
            v7 v7Var = new v7(0, this, mm4.class, "invalidateNodes", "invalidateNodes()V", 0, 21);
            kv7 kv7Var = this.b.L0;
            if (kv7Var.g(v7Var) < 0) {
                kv7Var.a(v7Var);
            }
            this.e = true;
        }
    }
}
