package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ha1  reason: default package */
/* loaded from: classes.dex */
public final class ha1 extends dr2 implements x7b {
    public final /* synthetic */ int C = 0;
    public Object D;
    public x7b e;
    public long f;

    public ha1(x03 x03Var) {
        this.D = x03Var;
    }

    @Override // defpackage.x7b
    public final int a(long j) {
        x7b x7bVar = this.e;
        x7bVar.getClass();
        return x7bVar.a(j - this.f);
    }

    @Override // defpackage.x7b
    public final long c(int i) {
        x7b x7bVar = this.e;
        x7bVar.getClass();
        return x7bVar.c(i) + this.f;
    }

    @Override // defpackage.x7b
    public final List f(long j) {
        x7b x7bVar = this.e;
        x7bVar.getClass();
        return x7bVar.f(j - this.f);
    }

    @Override // defpackage.x7b
    public final int g() {
        x7b x7bVar = this.e;
        x7bVar.getClass();
        return x7bVar.g();
    }

    @Override // defpackage.dr2
    public final void n() {
        this.b = 0;
        this.c = 0L;
        this.d = false;
        this.e = null;
    }

    @Override // defpackage.dr2
    public final void o() {
        switch (this.C) {
            case 0:
                n();
                ((ia1) ((q6) this.D).b).b.add(this);
                return;
            default:
                ((x03) this.D).n(this);
                return;
        }
    }

    public /* synthetic */ ha1() {
    }
}
