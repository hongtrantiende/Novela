package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r03  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class r03 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t03 b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ mce d;

    public /* synthetic */ r03(t03 t03Var, Runnable runnable, mce mceVar, int i) {
        this.a = i;
        this.b = t03Var;
        this.c = runnable;
        this.d = mceVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        final mce mceVar = this.d;
        final Runnable runnable = this.c;
        t03 t03Var = this.b;
        switch (i) {
            case 0:
                t03Var.a.execute(new Runnable() { // from class: p03
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i2 = r3;
                        mce mceVar2 = mceVar;
                        Runnable runnable2 = runnable;
                        switch (i2) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((v03) mceVar2.a).k(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((v03) mceVar2.a).k(e2);
                                    return;
                                }
                            default:
                                v03 v03Var = (v03) mceVar2.a;
                                try {
                                    runnable2.run();
                                    v03Var.j(null);
                                    return;
                                } catch (Exception e3) {
                                    v03Var.k(e3);
                                    return;
                                }
                        }
                    }
                });
                return;
            case 1:
                t03Var.a.execute(new Runnable() { // from class: p03
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i2 = r3;
                        mce mceVar2 = mceVar;
                        Runnable runnable2 = runnable;
                        switch (i2) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((v03) mceVar2.a).k(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((v03) mceVar2.a).k(e2);
                                    return;
                                }
                            default:
                                v03 v03Var = (v03) mceVar2.a;
                                try {
                                    runnable2.run();
                                    v03Var.j(null);
                                    return;
                                } catch (Exception e3) {
                                    v03Var.k(e3);
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                t03Var.a.execute(new Runnable() { // from class: p03
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i2 = r3;
                        mce mceVar2 = mceVar;
                        Runnable runnable2 = runnable;
                        switch (i2) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((v03) mceVar2.a).k(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((v03) mceVar2.a).k(e2);
                                    return;
                                }
                            default:
                                v03 v03Var = (v03) mceVar2.a;
                                try {
                                    runnable2.run();
                                    v03Var.j(null);
                                    return;
                                } catch (Exception e3) {
                                    v03Var.k(e3);
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
