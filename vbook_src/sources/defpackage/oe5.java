package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oe5  reason: default package */
/* loaded from: classes3.dex */
public final class oe5 implements fh5 {
    public final pg5 a;
    public final vyc b;
    public final uy1 c;
    public final r45 d;
    public final /* synthetic */ gh5 e;

    public oe5(gh5 gh5Var) {
        this.e = gh5Var;
        this.a = gh5Var.b;
        this.b = gh5Var.a.b();
        this.c = gh5Var.f;
        this.d = gh5Var.c.Y();
    }

    @Override // defpackage.og5
    public final n45 a() {
        return this.d;
    }

    @Override // defpackage.fh5
    public final uy1 getAttributes() {
        return this.c;
    }

    @Override // defpackage.fh5
    public final pg5 getMethod() {
        return this.a;
    }

    @Override // defpackage.fh5
    public final vyc getUrl() {
        return this.b;
    }

    @Override // defpackage.fh5
    public final rf8 o() {
        rf8 rf8Var;
        gh5 gh5Var = this.e;
        Object obj = gh5Var.d;
        if (obj instanceof rf8) {
            rf8Var = (rf8) obj;
        } else {
            rf8Var = null;
        }
        if (rf8Var != null) {
            return rf8Var;
        }
        cp8.u(gh5Var.d, "Content was not transformed to OutgoingContent yet. Current body is ");
        return null;
    }

    @Override // defpackage.fh5
    public final te5 y0() {
        throw new IllegalStateException("Call is not initialized");
    }
}
