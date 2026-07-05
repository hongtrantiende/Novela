package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ysb  reason: default package */
/* loaded from: classes.dex */
public final class ysb implements x2a {
    public final /* synthetic */ x2a a;
    public final h23 b;
    public final h23 c;

    public ysb(x2a x2aVar, final zsb zsbVar) {
        this.a = x2aVar;
        this.b = yae.q(new vt4() { // from class: xsb
            @Override // defpackage.vt4
            public final Object invoke() {
                int i = r2;
                boolean z = false;
                zsb zsbVar2 = zsbVar;
                switch (i) {
                    case 0:
                        if (zsbVar2.a.h() < zsbVar2.b.h()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    default:
                        if (zsbVar2.a.h() > nae.e) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                }
            }
        });
        this.c = yae.q(new vt4() { // from class: xsb
            @Override // defpackage.vt4
            public final Object invoke() {
                int i = r2;
                boolean z = false;
                zsb zsbVar2 = zsbVar;
                switch (i) {
                    case 0:
                        if (zsbVar2.a.h() < zsbVar2.b.h()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    default:
                        if (zsbVar2.a.h() > nae.e) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                }
            }
        });
    }

    @Override // defpackage.x2a
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.x2a
    public final boolean b() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    @Override // defpackage.x2a
    public final boolean c() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    @Override // defpackage.x2a
    public final float d(float f) {
        return this.a.d(f);
    }

    @Override // defpackage.x2a
    public final Object e(jw7 jw7Var, lu4 lu4Var, m42 m42Var) {
        return this.a.e(jw7Var, lu4Var, m42Var);
    }
}
