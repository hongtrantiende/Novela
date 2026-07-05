package defpackage;

import android.view.KeyEvent;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s86  reason: default package */
/* loaded from: classes3.dex */
public final class s86 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vt4 b;
    public final /* synthetic */ vt4 c;
    public final /* synthetic */ vt4 d;

    public /* synthetic */ s86(vt4 vt4Var, vt4 vt4Var2, vt4 vt4Var3, int i) {
        this.a = i;
        this.b = vt4Var;
        this.c = vt4Var2;
        this.d = vt4Var3;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        boolean z = false;
        vt4 vt4Var = this.d;
        vt4 vt4Var2 = this.c;
        vt4 vt4Var3 = this.b;
        switch (i) {
            case 0:
                KeyEvent keyEvent = ((g86) obj).a;
                keyEvent.getClass();
                if (gae.j(keyEvent) == 2) {
                    long a = rae.a(keyEvent.getKeyCode());
                    if (!e86.a(a, e86.f) && !e86.a(a, e86.h)) {
                        if (!e86.a(a, e86.e) && !e86.a(a, e86.g)) {
                            if (e86.a(a, e86.w) || e86.a(a, e86.x) || e86.a(a, e86.K) || e86.a(a, e86.L)) {
                                vt4Var.invoke();
                            }
                            return Boolean.valueOf(z);
                        }
                        vt4Var2.invoke();
                    } else {
                        vt4Var3.invoke();
                    }
                    z = true;
                    return Boolean.valueOf(z);
                }
                return Boolean.FALSE;
            default:
                KeyEvent keyEvent2 = ((g86) obj).a;
                keyEvent2.getClass();
                if (gae.j(keyEvent2) == 2) {
                    long a2 = rae.a(keyEvent2.getKeyCode());
                    if (e86.a(a2, e86.j)) {
                        vt4Var3.invoke();
                    } else if (e86.a(a2, e86.L)) {
                        vt4Var2.invoke();
                    } else {
                        if (e86.a(a2, e86.k)) {
                            vt4Var.invoke();
                        }
                        return Boolean.valueOf(z);
                    }
                    z = true;
                    return Boolean.valueOf(z);
                }
                return Boolean.FALSE;
        }
    }
}
